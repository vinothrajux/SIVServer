package com.sivserver.example.sports;

import com.sivserver.example.placement.CorporateHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

/**
 * Created by GBCorp on 15/07/2017.
 */
public interface SportsKitsPurchaseHeaderRepository extends JpaRepository<SportsKitsPurchaseHeader, Date> {
    CorporateHeader findBypurchasedate(Date purchasedate);
}
