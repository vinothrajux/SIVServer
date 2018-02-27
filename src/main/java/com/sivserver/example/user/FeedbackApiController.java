package com.sivserver.example.user;

import com.sivserver.example.student.PlaySchoolStudentBaseInformation;
import com.sivserver.example.student.PlaySchoolStudentBaseInformationProjection;
import com.sivserver.example.student.PlaySchoolStudentBaseInformationRepository;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 05-Feb-18.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/submitfeedback")
public class FeedbackApiController {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Autowired
    private PlaySchoolStudentBaseInformationRepository playSchoolStudentBaseInformationRepository;


    @RequestMapping(method = RequestMethod.POST)
    public String  submitFeedback(
            @RequestParam(value ="schoolFeedback", required=false) String schoolFeedback,
            @RequestParam(value ="appFeedback", required=false) String appFeedback,
            @RequestParam (value="schoolRating", required=false) Integer schoolRating,
            @RequestParam (value="appRating", required=false) Integer appRating,
            @RequestParam (value="registernumber", required=false) String registernumber,
            @RequestParam (value="instituteid", required=false) Integer instituteid
    ) {

        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();
        String curDate= year + "-"+month+"-"+day+ " 00:00:00";
        java.sql.Timestamp ts = java.sql.Timestamp.valueOf( curDate ) ;

        Feedback feedback = new Feedback();

        PlaySchoolStudentBaseInformationProjection playSchoolStudentBaseInformationProjection = playSchoolStudentBaseInformationRepository.findOneByRegisternumber(registernumber);
        String candidatename = playSchoolStudentBaseInformationProjection.getCandidatename();

        feedback.setRegisternumber(registernumber);
        feedback.setSchoolfeedback(schoolFeedback);
        feedback.setAppfeedback(appFeedback);
        feedback.setSchoolrating(schoolRating);
        feedback.setApprating(appRating);
        feedback.setInstituteid(instituteid);
        feedback.setEntrydate(ts);
        feedback.setCandidatename(candidatename);


        feedbackRepository.save(feedback);

        return "success";
    }


    @RequestMapping(method = RequestMethod.POST, value = "/viewFeedback")
    public Iterable<Feedback>  submitFeedback(
            @RequestParam(value ="instituteid", required=false) Integer instituteid
    ) {
        Iterable<Feedback> feedback = feedbackRepository.findByInstituteid(instituteid);

        return feedback;
    }
}
