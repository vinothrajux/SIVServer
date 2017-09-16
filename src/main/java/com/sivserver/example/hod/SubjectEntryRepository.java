package com.sivserver.example.hod;

/**
 * Created by Seetha on 28-Jun-17.
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SubjectEntryRepository extends JpaRepository<SubjectEntry, String> {
    //SubjectEntry findBysubjectcode(String subjectcode);
}
