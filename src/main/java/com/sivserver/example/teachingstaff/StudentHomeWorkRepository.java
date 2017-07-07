package com.sivserver.example.teachingstaff;

import com.sivserver.example.parent.StudentLeaveLetter;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 29/06/2017.
 */
public interface StudentHomeWorkRepository extends CrudRepository<StudentHomeWork, String> {
    StudentLeaveLetter findBysubjectcode(String subjectcode);
}
