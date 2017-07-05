package com.sivserver.example.hod;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 04/07/2017.
 */
public interface DiplomaInternalSem1TestTimetableHeaderRepository extends CrudRepository<DiplomaInternalSem1TestTimetableHeader, String> {
    DiplomaInternalSem1TestTimetableHeader findBytestid(String testid);
}
