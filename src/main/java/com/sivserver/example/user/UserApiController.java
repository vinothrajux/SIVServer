package com.sivserver.example.user;

import com.sivserver.example.utils.SivUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import static sun.misc.Version.println;

/**
 * Created by Seetha on 13-Jun-17.
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private UserRepository userRepository;
    /**
     * give a event id, will return the event details
     * @param name - primary key id
     * @return name
     */
//    @RequestMapping(method = RequestMethod.GET)
//    public @ResponseBody  User getUser(@RequestParam("name") String name) {
//        User i = userRepository.findOne(name);
//        String Username=i.getName();
//        return i;
//        //return this.userRepository.findOne(name);
//    }
    @RequestMapping(method = RequestMethod.GET)
    public User getUser(@RequestParam (value ="name") String username, @RequestParam (value="password") String password) {
        User loginUser = userRepository.findByName(username);
        if(null != loginUser && loginUser.getPassword().contentEquals(password)) {
            return this.userRepository.findByName(username);
        }else{
          return  null;
        }

    }
//    @RequestMapping(method = RequestMethod.GET)
//    public Iterable<User> getUsers(){
//        return this.userRepository.findAll();
//    }
}
