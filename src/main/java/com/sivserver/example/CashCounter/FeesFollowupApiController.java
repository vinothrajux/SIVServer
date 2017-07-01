package com.sivserver.example.CashCounter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by Seetha on 30-Jun-17.
 */

@RestController
@RequestMapping("/api/v1/feesfollowup")

public class FeesFollowupApiController  extends WebMvcConfigurerAdapter {

    @Autowired
    private FeesFollowupRepository feesFollowupRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void feesfollowup(
            @RequestParam(value ="currentdate", required=false) Date currentdate,
            @RequestParam (value="regno", required=false) String regno,
            @RequestParam (value="admissionno", required=false) String admissionno,
            @RequestParam (value="name", required=false) String name,
            @RequestParam (value="semester", required=false) String semester,
            @RequestParam (value="branchname", required=false) String branchname,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="lastpaymtdate", required=false) Date lastpaymtdate,
            @RequestParam (value="lastpaymtamount", required=false) Long lastpaymtamount,
            @RequestParam (value="duedate", required=false) Date duedate,
            @RequestParam (value="remarks", required=false) String remarks,
            @RequestParam (value="loginuser", required=false) String loginuser

    )
    {
        FeesFollowup feesfollow = new FeesFollowup();
        feesfollow.setCurrentDate(currentdate);
        feesfollow.setRegNo(regno);
        feesfollow.setAdmissionNo(admissionno);
        feesfollow.setName(name);
        feesfollow.setSemester(semester);
        feesfollow.setBranchName(branchname);
        feesfollow.setBranchCode(branchcode);
        feesfollow.setAcademicYear(academicyear);
        feesfollow.setLastPaymentDate(lastpaymtdate);
        feesfollow.setLastPaymentAmount(lastpaymtamount);
        feesfollow.setDueDate(duedate);
        feesfollow.setRemarks(remarks);
        feesfollow.setLoginUser(loginuser);

        feesFollowupRepository.save(feesfollow);



    }


}
