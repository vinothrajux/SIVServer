package com.sivserver.example.transport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by Seetha on 19-Jul-17.
 */
@RestController
@RequestMapping("/api/v1/fuelfilling")

public class FuelFillingApiController extends WebMvcConfigurerAdapter {

    @Autowired
    private FuelFillingRepository fuelfillingRepository;

    @RequestMapping(method = RequestMethod.POST)
    public void fuelfilling(
            @RequestParam(value = "currentdate", required = false) Date currentdate,
            @RequestParam(value = "vehicleno", required = false) String vehicleno,
            @RequestParam(value = "vehicletype", required = false) String vehicletype,
            @RequestParam(value = "fillingstation", required = false) String fillingstation,
            @RequestParam(value = "fillingstationmobno", required = false) Long fillingstationmobno,
            @RequestParam(value = "driverid", required = false) String driverid,
            @RequestParam(value = "drivername", required = false) String drivername,
            @RequestParam(value = "nooflitres", required = false) String nooflitres,
            @RequestParam(value = "fillingtimekms", required = false) Long fillingtimekms,
            @RequestParam(value = "amount", required = false) Long amount,
            @RequestParam(value = "lastfilleddate", required = false) Date lastfilleddate,
            @RequestParam(value = "lastfilledlitres", required = false) String lastfilledlitres,
            @RequestParam(value = "lastfillingkms", required = false) Long lastfillingkms,
            @RequestParam(value = "totalkilometers", required = false) Long totalkilometers,
            @RequestParam(value = "loginuser", required = false) String loginuser

    )
    {
        FuelFilling fuel = new FuelFilling();
        fuel.setCurrentdate(currentdate);
        fuel.setVehicleno(vehicleno);
        fuel.setVehicletype(vehicletype);
        fuel.setFillingstation(fillingstation);
        fuel.setFillingstationmobno(fillingstationmobno);
        fuel.setDriverid(driverid);
        fuel.setDrivername(drivername);
        fuel.setNooflitres(nooflitres);
        fuel.setFillingtimekms(fillingtimekms);
        fuel.setAmount(amount);
        fuel.setLastfilleddate(lastfilleddate);
        fuel.setLastfilledlitres(lastfilledlitres);
        fuel.setLastfillingkms(lastfillingkms);
        fuel.setTotalkilometers(totalkilometers);
        fuel.setLoginuser(loginuser);

        fuelfillingRepository.save(fuel);


    }
}




