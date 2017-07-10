package com.sivserver.example.placement;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 07/07/2017.
 */
public interface CampusRequestHeaderRepository extends CrudRepository<CampusRequestHeader, String> {
    CampusRequestHeader findByrequestid(String requestid);
}
