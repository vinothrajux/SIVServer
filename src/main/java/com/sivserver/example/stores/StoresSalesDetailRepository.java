package com.sivserver.example.stores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 05/07/2017.
 */
public interface StoresSalesDetailRepository extends JpaRepository<StoresSalesDetail, String> {
    StoresSalesDetail findByBillno(String billno);
}
