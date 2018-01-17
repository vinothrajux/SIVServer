package com.sivserver.example.sports;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 17/07/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/sportspddetail")

public class SportsPdDetailApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private SportsPdDetailRepository sportsPdDetailRepository;

    @RequestMapping(method = RequestMethod.POST)
    public void sportsodform(
            @RequestParam(value ="institutecode", required=false) String institutecode,
            @RequestParam(value ="institutename", required=false) String institutename,
            @RequestParam (value="instituteaddress1", required=false) String instituteaddress1,
            @RequestParam (value="instituteaddress2", required=false) String instituteaddress2,
            @RequestParam (value="institutearea", required=false) String institutearea,
            @RequestParam (value="institutepin", required=false) String institutepin,
            @RequestParam (value="physicaldirector1name", required=false) String physicaldirector1name,
            @RequestParam (value="physicaldirector1mobile", required=false) String physicaldirector1mobile,
            @RequestParam (value="physicaldirector1altmobile", required=false) String physicaldirector1altmobile,
            @RequestParam (value="physicaldirector1email", required=false) String physicaldirector1email,
            @RequestParam (value="physicaldirector1altemail", required=false) String physicaldirector1altemail,
            @RequestParam (value="physicaldirector2name", required=false) String physicaldirector2name,
            @RequestParam (value="physicaldirector2mobile", required=false) String physicaldirector2mobile,
            @RequestParam (value="physicaldirector2altmobile", required=false) String physicaldirector2altmobile,
            @RequestParam (value="physicaldirector2email", required=false) String physicaldirector2email,
            @RequestParam (value="physicaldirector2altemail", required=false) String physicaldirector2altemail,
            @RequestParam (value="loginuser", required=false) String loginuser



            ) {
        SportsPdDetail sportspddet = new SportsPdDetail();
        sportspddet.setInstitutecode(institutecode);
        sportspddet.setInstitutename(institutename);
        sportspddet.setInstituteaddress1(instituteaddress1);
        sportspddet.setInstituteaddress2(instituteaddress2);
        sportspddet.setInstitutearea(institutearea);
        sportspddet.setInstitutepin(institutepin);
        sportspddet.setPhysicaldirector1name(physicaldirector1name);
        sportspddet.setPhysicaldirector1mobile(physicaldirector1mobile);
        sportspddet.setPhysicaldirector1altmobile(physicaldirector1altmobile);
        sportspddet.setPhysicaldirector1email(physicaldirector1email);
        sportspddet.setPhysicaldirector1altemail(physicaldirector1altemail);
        sportspddet.setPhysicaldirector2name(physicaldirector2name);
        sportspddet.setPhysicaldirector2mobile(physicaldirector2mobile);
        sportspddet.setPhysicaldirector2altmobile(physicaldirector2altmobile);
        sportspddet.setPhysicaldirector2email(physicaldirector2email);
        sportspddet.setPhysicaldirector2altemail(physicaldirector2altemail);
        sportspddet.setLoginuser(loginuser);



        sportsPdDetailRepository.save(sportspddet);



    }



}
