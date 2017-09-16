package com.sivserver.example.hod;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 04/07/2017.
 */
public interface DiplomaInternalSem1TestTimetableDetailRepository extends JpaRepository<DiplomaInternalSem1TestTimetableDetail, String> {
    DiplomaInternalSem1TestTimetableDetail findByRegno(String regno);
}
