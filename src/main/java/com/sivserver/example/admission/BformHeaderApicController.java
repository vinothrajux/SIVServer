package com.sivserver.example.admission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by GBCorp on 01/07/2017.
 */
@RestController
@RequestMapping("/api/v1/bformheader")

public class BformHeaderApicController extends WebMvcConfigurerAdapter {
    @Autowired
    private BformHeaderRepository bformHeaderRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void bformHeader(
            @RequestParam(value ="slno", required=false) Integer slno,
            @RequestParam (value="category", required=false) String category,
            @RequestParam (value="allotedquota", required=false) String allotedquota,
            @RequestParam (value="name", required=false) String name,
            @RequestParam (value="gender", required=false) String gender,
            @RequestParam (value="dob", required=false) Date dob,
            @RequestParam (value="community", required=false) String community,
            @RequestParam (value="religion", required=false) String religion,
            @RequestParam (value="qualifiedexam", required=false) String qualifiedexam,
            @RequestParam (value="yearofpass", required=false) String yearofpass,
            @RequestParam (value="photoid", required=false) String photoid,
            @RequestParam (value="remarks", required=false) String remarks,
            @RequestParam (value="bcode", required=false) String bcode,
            @RequestParam (value="state", required=false) String state,
            @RequestParam (value="acadyear", required=false) String acadyear,
            @RequestParam (value="applicationno", required=false) String applicationno,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="loginuser", required=false) String loginuser
    ) {
        BformHeader bfromhead = new BformHeader();
        bfromhead.setSlno(slno);
        bfromhead.setCategory(category);
        bfromhead.setAllotedquota(allotedquota);
        bfromhead.setName(name);
        bfromhead.setGender(gender);
        bfromhead.setDateofbirth(dob);
        bfromhead.setCommunity(community);
        bfromhead.setReleigion(religion);
        bfromhead.setQualifiedexam(qualifiedexam);
        bfromhead.setYearofpass(yearofpass);
        bfromhead.setPhotoid(photoid);
        bfromhead.setRemarks(remarks);
        bfromhead.setBcode(bcode);
        bfromhead.setState(state);
        bfromhead.setAcadyear(acadyear);
        bfromhead.setApplicationno(applicationno);
        bfromhead.setSemester(semester);
        bfromhead.setLoginuser(loginuser);

     //   bformHeaderRepository.save(bfromhead);



    }

}
