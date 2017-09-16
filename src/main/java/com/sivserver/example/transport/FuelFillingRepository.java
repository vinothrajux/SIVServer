package com.sivserver.example.transport;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Seetha on 19-Jul-17.
 */
public interface FuelFillingRepository extends JpaRepository<FuelFilling, String> {
    FuelFilling findByVehicleno(String vehicleno);
}

