package com.sivserver.example.admission;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Seetha on 30-Jun-17.
 */
public interface FirstAidEntryRepository extends CrudRepository<FirstAidEntry, String> {
    Iterable<FirstAidEntry> findAllByregno(String regno);
}
