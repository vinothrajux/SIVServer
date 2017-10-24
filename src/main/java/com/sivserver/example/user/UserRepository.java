package com.sivserver.example.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
    LoginStatusProjection findOneByUsername(String Username);

    //Iterable<> findAllBy
}