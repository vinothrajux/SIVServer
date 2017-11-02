package com.sivserver.example.CashCounter;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 01/11/2017.
 */
public interface PlaySchoolFeesEntryBaseRepository extends JpaRepository<PlaySchoolFeesEntryBase, String> {

    PlaySchoolFeesEntryBase findByRegisternumber(String registernumber);

}
