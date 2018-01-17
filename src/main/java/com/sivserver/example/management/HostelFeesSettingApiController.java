package com.sivserver.example.management;

import com.sivserver.example.admission.ApplicationSale;
import com.sivserver.example.management.CollegeFeesSetting;
import com.sivserver.example.management.CollegeFeesSettingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 19-Jun-17.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/hostelfeessetting")

public class HostelFeesSettingApiController {

    @Autowired
    private HostelFeesSettingRepository hostelfeessettingRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void hosteleFeesSetting(
            @RequestParam(value = "feessettingdate", required = false) Date feessettingdate,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "individualroomfees", required = false) Long individualroomfees,
            @RequestParam(value = "grouproomfees", required = false) Long grouproomfees,
            @RequestParam(value = "singlecotfees", required = false) Long singlecotfees,
            @RequestParam(value = "multicotfees", required = false) Long multicotfees,
            @RequestParam(value = "foodfees", required = false) Long foodfees,
            @RequestParam(value = "others", required = false) Long others,
            @RequestParam(value = "totalfees", required = false) Long totalfees,
            @RequestParam(value = "loginuser", required = false) String loginuser
    )
    {
        HostelFeesSetting hostelfeessett = new HostelFeesSetting();
        hostelfeessett.setFeessettingdate(feessettingdate);
        hostelfeessett.setAcademicyear(academicyear);
        hostelfeessett.setIndividualroomfees(individualroomfees);
        hostelfeessett.setGrouproomfees(grouproomfees);
        hostelfeessett.setSinglecotfees(singlecotfees);
        hostelfeessett.setMulticotfees(multicotfees);
        hostelfeessett.setFoodfees(foodfees);
        hostelfeessett.setOthers(others);
        hostelfeessett.setTotalfees(totalfees);
        hostelfeessett.setLoginuser(loginuser);

        hostelfeessettingRepository.save(hostelfeessett);
    }
}