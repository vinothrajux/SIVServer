package com.sivserver.example.primarykey;

import com.sivserver.example.security.SecurityLateComers;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 22/08/2017.
 */
public interface Users_New_Repository extends JpaRepository<User_New, String> {
   User_New findByRegno(String Regno);
}
