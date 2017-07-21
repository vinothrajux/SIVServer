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
@RequestMapping("/api/v1/sportskitsstock")

public class SportsKitsStockApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private SportsKitsStockRepository sportsKitsStockRepository;

//    @Autowired
//    private ApplicationSaleRepository applicationSaleRepository;
//
//
//    @RequestMapping(method = RequestMethod.GET, value="/getApplcationDetail")
//    public ApplicationSaleDetailProjection getApplcationDetail(@RequestParam (value ="applno") String applicationNumber) {
//        ApplicationSaleDetailProjection applicationDetail = applicationSaleRepository.findOneByApplno(applicationNumber);
//        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
//
//        return applicationDetail;
//
//    }


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
        sportkitstk.setQuanitityinhand(quantityinhand);
        sportkitstk.setItemstatus(itemstatus);
        sportkitstk.setLoginuser(loginuser);

        sportsKitsStockRepository.save(sportkitstk);



    }


}
