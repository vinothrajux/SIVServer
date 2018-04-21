package com.sivserver.example.admission;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Seetha on 02-Apr-18.
 */
public interface AdmissionSchoolRepository extends JpaRepository<AdmissionSchool, String> {

    AdmissionSchool findByApplno(String applno);
    //AdmissionPlaySchool findTopByInstituteidOrderByRegisternumberDesc(Integer instituteid);
    AdmissionSchool findTopByInstituteidAndAcademicyearOrderByRegisternumberDesc(Integer instituteid, String academicyear);
    AdmissionSchoolProjection findOneByApplno(String applno);

}
