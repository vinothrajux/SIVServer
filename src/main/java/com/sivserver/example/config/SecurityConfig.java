package com.sivserver.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.sql.DataSource;

/**
 * Created by Seetha on 15-Jun-17.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    @Autowired
    DataSource dataSource;


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
                authorizeRequests()
                .antMatchers("/", "/login", "/api/v1/**", "/users/**").permitAll() // home or login is available for every one.
                /*.antMatchers("/users*").hasAuthority(UserType.ADMIN.name())*/ // Only admin can manage user
                //.antMatchers("/events*").hasAnyAuthority(UserType.ADMIN.name(), UserType.EVENT_MANAGER.name()) // Events can be managed by admin, event manager
                //.antMatchers("/songs*").hasAnyAuthority(UserType.ADMIN.name(), UserType.EVENT_MANAGER.name(), UserType.SONG_MANAGER.name()) // Songs can be managed by admin, song_manager, event_manager
                .anyRequest()
                .authenticated().and().csrf().disable().formLogin()
                //.loginPage("/login").failureUrl("/login?error=true")
                //.defaultSuccessUrl("/songs") // After login take the user to songs index page
                .usernameParameter("name") // Authenticate user by email
                .passwordParameter("password"); // password field
//                .and().logout()
//                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                .logoutSuccessUrl("/").and().exceptionHandling()
//                .accessDeniedPage("/access-denied");

    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        /*auth
                .inMemoryAuthentication()
                .withUser("inmemory@test.com")
                .password("test")
                .roles(UserType.ADMIN.name());*/

        auth.
                jdbcAuthentication()
                .dataSource(dataSource) /*What database should spring refer, autowired to application.properties's data source*/
                .passwordEncoder(new SIVPasswordEncoder()) /*ChoirBook custom password encoder, using sha 512 hashing*/
                .usersByUsernameQuery("select name as name, password, 1 as enabled from Firsttable where name=?") /*Spring is expecting 3 fields, so using email, password, enabled*/
                .authoritiesByUsernameQuery("select name, password from Firsttable where name=?");/*Again spring is expecting two fields, so using email and role*/

    }
}
