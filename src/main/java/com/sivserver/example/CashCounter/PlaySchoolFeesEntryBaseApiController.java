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
        PlaySchoolFeesEntryBase playschoolfeesentrybaseinfo = new PlaySchoolFeesEntryBase();
        PlaySchoolStudentPersonalInformation playschoolstudentpersonalinfo = new PlaySchoolStudentPersonalInformation(registernumber);

        playschoolfeesentrybaseinfo.setRegisternumber(registernumber)
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

        playSchoolFeesEntryBaseRepository.save(playschoolfeesentrybaseinfo);


    }



}
