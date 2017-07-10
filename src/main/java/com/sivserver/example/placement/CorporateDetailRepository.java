package com.sivserver.example.placement;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 07/07/2017.
 */
public interface CorporateDetailRepository extends CrudRepository<CorporateDetail, String> {
    CorporateDetail findBycorporateid(String corporateid);
}
