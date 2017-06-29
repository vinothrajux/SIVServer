package com.sivserver.example.user;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 24/06/2017.
 */
public interface UsersStaffRepository extends CrudRepository<UsersStaff, String> {
    User findByUsername(String username);
}
