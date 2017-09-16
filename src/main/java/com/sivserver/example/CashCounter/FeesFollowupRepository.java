package com.sivserver.example.CashCounter;



/**
 * Created by Seetha on 30-Jun-17.
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface FeesFollowupRepository extends JpaRepository<FeesFollowup, String> {
    FeesFollowup findByRegno(String regno);
}
