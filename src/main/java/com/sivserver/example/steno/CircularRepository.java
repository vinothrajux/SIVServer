package com.sivserver.example.steno;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Seetha on 06-Jul-17.
 */
public interface CircularRepository extends CrudRepository<Circular, String> {
    Circular findBycurrentdate(String currentdate);
}

