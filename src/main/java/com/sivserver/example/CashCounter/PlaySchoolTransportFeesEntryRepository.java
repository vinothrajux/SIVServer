package com.sivserver.example.CashCounter;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Seetha on 18-Dec-17.
 */
public interface PlaySchoolTransportFeesEntryRepository extends JpaRepository<PlaySchoolTransportFeesEntry, String> {

    PlaySchoolTransportFeesEntry findByRegisternumber(String registernumber);
}
