package com.sivserver.example.institute;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by GBCorp on 10/10/2017.
 */
@RestController
@RequestMapping("/api/v1/institutebusnodetails")

public class InstituteBusNoDetailsApiController {

    private InstituteBusNoDetailsRepository instituteBusNoDetailsRepository;

    @GetMapping(value="/all")

    public List<InstituteBusNoDetails> getInstituteBusNoDetails() {return instituteBusNoDetailsRepository.findAll();}

    public InstituteBusNoDetailsApiController(InstituteBusNoDetailsRepository instituteBusNoDetailsRepository)
    {
        this.instituteBusNoDetailsRepository = instituteBusNoDetailsRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void institutebusnodetailsdet(

            @RequestParam(value ="instituteid", required=false) String instituteid,
            @RequestParam(value ="busno", required=false) String busno



    ) {
        InstituteDetails instituteDetails = new InstituteDetails(instituteid);
        InstituteBusNoDetails instituteBusnoDetails = new InstituteBusNoDetails();
        instituteBusnoDetails.setInstituteid(instituteid);
        instituteBusnoDetails.setBusno(busno);


        instituteBusNoDetailsRepository.save(instituteBusnoDetails);
    }
}
