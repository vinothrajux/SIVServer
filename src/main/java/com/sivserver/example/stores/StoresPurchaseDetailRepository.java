package com.sivserver.example.stores;

import org.springframework.data.repository.CrudRepository;

import java.util.Date;

/**
 * Created by GBCorp on 05/07/2017.
 */
public interface StoresPurchaseDetailRepository extends CrudRepository<StoresPurchaseDetail, String> {
    StoresPurchaseDetail findByvendorId(String vendorId);
}
