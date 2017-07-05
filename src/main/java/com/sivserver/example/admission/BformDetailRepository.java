package com.sivserver.example.admission;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 01/07/2017.
 */
public interface BformDetailRepository extends CrudRepository<BformDetail, String> {
    BformDetail findByphotoid(String photoid);
}
