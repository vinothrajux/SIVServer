package com.sivserver.example.hod;

import org.springframework.data.repository.CrudRepository;

import java.util.Date;

/**
 * Created by GBCorp on 03/07/2017.
 */
public interface DiplomaInternalBranchTestTimetableDetailRepository extends CrudRepository<DiplomaInternalBranchTestTimetableDetail, String> {
    DiplomaInternalBranchTestTimetableDetail findBytestid(String testid);
}
