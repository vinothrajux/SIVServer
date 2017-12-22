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
            @RequestParam(value = "materialkitfees", required = false) Long materialkitfees,
            @RequestParam(value = "activityfees", required = false) Long activityfees,
            @RequestParam(value = "tuitionfees", required = false) Long tuitionfees,
            @RequestParam(value = "totalfees", required = false) Long totalfees,
            @RequestParam(value = "installment1fees", required = false) Long installment1fees,
            @RequestParam(value = "installment2fees", required = false) Long installment2fees,
            @RequestParam(value = "admissionfeesduedate", required = false) Date admissionfeesduedate,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        PlaySchoolBalanceFees playschoolbalancefeesinfo = new PlaySchoolBalanceFees();
        PlaySchoolStudentPersonalInformation playschoolstudentpersonalinfo = new PlaySchoolStudentPersonalInformation(registernumber);

        playschoolbalancefeesinfo.setRegisternumber(registernumber)
                .setMaterialkitfees(materialkitfees)
                .setActivityfees(activityfees)
                .setTuitionfees(tuitionfees)
                .setTotalfees(totalfees)
                .setInstallment1fees(installment1fees)
                .setInstallment2fees(installment2fees)
                .setAdmissionfeesduedate(admissionfeesduedate)
                .setAcademicyear(academicyear)
                .setLoginuser(loginuser)
                .setPlay_school_student_personal_regno(playschoolstudentpersonalinfo);

        playSchoolBalanceFeesRepository.save(playschoolbalancefeesinfo);


    }

}
