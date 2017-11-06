package com.sivserver.example.CashCounter;

import com.sivserver.example.student.PlaySchoolStudentBaseInformation;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 06/11/2017.
 */
@RestController
@RequestMapping("/api/v1/feespaymentplayschool")
public class FeesPaymentPlaySchoolApiController {

    private FeesPaymentPlaySchoolRepository feesPaymentPlaySchoolRepository;

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
            @RequestParam(value = "school_fees_title", required = false) String school_fees_title,
            @RequestParam(value = "school_fees", required = false) Long school_fees,
            @RequestParam(value = "school_fees_paid", required = false) Long school_fees_paid,
            @RequestParam(value = "transport_fees_title", required = false) String transport_fees_title,
            @RequestParam(value = "transport_fees", required = false) Long transport_fees,
            @RequestParam(value = "transport_fees_paid", required = false) Long transport_fees_paid,
            @RequestParam(value = "totalfees", required = false) Long totalfees,
            @RequestParam(value = "total_fees_paid", required = false) Long total_fees_paid,
            @RequestParam(value = "balance", required = false) Long balance,
            @RequestParam(value = "duedate", required = false) Date duedate,
            @RequestParam(value = "payment_method", required = false) String payment_method,
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
        ps_fees_payment.setSchool_fees_title(school_fees_title);
        ps_fees_payment.setSchool_fees(school_fees);
        ps_fees_payment.setSchool_fees_paid(school_fees_paid);
        ps_fees_payment.setTransport_fees_title(transport_fees_title);
        ps_fees_payment.setTransport_fees(transport_fees);
        ps_fees_payment.setTransport_fees_paid(transport_fees_paid);
        ps_fees_payment.setTotalfees(totalfees);
        ps_fees_payment.setTotal_fees_paid(total_fees_paid);
        ps_fees_payment.setBalance(balance);
        ps_fees_payment.setDuedate(duedate);
        ps_fees_payment.setPayment_method(payment_method);
        ps_fees_payment.setChequeno(chequeno);
        ps_fees_payment.setChequedate(chequedate);
        ps_fees_payment.setBankname(bankname);
        ps_fees_payment.setLoginuser(loginuser);

        feesPaymentPlaySchoolRepository.save(ps_fees_payment);


    }

    }
