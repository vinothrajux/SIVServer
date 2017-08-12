package com.sivserver.example.management;

import com.sivserver.example.admission.ApplicationSale;
import com.sivserver.example.management.CollegeFeesSetting;
import com.sivserver.example.management.CollegeFeesSettingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by Seetha on 19-Jun-17.
 */
@RestController
@RequestMapping("/api/v1/hostelfeessetting")

public class HostelFeesSettingApiController extends WebMvcConfigurerAdapter {

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
        hostelfeessett.setFeesSettingdate(feessettingdate);
        hostelfeessett.setAcademicyear(academicyear);
        hostelfeessett.setIndividualroomfees(individualroomfees);
        hostelfeessett.setGrouproomfees(grouproomfees);
        hostelfeessett.setSinglecotfees(singlecotfees);
        hostelfeessett.setMulticotfees(multicotfees);
        hostelfeessett.setFoodFees(foodfees);
        hostelfeessett.setOthers(others);
        hostelfeessett.setTotalfees(totalfees);
        hostelfeessett.setLoginuser(loginuser);

        hostelfeessettingRepository.save(hostelfeessett);
    }
}