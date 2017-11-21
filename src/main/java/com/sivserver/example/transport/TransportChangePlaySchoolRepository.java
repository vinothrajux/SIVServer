package com.sivserver.example.transport;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 07/11/2017.
 */
public interface TransportChangePlaySchoolRepository extends JpaRepository<TransportChangePlaySchool, String>{
    TransportChangePlaySchool findByTransportchangeid(String transportchangeid);
}
