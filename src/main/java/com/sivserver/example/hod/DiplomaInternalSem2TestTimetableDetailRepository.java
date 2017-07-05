package com.sivserver.example.hod;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 04/07/2017.
 */
public interface DiplomaInternalSem2TestTimetableDetailRepository extends CrudRepository<DiplomaInternalSem2TestTimetableDetail, String> {
    DiplomaInternalSem2TestTimetableDetail findBytestid(String testid);
}
