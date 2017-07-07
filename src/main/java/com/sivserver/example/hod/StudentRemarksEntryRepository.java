package com.sivserver.example.hod;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 01/07/2017.
 */
public interface StudentRemarksEntryRepository extends CrudRepository<StudentRemarksEntry, String> {
    StudentRemarksEntry findByregno(String regno);
}
