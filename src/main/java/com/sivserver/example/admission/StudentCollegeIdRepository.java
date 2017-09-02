package com.sivserver.example.admission;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
/**
 * Created by GBCorp on 30/06/2017.
 */
public interface StudentCollegeIdRepository extends JpaRepository<StudentCollegeId, String> {
        StudentCollegeId findByregno(String regno);
}
