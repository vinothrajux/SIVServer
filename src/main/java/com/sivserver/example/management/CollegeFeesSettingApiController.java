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
@RequestMapping("/api/v1/collegefeessetting")

public class CollegeFeesSettingApiController extends WebMvcConfigurerAdapter {

    @Autowired
    private CollegeFeesSettingRepository collegefeessettingRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void collegeFeesSetting(
            @RequestParam(value = "branchcode", required = false) String branchcode,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "feessettingdate", required = false) Date feessettingdate,
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
        Management_College_Fees_Compound_Key key = new Management_College_Fees_Compound_Key(branchcode, academicyear);
        clgfeessett.setManagement_college_fees_compound_key(key);
        clgfeessett.setFeessettingdate(feessettingdate);
        clgfeessett.setAdmissionfees(admissionfees);
        clgfeessett.setTutionfees(tutionfees);
        clgfeessett.setTextbookfees(textbookfees);
        clgfeessett.setMiscalleneousfees(miscalleneousfees);
        clgfeessett.setSpecialfees(specialfees);
        clgfeessett.setGroupinsurance(groupinsurance);
        clgfeessett.setOthers(others);
        clgfeessett.setTotalfees(totalfees);
        clgfeessett.setLoginuser(loginuser);

        collegefeessettingRepository.save(clgfeessett);
    }
}