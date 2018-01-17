package com.sivserver.example.Superintendent;


import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 28/09/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/staffpersonalinformation")
public class StaffPersonalInformationApiController {

    private StaffPersonalInformationRepository staffPersonalInformationRepository;

    @GetMapping(value="/all")

    public List<StaffPersonalInformation> getStaffPersonalInformationDetail() {return staffPersonalInformationRepository.findAll();}

    public StaffPersonalInformationApiController(StaffPersonalInformationRepository staffPersonalInformationRepository)
    {
        this.staffPersonalInformationRepository = staffPersonalInformationRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void staffpersonalinformation(
            @RequestParam(value ="staffid", required=false) String staffid,
            @RequestParam(value ="dob", required=false) Date dob,
            @RequestParam (value="gender", required=false) String gender,
            @RequestParam (value="bloodgroup", required=false) String bloodgroup,
            @RequestParam (value="physicallyhandicapped", required=false) String physicallyhandicapped,
            @RequestParam (value="aadharnumber", required=false) String aadharnumber,
            @RequestParam (value="panno", required=false) String panno,
            @RequestParam (value="candfathername", required=false) String candfathername,
            @RequestParam (value="candmothername", required=false) String candmothername,
            @RequestParam (value="fatheroccupation", required=false) String fatheroccupation,
            @RequestParam (value="maritialstatus", required=false) String maritialstatus,
            @RequestParam (value="spousename", required=false) String spousename,
            @RequestParam (value="spouseoccupation", required=false) String spouseoccupation,
            @RequestParam (value="community", required=false) String community,
            @RequestParam (value="caste", required=false) String caste,
            @RequestParam (value="mothertoungue", required=false) String mothertoungue,
            @RequestParam (value="referencedby", required=false) String referencedby,
            @RequestParam (value="refererid", required=false) String refererid,
            @RequestParam (value="referername", required=false) String referername,
            @RequestParam (value="presentaddress1", required=false) String presentaddress1,
            @RequestParam (value="presentaddress2", required=false) String presentaddress2,
            @RequestParam (value="presentarea", required=false) String presentarea,
            @RequestParam (value="presentpincode", required=false) String presentpincode,
            @RequestParam (value="presentstate", required=false) String presentstate,
            @RequestParam (value="presentmobileno", required=false) String presentmobileno,
            @RequestParam (value="presentaltmobno", required=false) String presentaltmobno,
            @RequestParam (value="presentemail", required=false) String presentemail,
            @RequestParam (value="presentaltemail", required=false) String presentaltemail,
            @RequestParam (value="permanentaddress1", required=false) String permanentaddress1,
            @RequestParam (value="permanentaddress2", required=false) String permanentaddress2,
            @RequestParam (value="permanentarea", required=false) String permanentarea,
            @RequestParam (value="permanentpincode", required=false) String permanentpincode,
            @RequestParam (value="permanentstate", required=false) String permanentstate,
            @RequestParam (value="permanentmobileno", required=false) String permanentmobileno,
            @RequestParam (value="permanentaltmobno", required=false) String permanentaltmobno,
            @RequestParam (value="permanentemail", required=false) String permanentemail,
            @RequestParam (value="permanentaltemail", required=false) String permanentaltemail,
            @RequestParam (value="loginuser", required=false) String loginuser
            )
    {
        StaffPersonalInformation staffpersonalinformation = new StaffPersonalInformation();
        staffpersonalinformation.setStaffid(staffid);
        staffpersonalinformation.setDob(dob);
        staffpersonalinformation.setGender(gender);
        staffpersonalinformation.setBloodgroup(bloodgroup);
        staffpersonalinformation.setPhysicallyhandicapped(physicallyhandicapped);
        staffpersonalinformation.setAadharnumber(aadharnumber);
        staffpersonalinformation.setPanno(panno);
        staffpersonalinformation.setCandfathername(candfathername);
        staffpersonalinformation.setCandmothername(candmothername);
        staffpersonalinformation.setFatheroccupation(fatheroccupation);
        staffpersonalinformation.setMaritialstatus(maritialstatus);
        staffpersonalinformation.setSpousename(spousename);
        staffpersonalinformation.setSpouseoccupation(spouseoccupation);
        staffpersonalinformation.setCommunity(community);
        staffpersonalinformation.setCaste(caste);
        staffpersonalinformation.setMothertoungue(mothertoungue);
        staffpersonalinformation.setReferencedby(referencedby);
        staffpersonalinformation.setRefererid(refererid);
        staffpersonalinformation.setReferername(referername);
        staffpersonalinformation.setPresentaddress1(presentaddress1);
        staffpersonalinformation.setPresentaddress2(presentaddress2);
        staffpersonalinformation.setPresentarea(presentarea);
        staffpersonalinformation.setPresentpincode(presentpincode);
        staffpersonalinformation.setPresentstate(presentstate);
        staffpersonalinformation.setPresentmobileno(presentmobileno);
        staffpersonalinformation.setPresentaltmobno(presentaltmobno);
        staffpersonalinformation.setPresentemail(presentemail);
        staffpersonalinformation.setPresentaltemail(presentaltemail);
        staffpersonalinformation.setPermanentaddress1(permanentaddress1);
        staffpersonalinformation.setPermanentaddress2(permanentaddress2);
        staffpersonalinformation.setPermanentarea(permanentarea);
        staffpersonalinformation.setPermanentpincode(permanentpincode);
        staffpersonalinformation.setPermanentstate(permanentstate);
        staffpersonalinformation.setPermanentmobileno(permanentmobileno);
        staffpersonalinformation.setPermanentaltmobno(permanentaltmobno);
        staffpersonalinformation.setPermanentemail(permanentemail);
        staffpersonalinformation.setPermanentaltemail(permanentaltemail);
        staffpersonalinformation.setLoginuser(loginuser);

        staffPersonalInformationRepository.save(staffpersonalinformation);
    }


}
