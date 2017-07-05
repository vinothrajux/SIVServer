package com.sivserver.example.hod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by GBCorp on 02/07/2017.
 */
@RestController
@RequestMapping("/api/v1/studentremarksaction")

public class StudentRemarksActionApiController extends WebMvcConfigurerAdapter{
    @Autowired
    private StudentRemarksActionRepository studentRemarksActionRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void studentsRemAction(
            @RequestParam(value = "regno", required = false) String regno,
            @RequestParam(value = "remarkactiondate", required = false) Date remarkactiondate,
            @RequestParam(value = "remarkactionday", required = false) String remarkactionday,
            @RequestParam(value = "remarkactiondetails", required = false) String remarkactiondetails,
            @RequestParam(value = "statusofaction", required = false) String statusofaction,
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        StudentRemarksAction studRemarksAction = new StudentRemarksAction();

        studRemarksAction.setRegno(regno);
        studRemarksAction.setRemarksActionDate(remarkactiondate);
        studRemarksAction.setRemarksActionDay(remarkactionday);
        studRemarksAction.setRemarksActionDetails(remarkactiondetails);
        studRemarksAction.setStatusofAction(statusofaction);
        studRemarksAction.setLoginUser(loginuser);

        studentRemarksActionRepository.save(studRemarksAction);
    }


}
