package com.sivserver.example.transport;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Seetha on 21-Jul-17.
 */
public interface TransportInsuranceRepository extends CrudRepository<TransportInsurance, String> {
    TransportInsurance findBycurrentdate(String currentdate);
}
