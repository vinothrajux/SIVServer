package com.sivserver.example.management;


import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Seetha on 19-Jun-17.
 */
@RestController
@RequestMapping("/api/v1/transportfeessetting")

public class TransportFeesSettingApiController extends WebMvcConfigurerAdapter {

    @Autowired
    private TransportFeesSettingRepository transportfeessettingRepository;

    @Autowired
    private BusDetailRepository busDetailRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void transportFeesSetting(
            @RequestParam(value = "feessettingdate", required = false) Date feessettingdate,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "route", required = false) String route,
            @RequestParam(value = "stage", required = false) String stage,
            @RequestParam(value = "amount", required = false) Long amount,
            @RequestParam(value = "loginuser", required = false) String loginuser,
            @RequestParam(value = "busno", required = false) String busno,
            @RequestParam(value = "drivername", required = false) String drivername,
            @RequestParam(value = "seatno", required = false) String seatno


    )

    {
        TransportFeesSetting transportfeessett = new TransportFeesSetting();
        BusDetail busDetail = new BusDetail();
        //create primary composite keys class name here

        transportfeessett.setFeesSettingdate(feessettingdate);
        transportfeessett.setAcademicyear(academicyear);
        transportfeessett.setRoute(route);
        transportfeessett.setStage(stage);
        transportfeessett.setAmount(amount);
        transportfeessett.setLoginuser(loginuser);

        busDetail.setBusno(busno);
        busDetail.setDrivername(drivername);
        busDetail.setSeatno(seatno);

        transportfeessettingRepository.save(transportfeessett);
        busDetailRepository.save(busDetail);


    }

}