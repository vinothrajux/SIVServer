package com.sivserver.example.steno;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Seetha on 29-Jun-17.
 */
public interface EventsRepository extends JpaRepository<Events, String> {
    Events findBycurrentdate(String currentdate);
}

