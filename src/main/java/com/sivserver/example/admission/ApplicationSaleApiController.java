package com.sivserver.example.admission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by Seetha on 19-Jun-17.
 */
@RestController
@RequestMapping("/api/v1/applicationsale")

public class ApplicationSaleApiController extends WebMvcConfigurerAdapter {

    @Autowired
    private ApplicationSaleRepository applicationsaleRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void applicationSale(
            @RequestParam(value ="category", required=false) String category,
            @RequestParam (value="applno", required=false) String applno,
            @RequestParam (value="saledate", required=false) Date saledate,
            @RequestParam (value="appfor", required=false) String appfor,
            @RequestParam (value="candfirstname", required=false) String candfirstname,
            @RequestParam (value="candmiddlename", required=false) String candmiddlename,
            @RequestParam (value="candlastname", required=false) String candlastname,
            @RequestParam (value="gender", required=false) String gender,
            @RequestParam (value="candfathername", required=false) String candfathername,
            @RequestParam (value="candmothername", required=false) String candmothername,
            @RequestParam (value="presentaddress1", required=false) String presentaddress1,
            @RequestParam (value="presentaddress2", required=false) String presentaddress2,
            @RequestParam (value="presentarea", required=false) String presentarea,
            @RequestParam (value="presentpincode", required=false) String presentpincode,
            @RequestParam (value="presentstate", required=false) String presentstate,
            @RequestParam (value="presentmobileno", required=false) String presentmobileno,
            @RequestParam (value="presentaltmobno", required=false) String presentaltmobno,
            @RequestParam (value="presentemail", required=false) String presentemail,
            @RequestParam (value="presentaltemail", required=false) String presentaltemail,
            @RequestParam (value="permanentaddress1", required=false) String permanentaddress1,
            @RequestParam (value="permanentaddress2", required=false) String permanentaddress2,
            @RequestParam (value="permanentarea", required=false) String permanentarea,
            @RequestParam (value="permanentpincode", required=false) String permanentpincode,
            @RequestParam (value="permanentstate", required=false) String permanentstate,
            @RequestParam (value="permanentmobileno", required=false) String permanentmobileno,
            @RequestParam (value="permanentaltmobno", required=false) String permanentaltmobno,
            @RequestParam (value="permanentemail", required=false) String permanentemail,
            @RequestParam (value="permanentaltemail", required=false) String permanentaltemail,
            @RequestParam (value="qualified", required=false) String qualified,
            @RequestParam (value="prefferedcour1", required=false) String prefferedcour1,
            @RequestParam (value="prefferedcour2", required=false) String prefferedcour2,
            @RequestParam (value="prefferedcour3", required=false) String prefferedcour3,
            @RequestParam (value="willingtojoin", required=false) String willingtojoin,
            @RequestParam (value="followupdate", required=false) Date followupdate,
            @RequestParam (value="applicationprice", required=false) Integer applicationprice,
            @RequestParam (value="applicationpaidmode", required=false) String applicationpaidmode,
            @RequestParam (value="remarks", required=false) String remarks,
            @RequestParam (value="loginuser", required=false) String loginuser
    ) {
        ApplicationSale appsale = new ApplicationSale();
        appsale.setCategory(category);
        appsale.setApplno(applno);
        appsale.setSaleDate(saledate);
        appsale.setAppFor(appfor);
        appsale.setCandFirstName(candfirstname);
        appsale.setCandMidName(candmiddlename);
        appsale.setCandLastName(candlastname);
        appsale.setGender(gender);
        appsale.setFatherName(candfathername);
        appsale.setMotherName(candmothername);
        appsale.setPreAdd1(presentaddress1);
        appsale.setPreAdd2(presentaddress2);
        appsale.setPreArea(presentarea);
        appsale.setPrePin(presentpincode);
        appsale.setPreState(presentstate);
        appsale.setPreMobno(presentmobileno);
        appsale.setPreAltMobno(presentaltmobno);
        appsale.setPreEmail(presentemail);
        appsale.setPreAltEmail(presentaltemail);
        appsale.setPerAdd1(permanentaddress1);
        appsale.setPerAdd2(permanentaddress2);
        appsale.setPerArea(permanentarea);
        appsale.setPerPin(permanentpincode);
        appsale.setPerState(permanentstate);
        appsale.setPerMobno(permanentmobileno);
        appsale.setPerAltMobno(permanentaltmobno);
        appsale.setPerEmail(permanentemail);
        appsale.setPerAltEmail(permanentaltemail);
        appsale.setQualified(qualified);
        appsale.setPreCour1(prefferedcour1);
        appsale.setPreCour2(prefferedcour2);
        appsale.setPreCour3(prefferedcour3);
        appsale.setWillingness(willingtojoin);
        appsale.setProbDate(followupdate);
        appsale.setAppFee(applicationprice);
        appsale.setAppFeeMode(applicationpaidmode);
        appsale.setRemarks(remarks);
        appsale.setLoginUser(loginuser);

        applicationsaleRepository.save(appsale);



    }


}
