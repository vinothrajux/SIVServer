package com.sivserver.example.admission;

import com.sivserver.example.management.Management_Playschool_Fees_Compound_Key;
import com.sivserver.example.management.PlaySchoolSchoolFeesSettingProjection;
import com.sivserver.example.management.PlaySchoolSchoolFeesSettingRepository;
import com.sivserver.example.student.StudentBaseInformationProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 25/10/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("api/v1/playschoolapplicationsale")
public class ApplicationSalePlaySchoolApiController {

    private ApplicationSalePlaySchoolRepository applicationSalePlaySchoolRepository;


    @Autowired
    private PlaySchoolApplicationNoGenerateRepository playSchoolApplicationNoGenerateRepository;

    @Autowired
    private PlaySchoolSchoolFeesSettingRepository playSchoolSchoolFeesSettingRepository;

    @RequestMapping(value="/all")

    public List<ApplicationSalePlaySchool> getApplicationSalePlaySchoolDetails() {return applicationSalePlaySchoolRepository.findAll();}

    public ApplicationSalePlaySchoolApiController(ApplicationSalePlaySchoolRepository applicationSalePlaySchoolRepository)
    {
        this.applicationSalePlaySchoolRepository = applicationSalePlaySchoolRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void playschoolapplicationsale(
            @RequestParam(value ="applno", required=false) String applno,
            @RequestParam(value ="category", required=false) String category,
            @RequestParam (value="saledate", required=false) Date saledate,
            @RequestParam (value="appfor", required=false) String appfor,
            @RequestParam (value="candfirstname", required=false) String candfirstname,
            @RequestParam (value="candmiddlename", required=false) String candmiddlename,
            @RequestParam (value="candlastname", required=false) String candlastname,
            @RequestParam (value="dateofbirth", required=false) Date dateofbirth,
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
            @RequestParam (value="followupdate", required=false) Date followupdate,
            @RequestParam (value="applicationprice", required=false) Long applicationprice,
            @RequestParam (value="applicationpaidmode", required=false) String applicationpaidmode,
            @RequestParam (value="remarks", required=false) String remarks,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="loginuser", required=false) String loginuser,
            @RequestParam (value="instituteid", required=false) Integer instituteid,
            @RequestParam (value="idno", required=false) Integer idno,
            @RequestParam (value="enquiryno", required=false) Integer enquiryno


    ) {
        ApplicationSalePlaySchool appsaleplayschool = new ApplicationSalePlaySchool();
        PlaySchoolApplicationNoGenerate appnogenerate = new PlaySchoolApplicationNoGenerate();
        appsaleplayschool.setApplno(applno);
        appsaleplayschool.setCategory(category);
        appsaleplayschool.setSaledate(saledate);
        appsaleplayschool.setAppfor(appfor);
        appsaleplayschool.setCandfirstname(candfirstname);
        appsaleplayschool.setCandmiddlename(candmiddlename);
        appsaleplayschool.setCandlastname(candlastname);
        appsaleplayschool.setDateofbirth(dateofbirth);
        appsaleplayschool.setAge(age);
        appsaleplayschool.setGender(gender);
        appsaleplayschool.setCandfathername(candfathername);
        appsaleplayschool.setCandmothername(candmothername);
        appsaleplayschool.setPresentaddress1(presentaddress1);
        appsaleplayschool.setPresentaddress2(presentaddress2);
        appsaleplayschool.setPresentarea(presentarea);
        appsaleplayschool.setPresentpincode(presentpincode);
        appsaleplayschool.setPresentstate(presentstate);
        appsaleplayschool.setFathersmobileno(fathersmobileno);
        appsaleplayschool.setFathersaltmobno(fathersaltmobno);
        appsaleplayschool.setMothersmobileno(mothersmobileno);
        appsaleplayschool.setMothersaltmobno(mothersaltmobno);
        appsaleplayschool.setFathersemail(fathersemail);
        appsaleplayschool.setMothersemail(mothersemail);
        appsaleplayschool.setReference(reference);
        appsaleplayschool.setWillingtojoin(willingtojoin);
        appsaleplayschool.setFollowupdate(followupdate);
        appsaleplayschool.setApplicationprice(applicationprice);
        appsaleplayschool.setApplicationpaidmode(applicationpaidmode);
        appsaleplayschool.setRemarks(remarks);
        appsaleplayschool.setAcademicyear(academicyear);
        appsaleplayschool.setLoginuser(loginuser);
        appsaleplayschool.setInstituteid(instituteid);


        applicationSalePlaySchoolRepository.save(appsaleplayschool);

        appnogenerate.setIdno(idno);
        appnogenerate.setEnquiryno(enquiryno);

        playSchoolApplicationNoGenerateRepository.save(appnogenerate);
    }
// THIS API CAN BE USED TO FETCH THE APPLICATION DETAIL
    @RequestMapping(method = RequestMethod.POST, value="/getPlaySchoolApplcationDetail")
    public ApplicationSalePlaySchoolProjection getPlaySchoolApplcationDetail(@RequestParam (value ="applno") String applicationNumber) {
        ApplicationSalePlaySchoolProjection playschoolapplicationDetail = applicationSalePlaySchoolRepository.findOneByApplno(applicationNumber);

        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getPlaySchoolApplcationDetail");
        return playschoolapplicationDetail;
    }

// THIS API CAN BE USED TO FETCH THE APPLICATION AND FEES INFORMATION FOR THE ADMISSION PLAY SCHOOL WINDOW
    ApplicationFeesInformation applicationFeesInformation;
    @RequestMapping(method = RequestMethod.POST, value="/getApplicationFeesDetails")
    public List<Object> getStudentProfileInformationDetail(@RequestParam (value ="applno") String applicationNumber,@RequestParam (value ="appfor") String program,@RequestParam (value ="academicyear") String academicyear,@RequestParam (value ="instituteid") Integer instituteid) {
        /* fetching data from table1*/
        ApplicationSalePlaySchoolProjection playschoolapplicationDetail = applicationSalePlaySchoolRepository.findOneByApplno(applicationNumber);
        /* fetching data from table2*/
        Management_Playschool_Fees_Compound_Key mgmtpsfeescompkey = new Management_Playschool_Fees_Compound_Key(program,academicyear,instituteid);
        PlaySchoolSchoolFeesSettingProjection playschoolfeesDetail = playSchoolSchoolFeesSettingRepository.findOneByManagementplayschoolfeescompoundkey(mgmtpsfeescompkey);
        List<Object> list = new ArrayList<Object>();
        list.add(playschoolapplicationDetail);
        list.add(playschoolfeesDetail);

        return list;
    }

}
