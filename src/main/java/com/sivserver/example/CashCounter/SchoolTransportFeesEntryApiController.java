package com.sivserver.example.CashCounter;

import com.sivserver.example.student.PlaySchoolStudentPersonalInformation;
import com.sivserver.example.student.SchoolStudentPersonalInformation;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 02-Apr-18.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/schooltransportfeesentry")

public class SchoolTransportFeesEntryApiController {

    private SchoolTransportFeesEntryRepository schoolTransportFeesEntryRepository;

    @GetMapping(value="/all")

    public List<SchoolTransportFeesEntry> getSchoolTransportFeesEntryDetails() {return schoolTransportFeesEntryRepository.findAll();}

    public SchoolTransportFeesEntryApiController(SchoolTransportFeesEntryRepository schoolTransportFeesEntryRepository)
    {
        this.schoolTransportFeesEntryRepository = schoolTransportFeesEntryRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void schooltransportfeesentry(
            @RequestParam(value = "registernumber", required = false) String registernumber,
            @RequestParam(value = "instituteregisternumber", required = false) String instituteregisternumber,
            @RequestParam(value = "transport", required = false) String transport,
            @RequestParam(value = "stage", required = false) String stage,
            @RequestParam(value = "transportfeesmethod", required = false) String transportfeesmethod,
            @RequestParam(value = "transportfees", required = false) Double transportfees,
            @RequestParam(value = "transportduedate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date transportduedate,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "loginuser", required = false) String loginuser,
            @RequestParam(value = "instituteid", required = false) Integer instituteid

    ) {
        SchoolTransportFeesEntry schooltransportfeesentryinfo = new SchoolTransportFeesEntry();
        SchoolStudentPersonalInformation playschoolstudentpersonalinfo = new SchoolStudentPersonalInformation(registernumber);


        schooltransportfeesentryinfo.setRegisternumber(registernumber)
                .setInstituteregisternumber(instituteregisternumber)
                .setTransport(transport)
                .setStage(stage)
                .setTransportfeesmethod(transportfeesmethod)
                .setTransportfees(transportfees)
                .setTransportduedate(transportduedate)
                .setAcademicyear(academicyear)
                .setLoginuser(loginuser)
                .setInstituteid(instituteid)
                .setPlay_school_student_personal_regno(playschoolstudentpersonalinfo);


        schoolTransportFeesEntryRepository.save(schooltransportfeesentryinfo);

    }



}
