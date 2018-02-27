package com.sivserver.example.institute;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 10/10/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/institutecoursedetails")
public class InstituteCourseDetailsApiController {

    private InstituteCourseDetailsRepository instituteCourseDetailsRepository;

    @GetMapping(value="/all")

    public List<InstituteCourseDetails> getInstituteCourseDetails() {return instituteCourseDetailsRepository.findAll();}

    public InstituteCourseDetailsApiController(InstituteCourseDetailsRepository instituteCourseDetailsRepository)
    {
        this.instituteCourseDetailsRepository = instituteCourseDetailsRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void institutedetailsdet(

            @RequestParam(value ="instituteid", required=false) Integer instituteid,
            @RequestParam(value ="coursecode", required=false) String coursecode,
            @RequestParam(value ="coursename", required=false) String coursename


    ) {
        InstituteDetails instituteDetails = new InstituteDetails(instituteid);
        InstituteCourseDetails instituteCourseDetails = new InstituteCourseDetails();
        instituteCourseDetails.setInstituteid(instituteid);
        instituteCourseDetails.setCoursecode(coursecode);
        instituteCourseDetails.setCoursename(coursename);

        instituteCourseDetailsRepository.save(instituteCourseDetails);
    }
}
