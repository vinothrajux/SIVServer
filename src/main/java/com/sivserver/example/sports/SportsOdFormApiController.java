package com.sivserver.example.sports;

import com.sivserver.example.student.StudentBaseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 17/07/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/sportsod")

public class SportsOdFormApiController {
    //@Autowired
    private SportsOdFormRepository sportsOdFormRepository;

    @GetMapping(value="/all")

    public List<SportsOdForm> getSportsOdForm() {return sportsOdFormRepository.findAll();}

    public SportsOdFormApiController(SportsOdFormRepository sportsOdFormRepository)
    {
        this.sportsOdFormRepository = sportsOdFormRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void sportsodform(
            @RequestParam(value ="id", required=false) Integer id,
            @RequestParam(value ="currentdate", required=false) Date currentdate,
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="batch", required=false) String batch,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="reasonforod", required=false) String reasonforod,
            @RequestParam (value="fromdate", required=false) Date fromdate,
            @RequestParam (value="todate", required=false) Date todate,
            @RequestParam (value="semester", required=false) String loginuser

    ) {
        SportsOdForm sportodfrm = new SportsOdForm();
        StudentBaseInformation studentBaseInformation = new StudentBaseInformation(regno);
        sportodfrm.setId(id);
        sportodfrm.setCurrentdate(currentdate);
        sportodfrm.setRegno(regno);
        sportodfrm.setBranchcode(branchcode);
        sportodfrm.setBatch(batch);
        sportodfrm.setSemester(semester);
        sportodfrm.setAcademicyear(academicyear);
        sportodfrm.setReasonforod(reasonforod);
        sportodfrm.setFromdate(fromdate);
        sportodfrm.setTodate(todate);
        sportodfrm.setLoginuser(loginuser);

        sportsOdFormRepository.save(sportodfrm);



    }



}
