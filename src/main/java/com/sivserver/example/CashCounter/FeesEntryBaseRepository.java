package com.sivserver.example.CashCounter;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 01/07/2017.
 */
public interface FeesEntryBaseRepository  extends CrudRepository<FeesEntryBase, String> {
    FeesEntryBase findByregno(String regno);
}
