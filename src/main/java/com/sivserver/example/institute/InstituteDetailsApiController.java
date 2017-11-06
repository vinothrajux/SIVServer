package com.sivserver.example.institute;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by GBCorp on 10/10/2017.
 */
@RestController
@RequestMapping("/api/v1/institutedetails")
public class InstituteDetailsApiController {

    private InstituteDetailsRepository instituteDetailsRepository;

    @GetMapping(value = "/all")

    public List<InstituteDetails> getInstituteDetails() {return instituteDetailsRepository.findAll(); }

    public InstituteDetailsApiController(InstituteDetailsRepository instituteDetailsRepository)
    {
        this.instituteDetailsRepository = instituteDetailsRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void institutedetailsdet(

            @RequestParam(value ="instituteid", required=false) String instituteid,
            @RequestParam(value ="institutecode", required=false) String institutecode,
            @RequestParam(value ="institutename", required=false) String institutename,
            @RequestParam(value ="institutetype", required=false) String institutetype,
            @RequestParam(value ="instituteaddress1", required=false) String instituteaddress1,
            @RequestParam(value ="instituteaddress2", required=false) String instituteaddress2,
            @RequestParam(value ="institutearea", required=false) String institutearea,
            @RequestParam(value ="institutepincode", required=false) String institutepincode,
            @RequestParam(value ="institutestate", required=false) String institutestate,
            @RequestParam(value ="institutecontactno1", required=false) String institutecontactno1,
            @RequestParam(value ="institutecontactno2", required=false) String institutecontactno2,
            @RequestParam(value ="instituteemail1", required=false) String instituteemail1,
            @RequestParam(value ="instituteemail2", required=false) String instituteemail2,
            @RequestParam(value ="instituteweb", required=false) String instituteweb

    ) {
        InstituteDetails insDetails = new InstituteDetails();

        insDetails.setInstituteid(instituteid);
        insDetails.setInstitutecode(institutecode);
        insDetails.setInstitutename(institutename);
        insDetails.setInstitutetype(institutetype);
        insDetails.setInstituteaddress1(instituteaddress1);
        insDetails.setInstituteaddress2(instituteaddress2);
        insDetails.setInstitutearea(institutearea);
        insDetails.setInstitutepincode(institutepincode);
        insDetails.setInstitutestate(institutestate);
        insDetails.setInstitutecontactno1(institutecontactno1);
        insDetails.setInstitutecontactno2(institutecontactno2);
        insDetails.setInstituteemail1(instituteemail1);
        insDetails.setInstituteemail2(instituteemail2);
        insDetails.setInstituteweb(instituteweb);

        instituteDetailsRepository.save(insDetails);

    }


    }
