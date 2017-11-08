package com.sivserver.example.teachingstaff;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 08/11/2017.
 */
public interface StudentsMonthlyProgressPlaySchoolRepository extends JpaRepository<StudentsMonthlyProgressPlaySchool,String> {
StudentsMonthlyProgressPlaySchool findByRemark_id(String remark_id);
}
