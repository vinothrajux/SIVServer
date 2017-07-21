package com.sivserver.example.transport;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Seetha on 19-Jul-17.
 */
public interface FuelFillingRepository extends CrudRepository<FuelFilling, String> {
    MtcConcession findBycurrentdate(String currentdate);
}

