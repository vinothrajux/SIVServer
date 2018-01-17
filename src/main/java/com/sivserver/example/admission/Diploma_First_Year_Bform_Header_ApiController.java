package com.sivserver.example.admission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 01/07/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/diploma_first_year_bform_header")

public class Diploma_First_Year_Bform_Header_ApiController  {
    //@Autowired
    private Diploma_First_Year_Bform_Header_Repository diplomaFirstYearBformHeaderRepository;

    @GetMapping(value="/all")
    public List<Diploma_First_Year_Bform_Header> getDiplomaFirstYearBformHeaderDetail() {return diplomaFirstYearBformHeaderRepository.findAll();}

    public Diploma_First_Year_Bform_Header_ApiController(Diploma_First_Year_Bform_Header_Repository diplomaFirstYearBformHeaderRepository)
    {
        this.diplomaFirstYearBformHeaderRepository = diplomaFirstYearBformHeaderRepository;
    }
    @RequestMapping(method = RequestMethod.POST)

    public void bformHeader(
            @RequestParam(value ="applno", required=false) String applno,
            @RequestParam(value ="slno", required=false) Integer slno,
            @RequestParam (value="category", required=false) String category,
            @RequestParam (value="allotedquota", required=false) String allotedquota,
            @RequestParam (value="name", required=false) String name,
            @RequestParam (value="gender", required=false) String gender,
            @RequestParam (value="dob", required=false) Date dob,
            @RequestParam (value="community", required=false) String community,
            @RequestParam (value="religion", required=false) String religion,
            @RequestParam (value="qualifiedexam", required=false) String qualifiedexam,
            @RequestParam (value="yearofpass", required=false) String yearofpass,
            @RequestParam (value="photoid", required=false) String photoid,
            @RequestParam (value="remarks", required=false) String remarks,
            @RequestParam (value="bcode", required=false) String bcode,
            @RequestParam (value="state", required=false) String state,
            @RequestParam (value="acadyear", required=false) String acadyear,
            @RequestParam (value="regno", required=false) String regno,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="loginuser", required=false) String loginuser
    ) {
        Diploma_First_Year_Bform_Header bformhead = new Diploma_First_Year_Bform_Header();
        AdmissionCounselling adm_couns_applno = new AdmissionCounselling(applno);
        bformhead.setSlno(slno)
                    .setCategory(category)
                    .setAllotedquota(allotedquota)
                    .setName(name)
                    .setGender(gender)
                    .setDob(dob)
                    .setCommunity(community)
                    .setReligion(religion)
                    .setQualifiedexam(qualifiedexam)
                    .setYearofpass(yearofpass)
                    .setPhotoid(photoid)
                    .setRemarks(remarks)
                    .setBcode(bcode)
                    .setState(state)
                    .setAcadyear(acadyear)
                    .setRegno(regno)
                    .setSemester(semester)
                    .setLoginuser(loginuser)
                    .setAdm_couns_applno(adm_couns_applno);

        diplomaFirstYearBformHeaderRepository.save(bformhead);



    }

}
