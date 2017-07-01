package com.sivserver.example.hod;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Seetha on 29-Jun-17.
 */
public interface QuestionEntryRepository extends CrudRepository<QuestionEntry, String> {
    QuestionEntry findBysno(String sno);
}

