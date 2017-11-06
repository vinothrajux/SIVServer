package com.sivserver.example.admission;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 31/10/2017.
 */
public interface AdmissionPlaySchoolRepository extends JpaRepository<AdmissionPlaySchool, String> {
AdmissionPlaySchool findByApplno(String applno);
}
