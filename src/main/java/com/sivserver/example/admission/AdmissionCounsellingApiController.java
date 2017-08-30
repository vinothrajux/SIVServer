package com.sivserver.example.admission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by Seetha on 19-Jun-17.
 */
@RestController
@RequestMapping("/api/v1/admissioncounselling")

public class AdmissionCounsellingApiController {

 //   @Autowired
    private AdmissionCounsellingRepository admissioncounsellingRepository;

    @GetMapping(value="/all")
    public List<AdmissionCounselling> getAdmissionCounselling(){
        return admissioncounsellingRepository.findAll();
    }

    public AdmissionCounsellingApiController(AdmissionCounsellingRepository admissioncounsellingRepository)
    {
        this.admissioncounsellingRepository = admissioncounsellingRepository;
    }


    @Autowired
    private ApplicationSaleRepository applicationSaleRepository;





    @RequestMapping(method = RequestMethod.POST)
    public void admissionCounselling(
            @RequestParam(value ="admissiontype", required=false) String admissiontype,
            @RequestParam(value ="applno", required=false) String applno,
            @RequestParam (value="counsellingdate", required=false) Date counsellingdate,
            @RequestParam (value="allotedcourse", required=false) String allotedcourse,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="transport", required=false) String transport,
            @RequestParam (value="transportstage", required=false) String transportstage,
            @RequestParam (value="hostel", required=false) String hostel,
            @RequestParam (value="food", required=false) String food,
            @RequestParam (value="counsellingstatus", required=false) String counsellingstatus,
            @RequestParam (value="admissionno", required=false) String admissionno,
            @RequestParam (value="totalfees", required=false) Long totalfees,
            @RequestParam (value="followupdate", required=false) Date followupdate,
            @RequestParam (value="remarks", required=false) String remarks,
            @RequestParam (value="loginuser", required=false) String loginuser

    ) {

        AdmissionCounselling admcouns = new AdmissionCounselling();
        ApplicationSale appsale = new ApplicationSale(applno);
        admcouns.setAdmissiontype(admissiontype)
                .setApplno(applno)
                .setCounsellingdate(counsellingdate)
                .setAllotedcourse(allotedcourse)
                .setBranchcode(branchcode)
                .setTransport(transport)
                .setTransportstage(transportstage)
                .setHostel(hostel)
                .setFood(food)
                .setCounsellingstatus(counsellingstatus)
                .setAdmissionno(admissionno)
                .setTotalfees(totalfees)
                .setFollowupdate(followupdate)
                .setRemarks(remarks)
                .setLoginuser(loginuser)
                .setAppsale(appsale);

        admissioncounsellingRepository.save(admcouns);



    }


    @RequestMapping(method = RequestMethod.POST, value="/getApplcationDetail")
    public ApplicationSaleProjection getApplcationDetail(@RequestParam (value ="applno") String applicationNumber) {
        ApplicationSaleProjection applicationDetail = applicationSaleRepository.findOneByApplno(applicationNumber);
        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getApplicationDetail");
        return applicationDetail;

    }

}
