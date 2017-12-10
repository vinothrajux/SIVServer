package com.sivserver.example.CashCounter;

import com.sivserver.example.student.PlaySchoolStudentBaseInformation;
import com.sivserver.example.student.PlaySchoolStudentBaseInformationProjection;
import com.sivserver.example.student.PlaySchoolStudentBaseInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 06/11/2017.
 */
@RestController
@RequestMapping("/api/v1/feespaymentplayschool")
public class FeesPaymentPlaySchoolApiController {

    private FeesPaymentPlaySchoolRepository feesPaymentPlaySchoolRepository;

    @Autowired
    private PlaySchoolStudentBaseInformationRepository playSchoolStudentBaseInformationRepository;

    @GetMapping(value="/all")

    public List<FeesPaymentPlaySchool> getFeesPaymentPlaySchoolDetails() {return feesPaymentPlaySchoolRepository.findAll();}

    public FeesPaymentPlaySchoolApiController(FeesPaymentPlaySchoolRepository feesPaymentPlaySchoolRepository)
    {
        this.feesPaymentPlaySchoolRepository = feesPaymentPlaySchoolRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void feesPaymentPlaySchool(
            @RequestParam(value = "billdate", required = false) Date billdate,
            @RequestParam(value = "billno", required = false) String billno,
            @RequestParam(value = "registernumber", required = false) String registernumber,
            @RequestParam(value = "program", required = false) String program,
            @RequestParam(value = "section", required = false) String section,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "schoolfeestitle", required = false) String schoolfeestitle,
            @RequestParam(value = "schoolfees", required = false) Long schoolfees,
            @RequestParam(value = "schoolfeespaid", required = false) Long schoolfeespaid,
            @RequestParam(value = "transportfeestitle", required = false) String transportfeestitle,
            @RequestParam(value = "transportfees", required = false) Long transportfees,
            @RequestParam(value = "transportfeespaid", required = false) Long transportfeespaid,
            @RequestParam(value = "totalfees", required = false) Long totalfees,
            @RequestParam(value = "totalfeespaid", required = false) Long totalfeespaid,
            @RequestParam(value = "balance", required = false) Long balance,
            @RequestParam(value = "duedate", required = false) Date duedate,
            @RequestParam(value = "paymentmethod", required = false) String paymentmethod,
            @RequestParam(value = "chequeno", required = false) String chequeno,
            @RequestParam(value = "chequedate", required = false) Date chequedate,
            @RequestParam(value = "bankname", required = false) String bankname,
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        FeesPaymentPlaySchool ps_fees_payment = new FeesPaymentPlaySchool();
        PlaySchoolStudentBaseInformation ps_student_base_info = new PlaySchoolStudentBaseInformation();

        ps_fees_payment.setBilldate(billdate);
        ps_fees_payment.setBillno(billno);
        ps_fees_payment.setRegisternumber(registernumber);
        ps_fees_payment.setProgram(program);
        ps_fees_payment.setSection(section);
        ps_fees_payment.setAcademicyear(academicyear);
        ps_fees_payment.setSchoolfeestitle(schoolfeestitle);
        ps_fees_payment.setSchoolfees(schoolfees);
        ps_fees_payment.setSchoolfeespaid(schoolfeespaid);
        ps_fees_payment.setTransportfeestitle(transportfeestitle);
        ps_fees_payment.setTransportfees(transportfees);
        ps_fees_payment.setTransportfeespaid(transportfeespaid);
        ps_fees_payment.setTotalfees(totalfees);
        ps_fees_payment.setTotalfeespaid(totalfeespaid);
        ps_fees_payment.setBalance(balance);
        ps_fees_payment.setDuedate(duedate);
        ps_fees_payment.setPaymentmethod(paymentmethod);
        ps_fees_payment.setChequeno(chequeno);
        ps_fees_payment.setChequedate(chequedate);
        ps_fees_payment.setBankname(bankname);
        ps_fees_payment.setLoginuser(loginuser);

        feesPaymentPlaySchoolRepository.save(ps_fees_payment);


    }

    FeesPaymentPlaySchoolInformation feesPaymentPlaySchoolInformation;
    @RequestMapping(method = RequestMethod.POST, value="/getPlaySchoolFeesPaymentInformationDetail")

    public List<Object> getPlaySchoolFeesPaymentInformationDetail(@RequestParam (value ="billno") String billno) {

        FeesPaymentPlaySchoolProjection feesPaymentPlaySchoolProjection = feesPaymentPlaySchoolRepository.findOneByBillno(billno);
        String regno = feesPaymentPlaySchoolProjection.getRegisternumber();
        System.out.println("test:"+regno);
        PlaySchoolStudentBaseInformationProjection playSchoolStudentBaseInformationProjection = playSchoolStudentBaseInformationRepository.findOneByRegisternumber(regno);

        List<Object> list = new ArrayList<Object>();

        list.add(feesPaymentPlaySchoolProjection);
        list.add(playSchoolStudentBaseInformationProjection);

        return list;
    }

    }
