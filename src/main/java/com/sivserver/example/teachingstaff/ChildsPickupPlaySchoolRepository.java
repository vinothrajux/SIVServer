package com.sivserver.example.teachingstaff;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

/**
 * Created by GBCorp on 07/11/2017.
 */
public interface ChildsPickupPlaySchoolRepository extends JpaRepository<ChildsPickupPlaySchool, String > {
ChildsPickupPlaySchool findByPickupid(String pickupid);
ChildsPickupPlaySchoolProjection findOneByPickupid(String pickupid);
ChildsPickupPlaySchoolProjection findOneByRegisternumberAndPickupddate(String registernumber, Date pickupddate);
}
