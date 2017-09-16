package com.sivserver.example.CashCounter;

/**
 * Created by Seetha on 20-Jun-17.
 */
import org.springframework.data.repository.CrudRepository;

public interface AllFeesPaymentRepository extends CrudRepository<AllFeesPayment, String> {
    AllFeesPayment findBybillno(String billno);
}