package com.sivserver.example.hod;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 04/07/2017.
 */
public interface DiplomaInternalSem1TestTimetableHeaderRepository extends JpaRepository<DiplomaInternalSem1TestTimetableHeader, String> {
    //iplomaInternalSem1TestTimetableHeader findBytestid(String testid);
}
