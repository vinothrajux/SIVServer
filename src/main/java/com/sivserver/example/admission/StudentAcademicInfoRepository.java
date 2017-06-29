package com.sivserver.example.admission;

/**
 * Created by Seetha on 27-Jun-17.
 */

import org.springframework.data.repository.CrudRepository;

public interface StudentAcademicInfoRepository extends CrudRepository<StudentAcademicInfo,String>{
    StudentAcademicInfo findByRegno(String regno);
}
