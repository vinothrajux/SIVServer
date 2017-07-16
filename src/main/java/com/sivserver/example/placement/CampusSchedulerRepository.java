package com.sivserver.example.placement;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 14/07/2017.
 */
public interface CampusSchedulerRepository extends CrudRepository<CampusScheduler, String> {
    CampusScheduler findByscheduleid(String scheduleid);
}
