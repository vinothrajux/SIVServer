package com.sivserver.example.hod;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 02/07/2017.
 */
public interface StudentRemarksActionRepository extends CrudRepository<StudentRemarksAction, String> {
    StudentRemarksAction findByregno(String regno);
}
