package com.sivserver.example.stores;

import org.springframework.data.repository.CrudRepository;

import java.util.Date;

/**
 * Created by GBCorp on 05/07/2017.
 */
public interface StoresReturnHeaderRepository extends CrudRepository<StoresReturnHeader, Date> {
    StoresReturnHeader findByreturnDate(Date returnDate);
}
