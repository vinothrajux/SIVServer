package com.sivserver.example.institute;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 10/10/2017.
 */
public interface InstituteCourseDetailsRepository extends JpaRepository<InstituteCourseDetails, String> {
    InstituteCourseDetails findByCoursecode(String coursecode);
}
