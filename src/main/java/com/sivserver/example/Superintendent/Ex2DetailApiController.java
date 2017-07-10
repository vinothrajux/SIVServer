package com.sivserver.example.Superintendent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by GBCorp on 07/07/2017.
 */
@RestController
@RequestMapping("/api/v1/ex2detail")

public class Ex2DetailApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private Ex2DetailRepository ex2DetailRepository;


    @RequestMapping(method = RequestMethod.POST)
    public void ex2Det(
            @RequestParam(value ="questioncode", required=false) String questioncode,
            @RequestParam (value="regno", required=false) String regno,
            @RequestParam (value="attendancestatus", required=false) String attendancestatus

                ) {
        Ex2Detail ex2Det = new Ex2Detail();
        ex2Det.setQuestionCode(questioncode);
        ex2Det.setRegno(regno);
        ex2Det.setAttendanceStatus(attendancestatus);

        ex2DetailRepository.save(ex2Det);



    }


}
