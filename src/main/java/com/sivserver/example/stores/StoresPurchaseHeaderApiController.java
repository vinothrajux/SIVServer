package com.sivserver.example.stores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 05/07/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/storespurchaseheader")

public class StoresPurchaseHeaderApiController  {
   // @Autowired
    private StoresPurchaseHeaderRepository storesPurchaseHeaderRepository;

    @GetMapping("value=/all")

    public List<StoresPurchaseHeader> getStoresPurchaseHeaderDetail() {return storesPurchaseHeaderRepository.findAll();}

    public StoresPurchaseHeaderApiController(StoresPurchaseHeaderRepository storesPurchaseHeaderRepository)
    {
        this.storesPurchaseHeaderRepository = storesPurchaseHeaderRepository;
    }


    @RequestMapping(method = RequestMethod.POST)

    public void storesPurHead(
            @RequestParam(value = "purchaseDate", required = false) Date purchaseDate,
            @RequestParam(value = "billno", required = false) String billno,
            @RequestParam(value = "vendorId", required = false) String vendorId,
            @RequestParam(value = "totalAmount", required = false) Long totalAmount,
            @RequestParam(value = "paidAmount", required = false) Long paidAmount,
            @RequestParam(value = "balanceAmount", required = false) Long balanceAmount,
            @RequestParam(value = "dueDate", required = false) Date dueDate,
            @RequestParam(value = "paymentMode", required = false) String paymentMode,
            @RequestParam(value = "chequeDate", required = false) Date chequeDate,
            @RequestParam(value = "chequeNo", required = false) String chequeNo,
            @RequestParam(value = "bankName", required = false) String bankName,
            @RequestParam(value = "academicYear", required = false) String academicYear,
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        StoresPurchaseHeader storepurchhead = new StoresPurchaseHeader();
        StoresVendorDetails storesVendorDetails = new StoresVendorDetails(vendorId);
        storepurchhead.setPurchaseDate(purchaseDate);
        storepurchhead.setBillno(billno);
        storepurchhead.setVendorId(vendorId);
        storepurchhead.setTotalAmount(totalAmount);
        storepurchhead.setPaidAmount(paidAmount);
        storepurchhead.setBalanceAmount(balanceAmount);
        storepurchhead.setDueDate(dueDate);
        storepurchhead.setPaymentMode(paymentMode);
        storepurchhead.setChequeDate(chequeDate);
        storepurchhead.setChequeNo(chequeNo);
        storepurchhead.setBankName(bankName);
        storepurchhead.setAcademicYear(academicYear);
        storepurchhead.setLoginuser(loginuser);

        storesPurchaseHeaderRepository.save(storepurchhead);


    }

}
