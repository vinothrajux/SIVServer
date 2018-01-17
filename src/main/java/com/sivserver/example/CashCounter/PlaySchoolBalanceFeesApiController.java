package com.sivserver.example.CashCounter;

import com.sivserver.example.student.PlaySchoolStudentPersonalInformation;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 01/11/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
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
            @RequestParam(value = "registrationfees", required = false) Double registrationfees,
            @RequestParam(value = "materialkitfees", required = false) Double materialkitfees,
            @RequestParam(value = "activityfees", required = false) Double activityfees,
            @RequestParam(value = "tuitionfees", required = false) Double tuitionfees,
            @RequestParam(value = "totalfees", required = false) Double totalfees,
            @RequestParam(value = "installment1fees", required = false) Double installment1fees,
            @RequestParam(value = "installment2fees", required = false) Double installment2fees,
            @RequestParam(value = "installment1duedate", required = false) Date installment1duedate,
            @RequestParam(value = "installment2duedate", required = false) Date installment2duedate,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "loginuser", required = false) String loginuser,
            @RequestParam(value = "instituteid", required = false) Integer instituteid

    ) {
        PlaySchoolBalanceFees playschoolbalancefeesinfo = new PlaySchoolBalanceFees();
        PlaySchoolStudentPersonalInformation playschoolstudentpersonalinfo = new PlaySchoolStudentPersonalInformation(registernumber);

        playschoolbalancefeesinfo.setRegisternumber(registernumber)
                .setRegistrationfees(registrationfees)
                .setMaterialkitfees(materialkitfees)
                .setActivityfees(activityfees)
                .setTuitionfees(tuitionfees)
                .setTotalfees(totalfees)
                .setInstallment1fees(installment1fees)
                .setInstallment2fees(installment2fees)
                .setInstallment1duedate(installment1duedate)
                .setInstallment2duedate(installment2duedate)
                .setAcademicyear(academicyear)
                .setLoginuser(loginuser)
                .setInstituteid(instituteid)
                .setPlay_school_student_personal_regno(playschoolstudentpersonalinfo);

        playSchoolBalanceFeesRepository.save(playschoolbalancefeesinfo);


    }

}
