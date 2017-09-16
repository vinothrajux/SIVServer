package com.sivserver.example.admission;

/**
 * Created by Seetha on 27-Jun-17.
 */

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentAcademicInfoRepository extends JpaRepository<StudentAcademicInfo,String> {
    StudentAcademicInfo findByRegno(String regno);
    StudentAcademicInfoProjection findOneByRegno(String regno);
}
