package com.sivserver.example.user;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 24/06/2017.
 */
public interface UsersStudentRepository extends CrudRepository<UsersStudent, String> {
    User findByUsername(String username);
}
