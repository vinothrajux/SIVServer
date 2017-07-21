package com.sivserver.example.sports;

import org.springframework.data.repository.CrudRepository;

import java.util.Date;

/**
 * Created by GBCorp on 17/07/2017.
 */
public interface SportsOdFormRepository extends CrudRepository<SportsOdForm, Date> {
    SportsOdForm findBycurrentdate(Date currentdate);
}