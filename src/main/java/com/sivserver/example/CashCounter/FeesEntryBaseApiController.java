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
        feesEntry.setAdmissionNo(admissionno);
        feesEntry.setAdmissionFees(admissionfees);
        feesEntry.setTuitionFees(tuitionfees);
        feesEntry.setTransportFees(transportFees);
        feesEntry.setHostelFees(hostelfees);
        feesEntry.setFoodFees(foodfees);
        feesEntry.setTextBookStationaryFees(textbookstationaryfees);
        feesEntry.setMiscellaneousFees(miscellaneousfees);
        feesEntry.setSpecialFees(specialfees);
        feesEntry.setPenaltyFees(penaltyfees);
        feesEntry.setPreviousBalanceFees(previousbalancefees);
        feesEntry.setGroupInsuranceFees(groupinsurancefees);
        feesEntry.setOthersFees(othersfees);
        feesEntry.setTotalFees(totalfees);
        feesEntry.setAcademicYear(academicyear);
        feesEntry.setLoginUser(loginuser);


       // feesEntryBaseRepository.save(feesEntry);



    }

}

