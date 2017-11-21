package com.sivserver.example.teachingstaff;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 07/11/2017.
 */
public interface StudentHomeWorkPlaySchoolRepository extends JpaRepository<StudentHomeWorkPlaySchool, String> {
StudentHomeWorkPlaySchool findByHomeworkid(String homeworkid);
}
