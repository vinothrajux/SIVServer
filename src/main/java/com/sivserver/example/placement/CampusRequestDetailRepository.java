package com.sivserver.example.placement;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 14/07/2017.
 */
public interface CampusRequestDetailRepository extends CrudRepository<CampusRequestDetail, String> {
    CampusRequestDetail findByrequestid(String requestid);
}
