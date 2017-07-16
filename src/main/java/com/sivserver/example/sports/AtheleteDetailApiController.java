package com.sivserver.example.sports;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by GBCorp on 14/07/2017.
 */
@RestController
@RequestMapping("/api/v1/atheletedetail")

public class AtheleteDetailApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private AtheleteDetailRepository atheleteDetailRepository;

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
    public void atheletedet(
            @RequestParam(value ="atheleteid", required=false) String atheleteid,
            @RequestParam(value ="typeofsports", required=false) String typeofsports,
            @RequestParam (value="sportscode", required=false) String sportscode,
            @RequestParam (value="areainsports", required=false) String areainsports,
            @RequestParam (value="performancelevel", required=false) String performancelevel,
            @RequestParam (value="house", required=false) String house

    ) {
        AtheleteDetail athleteDet = new AtheleteDetail();
        athleteDet.setAtheleteid (atheleteid);
        athleteDet.setTypeofsports(typeofsports);
        athleteDet.setSportscode(sportscode);
        athleteDet.setAreainsports(areainsports);
        athleteDet.setPerformancelevel(performancelevel);
        athleteDet.setHouse(house);

        atheleteDetailRepository.save(athleteDet);



    }


}
