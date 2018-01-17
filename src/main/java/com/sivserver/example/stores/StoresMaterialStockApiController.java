package com.sivserver.example.stores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 05/07/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/storesmaterialstock")

public class StoresMaterialStockApiController  {
    @Autowired
    private StoresMaterialStockRepository storesMaterialStockRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void storesMatStock(
            @RequestParam(value = "itemHsnCode", required = false) String itemHsnCode,
            @RequestParam(value = "itemName", required = false) String itemName,
            @RequestParam(value = "itemStockInHand", required = false) Long itemStockInHand,
            @RequestParam(value = "itemMinimumLevel", required = false) Long itemMinimumLevel

    ) {
        StoresMaterialStock storesMatStk = new StoresMaterialStock();
        storesMatStk.setItemHsnCode(itemHsnCode);
        storesMatStk.setItemName(itemName);
        storesMatStk.setItemStockInHand(itemStockInHand);
        storesMatStk.setItemMinimumLevel(itemMinimumLevel);

        storesMaterialStockRepository.save(storesMatStk);


    }


}
