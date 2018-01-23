package com.sivserver.example.CashCounter;

import com.sivserver.example.student.PlaySchoolStudentBaseInformation;
import com.sivserver.example.student.PlaySchoolStudentBaseInformationProjection;
import com.sivserver.example.student.PlaySchoolStudentBaseInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 06/11/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/feespaymentplayschool")
public class FeesPaymentPlaySchoolApiController {

    private FeesPaymentPlaySchoolRepository feesPaymentPlaySchoolRepository;

    @Autowired
    private PlaySchoolStudentBaseInformationRepository playSchoolStudentBaseInformationRepository;

    @Autowired
    private PlaySchoolBillNoGenerateRepository playSchoolBillNoGenerateRepository;

    @GetMapping(value="/all")

    public List<FeesPaymentPlaySchool> getFeesPaymentPlaySchoolDetails() {return feesPaymentPlaySchoolRepository.findAll();}

    public FeesPaymentPlaySchoolApiController(FeesPaymentPlaySchoolRepository feesPaymentPlaySchoolRepository)
    {
        this.feesPaymentPlaySchoolRepository = feesPaymentPlaySchoolRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public String feesPaymentPlaySchool(
            @RequestParam(value = "billdate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date billdate,
            @RequestParam(value = "billno", required = false) String billno,
            @RequestParam(value = "registernumber", required = false) String registernumber,
            @RequestParam(value = "program", required = false) String program,
            @RequestParam(value = "section", required = false) String section,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "schoolfeestitle", required = false) String schoolfeestitle,
            @RequestParam(value = "materialkitfees", required = false) Long materialkitfees,
            @RequestParam(value = "materialkitfeespaid", required = false) Long materialkitfeespaid,
            @RequestParam(value = "activityfees", required = false) String activityfees,
            @RequestParam(value = "activityfeespaid", required = false) Long activityfeespaid,
            @RequestParam(value = "tuitionfees", required = false) Long tuitionfees,
            @RequestParam(value = "tuitionfeespaid", required = false) Long tuitionfeespaid,
            @RequestParam(value = "totalfees", required = false) Long totalfees,
            @RequestParam(value = "totalfeespaid", required = false) Long totalfeespaid,
            @RequestParam(value = "balancefees", required = false) Long balancefees,
            @RequestParam(value = "duedate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date duedate,
            @RequestParam(value = "paymentmethod", required = false) String paymentmethod,
            @RequestParam(value = "chequeno", required = false) String chequeno,
            @RequestParam(value = "chequedate", required = false) String chequedate,
            @RequestParam(value = "bankname", required = false) String bankname,
            @RequestParam(value = "loginuser", required = false) String loginuser,
            @RequestParam(value = "instituteid", required = false) Integer instituteid,
            @RequestParam(value = "idno", required = false) Integer idno


    ) {
        FeesPaymentPlaySchool ps_fees_payment = new FeesPaymentPlaySchool();
        PlaySchoolStudentBaseInformation ps_student_base_info = new PlaySchoolStudentBaseInformation();
        PlaySchoolBillNoGenerate psbillnogenerate = new PlaySchoolBillNoGenerate();

        PlaySchoolBillNoGenerateProjection playschoolBillNo = playSchoolBillNoGenerateRepository.findOneByIdno(idno);
        Integer lastbillnotable = playschoolBillNo.getLastbillno();
        lastbillnotable++;

        ps_fees_payment.setBilldate(billdate);
        ps_fees_payment.setBillno(lastbillnotable.toString());
        ps_fees_payment.setRegisternumber(registernumber);
        ps_fees_payment.setProgram(program);
        ps_fees_payment.setSection(section);
        ps_fees_payment.setAcademicyear(academicyear);
        ps_fees_payment.setSchoolfeestitle(schoolfeestitle);
        ps_fees_payment.setMaterialkitfees(materialkitfees);
        ps_fees_payment.setMaterialkitfeespaid(materialkitfeespaid);
        ps_fees_payment.setActivityfees(activityfeespaid);
        ps_fees_payment.setActivityfeespaid(activityfeespaid);
        ps_fees_payment.setTuitionfees(tuitionfees);
        ps_fees_payment.setTuitionfeespaid(tuitionfeespaid);
        ps_fees_payment.setTotalfees(totalfees);
        ps_fees_payment.setTotalfeespaid(totalfeespaid);
        ps_fees_payment.setBalancefees(balancefees);
        ps_fees_payment.setDuedate(duedate);
        ps_fees_payment.setPaymentmethod(paymentmethod);
        ps_fees_payment.setChequeno(chequeno);
        ps_fees_payment.setChequedate(chequedate);
        ps_fees_payment.setBankname(bankname);
        ps_fees_payment.setLoginuser(loginuser);
        ps_fees_payment.setInstituteid(instituteid);

        feesPaymentPlaySchoolRepository.save(ps_fees_payment);

        psbillnogenerate.setIdno(idno);
        Long lastbillno = new Long(lastbillnotable);
        psbillnogenerate.setLastBillno(lastbillno);

        playSchoolBillNoGenerateRepository.save(psbillnogenerate);

        return lastbillnotable.toString();
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
