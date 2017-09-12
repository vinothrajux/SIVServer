package com.sivserver.example.CashCounter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

/**
 * Created by Seetha on 30-Jun-17.
 */

@RestController
@RequestMapping("/api/v1/feesfollowup")

public class FeesFollowupApiController  {

    //@Autowired
    private FeesFollowupRepository feesFollowupRepository;

    @GetMapping(value="/all")
    public List<FeesFollowup> getFeesFollowUpDetails() {return feesFollowupRepository.findAll();}

    public FeesFollowupApiController(FeesFollowupRepository feesFollowupRepository)
    {
        this.feesFollowupRepository = feesFollowupRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void feesfollowup(
            @RequestParam(value ="currentdate", required=false) Date currentdate,
            @RequestParam (value="regno", required=false) String regno,
            @RequestParam (value="admissionno", required=false) String admissionno,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="batch", required=false) String batch,
            @RequestParam (value="semester", required=false) String semester,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="lastpaymtdate", required=false) Date lastpaymtdate,
            @RequestParam (value="lastpaymtamount", required=false) Long lastpaymtamount,
            @RequestParam (value="balance", required=false) Long balance,
            @RequestParam (value="duedate", required=false) Date duedate,
            @RequestParam (value="remarks", required=false) String remarks,
            @RequestParam (value="loginuser", required=false) String loginuser

    )
    {
        FeesFollowup feesfollow = new FeesFollowup();
        Current_Academic_Student_Actual_Fees current_Academic_Student_Actual_Fees_regno = new Current_Academic_Student_Actual_Fees(regno);
        feesfollow.setCurrentdate(currentdate)
                    .setRegno(regno)
                    .setAdmissionno(admissionno)
                    .setBranchcode(branchcode)
                    .setBatch(batch)
                    .setSemester(semester)
                    .setAcademicyear(academicyear)
                    .setLastpaymtdate(lastpaymtdate)
                    .setLastpaymtamount(lastpaymtamount)
                    .setBalance(balance)
                    .setDuedate(duedate)
                    .setRemarks(remarks)
                    .setLoginuser(loginuser)
                    .setCurrent_Academic_Student_Actual_Fees_regno(current_Academic_Student_Actual_Fees_regno);

        feesFollowupRepository.save(feesfollow);



    }


}
