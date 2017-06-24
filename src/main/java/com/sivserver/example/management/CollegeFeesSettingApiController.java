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
@RequestMapping("/api/v1/collegefeessetting")

public class CollegeFeesSettingApiController extends WebMvcConfigurerAdapter {

    @Autowired
    private CollegeFeesSettingRepository collegefeessettingRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void collegeFeesSetting(
            @RequestParam(value = "feessettingdate", required = false) Date feessettingdate,
            @RequestParam(value = "branchname", required = false) String branchname,
            @RequestParam(value = "branchcode", required = false) String branchcode,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "admissionfees", required = false) Long admissionfees,
            @RequestParam(value = "tutionfees", required = false) Long tutionfees,
            @RequestParam(value = "textbookfees", required = false) Long textbookfees,
            @RequestParam(value = "miscalleneousfees", required = false) Long miscalleneousfees,
            @RequestParam(value = "specialfees", required = false) Long specialfees,
            @RequestParam(value = "groupinsurance", required = false) Long groupinsurance,
            @RequestParam(value = "others", required = false) Long others,
            @RequestParam(value = "totalfees", required = false) Long totalfees,
            @RequestParam(value = "loginuser", required = false) String loginuser
    )
    {
        CollegeFeesSetting clgfeessett = new CollegeFeesSetting();
        clgfeessett.setFeesSettingDate(feessettingdate);
        clgfeessett.setBranchName(branchname);
        clgfeessett.setBranchCode(branchcode);
        clgfeessett.setAcademicYear(academicyear);
        clgfeessett.setAdmissionFees(admissionfees);
        clgfeessett.setTutionFees(tutionfees);
        clgfeessett.setTextBookFees(textbookfees);
        clgfeessett.setMiscalleneousFees(miscalleneousfees);
        clgfeessett.setSpecialFees(specialfees);
        clgfeessett.setGroupInsurance(groupinsurance);
        clgfeessett.setOthers(others);
        clgfeessett.setTotalFees(totalfees);
        clgfeessett.setLoginUser(loginuser);

        collegefeessettingRepository.save(clgfeessett);
    }
}