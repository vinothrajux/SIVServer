package com.sivserver.example.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 03/08/2017.
 */
public interface SecurityStudentLateComersRepository extends JpaRepository<SecurityStudentLateComers, String> {
    SecurityStudentLateComers findByLatecomeid(String latecomeid);
}
