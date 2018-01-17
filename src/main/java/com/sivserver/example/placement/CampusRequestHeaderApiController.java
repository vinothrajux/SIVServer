package com.sivserver.example.placement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 07/07/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/campusrequestheader")

public class CampusRequestHeaderApiController {
    //@Autowired
    private CampusRequestHeaderRepository campusRequestHeaderRepository;

    @GetMapping(value="/all")

    public List<CampusRequestHeader> getCampusRequestHeaderDetail() {return campusRequestHeaderRepository.findAll();}

    public CampusRequestHeaderApiController(CampusRequestHeaderRepository campusRequestHeaderRepository)
    {
        this.campusRequestHeaderRepository = campusRequestHeaderRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void campRequestHead(
            @RequestParam(value ="entrydate", required=false) Date entrydate,
            @RequestParam(value ="requestId", required=false) String requestId,
            @RequestParam (value="corporateid", required=false) String corporateid,
            @RequestParam (value="requestType", required=false) String requestType,
            @RequestParam (value="campusreqfromDate", required=false) Date campusreqfromDate,
            @RequestParam (value="campusreqtoDate", required=false) Date campusreqtoDate,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="remarks", required=false) String remarks,
            @RequestParam (value="followupdate", required=false) Date followupdate,
            @RequestParam (value="loginuser", required=false) String loginuser


    ) {
        CampusRequestHeader campReqHeader = new CampusRequestHeader();
        CorporateHeader corporateHeader = new CorporateHeader(corporateid);
        campReqHeader.setEntrydate(entrydate);
        campReqHeader.setRequestid(requestId);
        campReqHeader.setCorporateid(corporateid);
        campReqHeader.setRequesttype(requestType);
        campReqHeader.setCampusreqfromdate(campusreqfromDate);
        campReqHeader.setCampusreqtodate(campusreqtoDate);
        campReqHeader.setAcademicyear(academicyear);
        campReqHeader.setRemarks(remarks);
        campReqHeader.setFollowupdate(followupdate);
        campReqHeader.setLoginuser(loginuser);


        campusRequestHeaderRepository.save(campReqHeader);



    }

}
