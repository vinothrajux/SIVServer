package com.sivserver.example.stores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 05/07/2017.
 */
public class StoresReturnDetailApiController {
    //@Autowired
    private StoresReturnDetailRepository storesReturnDetailRepository;

    @GetMapping(value="/all")

    public List<StoresReturnDetail> getStoresReturnDetail() {return storesReturnDetailRepository.findAll();}

    public StoresReturnDetailApiController(StoresReturnDetailRepository storesReturnDetailRepository)
    {
        this.storesReturnDetailRepository = storesReturnDetailRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void storesRetDet(
            @RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "vendorId", required = false) String vendorId,
            @RequestParam(value = "billno", required = false) String billno,
            @RequestParam(value = "itemHsnCode", required = false) String itemHsnCode,
            @RequestParam(value = "itemName", required = false) String itemName,
            @RequestParam(value = "itemQuantity", required = false) Integer itemQuantity,
            @RequestParam(value = "itemUnitPrice", required = false) Long itemUnitPrice,
            @RequestParam(value = "itemTotalPrice", required = false) Long itemTotalPrice
    ) {
        StoresReturnDetail storesretdet = new StoresReturnDetail();
        StoresReturnHeader storesReturnHeader = new StoresReturnHeader(billno);
        storesretdet.setId(id);
        storesretdet.setVendorId(vendorId);
        storesretdet.setBillno(billno);
        storesretdet.setItemHsnCode(itemHsnCode);
        storesretdet.setItemName(itemName);
        storesretdet.setItemQuantity(itemQuantity);
        storesretdet.setItemUnitPrice(itemUnitPrice);
        storesretdet.setItemTotalPrice(itemTotalPrice);


        storesReturnDetailRepository.save(storesretdet);


    }

}
