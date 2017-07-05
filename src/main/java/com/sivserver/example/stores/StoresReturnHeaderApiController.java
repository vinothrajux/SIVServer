package com.sivserver.example.stores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by GBCorp on 05/07/2017.
 */
@RestController
@RequestMapping("/api/v1/storesreturnheader")

public class StoresReturnHeaderApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private StoresReturnHeaderRepository storesReturnHeaderRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void storesRetHead(
            @RequestParam(value = "returnDate", required = false) Date returnDate,
            @RequestParam(value = "billno", required = false) String billno,
            @RequestParam(value = "vendorId", required = false) String vendorId,
            @RequestParam(value = "totalAmount", required = false) Long totalAmount,
            @RequestParam(value = "receivedAmount", required = false) Long receivedAmount,
            @RequestParam(value = "balanceAmount", required = false) Long balanceAmount,
            @RequestParam(value = "dueDate", required = false) Date dueDate,
            @RequestParam(value = "paymentMode", required = false) String paymentMode,
            @RequestParam(value = "chequeDate", required = false) Date chequeDate,
            @RequestParam(value = "chequeNo", required = false) String chequeNo,
            @RequestParam(value = "bankName", required = false) String bankName,
            @RequestParam(value = "academicYear", required = false) String academicYear,
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        StoresReturnHeader storeRethead = new StoresReturnHeader();
        storeRethead.setReturnDate(returnDate);
        storeRethead.setBillno(billno);
        storeRethead.setVendorId(vendorId);
        storeRethead.setTotalAmount(totalAmount);
        storeRethead.setReceivedAmount(receivedAmount);
        storeRethead.setBalanceAmount(balanceAmount);
        storeRethead.setDueDate(dueDate);
        storeRethead.setPaymentMode(paymentMode);
        storeRethead.setChequeDate(chequeDate);
        storeRethead.setChequeNo(chequeNo);
        storeRethead.setBankName(bankName);
        storeRethead.setAcademicYear(academicYear);
        storeRethead.setLoginUser(loginuser);

        storesReturnHeaderRepository.save(storeRethead);


    }
}
