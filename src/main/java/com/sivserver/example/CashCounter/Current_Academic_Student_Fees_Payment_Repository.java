package com.sivserver.example.CashCounter;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 10/09/2017.
 */
public interface Current_Academic_Student_Fees_Payment_Repository extends JpaRepository<Current_Academic_Student_Fees_Payment, String> {
    Current_Academic_Student_Fees_Payment findByRegno(String regno);
}
