package com.sivserver.example.transport;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Seetha on 10-Jul-17.
 */
public interface TransportIdCardRepository extends CrudRepository<TransportIdCard, String> {
    TransportIdCard findByregno(String regno);
}

