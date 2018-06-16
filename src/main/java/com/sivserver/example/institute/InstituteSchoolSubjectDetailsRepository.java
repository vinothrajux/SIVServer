package com.sivserver.example.institute;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Seetha on 24-Apr-18.
 */
public interface InstituteSchoolSubjectDetailsRepository extends JpaRepository<InstituteSchoolSubjectDetails, Integer> {

    InstituteSchoolSubjectDetails findByInstituteid(Integer instituteid);
//    InstituteSchoolSubjectDetails findByInstituteid(Integer instituteid);
}
