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
@RequestMapping("/api/v1/storespurchasedetail")

public class StoresPurchaseDetailApiController {
    //@Autowired
    private StoresPurchaseDetailRepository storesPurchaseDetailRepository;

    @GetMapping(value="/all")

    public List<StoresPurchaseDetail>  getStoresPurchaseDetail() {return storesPurchaseDetailRepository.findAll();}

    public StoresPurchaseDetailApiController(StoresPurchaseDetailRepository storesPurchaseDetailRepository)
    {
        this.storesPurchaseDetailRepository = storesPurchaseDetailRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void storesPurDet(
            @RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "vendorId", required = false) String vendorId,
            @RequestParam(value = "billno", required = false) String billno,
            @RequestParam(value = "itemHsnCode", required = false) String itemHsnCode,
            @RequestParam(value = "itemName", required = false) String itemName,
            @RequestParam(value = "itemQuantity", required = false) Integer itemQuantity,
            @RequestParam(value = "itemUnitPrice", required = false) Long itemUnitPrice,
            @RequestParam(value = "itemTotalPrice", required = false) Long itemTotalPrice
                ) {
        StoresPurchaseDetail storepurchdet = new StoresPurchaseDetail();
        StoresPurchaseHeader storesPurchaseHeader = new StoresPurchaseHeader(billno);
        storepurchdet.setId(id);
        storepurchdet.setVendorId(vendorId);
        storepurchdet.setBillno(billno);
        storepurchdet.setItemHsnCode(itemHsnCode);
        storepurchdet.setItemName(itemName);
        storepurchdet.setItemQuantity(itemQuantity);
        storepurchdet.setItemUnitPrice(itemUnitPrice);
        storepurchdet.setItemTotalPrice(itemTotalPrice);


        storesPurchaseDetailRepository.save(storepurchdet);


    }

}
