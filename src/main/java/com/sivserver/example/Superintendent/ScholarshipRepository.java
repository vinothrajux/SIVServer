package com.sivserver.example.Superintendent;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Seetha on 01-Jul-17.
 */
public interface ScholarshipRepository extends JpaRepository<Scholarship, String> {
    Scholarship findByregno(String regno);
}
