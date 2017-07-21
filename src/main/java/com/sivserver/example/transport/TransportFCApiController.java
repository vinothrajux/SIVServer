package com.sivserver.example.transport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by Seetha on 21-Jul-17.
 */
@RestController
@RequestMapping("/api/v1/transportfc")

public class TransportFCApiController extends WebMvcConfigurerAdapter {


    @Autowired
    private TransportFCRepository transportfcRepository;

    @RequestMapping(method = RequestMethod.POST)
    public void transportfc(
            @RequestParam(value = "currentdate", required = false) Date currentdate,
            @RequestParam(value = "vehicleid", required = false) String vehicleid,
            @RequestParam(value = "vehicletype", required = false) String vehicletype,
            @RequestParam(value = "dateoffc", required = false) Date dateoffc,
            @RequestParam(value = "expirydate", required = false) Date expirydate,
            @RequestParam(value = "amount", required = false) Long amount,
            @RequestParam(value = "remarks", required = false) String remarks,
            @RequestParam(value = "loginuser", required = false) String loginuser
    ) {
        TransportFC transportfc = new TransportFC();
        transportfc.setCurrentdate(currentdate);
        transportfc.setVehicleid(vehicleid);
        transportfc.setVehicletype(vehicletype);
        transportfc.setDateoffc(dateoffc);
        transportfc.setExpirydate(expirydate);
        transportfc.setAmount(amount);
        transportfc.setRemarks(remarks);
        transportfc.setLoginuser(loginuser);

        transportfcRepository.save(transportfc);


    }

}
