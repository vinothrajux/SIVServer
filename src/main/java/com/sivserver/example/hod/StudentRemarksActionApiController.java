package com.sivserver.example.hod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 02/07/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/studentremarksaction")

public class StudentRemarksActionApiController extends WebMvcConfigurerAdapter{
    //@Autowired
    private StudentRemarksActionRepository studentRemarksActionRepository;

    @GetMapping(value="/all")

    public List<StudentRemarksAction> getStudentRemarksActionDetail() {return studentRemarksActionRepository.findAll(); }

    public StudentRemarksActionApiController(StudentRemarksActionRepository studentRemarksActionRepository)
    {
        this.studentRemarksActionRepository = studentRemarksActionRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void studentsRemAction(
            @RequestParam(value = "followupid", required = false) String followupid,
            @RequestParam(value = "remarkid", required = false) String remarkid,
            @RequestParam(value = "regno", required = false) String regno,
            @RequestParam(value = "remarkactiondate", required = false) Date remarkactiondate,
            @RequestParam(value = "remarkactionday", required = false) String remarkactionday,
            @RequestParam(value = "remarkactiondetails", required = false) String remarkactiondetails,
            @RequestParam(value = "statusofaction", required = false) String statusofaction,
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        StudentRemarksAction studRemarksAction = new StudentRemarksAction();
        StudentRemarksEntry StudentRemarksAction_remarkid = new StudentRemarksEntry(remarkid);

        studRemarksAction.setFollowupid(followupid);
        studRemarksAction.setRemarkid(remarkid);
        studRemarksAction.setRegno(regno);
        studRemarksAction.setRemarkactiondate(remarkactiondate);
        studRemarksAction.setRemarkactionday(remarkactionday);
        studRemarksAction.setRemarkactiondetails(remarkactiondetails);
        studRemarksAction.setStatusofaction(statusofaction);
        studRemarksAction.setLoginuser(loginuser);

        studentRemarksActionRepository.save(studRemarksAction);
    }


}
