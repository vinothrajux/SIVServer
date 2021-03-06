package com.sivserver.example.sports;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 15/07/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/sportskitsstock")

public class SportsKitsStockApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private SportsKitsStockRepository sportsKitsStockRepository;



    @RequestMapping(method = RequestMethod.POST)
    public void sportskitsstk(
            @RequestParam(value ="itemcode", required=false) String itemcode,
            @RequestParam(value ="itemname", required=false) String itemname,
            @RequestParam (value="quantityinhand", required=false) Integer quantityinhand,
            @RequestParam (value="itemstatus", required=false) String itemstatus,
            @RequestParam (value="loginuser", required=false) String loginuser


    ) {
        SportsKitsStock sportkitstk = new SportsKitsStock();
        sportkitstk.setItemcode(itemcode);
        sportkitstk.setItemname(itemname);
        sportkitstk.setQuantityinhand(quantityinhand);
        sportkitstk.setItemstatus(itemstatus);
        sportkitstk.setLoginuser(loginuser);

        sportsKitsStockRepository.save(sportkitstk);



    }


}
