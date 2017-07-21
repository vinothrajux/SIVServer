package com.sivserver.example.transport;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Seetha on 17-Jul-17.
 */
public interface MtcConcessionRepository extends CrudRepository<MtcConcession, String> {
    MtcConcession findByregno(String regno);
}

