package com.sivserver.example.admission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Created by GBCorp on 01/07/2017.
 */
@RestController
@RequestMapping("/api/v1/diploma_first_year_bformdetail")

public class Diploma_First_Year_Bform_Detail_ApiController {
    //@Autowired
    private Diploma_First_Year_Bform_Detail_Repository diplomaFirstYearBformDetailRepository;

    @GetMapping(value="/all")
    public List<Diploma_First_Year_Bform_Detail> getDiplomaFirstYearBformDetail() {return diplomaFirstYearBformDetailRepository.findAll();}

    public Diploma_First_Year_Bform_Detail_ApiController(Diploma_First_Year_Bform_Detail_Repository diplomaFirstYearBformDetailRepository)
    {
        this.diplomaFirstYearBformDetailRepository = diplomaFirstYearBformDetailRepository;
    }
    @RequestMapping(method = RequestMethod.POST)

    public void bformDetail(
            @RequestParam(value ="applno", required=false) String applno,
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam (value="photoid", required=false) String photoid,
            @RequestParam (value="subject1", required=false) Integer subject1,
            @RequestParam (value="subject2", required=false) Integer subject2,
            @RequestParam (value="subject3", required=false) Integer subject3,
            @RequestParam (value="total", required=false) Integer total,
            @RequestParam (value="percentage", required=false) Long percentage
    ) {
        Diploma_First_Year_Bform_Detail bformdet = new Diploma_First_Year_Bform_Detail();
        AdmissionCounselling adm_couns_applno = new AdmissionCounselling(applno);

        bformdet.setApplno(applno)
                .setRegno(regno)
                .setPhotoid(photoid)
                .setSubject1(subject1)
                .setSubject2(subject2)
                .setSubject3(subject3)
                .setTotal(total)
                .setPercentage(percentage)
                .setAdm_couns_applno(adm_couns_applno);

           diplomaFirstYearBformDetailRepository.save(bformdet);



    }

}
