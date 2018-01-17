package com.sivserver.example.institute;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 10/10/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/institutebusroutedetails")

public class InstituteBusRouteDetailsApiController {

    private InstituteBusRouteDetailsRepository instituteBusRouteDetailsRepository;

    @GetMapping(value="/all")

    public List<InstituteBusRouteDetails> getInstituteBusRouteDetails() {return instituteBusRouteDetailsRepository.findAll();}

    public InstituteBusRouteDetailsApiController(InstituteBusRouteDetailsRepository instituteBusRouteDetailsRepository)
    {
        this.instituteBusRouteDetailsRepository = instituteBusRouteDetailsRepository;
    }


    @RequestMapping(method = RequestMethod.POST)
    public void institutebusroutedetailsdet(

            @RequestParam(value ="instituteid", required=false) String instituteid,
            @RequestParam(value ="route", required=false) String route,
            @RequestParam(value ="stage", required=false) String stage



    ) {
        InstituteDetails instituteDetails = new InstituteDetails(instituteid);
        InstituteBusRouteDetails instituteBusRouteDetails = new InstituteBusRouteDetails();
        InstituteBusRouteCompoundKey key = new InstituteBusRouteCompoundKey(route, stage);
        instituteBusRouteDetails.setInstituteid(instituteid);
        instituteBusRouteDetails.setInstituteBusRouteCompoundKeyId(key);

        instituteBusRouteDetailsRepository.save(instituteBusRouteDetails);


    }


    }

