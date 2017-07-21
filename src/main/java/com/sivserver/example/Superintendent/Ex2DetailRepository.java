package com.sivserver.example.Superintendent;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 07/07/2017.
 */
public interface Ex2DetailRepository extends CrudRepository<Ex2Detail, String> {
    Ex2Detail findByquestioncode(String questioncode);
}
