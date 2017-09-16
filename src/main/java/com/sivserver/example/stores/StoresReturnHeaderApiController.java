package com.sivserver.example.stores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 05/07/2017.
 */
@RestController
@RequestMapping("/api/v1/storesreturnheader")

public class StoresReturnHeaderApiController {
    //@Autowired
    private StoresReturnHeaderRepository storesReturnHeaderRepository;

    @GetMapping(value="/all")

    public List<StoresReturnHeader> getStoresReturnHeaderDetail() {return storesReturnHeaderRepository.findAll();}

    public StoresReturnHeaderApiController(StoresReturnHeaderRepository storesReturnHeaderRepository)
    {
        this.storesReturnHeaderRepository = storesReturnHeaderRepository;
    }

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
        StoresVendorDetails storesVendorDetails = new StoresVendorDetails(vendorId);
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
        storeRethead.setLoginuser(loginuser);

        storesReturnHeaderRepository.save(storeRethead);


    }
}
