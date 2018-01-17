package com.sivserver.example.transport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 10-Jul-17.
 */

@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/transportidcard")

public class TransportIdCardApiController extends WebMvcConfigurerAdapter {

    @Autowired
    private TransportIdCardRepository transportidcardRepository;

    @RequestMapping(method = RequestMethod.POST)
    public void transportidcard(
            @RequestParam(value = "regno", required = false) String regno,
            @RequestParam(value = "admissionno", required = false) String admissionno,
            @RequestParam(value = "candidatename", required = false) String candidatename,
            @RequestParam(value = "branch", required = false) String branch,
            @RequestParam(value = "branchcode", required = false) String branchcode,
            @RequestParam(value = "Batch", required = false) String Batch,
            @RequestParam(value = "semester", required = false) Integer semester,
            @RequestParam(value = "academicYear", required = false) String academicYear,
            @RequestParam(value = "idissueddate", required = false) Date idissueddate,
            @RequestParam(value = "idcardno", required = false) String idcardno,
            @RequestParam(value = "idtype", required = false) String idtype,
            @RequestParam(value = "idstatus", required = false) String idstatus,
            @RequestParam(value = "routename", required = false) String routename,
            @RequestParam(value = "routeno", required = false) Integer routeno,
            @RequestParam(value = "stage", required = false) String stage,
            @RequestParam(value = "seatno", required = false) String seatno,
            @RequestParam(value = "loginuser", required = false) String loginuser
    ) {
        TransportIdCard transportid = new TransportIdCard();
        transportid.setRegno(regno);
        transportid.setAdmissionno(admissionno);
        transportid.setCandidateName(candidatename);
        transportid.setBranch(branch);
        transportid.setBranchCode(branchcode);
        transportid.setBatch(Batch);
        transportid.setSemester(semester);
        transportid.setAcademicYear(academicYear);
        transportid.setIdIssueDate(idissueddate);
        transportid.setidcardno(idcardno);
        transportid.setIdtype(idtype);
        transportid.setIdstatus(idstatus);
        transportid.setRoutename(routename);
        transportid.setRouteno(routeno);
        transportid.setStage(stage);
        transportid.setSeatno(seatno);
        transportid.setLoginUser(loginuser);

        transportidcardRepository.save(transportid);


    }

}
