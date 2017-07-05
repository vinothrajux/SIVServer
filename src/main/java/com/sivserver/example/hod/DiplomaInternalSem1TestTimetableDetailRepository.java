package com.sivserver.example.hod;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 04/07/2017.
 */
public interface DiplomaInternalSem1TestTimetableDetailRepository extends CrudRepository<DiplomaInternalSem1TestTimetableDetail, String> {
    DiplomaInternalSem1TestTimetableDetail findBytestid(String testid);
}
