package com.sivserver.example.security;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Seetha on 02-Aug-17.
 */
public interface SecurityVehiclesInOutRepository extends CrudRepository<SecurityVehiclesInOut, String> {
    SecurityVehiclesInOut findByStaffid(String staffid);
}
