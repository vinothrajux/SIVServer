package com.sivserver.example.CashCounter;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 01/07/2017.
 */
public interface AllFeesEntryBaseRepository extends JpaRepository<AllFeesEntryBase, String> {
 //   AllFeesEntryBase findByregno(String regno);
}
