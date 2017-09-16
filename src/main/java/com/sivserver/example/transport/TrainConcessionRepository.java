package com.sivserver.example.transport;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Seetha on 17-Jul-17.
 */
public interface TrainConcessionRepository extends JpaRepository<TrainConcession, String> {
    TrainConcession findByregno(String regno);
}

