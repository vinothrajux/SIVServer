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
@RequestMapping("/api/v1/storespurchasedetail")

public class StoresPurchaseDetailApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private StoresPurchaseDetailRepository storesPurchaseDetailRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void storesPurDet(
            @RequestParam(value = "vendorId", required = false) String vendorId,
            @RequestParam(value = "billno", required = false) String billno,
            @RequestParam(value = "itemHsnCode", required = false) String itemHsnCode,
            @RequestParam(value = "itemName", required = false) String itemName,
            @RequestParam(value = "itemQuantity", required = false) Integer itemQuantity,
            @RequestParam(value = "itemUnitPrice", required = false) Long itemUnitPrice,
            @RequestParam(value = "itemTotalPrice", required = false) Long itemTotalPrice
                ) {
        StoresPurchaseDetail storepurchdet = new StoresPurchaseDetail();
        storepurchdet.setVendorId(vendorId);
        storepurchdet.setBillNo(billno);
        storepurchdet.setItemHSNCode(itemHsnCode);
        storepurchdet.setItemName(itemName);
        storepurchdet.setItemQuantity(itemQuantity);
        storepurchdet.setItemUnitPrice(itemUnitPrice);
        storepurchdet.setItemTotalPrice(itemTotalPrice);


        storesPurchaseDetailRepository.save(storepurchdet);


    }

}
