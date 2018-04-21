package com.sivserver.example.CashCounter;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Seetha on 02-Apr-18.
 */
public interface SchoolTransportFeesEntryRepository extends JpaRepository<SchoolTransportFeesEntry, String> {

    SchoolTransportFeesEntry findByRegisternumber(String registernumber);
}
