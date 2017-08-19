package com.sivserver.example.student;

/**
 * Created by Seetha on 28-Jun-17.
 */

import org.springframework.data.repository.CrudRepository;

public interface StudentBaseInformationRepository extends CrudRepository<StudentBaseInformation, String> {
    Iterable<StudentBaseInformation> findAllByAcademicyearAndBatchAndSemesterAndBranchcodeAndStudenttype(String academicyear,String batch, String semester, String branchcode, String studenttype);
}

