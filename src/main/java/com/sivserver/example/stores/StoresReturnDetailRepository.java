package com.sivserver.example.stores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 05/07/2017.
 */
public interface StoresReturnDetailRepository extends JpaRepository<StoresReturnDetail, String> {
    StoresReturnDetail findByBillno(String billno);
}
