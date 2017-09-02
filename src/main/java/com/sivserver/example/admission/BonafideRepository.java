package com.sivserver.example.admission;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Seetha on 30-Jun-17.
 */
public interface BonafideRepository extends JpaRepository<Bonafide, String> {
    Bonafide findByBonafideid(String bonafideid);
    BonafideProjection findOneByBonafideid(String bonafideid);
}
