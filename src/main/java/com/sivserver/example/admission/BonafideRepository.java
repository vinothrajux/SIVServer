package com.sivserver.example.admission;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Seetha on 30-Jun-17.
 */
public interface BonafideRepository extends CrudRepository<Bonafide, String> {
    ApplicationSale findByregno(String regno);
}
