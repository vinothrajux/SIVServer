package com.sivserver.example.CashCounter;

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
@RequestMapping("/api/v1/schoolbalancefees")

public class SchoolBalanceFeesApiController {

    private SchoolBalanceFeesRepository schoolBalanceFeesRepository;

    @GetMapping(value="/all")

    public List<SchoolBalanceFees> getSchoolBalanceFeesDetails() {return schoolBalanceFeesRepository.findAll(); }

    public SchoolBalanceFeesApiController(SchoolBalanceFeesRepository schoolBalanceFeesRepository)
    {
        this.schoolBalanceFeesRepository = schoolBalanceFeesRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void schoolbalancefees(
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
        SchoolBalanceFees schoolbalancefees = new SchoolBalanceFees();
        SchoolStudentPersonalInformation schoolstudentpersonalinfo = new SchoolStudentPersonalInformation(registernumber);

        schoolbalancefees.setRegisternumber(registernumber)
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

        schoolBalanceFeesRepository.save(schoolbalancefees);


    }

}
