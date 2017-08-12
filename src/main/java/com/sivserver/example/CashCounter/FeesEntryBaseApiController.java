package com.sivserver.example.CashCounter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by GBCorp on 01/07/2017.
 */
@RestController
@RequestMapping("/api/v1/feesentrybase")


public class FeesEntryBaseApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private FeesEntryBaseRepository feesEntryBaseRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void feesBaseEntry(
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam (value="admissionno", required=false) String admissionno,
            @RequestParam (value="admissionfees", required=false) Long admissionfees,
            @RequestParam (value="tuitionfees", required=false) Long tuitionfees,
            @RequestParam (value="transportFees", required=false) Long transportFees,
            @RequestParam (value="hostelfees", required=false) Long hostelfees,
            @RequestParam (value="foodfees", required=false) Long foodfees,
            @RequestParam (value="textbookstationaryfees", required=false) Long textbookstationaryfees,
            @RequestParam (value="miscellaneousfees", required=false) Long miscellaneousfees,
            @RequestParam (value="specialfees", required=false) Long specialfees,
            @RequestParam (value="penaltyfees", required=false) Long penaltyfees,
            @RequestParam (value="previousbalancefees", required=false) Long previousbalancefees,
            @RequestParam (value="groupinsurancefees", required=false) Long groupinsurancefees,
            @RequestParam (value="othersfees", required=false) Long othersfees,
            @RequestParam (value="totalfees", required=false) Long totalfees,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="loginuser", required=false) String loginuser


    )
    {
        FeesEntryBase feesEntry = new FeesEntryBase();
        feesEntry.setRegno(regno);
        feesEntry.setAdmissionno(admissionno);
        feesEntry.setAdmissionfees(admissionfees);
        feesEntry.setTuitionfees(tuitionfees);
        feesEntry.setTransportfees(transportFees);
        feesEntry.setHostelfees(hostelfees);
        feesEntry.setFoodfees(foodfees);
        feesEntry.setTextbookstationaryfees(textbookstationaryfees);
        feesEntry.setMiscellaneousfees(miscellaneousfees);
        feesEntry.setSpecialfees(specialfees);
        feesEntry.setPenaltyfees(penaltyfees);
        feesEntry.setPreviousbalancefees(previousbalancefees);
        feesEntry.setGroupinsurancefees(groupinsurancefees);
        feesEntry.setOthersfees(othersfees);
        feesEntry.setTotalfees(totalfees);
        feesEntry.setAcademicyear(academicyear);
        feesEntry.setLoginuser(loginuser);


        feesEntryBaseRepository.save(feesEntry);



    }

}

