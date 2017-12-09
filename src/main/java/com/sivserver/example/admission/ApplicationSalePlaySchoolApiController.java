package com.sivserver.example.admission;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 25/10/2017.
 */
@RestController
@RequestMapping("api/v1/playschoolapplicationsale")
public class ApplicationSalePlaySchoolApiController {

    private ApplicationSalePlaySchoolRepository applicationSalePlaySchoolRepository;

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
            @RequestParam (value="age", required=false) Long age,
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
            @RequestParam (value="loginuser", required=false) String loginuser

    ) {
        ApplicationSalePlaySchool appsaleplayschool = new ApplicationSalePlaySchool();
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

        applicationSalePlaySchoolRepository.save(appsaleplayschool);

    }

    @RequestMapping(method = RequestMethod.POST, value="/getPlaySchoolApplcationDetail")
    public ApplicationSalePlaySchoolProjection getPlaySchoolApplcationDetail(@RequestParam (value ="applno") String applicationNumber) {
        ApplicationSalePlaySchoolProjection playschoolapplicationDetail = applicationSalePlaySchoolRepository.findOneByApplno(applicationNumber);
        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getPlaySchoolApplcationDetail");
        return playschoolapplicationDetail;
    }


}
