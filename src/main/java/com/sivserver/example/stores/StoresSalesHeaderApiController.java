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
@RequestMapping("/api/v1/storessalesheader")

public class StoresSalesHeaderApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private StoresSalesHeaderRepository storesSalesHeaderRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void storesSaleHead(
            @RequestParam(value = "salesDate", required = false) Date salesDate,
            @RequestParam(value = "billno", required = false) String billno,
            @RequestParam(value = "regno", required = false) String regno,
            @RequestParam(value = "branchcode", required = false) String branchcode,
            @RequestParam(value = "batch", required = false) String batch,
            @RequestParam(value = "semester", required = false) Integer semester,
            @RequestParam(value = "academicYear", required = false) String academicYear,
            @RequestParam(value = "totalAmount", required = false) Long totalAmount,
            @RequestParam(value = "paidAmount", required = false) Long paidAmount,
            @RequestParam(value = "balanceAmount", required = false) Long balanceAmount,
            @RequestParam(value = "dueDate", required = false) Date dueDate,
            @RequestParam(value = "paymentMode", required = false) String paymentMode,
            @RequestParam(value = "chequeDate", required = false) Date chequeDate,
            @RequestParam(value = "chequeNo", required = false) String chequeNo,
            @RequestParam(value = "bankName", required = false) String bankName,
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        StoresSalesHeader storesaleshead = new StoresSalesHeader();
        storesaleshead.setSalesDate(salesDate);
        storesaleshead.setBillno(billno);
        storesaleshead.setRegno(regno);
        storesaleshead.setBranchCode(branchcode);
        storesaleshead.setBatch(batch);
        storesaleshead.setSemester(semester);
        storesaleshead.setAcademicYear(academicYear);
        storesaleshead.setTotalAmount(totalAmount);
        storesaleshead.setPaidAmount(paidAmount);
        storesaleshead.setBalanceAmount(balanceAmount);
        storesaleshead.setDueDate(dueDate);
        storesaleshead.setPaymentMode(paymentMode);
        storesaleshead.setChequeDate(chequeDate);
        storesaleshead.setChequeNo(chequeNo);
        storesaleshead.setBankName(bankName);
        storesaleshead.setLoginUser(loginuser);

        storesSalesHeaderRepository.save(storesaleshead);


    }

}
