package com.sivserver.example.transport;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Seetha on 17-Jul-17.
 */
public interface TrainConcessionRepository extends CrudRepository<TrainConcession, String> {
    TrainConcession findByregno(String regno);
}

