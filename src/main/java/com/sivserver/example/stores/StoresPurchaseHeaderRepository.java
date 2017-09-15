package com.sivserver.example.stores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

/**
 * Created by GBCorp on 05/07/2017.
 */
public interface StoresPurchaseHeaderRepository extends JpaRepository<StoresPurchaseHeader, String> {
    StoresPurchaseHeader findByBillno(String billno);
}
