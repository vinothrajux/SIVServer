package com.sivserver.example.hod;

/**
 * Created by Seetha on 29-Jun-17.
 */
import org.springframework.data.repository.CrudRepository;
public interface SubjectAllocationRepository extends CrudRepository<SubjectAllocation, String> {
    SubjectAllocation findBysubjectcode(String subjectcode);

}
