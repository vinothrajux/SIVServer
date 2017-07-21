package com.sivserver.example.placement;

import com.sivserver.example.parent.StudentLeaveLetter;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 07/07/2017.
 */
public interface CorporateHeaderRepository extends CrudRepository<CorporateHeader, String> {
    CorporateHeader findBycorporateid(String corporateid);
}
