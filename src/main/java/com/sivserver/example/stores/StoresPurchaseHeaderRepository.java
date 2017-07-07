package com.sivserver.example.stores;

import org.springframework.data.repository.CrudRepository;

import java.util.Date;

/**
 * Created by GBCorp on 05/07/2017.
 */
public interface StoresPurchaseHeaderRepository extends CrudRepository<StoresPurchaseHeader, Date> {
    StoresPurchaseHeader findBypurchaseDate(Date purchaseDate);
}
