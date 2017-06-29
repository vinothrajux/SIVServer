package com.sivserver.example.CashCounter;

/**
 * Created by Seetha on 20-Jun-17.
 */
import org.springframework.data.repository.CrudRepository;

public interface FeesPaymentRepository extends CrudRepository<FeesPayment, String> {
    FeesPayment findBybillno(String billno);
}