package com.sivserver.example.CashCounter;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 06/11/2017.
 */
public interface FeesPaymentPlaySchoolRepository extends JpaRepository<FeesPaymentPlaySchool, String> {
    FeesPaymentPlaySchool findByBillno(String billno);
    FeesPaymentPlaySchoolProjection findOneByBillno(String billno);
}
