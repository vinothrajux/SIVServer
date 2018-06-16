package com.sivserver.example.institute;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 24-Apr-18.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/instituteschoolsubjectdetails")

public class InstituteSchoolSubjectDetailsApiController {

    private InstituteSchoolSubjectDetailsRepository instituteSchoolSubjectDetailsRepository;

    @GetMapping(value="/all")

    public List<InstituteSchoolSubjectDetails> getInstituteSchoolSubjectDetails() {return instituteSchoolSubjectDetailsRepository.findAll();}

    public InstituteSchoolSubjectDetailsApiController(InstituteSchoolSubjectDetailsRepository instituteSchoolSubjectDetailsRepository)
    {
        this.instituteSchoolSubjectDetailsRepository = instituteSchoolSubjectDetailsRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void instituteschoolsubjectdetails(

            @RequestParam(value ="instituteid", required=false) Integer instituteid,
            @RequestParam(value ="subjectdetails", required=false) String subjectdetails,
            @RequestParam(value ="loginuser", required=false) String loginuser



    ) {

        InstituteSchoolSubjectDetails instituteschoolsubjectDetails = new InstituteSchoolSubjectDetails();
        instituteschoolsubjectDetails.setInstituteid(instituteid);
        instituteschoolsubjectDetails.setSubjectdetails(subjectdetails);
        instituteschoolsubjectDetails.setLoginuser(loginuser);


        instituteSchoolSubjectDetailsRepository.save(instituteschoolsubjectDetails);
    }

}
