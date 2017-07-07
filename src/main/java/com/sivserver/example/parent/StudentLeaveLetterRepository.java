package com.sivserver.example.parent;

import com.sivserver.example.admission.StudentFood;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 29/06/2017.
 */
    public interface StudentLeaveLetterRepository extends CrudRepository<StudentLeaveLetter, String> {
    StudentLeaveLetter findByregno(String regno);
}
