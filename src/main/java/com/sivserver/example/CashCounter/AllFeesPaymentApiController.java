package com.sivserver.example.CashCounter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by Seetha on 19-Jun-17.
 */
@RestController
@RequestMapping("/api/v1/feespayment")

public class AllFeesPaymentApiController extends WebMvcConfigurerAdapter {

    @Autowired
    private AllFeesPaymentRepository allFeesPaymentRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void feespayment(
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam(value ="academicyear", required=false) String academicyear,
            @RequestParam(value ="date", required=false) Date date,
            @RequestParam (value="billno", required=false) String billno,
            @RequestParam (value="admissionno", required=false) String admissionno,
            @RequestParam (value="name", required=false) String name,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="branchname", required=false) String branchname,
            @RequestParam (value="semester", required=false) String semester,
            @RequestParam (value="paymentmethod", required=false) String paymentmethod,
            @RequestParam (value="admnfeestot", required=false) Long admnfeestot,
            @RequestParam (value="admnfeespaid", required=false) Long admnfeespaid,
            @RequestParam (value="admnfeesbal", required=false) Long admnfeesbal,
            @RequestParam (value="tutionfeestot", required=false) Long tutionfeestot,
            @RequestParam (value="tutionfeespaid", required=false) Long tutionfeespaid,
            @RequestParam (value="tutionfeesbal", required=false) Long tutionfeesbal,
            @RequestParam (value="transfeestot", required=false) Long transfeestot,
            @RequestParam (value="transfeespaid", required=false) Long transfeespaid,
            @RequestParam (value="transfeesbal", required=false) Long transfeesbal,
            @RequestParam (value="hostfeestot", required=false) Long hostfeestot,
            @RequestParam (value="hostfeespaid", required=false) Long hostfeespaid,
            @RequestParam (value="hostfeesbal", required=false) Long hostfeesbal,
            @RequestParam (value="foodfeestot", required=false) Long foodfeestot,
            @RequestParam (value="foodfeespaid", required=false) Long foodfeespaid,
            @RequestParam (value="foodfeesbal", required=false) Long foodfeesbal,
            @RequestParam (value="txtbookfeestot", required=false) Long txtbookfeestot,
            @RequestParam (value="txtbookfeespaid", required=false) Long txtbookfeespaid,
            @RequestParam (value="txtbookfeesbal", required=false) Long txtbookfeesbal,
            @RequestParam (value="miscfeestot", required=false) Long miscfeestot,
            @RequestParam (value="miscfeespaid", required=false) Long miscfeespaid,
            @RequestParam (value="miscfeesbal", required=false) Long miscfeesbal,
            @RequestParam (value="splfeestot", required=false) Long splfeestot,
            @RequestParam (value="splfeespaid", required=false) Long splfeespaid,
            @RequestParam (value="splfeesbal", required=false) Long splfeesbal,
            @RequestParam (value="penaltyfeestot", required=false) Long penaltyfeestot,
            @RequestParam (value="penaltyfeespaid", required=false) Long penaltyfeespaid,
            @RequestParam (value="penaltyfeesbal", required=false) Long penaltyfeesbal,
            @RequestParam (value="oldbalancetot", required=false) Long oldbalancetot,
            @RequestParam (value="oldbalancepaid", required=false) Long oldbalancepaid,
            @RequestParam (value="oldbalancebal", required=false) Long oldbalancebal,
            @RequestParam (value="groupinsurancetot", required=false) Long groupinsurancetot,
            @RequestParam (value="groupinsurancepaid", required=false) Long groupinsurancepaid,
            @RequestParam (value="groupinsurancebal", required=false) Long groupinsurancebal,
            @RequestParam (value="othersfeestot", required=false) Long othersfeestot,
            @RequestParam (value="othersfeespaid", required=false) Long othersfeespaid,
            @RequestParam (value="othersfeesbal", required=false) Long othersfeesbal,
            @RequestParam (value="totfeestot", required=false) Long totfeestot,
            @RequestParam (value="totfeespaid", required=false) Long totfeespaid,
            @RequestParam (value="totfeesbal", required=false) Long totfeesbal,
            @RequestParam (value="duedate", required=false) Date duedate,
            @RequestParam (value="chequeno", required=false) Long chequeno,
            @RequestParam (value="chequedate", required=false) Date chequedate,
            @RequestParam (value="bankname", required=false) String bankname,
            @RequestParam (value="noofprint", required=false) Long noofprint,
            @RequestParam (value="loginuser", required=false) String loginuser
            )
    {
        AllFeesPayment feepay = new AllFeesPayment();
        Cash_Counter_Compound_Key key = new Cash_Counter_Compound_Key(regno,academicyear);
        feepay.setFees_Payment_Compound_Key(key);
        feepay.setDate(date);
        feepay.setBillno(billno);
        feepay.setAdmissionno(admissionno);
        feepay.setName(name);
        feepay.setBranchcode(branchcode);
        feepay.setBranchname(branchname);
        feepay.setSemester(semester);
        feepay.setPaymentmethod(paymentmethod);
        feepay.setAdmnfeestot(admnfeestot);
        feepay.setAdmnfeespaid(admnfeespaid);
        feepay.setAdmnfeesbal(admnfeesbal);
        feepay.setTutionfeestot(tutionfeestot);
        feepay.setTutionfeespaid(tutionfeespaid);
        feepay.setTutionfeesbal(tutionfeesbal);
        feepay.setTransfeestot(transfeestot);
        feepay.setTransfeespaid(transfeespaid);
        feepay.setTransfeesbal(transfeesbal);
        feepay.setHostfeestot(hostfeestot);
        feepay.setHostfeespaid(hostfeespaid);
        feepay.setHostfeesbal(hostfeesbal);
        feepay.setFoodfeestot(foodfeestot);
        feepay.setFoodfeespaid(foodfeespaid);
        feepay.setFoodfeesbal(foodfeesbal);
        feepay.setTxtbookfeestot(txtbookfeestot);
        feepay.setTxtbookfeespaid(txtbookfeespaid);
        feepay.setTxtbookfeesbal(txtbookfeesbal);
        feepay.setMiscfeestot(miscfeestot);
        feepay.setMiscfeespaid(miscfeespaid);
        feepay.setMiscfeesbal(miscfeesbal);
        feepay.setSplfeestot(splfeestot);
        feepay.setSplfeespaid(splfeespaid);
        feepay.setSplfeesbal(splfeesbal);
        feepay.setPenaltyfeestot(penaltyfeestot);
        feepay.setPenaltyfeespaid(penaltyfeespaid);
        feepay.setPenaltyfeesbal(penaltyfeesbal);
        feepay.setOldbalancetot(oldbalancetot);
        feepay.setOldbalancepaid(oldbalancepaid);
        feepay.setOldbalancebal(oldbalancebal);
        feepay.setGroupinsurancetot(groupinsurancetot);
        feepay.setGroupinsurancepaid(groupinsurancepaid);
        feepay.setGroupinsurancebal(groupinsurancebal);
        feepay.setOthersfeestot(othersfeestot);
        feepay.setOthersfeespaid(othersfeespaid);
        feepay.setOthersfeesbal(othersfeesbal);
        feepay.setTotfeestot(totfeestot);
        feepay.setTotfeespaid(totfeespaid);
        feepay.setTotfeesbal(totfeesbal);
        feepay.setDuedate(duedate);
        feepay.setChequeno(chequeno);
        feepay.setChequedate(chequedate);
        feepay.setBankname(bankname);
        feepay.setNoofprint(noofprint);
        feepay.setLoginuser(loginuser);

        allFeesPaymentRepository.save(feepay);



    }


}
