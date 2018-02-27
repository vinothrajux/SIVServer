package com.sivserver.example.institute;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 10/10/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/institutetestdetails")
public class InstituteTestDetailsApiController {

    private InstituteTestDetailsRepository instituteTestDetailsRepository;

    @GetMapping(value="/all")

    public List<InstituteTestDetails> getInstituteTestDetails() {return instituteTestDetailsRepository.findAll();}

    public InstituteTestDetailsApiController(InstituteTestDetailsRepository instituteTestDetailsRepository)
    {
        this.instituteTestDetailsRepository = instituteTestDetailsRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void institutetestdetailsdet(

            @RequestParam(value ="instituteid", required=false) Integer instituteid,
            @RequestParam(value ="testname", required=false) String testname



    ) {
        InstituteDetails instituteDetails = new InstituteDetails(instituteid);
        InstituteTestDetails instituteTestDetails = new InstituteTestDetails();
        instituteTestDetails.setInstituteid(instituteid);
        instituteTestDetails.setTestname(testname);


        instituteTestDetailsRepository.save(instituteTestDetails);
    }

}

