package com.sivserver.example.sports;

import com.sivserver.example.placement.CorporateHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 15/07/2017.
 */
public interface SportsKitsStockRepository extends JpaRepository<SportsKitsStock, String> {
    SportsKitsStock findByitemcode(String itemcode);
}
