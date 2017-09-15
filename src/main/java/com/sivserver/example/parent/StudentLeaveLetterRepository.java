package com.sivserver.example.parent;

import com.sivserver.example.admission.StudentFood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

/**
 * Created by GBCorp on 29/06/2017.
 */
    public interface StudentLeaveLetterRepository extends JpaRepository<StudentLeaveLetter, Date> {
    StudentLeaveLetter findByFromdate(Date fromdate);
}
