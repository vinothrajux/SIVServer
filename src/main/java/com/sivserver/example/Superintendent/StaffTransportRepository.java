package com.sivserver.example.Superintendent;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Seetha on 01-Jul-17.
 */
public interface StaffTransportRepository extends CrudRepository<StaffTransport, String> {
    StaffTransport findBystaffid(String staffid);
}

