package com.sivserver.example.security;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 03/08/2017.
 */
public interface SecurityMaterialInOutHeaderRepository extends CrudRepository<SecurityMaterialInOutHeader, String> {
    SecurityMaterialInOutHeader findByMatgatepassid(String matgatepassid);
}
