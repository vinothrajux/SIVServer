package com.sivserver.example.admission;

import org.springframework.data.repository.CrudRepository;
/**
 * Created by GBCorp on 30/06/2017.
 */
public interface StudentCollegeIdRepository extends CrudRepository <StudentCollegeId, String>{
        StudentCollegeId findByregno(String regno);
}
