package com.sivserver.example.CashCounter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by GBCorp on 12/09/2017.
 */
@RestController
@RequestMapping("/api/v1/allfeesbalance")

public class AllFeesBalanceApiController {
    @Autowired
    private AllFeesBalanceRepository allFeesBalanceRepository;

    @RequestMapping(method = RequestMethod.POST)

    public void allFeesBalance(
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam(value ="academicyear", required=false) String academicyear,
            @RequestParam(value ="branchcode", required=false) String branchcode,
            @RequestParam(value ="batch", required=false) String batch,
            @RequestParam(value ="semester", required=false) String semester,
            @RequestParam (value="admissionfeesbalance", required=false) Long admissionfeesbalance,
            @RequestParam (value="tuitionfeesbalance", required=false) Long tuitionfeesbalance,
            @RequestParam (value="transportFeesbalance", required=false) Long transportFeesbalance,
            @RequestParam (value="hostelfeesbalance", required=false) Long hostelfeesbalance,
            @RequestParam (value="foodfeesbalance", required=false) Long foodfeesbalance,
            @RequestParam (value="textbookstationaryfeesbalance", required=false) Long textbookstationaryfeesbalance,
            @RequestParam (value="miscellaneousfeesbalance", required=false) Long miscellaneousfeesbalance,
            @RequestParam (value="specialfeesbalance", required=false) Long specialfeesbalance,
            @RequestParam (value="penaltyfeesbalance", required=false) Long penaltyfeesbalance,
            @RequestParam (value="previousbalancefeesbalance", required=false) Long previousbalancefeesbalance,
            @RequestParam (value="groupinsurancefeesbalance", required=false) Long groupinsurancefeesbalance,
            @RequestParam (value="othersfeesbalance", required=false) Long othersfeesbalance,
            @RequestParam (value="totalfeesbalance", required=false) Long totalfeesbalance,
            @RequestParam (value="loginuser", required=false) String loginuser


    )
    {
        AllFeesBalance feesBalanceAll = new AllFeesBalance();
        Cash_Counter_Compound_Key key = new Cash_Counter_Compound_Key(regno,academicyear);

        feesBalanceAll.setAllFeesBalance_Compound_Key(key);
        feesBalanceAll.setBranchcode(branchcode);
        feesBalanceAll.setBatch(batch);
        feesBalanceAll.setSemester(semester);
        feesBalanceAll.setTuitionfeesbalance(tuitionfeesbalance);
        feesBalanceAll.setTransportFeesbalance(transportFeesbalance);
        feesBalanceAll.setHostelfeesbalance(hostelfeesbalance);
        feesBalanceAll.setFoodfeesbalance(foodfeesbalance);
        feesBalanceAll.setTextbookstationaryfeesbalance(textbookstationaryfeesbalance);
        feesBalanceAll.setMiscellaneousfeesbalance(miscellaneousfeesbalance);
        feesBalanceAll.setSpecialfeesbalance(specialfeesbalance);
        feesBalanceAll.setPenaltyfeesbalance(penaltyfeesbalance);
        feesBalanceAll.setPreviousbalancefeesbalance(previousbalancefeesbalance);
        feesBalanceAll.setGroupinsurancefeesbalance(groupinsurancefeesbalance);
        feesBalanceAll.setOthersfeesbalance(othersfeesbalance);
        feesBalanceAll.setTotalfeesbalance(totalfeesbalance);
        feesBalanceAll.setLoginuser(loginuser);


        allFeesBalanceRepository.save(feesBalanceAll);

    }


}
