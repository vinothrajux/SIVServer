package com.sivserver.example.CashCounter;

import com.sivserver.example.student.PlaySchoolStudentPersonalInformation;
import org.springframework.web.bind.annotation.*;

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
            @RequestParam(value = "admissionfees", required = false) Long admissionfees,
            @RequestParam(value = "transportfees", required = false) Long transportfees,
            @RequestParam(value = "total_admission_fees", required = false) Long total_admission_fees,
            @RequestParam(value = "term1fees", required = false) Long term1fees,
            @RequestParam(value = "term1transportfees", required = false) Long term1transportfees,
            @RequestParam(value = "total_term1_fees", required = false) Long total_term1_fees,
            @RequestParam(value = "term2fees", required = false) Long term2fees,
            @RequestParam(value = "term2transportfees", required = false) Long term2transportfees,
            @RequestParam(value = "total_term2_fees", required = false) Long total_term2_fees,
            @RequestParam(value = "grand_total_fees", required = false) Long grand_total_fees,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        PlaySchoolFeesEntryBase playschoolfeesentrybaseinfo = new PlaySchoolFeesEntryBase();
        PlaySchoolStudentPersonalInformation playschoolstudentpersonalinfo = new PlaySchoolStudentPersonalInformation(registernumber);

        playschoolfeesentrybaseinfo.setRegisternumber(registernumber)
                                    .setAdmissionfees(admissionfees)
                                    .setTransportfees(transportfees)
                                    .setTotal_admission_fees(total_admission_fees)
                                    .setTerm1fees(term1fees)
                                    .setTerm1transportfees(term1transportfees)
                                    .setTotal_term1_fees(total_term1_fees)
                                    .setTerm2fees(term2fees)
                                    .setTerm2transportfees(term2transportfees)
                                    .setTotal_term2_fees(total_term2_fees)
                                    .setGrand_total_fees(grand_total_fees)
                                    .setAcademicyear(academicyear)
                                    .setLoginuser(loginuser)
                                    .setPlay_school_student_personal_regno(playschoolstudentpersonalinfo);

        playSchoolFeesEntryBaseRepository.save(playschoolfeesentrybaseinfo);


    }

    }
