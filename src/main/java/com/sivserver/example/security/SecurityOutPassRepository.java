package com.sivserver.example.security;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 03/08/2017.
 */
public interface SecurityOutPassRepository extends CrudRepository<SecurityOutPass, String> {
    SecurityOutPass findByOutpassid(String outpassid);
}
