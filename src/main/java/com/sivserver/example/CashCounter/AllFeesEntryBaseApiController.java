package com.sivserver.example.CashCounter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 01/07/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/feesentrybase")


public class AllFeesEntryBaseApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private AllFeesEntryBaseRepository allFeesEntryBaseRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void feesBaseEntry(
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="admissionno", required=false) String admissionno,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="batch", required=false) String batch,
            @RequestParam (value="semester", required=false) String semester,
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
            @RequestParam (value="loginuser", required=false) String loginuser


    )
    {
        AllFeesEntryBase feesEntry = new AllFeesEntryBase();
        Cash_Counter_Compound_Key key = new Cash_Counter_Compound_Key(regno,academicyear);
        feesEntry.setCash_Counter_Compound_Key(key);
        feesEntry.setAdmissionno(admissionno);
        feesEntry.setAdmissionfees(admissionfees);
        feesEntry.setTuitionfees(tuitionfees);
        feesEntry.setTransportFees(transportFees);
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
        feesEntry.setLoginuser(loginuser);


        allFeesEntryBaseRepository.save(feesEntry);



    }

}

