package com.sivserver.example.CashCounter;

import com.sivserver.example.student.StudentBaseInformation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by GBCorp on 10/09/2017.
 */
@RestController
@RequestMapping("/api/v1/current_Academic_Student_Balance_Fees")

public class Current_Academic_Student_Balance_Fees_ApiController {

    private Current_Academic_Student_Balance_Fees_Repository current_Academic_Student_Balance_Fees_Repository;

    @GetMapping(value="/all")
    public List<Current_Academic_Student_Balance_Fees> getCurrentAcademicStudentBalanceFeesDetails() {return current_Academic_Student_Balance_Fees_Repository.findAll();}

    public Current_Academic_Student_Balance_Fees_ApiController(Current_Academic_Student_Balance_Fees_Repository current_Academic_Student_Balance_Fees_Repository)
    {
        this.current_Academic_Student_Balance_Fees_Repository = current_Academic_Student_Balance_Fees_Repository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void currentFeesBaseEntry(
            @RequestParam(value ="regno", required=false) String regno,
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
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="loginuser", required=false) String loginuser


    )
    {
        Current_Academic_Student_Balance_Fees feesEntry = new Current_Academic_Student_Balance_Fees();
        Current_Academic_Student_Actual_Fees current_Academic_Student_Actual_Fees_regno = new Current_Academic_Student_Actual_Fees(regno);
        feesEntry.setRegno(regno)
                .setBranchcode(branchcode)
                .setBatch(batch)
                .setSemester(semester)
                .setTuitionfeesbalance(tuitionfeesbalance)
                .setTransportFeesbalance(transportFeesbalance)
                .setHostelfeesbalance(hostelfeesbalance)
                .setFoodfeesbalance(foodfeesbalance)
                .setTextbookstationaryfeesbalance(textbookstationaryfeesbalance)
                .setMiscellaneousfeesbalance(miscellaneousfeesbalance)
                .setSpecialfeesbalance(specialfeesbalance)
                .setPenaltyfeesbalance(penaltyfeesbalance)
                .setPreviousbalancefeesbalance(previousbalancefeesbalance)
                .setGroupinsurancefeesbalance(groupinsurancefeesbalance)
                .setOthersfeesbalance(othersfeesbalance)
                .setTotalfeesbalance(totalfeesbalance)
                .setAcademicyear(academicyear)
                .setLoginuser(loginuser)
                .setCurrent_Academic_Student_Actual_Fees_regno(current_Academic_Student_Actual_Fees_regno);


        current_Academic_Student_Balance_Fees_Repository.save(feesEntry);



    }

}
