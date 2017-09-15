package com.sivserver.example.placement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 14/07/2017.
 */
public interface CampusSchedulerRepository extends JpaRepository<CampusScheduler, String> {
    CampusScheduler findByscheduleid(String scheduleid);
}
