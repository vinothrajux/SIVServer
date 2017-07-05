package com.sivserver.example.hod;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 04/07/2017.
 */
public interface DiplomaInternalSem2TestTimetableHeaderRepository extends CrudRepository<DiplomaInternalSem2TestTimetableHeader, String> {
    DiplomaInternalSem2TestTimetableHeader findBytestid(String testid);
}
