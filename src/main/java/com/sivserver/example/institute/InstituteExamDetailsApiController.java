package com.sivserver.example.institute;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 10/10/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/instituteexamdetails")

public class InstituteExamDetailsApiController {

    private InstituteExamDetailsRepository instituteExamDetailsRepository;

    @GetMapping(value="/all")

    public List<InstituteExamDetails> getInstituteExamDetails() {return instituteExamDetailsRepository.findAll();}

    public InstituteExamDetailsApiController(InstituteExamDetailsRepository instituteExamDetailsRepository)
    {
        this.instituteExamDetailsRepository = instituteExamDetailsRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void instituteexamdetailsdet(

            @RequestParam(value ="instituteid", required=false) Integer instituteid,
            @RequestParam(value ="examname", required=false) String examname



    ) {
        InstituteDetails instituteDetails = new InstituteDetails(instituteid);
        InstituteExamDetails instituteExamDetails = new InstituteExamDetails();
        instituteExamDetails.setInstituteid(instituteid);
        instituteExamDetails.setExamname(examname);


        instituteExamDetailsRepository.save(instituteExamDetails);
    }

}
