package com.sivserver.example.foreignkey;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 29/08/2017.
 */
public interface For_User_Repository extends JpaRepository<For_User, String> {
    For_User findByRegno(String regno);
}
