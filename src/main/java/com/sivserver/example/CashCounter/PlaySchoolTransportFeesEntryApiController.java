package com.sivserver.example.CashCounter;

import com.sivserver.example.student.PlaySchoolStudentPersonalInformation;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 18-Dec-17.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/playschooltransportfeesentry")
public class PlaySchoolTransportFeesEntryApiController {

    private PlaySchoolTransportFeesEntryRepository playSchoolTransportFeesEntryRepository;

    @GetMapping(value="/all")

    public List<PlaySchoolTransportFeesEntry> getPlaySchoolTransportFeesEntryDetails() {return playSchoolTransportFeesEntryRepository.findAll();}

    public PlaySchoolTransportFeesEntryApiController(PlaySchoolTransportFeesEntryRepository playSchoolTransportFeesEntryRepository)
    {
        this.playSchoolTransportFeesEntryRepository = playSchoolTransportFeesEntryRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void playschooltransportfeesentry(
            @RequestParam(value = "registernumber", required = false) String registernumber,
            @RequestParam(value = "transport", required = false) String transport,
            @RequestParam(value = "stage", required = false) String stage,
            @RequestParam(value = "transportfeesmethod", required = false) String transportfeesmethod,
            @RequestParam(value = "transportfees", required = false) Double transportfees,
            @RequestParam(value = "transportduedate", required = false) Date transportduedate,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "loginuser", required = false) String loginuser,
            @RequestParam(value = "instituteid", required = false) Integer instituteid

    ) {
        PlaySchoolTransportFeesEntry playschooltransportfeesentryinfo = new PlaySchoolTransportFeesEntry();
        PlaySchoolStudentPersonalInformation playschoolstudentpersonalinfo = new PlaySchoolStudentPersonalInformation(registernumber);


        playschooltransportfeesentryinfo.setRegisternumber(registernumber)
                .setTransport(transport)
                .setStage(stage)
                .setTransportpaymentmethod(transportfeesmethod)
                .setTransportfees(transportfees)
                .setTransportduedate(transportduedate)
                .setAcademicyear(academicyear)
                .setLoginuser(loginuser)
                .setInstituteid(instituteid)
                .setPlay_school_student_personal_regno(playschoolstudentpersonalinfo);


        playSchoolTransportFeesEntryRepository.save(playschooltransportfeesentryinfo);

    }


    }
