package com.sivserver.example.sports;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by GBCorp on 15/07/2017.
 */
@RestController
@RequestMapping("/api/v1/sportskitspurchasedetail")

public class SportsKitsPurchaseDetailApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private SportsKitsPurchaseDetailRepository sportsKitsPurchaseDetailRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void sportskitspurdet(
            @RequestParam(value = "vendorid", required = false) String vendorid,
            @RequestParam(value = "billno", required = false) String billno,
            @RequestParam(value = "itemHsncode", required = false) String itemHsncode,
            @RequestParam(value = "itemname", required = false) String itemname,
            @RequestParam(value = "itemquantity", required = false) Integer itemquantity,
            @RequestParam(value = "itemunitprice", required = false) Long itemunitprice,
            @RequestParam(value = "itemtotalprice", required = false) Long itemtotalprice
    ) {
        SportsKitsPurchaseDetail sportkitpurdet = new SportsKitsPurchaseDetail();
        sportkitpurdet.setVendorid(vendorid);
        sportkitpurdet.setBillno(billno);
        sportkitpurdet.setItemhsncode(itemHsncode);
        sportkitpurdet.setItemname(itemname);
        sportkitpurdet.setItemquantity(itemquantity);
        sportkitpurdet.setItemunitprice(itemunitprice);
        sportkitpurdet.setItemtotalprice(itemtotalprice);


        sportsKitsPurchaseDetailRepository.save(sportkitpurdet);


    }

}
