package com.sivserver.example.sports;

import com.sivserver.example.placement.CorporateHeader;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 14/07/2017.
 */
public interface AtheleteHeaderRepository extends CrudRepository<AtheleteHeader, String> {
    CorporateHeader findByatheleteid(String atheleteid);
}
