package com.sivserver.example.stores;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 05/07/2017.
 */
public interface StoresMaterialStockRepository extends CrudRepository<StoresMaterialStock, String> {
    StoresMaterialStock findByitemHsnCode(String itemHsnCode);
}
