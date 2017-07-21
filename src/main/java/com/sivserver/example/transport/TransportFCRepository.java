package com.sivserver.example.transport;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Seetha on 21-Jul-17.
 */
public interface TransportFCRepository extends CrudRepository<TransportFC, String> {
    TransportFC findBycurrentdate(String currentdate);
}

