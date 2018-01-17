package com.sivserver.example.institute;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 10/10/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/institutebatchdetails")

public class InstituteBatchDetailsApiController {

    private InstituteBatchDetailsRepository instituteBatchDetailsRepository;

    @GetMapping(value="/all")

    public List<InstituteBatchDetails> getInstituteBatchDetails() {return instituteBatchDetailsRepository.findAll();}

    public InstituteBatchDetailsApiController(InstituteBatchDetailsRepository instituteBatchDetailsRepository)
    {
        this.instituteBatchDetailsRepository = instituteBatchDetailsRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void institutebatchdetailsdet(

            @RequestParam(value ="instituteid", required=false) String instituteid,
            @RequestParam(value ="batch", required=false) String batch



    ) {
        InstituteDetails instituteDetails = new InstituteDetails(instituteid);
        InstituteBatchDetails instituteBatchDetails = new InstituteBatchDetails();
        instituteBatchDetails.setInstituteid(instituteid);
        instituteBatchDetails.setBatch(batch);


        instituteBatchDetailsRepository.save(instituteBatchDetails);
    }
}
