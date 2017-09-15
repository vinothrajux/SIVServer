package com.sivserver.example.sports;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Created by GBCorp on 15/07/2017.
 */
@RestController
@RequestMapping("/api/v1/sportskitspurchasedetail")

public class SportsKitsPurchaseDetailApiController {
    //@Autowired
    private SportsKitsPurchaseDetailRepository sportsKitsPurchaseDetailRepository;

    @GetMapping(value="/all")

    public List<SportsKitsPurchaseDetail> getSportsKitsPurchaseDetail() {return sportsKitsPurchaseDetailRepository.findAll();}

    public SportsKitsPurchaseDetailApiController(SportsKitsPurchaseDetailRepository sportsKitsPurchaseDetailRepository)
    {
        this.sportsKitsPurchaseDetailRepository = sportsKitsPurchaseDetailRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void sportskitspurdet(
            @RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "billno", required = false) String billno,
            @RequestParam(value = "itemHsncode", required = false) String itemHsncode,
            @RequestParam(value = "itemname", required = false) String itemname,
            @RequestParam(value = "itemquantity", required = false) Integer itemquantity,
            @RequestParam(value = "itemunitprice", required = false) Long itemunitprice,
            @RequestParam(value = "itemtotalprice", required = false) Long itemtotalprice
    ) {
        SportsKitsPurchaseDetail sportkitpurdet = new SportsKitsPurchaseDetail();
        SportsKitsPurchaseHeader sportsKitsPurchaseHeader = new SportsKitsPurchaseHeader(billno);
        sportkitpurdet.setId(id);
        sportkitpurdet.setBillno(billno);
        sportkitpurdet.setItemHsncode(itemHsncode);
        sportkitpurdet.setItemname(itemname);
        sportkitpurdet.setItemquantity(itemquantity);
        sportkitpurdet.setItemunitprice(itemunitprice);
        sportkitpurdet.setItemtotalprice(itemtotalprice);


        sportsKitsPurchaseDetailRepository.save(sportkitpurdet);


    }

}
