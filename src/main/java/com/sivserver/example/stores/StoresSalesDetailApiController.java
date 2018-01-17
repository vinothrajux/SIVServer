package com.sivserver.example.stores;

import com.sivserver.example.student.StudentBaseInformation;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 15/09/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/storessalesdetail")
public class StoresSalesDetailApiController {

    private StoresSalesDetailRepository storesSalesDetailRepository ;

    @GetMapping(value="/all")

    public List<StoresSalesDetail>  getStoresSalesDetail() {return storesSalesDetailRepository.findAll();}

    public StoresSalesDetailApiController(StoresSalesDetailRepository storesSalesDetailRepository)
    {
        this.storesSalesDetailRepository = storesSalesDetailRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void storesSaleDetail(
            @RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "billno", required = false) String billno,
            @RequestParam(value = "itemHsnCode", required = false) String itemHsnCode,
            @RequestParam(value = "itemName", required = false) String itemName,
            @RequestParam(value = "itemQuantity", required = false) Integer itemQuantity,
            @RequestParam(value = "itemUnitPrice", required = false) Long itemUnitPrice,
            @RequestParam(value = "itemTotalPrice", required = false) Long itemTotalPrice

    ) {
        StoresSalesDetail storesalesdet = new StoresSalesDetail();
        StoresSalesHeader storesSaleHeader = new StoresSalesHeader(billno);
        storesalesdet.setId(id);
        storesalesdet.setBillno(billno);
        storesalesdet.setItemHsnCode(itemHsnCode);
        storesalesdet.setItemName(itemName);
        storesalesdet.setItemQuantity(itemQuantity);
        storesalesdet.setItemUnitPrice(itemUnitPrice);
        storesalesdet.setItemTotalPrice(itemTotalPrice);

        storesSalesDetailRepository.save(storesalesdet);


    }

}

