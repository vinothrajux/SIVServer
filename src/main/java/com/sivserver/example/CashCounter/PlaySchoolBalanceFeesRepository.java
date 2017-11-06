package com.sivserver.example.CashCounter;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 01/11/2017.
 */
public interface PlaySchoolBalanceFeesRepository extends JpaRepository<PlaySchoolBalanceFees, String> {
PlaySchoolBalanceFees findByRegisternumber(String registernumber);
}
