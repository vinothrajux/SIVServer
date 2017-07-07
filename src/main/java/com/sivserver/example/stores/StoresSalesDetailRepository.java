package com.sivserver.example.stores;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 05/07/2017.
 */
public interface StoresSalesDetailRepository extends CrudRepository<StoresSalesDetail, String> {
    StoresSalesDetail findBybillno(String billno);
}
