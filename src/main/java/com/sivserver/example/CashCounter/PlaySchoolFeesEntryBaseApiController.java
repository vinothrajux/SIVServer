package com.sivserver.example.CashCounter;

import com.sivserver.example.admission.AdmissionPlaySchoolProjection;
import com.sivserver.example.student.PlaySchoolStudentPersonalInformation;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 01/11/2017.
 */
@RestController
@RequestMapping("/api/v1/playschoolfeesentrybase")
public class PlaySchoolFeesEntryBaseApiController {

    private PlaySchoolFeesEntryBaseRepository playSchoolFeesEntryBaseRepository;

    @GetMapping(value="/all")

    public List<PlaySchoolFeesEntryBase> getPlaySchoolFeesEntryBaseDetails() {return playSchoolFeesEntryBaseRepository.findAll(); }

    public PlaySchoolFeesEntryBaseApiController(PlaySchoolFeesEntryBaseRepository playSchoolFeesEntryBaseRepository)
    {
        this.playSchoolFeesEntryBaseRepository = playSchoolFeesEntryBaseRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void playschoolfeesentrybase(
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
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        PlaySchoolFeesEntryBase playschoolfeesentrybaseinfo = new PlaySchoolFeesEntryBase();
        PlaySchoolStudentPersonalInformation playschoolstudentpersonalinfo = new PlaySchoolStudentPersonalInformation(registernumber);

        playschoolfeesentrybaseinfo.setRegisternumber(registernumber)
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
                                    .setPlay_school_student_personal_regno(playschoolstudentpersonalinfo);

        playSchoolFeesEntryBaseRepository.save(playschoolfeesentrybaseinfo);


    }



}
