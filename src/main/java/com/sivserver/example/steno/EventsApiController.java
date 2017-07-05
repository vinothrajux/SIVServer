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
@RequestMapping("/api/v1/stenoevents")

public class EventsApiController extends WebMvcConfigurerAdapter {

    @Autowired
    private EventsRepository stenoeventsRepository;

    @RequestMapping(method = RequestMethod.POST)

    public void stenoevents(
            @RequestParam(value = "currentdate", required = false) Date currentdate,
            @RequestParam(value = "eventtype", required = false) String eventtype,
            @RequestParam(value = "eventdate", required = false) Date eventdate,
            @RequestParam(value = "eventparticular", required = false) String eventparticular,
            @RequestParam(value = "branch", required = false) String branch,
            @RequestParam(value = "branchcode", required = false) String branchcode,
            @RequestParam(value = "semester", required = false) String semester,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "loginuser", required = false) String loginuser


    )

    {
        Events steno = new Events();

        steno.setCurrentdate(currentdate);
        steno.setEventtype(eventtype);
        steno.setEventdate(eventdate);
        steno.setEventparticular(eventparticular);
        steno.setBranch(branch);
        steno.setBranchcode(branchcode);
        steno.setSemester(semester);
        steno.setAcademicyear(academicyear);
        steno.setLoginUser(loginuser);

        stenoeventsRepository.save(steno);


    }
}
