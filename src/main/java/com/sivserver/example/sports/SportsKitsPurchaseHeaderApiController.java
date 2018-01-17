package com.sivserver.example.sports;

import com.sivserver.example.stores.StoresPurchaseHeader;
import com.sivserver.example.stores.StoresPurchaseHeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 15/07/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/storeskitspurchaseheader")

public class SportsKitsPurchaseHeaderApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private SportsKitsPurchaseHeaderRepository sportsKitsPurchaseHeaderRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void sportskitsPurHead(
            @RequestParam(value = "purchasedate", required = false) Date purchasedate,
            @RequestParam(value = "billno", required = false) String billno,
            @RequestParam(value = "vendorid", required = false) String vendorid,
            @RequestParam(value = "totalamount", required = false) Long totalamount,
            @RequestParam(value = "paidamount", required = false) Long paidamount,
            @RequestParam(value = "balanceamount", required = false) Long balanceamount,
            @RequestParam(value = "duedate", required = false) Date duedate,
            @RequestParam(value = "paymentmode", required = false) String paymentmode,
            @RequestParam(value = "chequedate", required = false) Date chequedate,
            @RequestParam(value = "chequeno", required = false) String chequeno,
            @RequestParam(value = "bankname", required = false) String bankname,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        SportsKitsPurchaseHeader sportskitspurhead = new SportsKitsPurchaseHeader();
        sportskitspurhead.setPurchasedate(purchasedate);
        sportskitspurhead.setBillno(billno);
        sportskitspurhead.setVendorid(vendorid);
        sportskitspurhead.setTotalamount(totalamount);
        sportskitspurhead.setPaidamount(paidamount);
        sportskitspurhead.setBalanceamount(balanceamount);
        sportskitspurhead.setDuedate(duedate);
        sportskitspurhead.setPaymentmode(paymentmode);
        sportskitspurhead.setChequedate(chequedate);
        sportskitspurhead.setChequeno(chequeno);
        sportskitspurhead.setBankname(bankname);
        sportskitspurhead.setAcademicyear(academicyear);
        sportskitspurhead.setLoginuser(loginuser);

        sportsKitsPurchaseHeaderRepository.save(sportskitspurhead);


    }

}
