package com.sivserver.example.teachingstaff;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 07/11/2017.
 */
public interface ChildsPickupPlaySchoolRepository extends JpaRepository<ChildsPickupPlaySchool, String > {
ChildsPickupPlaySchool findByPickupid(String pickupid);
}
