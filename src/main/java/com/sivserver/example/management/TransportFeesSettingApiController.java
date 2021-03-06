package com.sivserver.example.management;


import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 19-Jun-17.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/transportfeessetting")

public class TransportFeesSettingApiController {

    @Autowired
    private TransportFeesSettingRepository transportfeessettingRepository;

    @Autowired
    private BusDetailRepository busDetailRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void transportFeesSetting(
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "stage", required = false) String stage,
            @RequestParam(value = "feessettingdate", required = false) Date feessettingdate,
            @RequestParam(value = "route", required = false) String route,
            @RequestParam(value = "amount", required = false) Long amount,
            @RequestParam(value = "loginuser", required = false) String loginuser,
            @RequestParam(value = "busno", required = false) String busno,
            @RequestParam(value = "drivername", required = false) String drivername,
            @RequestParam(value = "seatno", required = false) String seatno,
            @RequestParam(value = "instituteid", required = false) Integer instituteid


    )

    {
        TransportFeesSetting transportfeessett = new TransportFeesSetting();
        Management_Transport_Fees_Compound_Key key = new Management_Transport_Fees_Compound_Key(academicyear, stage,instituteid);
      //  TransportFeesSetting key = new BusDetail();
        //create primary composite keys class name here

        transportfeessett.setFeessettingdate(feessettingdate);
        transportfeessett.setRoute(route);
        transportfeessett.setAmount(amount);
        transportfeessett.setLoginuser(loginuser);

        //busDetail.setBusno(busno);
        //busDetail.setDrivername(drivername);
        //busDetail.setSeatno(seatno);

        transportfeessettingRepository.save(transportfeessett);
        //busDetailRepository.save(busDetail);


    }

}