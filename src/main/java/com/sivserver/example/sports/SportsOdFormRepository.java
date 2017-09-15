package com.sivserver.example.sports;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

/**
 * Created by GBCorp on 17/07/2017.
 */
public interface SportsOdFormRepository extends JpaRepository<SportsOdForm, String> {
    SportsOdForm findByRegno(String regno);
}
