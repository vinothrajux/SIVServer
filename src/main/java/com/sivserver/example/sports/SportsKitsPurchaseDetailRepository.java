package com.sivserver.example.sports;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 15/07/2017.
 */
public interface SportsKitsPurchaseDetailRepository extends CrudRepository<SportsKitsPurchaseDetail, String> {
    SportsKitsPurchaseDetail findByvendorid(String vendorid);
}
