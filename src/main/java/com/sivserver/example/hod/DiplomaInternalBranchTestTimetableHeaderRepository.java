package com.sivserver.example.hod;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

/**
 * Created by GBCorp on 03/07/2017.
 */
public interface DiplomaInternalBranchTestTimetableHeaderRepository extends JpaRepository<DiplomaInternalBranchTestTimetableHeader, String> {
 //   DiplomaInternalBranchTestTimetableHeader findBytestid(String testid);
}
