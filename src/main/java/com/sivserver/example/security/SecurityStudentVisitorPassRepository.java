package com.sivserver.example.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Seetha on 02-Aug-17.
 */
public interface SecurityStudentVisitorPassRepository extends JpaRepository<SecurityStudentVisitorPass, String> {
    SecurityStudentVisitorPass findByRegno(String regno);
}
