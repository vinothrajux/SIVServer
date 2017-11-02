package com.sivserver.example.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by GBCorp on 02/11/2017.
 */
@RestController
@RequestMapping("/api/v1/playschoolschoolfeessetting")
public class PlaySchoolSchoolFeesSettingApiController {

    @Autowired
    private PlaySchoolSchoolFeesSettingRepository  playSchoolSchoolFeesSettingRepository;

    @RequestMapping(method = RequestMethod.POST)

    public void playschoolFeesSetting(
            @RequestParam(value = "fees_setting_date", required = false) Date fees_setting_date,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "program", required = false) String program,
            @RequestParam(value = "admissionfees", required = false) Long admissionfees,
            @RequestParam(value = "admissionfees_due_date", required = false) Date admissionfees_due_date,
            @RequestParam(value = "term1fees", required = false) Long term1fees,
            @RequestParam(value = "term1fees_due_date", required = false) Date term1fees_due_date,
            @RequestParam(value = "term2fees", required = false) Long term2fees,
            @RequestParam(value = "term2fees_due_date", required = false) Date term2fees_due_date,
            @RequestParam(value = "grandtotalfees", required = false) Long grandtotalfees,
            @RequestParam(value = "loginuser", required = false) String loginuser
    )
    {
        PlaySchoolSchoolFeesSetting ps_School_Fees_Set = new PlaySchoolSchoolFeesSetting();
        Management_Playschool_Fees_Compound_Key key = new Management_Playschool_Fees_Compound_Key(program, academicyear);

        ps_School_Fees_Set.setFees_setting_date(fees_setting_date);
        ps_School_Fees_Set.setManagement_Playschool_Fees_Compound_Key(key);
        ps_School_Fees_Set.setAdmissionfees(admissionfees);
        ps_School_Fees_Set.setAdmissionfees_due_date(admissionfees_due_date);
        ps_School_Fees_Set.setTerm1fees(term1fees);
        ps_School_Fees_Set.setTerm1fees_due_date(term1fees_due_date);
        ps_School_Fees_Set.setTerm2fees(term2fees);
        ps_School_Fees_Set.setTerm2fees_due_date(term2fees_due_date);
        ps_School_Fees_Set.setGrandtotalfees(grandtotalfees);
        ps_School_Fees_Set.setLoginuser(loginuser);

        playSchoolSchoolFeesSettingRepository.save(ps_School_Fees_Set);


    }

    }
