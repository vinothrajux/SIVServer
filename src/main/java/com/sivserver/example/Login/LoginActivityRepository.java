package com.sivserver.example.Login;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

/**
 * Created by Seetha on 03-Dec-18.
 */
public interface LoginActivityRepository extends JpaRepository<LoginActivity,String> {
    Iterable<LoginActivity> findByRegisternumberAndInstituteid(String registernumber, Integer instituteid);
    Iterable<LoginActivity> findByRegisternumberAndInstituteidAndLogindate(String registernumber, Integer instituteid, Date logindate);
    Iterable<LoginActivity> findByInstituteidAndLogindateAndUserrole(Integer instituteid, Date logindate,String userrole);
    Iterable<LoginActivity> findByInstituteidAndUserrole(Integer instituteid, String userrole);
}
