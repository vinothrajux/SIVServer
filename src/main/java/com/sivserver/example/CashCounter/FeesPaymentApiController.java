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

public class FeesPaymentApiController extends WebMvcConfigurerAdapter {

    @Autowired
    private FeesPaymentRepository feesPaymentRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void feespayment(
            @RequestParam(value ="date", required=false) Date date,
            @RequestParam (value="billno", required=false) String billno,
            @RequestParam (value="regno", required=false) String regno,
            @RequestParam (value="admissionno", required=false) String admissionno,
            @RequestParam (value="name", required=false) String name,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="branchname", required=false) String branchname,
            @RequestParam (value="semester", required=false) String semester,
            @RequestParam (value="academicyear", required=false) String academicyear,
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
        FeesPayment feepay = new FeesPayment();
        feepay.setDate(date);
        feepay.setBillNo(billno);
        feepay.setRegNo(regno);
        feepay.setAdmissionNo(admissionno);
        feepay.setName(name);
        feepay.setBranchCode(branchcode);
        feepay.setBranchName(branchname);
        feepay.setSemester(semester);
        feepay.setAcademicYear(academicyear);
        feepay.setPaymentMethod(paymentmethod);
        feepay.setAdmissionFeesTotal(admnfeestot);
        feepay.setAdmissionFeesPaid(admnfeespaid);
        feepay.setAdmissionFeesBalance(admnfeesbal);
        feepay.setTutionFeesTotal(tutionfeestot);
        feepay.setTutionFeesPaid(tutionfeespaid);
        feepay.setTutionFeesBalance(tutionfeesbal);
        feepay.setTransportFeesTotal(transfeestot);
        feepay.setTransportFeesPaid(transfeespaid);
        feepay.setTransportFeesBalance(transfeesbal);
        feepay.setHostelFeesTotal(hostfeestot);
        feepay.setHostelFeesPaid(hostfeespaid);
        feepay.setHostelFeesBalance(hostfeesbal);
        feepay.setFoodFeesTotal(foodfeestot);
        feepay.setFoodFeesPaid(foodfeespaid);
        feepay.setFoodFeesBalance(foodfeesbal);
        feepay.setTextBookFeesTotal(txtbookfeestot);
        feepay.setTextBookFeesPaid(txtbookfeespaid);
        feepay.setTextBookFeesBalance(txtbookfeesbal);
        feepay.setMiscalleneousFeesTotal(miscfeestot);
        feepay.setMiscalleneousFeesPaid(miscfeespaid);
        feepay.setMiscalleneousFeesBalance(miscfeesbal);
        feepay.setSpecialFeesTotal(splfeestot);
        feepay.setSpecialFeesPaid(splfeespaid);
        feepay.setSpecialFeesBalance(splfeesbal);
        feepay.setPenaltyFeesTotal(penaltyfeestot);
        feepay.setPenaltyFeesPaid(penaltyfeespaid);
        feepay.setPenaltyFeesBalance(penaltyfeesbal);
        feepay.setOldBalanceTotal(oldbalancetot);
        feepay.setOldBalancePaid(oldbalancepaid);
        feepay.setOldBalanceBalance(oldbalancebal);
        feepay.setGroupInsuranceTotal(groupinsurancetot);
        feepay.setGroupInsurancePaid(groupinsurancepaid);
        feepay.setGroupInsuranceBalance(groupinsurancebal);
        feepay.setOthersFeesTotal(othersfeestot);
        feepay.setOthersFeesPaid(othersfeespaid);
        feepay.setOthersFeesBalance(othersfeesbal);
        feepay.setTotalFeesTotal(totfeestot);
        feepay.setTotalFeesPaid(totfeespaid);
        feepay.setTotalFeesBalance(totfeesbal);
        feepay.setDueDate(duedate);
        feepay.setChequeNo(chequeno);
        feepay.setChequeDate(chequedate);
        feepay.setBankName(bankname);
        feepay.setNoofprint(noofprint);
        feepay.setLoginUser(loginuser);

        feesPaymentRepository.save(feepay);



    }


}
