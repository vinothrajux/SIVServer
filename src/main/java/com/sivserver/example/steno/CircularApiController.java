package com.sivserver.example.steno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by Seetha on 06-Jul-17.
 */

@RestController
@RequestMapping("/api/v1/stenocircular")

public class CircularApiController extends WebMvcConfigurerAdapter {

    @Autowired
    private CircularRepository stenocircularRepository;

    @RequestMapping(method = RequestMethod.POST)

    public void stenocircular(
            @RequestParam(value = "currentdate", required = false) Date currentdate,
            @RequestParam(value = "circulartype", required = false) String circulartype,
            @RequestParam(value = "circulardate", required = false) Date circulardate,
            @RequestParam(value = "circularparticular", required = false) String circularparticular,
            @RequestParam(value = "branch", required = false) String branch,
            @RequestParam(value = "branchcode", required = false) String branchcode,
            @RequestParam(value = "semester", required = false) String semester,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "loginuser", required = false) String loginuser


    )

    {
        Circular steno = new Circular();

        steno.setCurrentdate(currentdate);
        steno.setCirculartype(circulartype);
        steno.setCirculardate(circulardate);
        steno.setCircularparticular(circularparticular);
        steno.setBranch(branch);
        steno.setBranchcode(branchcode);
        steno.setSemester(semester);
        steno.setAcademicyear(academicyear);
        steno.setLoginUser(loginuser);

        stenocircularRepository.save(steno);


    }
}


