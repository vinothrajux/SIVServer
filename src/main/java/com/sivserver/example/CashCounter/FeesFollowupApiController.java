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
        feesfollow.setCurrentdate(currentdate);
        feesfollow.setRegno(regno);
        feesfollow.setAdmissionno(admissionno);
        feesfollow.setName(name);
        feesfollow.setSemester(semester);
        feesfollow.setBranchname(branchname);
        feesfollow.setBranchcode(branchcode);
        feesfollow.setAcademicyear(academicyear);
        feesfollow.setLastpaymentdate(lastpaymtdate);
        feesfollow.setLastpaymentamount(lastpaymtamount);
        feesfollow.setDuedate(duedate);
        feesfollow.setRemarks(remarks);
        feesfollow.setLoginuser(loginuser);

        feesFollowupRepository.save(feesfollow);



    }


}
