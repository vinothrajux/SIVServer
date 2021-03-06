package com.sivserver.example.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 14/09/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/foodfeessetting")

public class FoodFeesSettingApiController {

    @Autowired
    private FoodFeesSettingRepository foodfeessettingRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void foodFeesSetting(
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "feessettingdate", required = false) Date feessettingdate,
            @RequestParam(value = "nonvegfoodfees", required = false) Long nonvegfoodfees,
            @RequestParam(value = "vegfoodfees", required = false) Long vegfoodfees,
            @RequestParam(value = "loginuser", required = false) String loginuser
    )
    {
        FoodFeesSetting foodfeessett = new FoodFeesSetting();
        foodfeessett.setAcademicyear(academicyear);
        foodfeessett.setFeessettingdate(feessettingdate);
        foodfeessett.setNonvegfoodfees(nonvegfoodfees);
        foodfeessett.setVegfoodfees(vegfoodfees);
        foodfeessett.setLoginuser(loginuser);

        foodfeessettingRepository.save(foodfeessett);
    }

}
