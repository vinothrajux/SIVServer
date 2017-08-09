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
@RequestMapping("/api/v1/bformdetail")

public class BformDetailApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private BformDetailRepository bformDetailRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void bformDetail(
            @RequestParam(value ="applicationno", required=false) String applicationno,
            @RequestParam (value="photoid", required=false) String photoid,
            @RequestParam (value="subject1", required=false) Integer subject1,
            @RequestParam (value="subject2", required=false) Integer subject2,
            @RequestParam (value="subject3", required=false) Integer subject3,
            @RequestParam (value="total", required=false) Integer total,
            @RequestParam (value="percentage", required=false) Long percentage
    ) {
        BformDetail bfromdet = new BformDetail();
        bfromdet.setApplicationno(applicationno);
        bfromdet.setPhotoid(photoid);
        bfromdet.setSubject1(subject1);
        bfromdet.setSubject2(subject2);
        bfromdet.setSubect3(subject3);
        bfromdet.setTotal(total);
        bfromdet.setPercentage(percentage);

        //   bformHeaderRepository.save(bfromhead);



    }

}
