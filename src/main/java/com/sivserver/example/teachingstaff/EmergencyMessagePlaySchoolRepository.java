package com.sivserver.example.teachingstaff;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 07/11/2017.
 */
public interface EmergencyMessagePlaySchoolRepository extends JpaRepository<EmergencyMessagePlaySchool, String> {
EmergencyMessagePlaySchool findByEmergency_message_id(String emergency_message_id);
}
