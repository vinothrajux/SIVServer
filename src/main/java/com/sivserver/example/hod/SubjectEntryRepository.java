package com.sivserver.example.hod;

/**
 * Created by Seetha on 28-Jun-17.
 */

import org.springframework.data.repository.CrudRepository;

public interface SubjectEntryRepository extends CrudRepository<SubjectEntry, String> {
    SubjectEntry findBysubjectcode(String subjectcode);
}
