package com.sivserver.example.CashCounter;

import com.sivserver.example.student.PlaySchoolStudentPersonalInformation;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 01/11/2017.
 */
@RestController
@RequestMapping("/api/v1/playschoolbalancefees")
public class PlaySchoolBalanceFeesApiController {

    private PlaySchoolBalanceFeesRepository playSchoolBalanceFeesRepository;

    @GetMapping(value = "/all")

    public List<PlaySchoolBalanceFees> getPlaySchoolBalanceFeesDetails() {return playSchoolBalanceFeesRepository.findAll();}

    public PlaySchoolBalanceFeesApiController(PlaySchoolBalanceFeesRepository playSchoolBalanceFeesRepository)
    {
        this.playSchoolBalanceFeesRepository = playSchoolBalanceFeesRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void playschoolbalancefees(
            @RequestParam(value = "registernumber", required = false) String registernumber,
            @RequestParam(value = "admissionfees", required = false) Long admissionfees,
            @RequestParam(value = "transportfees", required = false) Long transportfees,
            @RequestParam(value = "total_admission_fees", required = false) Long total_admission_fees,
            @RequestParam(value = "admission_fees_due_date", required = false) Date admission_fees_due_date,
            @RequestParam(value = "term1fees", required = false) Long term1fees,
            @RequestParam(value = "term1transportfees", required = false) Long term1transportfees,
            @RequestParam(value = "total_term1_fees", required = false) Long total_term1_fees,
            @RequestParam(value = "term1_fees_due_date", required = false) Date term1_fees_due_date,
            @RequestParam(value = "term2fees", required = false) Long term2fees,
            @RequestParam(value = "term2transportfees", required = false) Long term2transportfees,
            @RequestParam(value = "total_term2_fees", required = false) Long total_term2_fees,
            @RequestParam(value = "term2_fees_due_date", required = false) Date term2_fees_due_date,
            @RequestParam(value = "grand_total_fees", required = false) Long grand_total_fees,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        PlaySchoolBalanceFees playschoolbalancefeesinfo = new PlaySchoolBalanceFees();
        PlaySchoolStudentPersonalInformation playschoolstudentpersonalinfo = new PlaySchoolStudentPersonalInformation(registernumber);

        playschoolbalancefeesinfo.setRegisternumber(registernumber)
                .setAdmissionfees(admissionfees)
                .setTransportfees(transportfees)
                .setTotal_admission_fees(total_admission_fees)
                .setAdmission_fees_due_date(admission_fees_due_date)
                .setTerm1fees(term1fees)
                .setTerm1transportfees(term1transportfees)
                .setTotal_term1_fees(total_term1_fees)
                .setTerm1_fees_due_date(term1_fees_due_date)
                .setTerm2fees(term2fees)
                .setTerm2transportfees(term2transportfees)
                .setTotal_term2_fees(total_term2_fees)
                .setTerm2_fees_due_date(term2_fees_due_date)
                .setGrand_total_fees(grand_total_fees)
                .setAcademicyear(academicyear)
                .setLoginuser(loginuser)
                .setPlay_school_student_personal_regno(playschoolstudentpersonalinfo);

        playSchoolBalanceFeesRepository.save(playschoolbalancefeesinfo);


    }

}
