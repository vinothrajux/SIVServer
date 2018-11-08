package com.sivserver.example.admission;

import com.sivserver.example.management.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 31-Mar-18.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("api/v1/applicationsaleschool")

public class ApplicationSaleSchoolApiController {

    private ApplicationSaleSchoolRepository applicationSaleSchoolRepository;

    @Autowired
    private ApplicationSalePlaySchoolRepository applicationSalePlaySchoolRepository;


//    @Autowired
//    private SchoolApplicationNoGenerateRepository schoolApplicationNoGenerateRepository;

    @Autowired
    private SchoolFeesSettingRepository schoolFeesSettingRepository;

    @Autowired
    private PlaySchoolSchoolFeesSettingRepository playSchoolSchoolFeesSettingRepository;

    @RequestMapping(value="/all")

    public List<ApplicationSalePlaySchool> getApplicationSaleSchoolDetails() {return applicationSalePlaySchoolRepository.findAll();}

    public ApplicationSaleSchoolApiController(ApplicationSaleSchoolRepository applicationSaleSchoolRepository)
    {
        this.applicationSaleSchoolRepository = applicationSaleSchoolRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void schoolapplicationsale(
            @RequestParam(value ="applno", required=false) String applno,
//            @RequestParam(value ="category", required=false) String category,
            @RequestParam (value="saledate", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date saledate,
            @RequestParam (value="appfor", required=false) String appfor,
            @RequestParam (value="candfirstname", required=false) String candfirstname,
            @RequestParam (value="candmiddlename", required=false) String candmiddlename,
            @RequestParam (value="candlastname", required=false) String candlastname,
            @RequestParam (value="dateofbirth", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date dateofbirth,
            @RequestParam (value="age", required=false) float age,
            @RequestParam (value="gender", required=false) String gender,
            @RequestParam (value="candfathername", required=false) String candfathername,
            @RequestParam (value="candmothername", required=false) String candmothername,
            @RequestParam (value="presentaddress1", required=false) String presentaddress1,
            @RequestParam (value="presentaddress2", required=false) String presentaddress2,
            @RequestParam (value="presentarea", required=false) String presentarea,
            @RequestParam (value="presentpincode", required=false) String presentpincode,
            @RequestParam (value="presentstate", required=false) String presentstate,
            @RequestParam (value="fathersmobileno", required=false) String fathersmobileno,
            @RequestParam (value="fathersaltmobno", required=false) String fathersaltmobno,
            @RequestParam (value="mothersmobileno", required=false) String mothersmobileno,
            @RequestParam (value="mothersaltmobno", required=false) String mothersaltmobno,
            @RequestParam (value="fathersemail", required=false) String fathersemail,
            @RequestParam (value="mothersemail", required=false) String mothersemail,
            @RequestParam (value="reference", required=false) String reference,
            @RequestParam (value="willingtojoin", required=false) String willingtojoin,
            @RequestParam (value="followupdate", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date followupdate,
            @RequestParam (value="applicationprice", required=false) Long applicationprice,
            @RequestParam (value="applicationpaidmode", required=false) String applicationpaidmode,
            @RequestParam (value="remarks", required=false) String remarks,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="loginuser", required=false) String loginuser,
            @RequestParam (value="instituteid", required=false) Integer instituteid
//            @RequestParam (value="idno", required=false) Integer idno
//            @RequestParam (value="enquiryno", required=false) Integer enquiryno


    ) {
        ApplicationSalePlaySchool appsaleschool = new ApplicationSalePlaySchool();
//        SchoolApplicationNoGenerate appnogenerate = new SchoolApplicationNoGenerate();
        appsaleschool.setApplno(applno);
//        appsaleplayschool.setCategory(category);
        appsaleschool.setSaledate(saledate);
        appsaleschool.setAppfor(appfor);
        appsaleschool.setCandfirstname(candfirstname);
        appsaleschool.setCandmiddlename(candmiddlename);
        appsaleschool.setCandlastname(candlastname);
        appsaleschool.setDateofbirth(dateofbirth);
        appsaleschool.setAge(age);
        appsaleschool.setGender(gender);
        appsaleschool.setCandfathername(candfathername);
        appsaleschool.setCandmothername(candmothername);
        appsaleschool.setPresentaddress1(presentaddress1);
        appsaleschool.setPresentaddress2(presentaddress2);
        appsaleschool.setPresentarea(presentarea);
        appsaleschool.setPresentpincode(presentpincode);
        appsaleschool.setPresentstate(presentstate);
        appsaleschool.setFathersmobileno(fathersmobileno);
        appsaleschool.setFathersaltmobno(fathersaltmobno);
        appsaleschool.setMothersmobileno(mothersmobileno);
        appsaleschool.setMothersaltmobno(mothersaltmobno);
        appsaleschool.setFathersemail(fathersemail);
        appsaleschool.setMothersemail(mothersemail);
        appsaleschool.setReference(reference);
        appsaleschool.setWillingtojoin(willingtojoin);
        appsaleschool.setFollowupdate(followupdate);
        appsaleschool.setApplicationprice(applicationprice);
        appsaleschool.setApplicationpaidmode(applicationpaidmode);
        appsaleschool.setRemarks(remarks);
        appsaleschool.setAcademicyear(academicyear);
        appsaleschool.setLoginuser(loginuser);
        appsaleschool.setInstituteid(instituteid);


        applicationSalePlaySchoolRepository.save(appsaleschool);

//        appnogenerate.setIdno(idno);
////        appnogenerate.setEnquiryno(enquiryno);
//
//        playSchoolApplicationNoGenerateRepository.save(appnogenerate);
    }
    // THIS API CAN BE USED TO FETCH THE APPLICATION DETAIL
    @RequestMapping(method = RequestMethod.POST, value="/getSchoolApplcationDetail")
    public ApplicationSalePlaySchoolProjection getPlaySchoolApplcationDetail(@RequestParam (value ="applno") String applicationNumber) {
        ApplicationSalePlaySchoolProjection schoolapplicationDetail = applicationSalePlaySchoolRepository.findOneByApplno(applicationNumber);

        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getSchoolApplcationDetail");
        return schoolapplicationDetail;
    }

    // THIS API CAN BE USED TO FETCH THE APPLICATION AND FEES INFORMATION FOR THE ADMISSION PLAY SCHOOL WINDOW
    ApplicationFeesInformation applicationFeesInformation;
    @RequestMapping(method = RequestMethod.POST, value="/getApplicationFeesDetails")
    public List<Object> getStudentProfileInformationDetail(@RequestParam (value ="applno") String applicationNumber, @RequestParam (value ="instituteid") Integer userinstituteid) {
        /* fetching data from table1*/
        ApplicationSalePlaySchoolProjection playschoolapplicationDetail = applicationSalePlaySchoolRepository.findOneByApplno(applicationNumber);
        String academicyear = playschoolapplicationDetail.getAcademicyear();
        Integer instituteid = playschoolapplicationDetail.getInstituteid();
        String program = playschoolapplicationDetail.getAppfor();
        if (instituteid == userinstituteid){

        /* fetching data from table2*/
            Management_Playschool_Fees_Compound_Key mgmtpsfeescompkey = new Management_Playschool_Fees_Compound_Key(program,academicyear,instituteid);
            PlaySchoolSchoolFeesSettingProjection playschoolfeesDetail = playSchoolSchoolFeesSettingRepository.findOneByManagementplayschoolfeescompoundkey(mgmtpsfeescompkey);
            List<Object> list = new ArrayList<Object>();
            list.add(playschoolapplicationDetail);
            list.add(playschoolfeesDetail);

            return list;
        }else {
            return null;
        }
    }

}
