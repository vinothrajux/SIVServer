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
@RequestMapping("/api/v1/transportinsurance")

public class TransportInsuranceApiController extends WebMvcConfigurerAdapter {

    @Autowired
    private TransportInsuranceRepository transportinsuranceRepository;

    @RequestMapping(method = RequestMethod.POST)
    public void transportinsurance(
            @RequestParam(value = "currentdate", required = false) Date currentdate,
            @RequestParam(value = "vehicleid", required = false) String vehicleid,
            @RequestParam(value = "vehicletype", required = false) String vehicletype,
            @RequestParam(value = "insurancecompany", required = false) String insurancecompany,
            @RequestParam(value = "mobileno", required = false) Long mobileno,
            @RequestParam(value = "insuramount", required = false) Long insuramount,
            @RequestParam(value = "dateofexpiry", required = false) Date dateofexpiry,
            @RequestParam(value = "valofvehic", required = false) String valofvehic,
            @RequestParam(value = "loginuser", required = false) String loginuser

    )
    {
        TransportInsurance trins = new TransportInsurance();
        trins.setCurrentdate(currentdate);
        trins.setVehicleid(vehicleid);
        trins.setVehicletype(vehicletype);
        trins.setInsurancecompany(insurancecompany);
        trins.setMobileno(mobileno);
        trins.setInsuranceamount(insuramount);
        trins.setDateofexpiry(dateofexpiry);
        trins.setValueofvehicle(valofvehic);
        trins.setLoginuser(loginuser);

        transportinsuranceRepository.save(trins);


    }
}


