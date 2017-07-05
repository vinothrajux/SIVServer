package com.sivserver.example.admission;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 01/07/2017.
 */
public interface BformHeaderRepository extends CrudRepository<BformHeader, String> {
    BformHeader findByphotoid(String photoid);
}
