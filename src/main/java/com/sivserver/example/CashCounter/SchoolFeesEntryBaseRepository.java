package com.sivserver.example.CashCounter;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Seetha on 02-Apr-18.
 */
public interface SchoolFeesEntryBaseRepository extends JpaRepository<SchoolFeesEntryBase, String> {
    SchoolFeesEntryBase findByRegisternumber(String registernumber);
    SchoolFeesEntryBaseProjection findOneByRegisternumber(String registernumber);

}
