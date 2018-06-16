package com.sivserver.example.teachingstaff;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Seetha on 24-Apr-18.
 */
public interface SchoolTestExamTimeTableRepository extends JpaRepository<SchoolTestExamTimeTable, SchoolTestExamTimeTableCompoundKey> {
    SchoolTestExamTimeTable findBySchoolTestExamTimeTableCompoundKey(SchoolTestExamTimeTableCompoundKey schoolTestExamTimeTableCompoundKey);
}
