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
@RequestMapping("/api/v1/schoolfeesentrybase")

public class SchoolFeesEntryBaseApiController {

    private SchoolFeesEntryBaseRepository schoolFeesEntryBaseRepository;

    @GetMapping(value="/all")

    public List<SchoolFeesEntryBase> getSchoolFeesEntryBaseDetails() {return schoolFeesEntryBaseRepository.findAll(); }

    public SchoolFeesEntryBaseApiController(SchoolFeesEntryBaseRepository schoolFeesEntryBaseRepository)
    {
        this.schoolFeesEntryBaseRepository = schoolFeesEntryBaseRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void schoolfeesentrybase(
            @RequestParam(value = "registernumber", required = false) String registernumber,
            @RequestParam(value = "instituteregisternumber", required = false) String instituteregisternumber,
            @RequestParam(value = "facilityfees", required = false) Double facilityfees,
            @RequestParam(value = "facilityfeesduedate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date facilityfeesduedate,
            @RequestParam(value = "booksnotebookfees", required = false) Double booksnotebookfees,
            @RequestParam(value = "booksnotebookfeesduedate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date booksnotebookfeesduedate,
            @RequestParam(value = "othersfees", required = false) Double othersfees,
            @RequestParam(value = "othersfeesduedate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date othersfeesduedate,
            @RequestParam(value = "tuitionfeesmonthly", required = false) Double tuitionfeesmonthly,
            @RequestParam(value = "tuitionfeesmonthlyduedate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date tuitionfeesmonthlyduedate,
            @RequestParam(value = "tuitionfeestermly", required = false) Double tuitionfeestermly,
            @RequestParam(value = "tuitionfeestermlyduedate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date tuitionfeestermlyduedate,
            @RequestParam(value = "totalfees", required = false) Double totalfees,
            @RequestParam(value = "tuitionfeesmethod", required = false) String tuitionfeesmethod,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "loginuser", required = false) String loginuser,
            @RequestParam(value = "instituteid", required = false) Integer instituteid

    ) {
        SchoolFeesEntryBase schoolfeesentrybaseinfo = new SchoolFeesEntryBase();
        SchoolStudentPersonalInformation schoolstudentpersonalinfo = new SchoolStudentPersonalInformation(registernumber);

        schoolfeesentrybaseinfo.setRegisternumber(registernumber)
                .setInstituteregisternumber(instituteregisternumber)
                .setFacilityfees(facilityfees)
                .setFacilityfeesduedate(facilityfeesduedate)
                .setBooksnotebookfees(booksnotebookfees)
                .setBooksnotebookfeesduedate(booksnotebookfeesduedate)
                .setOthersfees(othersfees)
                .setOthersfeesduedate(othersfeesduedate)
                .setTuitionfeesmonthly(tuitionfeesmonthly)
                .setTuitionfeesmonthlyduedate(tuitionfeesmonthlyduedate)
                .setTuitionfeestermlyduedate(tuitionfeestermlyduedate)
                .setTotalfees(totalfees)
                .setTuitionfeesmethod(tuitionfeesmethod)
                .setAcademicyear(academicyear)
                .setLoginuser(loginuser)
                .setInstituteid(instituteid)
                .setSchool_student_personal_regno(schoolstudentpersonalinfo);

        schoolFeesEntryBaseRepository.save(schoolfeesentrybaseinfo);


    }



}
