package com.sivserver.example.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 31-Mar-18.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/schoolfeessetting")

public class SchoolFeesSettingApiController {

    @Autowired
    private SchoolFeesSettingRepository  schoolFeesSettingRepository;

    @RequestMapping(method = RequestMethod.POST)

    public void schoolFeesSetting(

            @RequestParam(value = "feessettingdate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date feessettingdate,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "program", required = false) String program,
            @RequestParam(value = "instituteid", required = false) Integer instituteid,
            @RequestParam(value = "facilityfees", required = false) Double facilityfees,
            @RequestParam(value = "tuitionfeesmonthly", required = false) Double tuitionfeesmonthly,
            @RequestParam(value = "tuitionfeestermly", required = false) Double tuitionfeestermly,
            @RequestParam(value = "booksnotebookfees", required = false) Double booksnotebookfees,
            @RequestParam(value = "othersfees", required = false) Double othersfees,
            @RequestParam(value = "totalfees", required = false) Double totalfees,
            @RequestParam(value = "facilityfeesduedate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date facilityfeesduedate,
            @RequestParam(value = "tuitionfeesmonthlyduedate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date tuitionfeesmonthlyduedate,
            @RequestParam(value = "tuitionfeestermlyduedate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date tuitionfeestermlyduedate,
            @RequestParam(value = "booksnotebookfeesduedate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date booksnotebookfeesduedate,
            @RequestParam(value = "othersfeesduedate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date othersfeesduedate,
            @RequestParam(value = "loginuser", required = false) String loginuser
    )
    {
        SchoolFeesSetting school_Fees_Set = new SchoolFeesSetting();
        Management_School_Fees_Compound_Key key = new Management_School_Fees_Compound_Key(program, academicyear,instituteid);

        school_Fees_Set.setFeessettingdate(feessettingdate);
        school_Fees_Set.setManagementschoolfeescompoundkey(key);
        school_Fees_Set.setFacilityfees(facilityfees);
        school_Fees_Set.setTuitionfeesmonthly(tuitionfeesmonthly);
        school_Fees_Set.setTuitionfeestermly(tuitionfeestermly);
        school_Fees_Set.setBooksnotebookfees(booksnotebookfees);
        school_Fees_Set.setOthersfees(othersfees);
        school_Fees_Set.setTotalfees(totalfees);
        school_Fees_Set.setFacilityfeesduedate(facilityfeesduedate);
        school_Fees_Set.setTuitionfeesmonthlyduedate(tuitionfeesmonthlyduedate);
        school_Fees_Set.setTuitionfeestermlyduedate(tuitionfeestermlyduedate);
        school_Fees_Set.setBooksnotebookfeesduedate(booksnotebookfeesduedate);
        school_Fees_Set.setOthersfeesduedate(othersfeesduedate);
        school_Fees_Set.setLoginuser(loginuser);

        schoolFeesSettingRepository.save(school_Fees_Set);


    }

    @RequestMapping(method = RequestMethod.POST, value="/getSchoolFeesDetail")
//    public PlaySchoolSchoolFeesSettingProjection getPlaySchoolFeesDetail(@RequestParam (value ="managementplayschoolfeescompoundkey", required = false) Management_Playschool_Fees_Compound_Key mgmtpsfeescompkey) {
    public SchoolFeesSettingProjection getSchoolFeesDetail(@RequestParam (value ="program", required = false) String program,@RequestParam (value ="academicyear", required = false) String academicyear,@RequestParam (value ="instituteid", required = false) Integer instituteid)  {
        Management_School_Fees_Compound_Key mgmtsfeescompkey = new Management_School_Fees_Compound_Key(program,academicyear,instituteid);
        SchoolFeesSettingProjection schoolfeesDetail = schoolFeesSettingRepository.findOneByManagementschoolfeescompoundkey(mgmtsfeescompkey);
        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
//        System.out.println("Inside getSchoolFeesDetail");
        return schoolfeesDetail;
    }


//    @RequestMapping(method = RequestMethod.POST, value="/getPlaySchoolFeesDetail")
//    public PlaySchoolSchoolFeesSettingProjection getPlaySchoolFeesDetail(
//            @RequestParam(value ="program", required=false) String program,
//            @RequestParam (value="academicyear", required=false) String academicyear
//    ){
////        Iterable<StudentBaseInformation> studentList = studentbaseinformationRepository.findByAcademicyearAndBranchcode(academicyear, branchcode);
//        PlaySchoolSchoolFeesSettingProjection playschoolfeesDetail = playSchoolFeesEntryBaseRepository.findOneByProgramAndAcademicyear(program, academicyear );
//
//        System.out.println("Inside getPlaySchoolFeesDetail");
//        return playschoolfeesDetail;
//    }

}
