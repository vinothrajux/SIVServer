package com.sivserver.example.CashCounter;

import com.sivserver.example.student.StudentBaseInformation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by GBCorp on 10/09/2017.
 */
@RestController
@RequestMapping("/api/v1/current_Academic_Student_Actual_Fees")

public class Current_Academic_Student_Actual_Fees_ApiController {

    private Current_Academic_Student_Actual_Fees_Repository current_Academic_Student_Actual_Fees_Repository;

    @GetMapping(value="/all")
    public List<Current_Academic_Student_Actual_Fees> getCurrentStudentActualFeesDetails() {return current_Academic_Student_Actual_Fees_Repository.findAll(); }

    public Current_Academic_Student_Actual_Fees_ApiController(Current_Academic_Student_Actual_Fees_Repository current_Academic_Student_Actual_Fees_Rep)
    {
        this.current_Academic_Student_Actual_Fees_Repository=current_Academic_Student_Actual_Fees_Repository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void currentFeesBaseEntry(
            @RequestParam(value ="regno", required=false) String regno,
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
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="loginuser", required=false) String loginuser


    )
    {
        Current_Academic_Student_Actual_Fees feesEntry = new Current_Academic_Student_Actual_Fees();
        StudentBaseInformation student_base_regno = new StudentBaseInformation(regno);
        feesEntry.setRegno(regno)
                .setAdmissionno(admissionno)
                .setBranchcode(branchcode)
                .setBatch(batch)
                .setSemester(semester)
                .setTuitionfees(tuitionfees)
                .setTransportFees(transportFees)
                .setHostelfees(hostelfees)
                .setFoodfees(foodfees)
                .setTextbookstationaryfees(textbookstationaryfees)
                .setMiscellaneousfees(miscellaneousfees)
                .setSpecialfees(specialfees)
                .setPenaltyfees(penaltyfees)
                .setPreviousbalancefees(previousbalancefees)
                .setGroupinsurancefees(groupinsurancefees)
                .setOthersfees(othersfees)
                .setTotalfees(totalfees)
                .setAcademicyear(academicyear)
                .setLoginuser(loginuser)
                .setStudent_base_regno(student_base_regno);


        current_Academic_Student_Actual_Fees_Repository.save(feesEntry);



    }


}
