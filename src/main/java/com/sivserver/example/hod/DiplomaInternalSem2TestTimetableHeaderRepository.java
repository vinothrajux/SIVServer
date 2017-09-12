package com.sivserver.example.hod;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 04/07/2017.
 */
public interface DiplomaInternalSem2TestTimetableHeaderRepository extends JpaRepository<DiplomaInternalSem2TestTimetableHeader, String> {
    //DiplomaInternalSem2TestTimetableHeader findBytestid(String testid);
}
