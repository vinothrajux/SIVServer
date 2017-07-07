package com.sivserver.example.CashCounter;



/**
 * Created by Seetha on 30-Jun-17.
 */

import org.springframework.data.repository.CrudRepository;

public interface FeesFollowupRepository extends CrudRepository<FeesFollowup, String> {
    FeesFollowup findByregno(String regno);
}
