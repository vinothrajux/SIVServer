package com.sivserver.example.sports;

import com.sivserver.example.placement.CorporateHeader;
import com.sivserver.example.placement.CorporateHeaderRepository;
import com.sivserver.example.student.StudentBaseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Created by GBCorp on 14/07/2017.
 */
@RestController
@RequestMapping("/api/v1/atheleteheader")

public class AtheleteHeaderApiController {
    //@Autowired
    private AtheleteHeaderRepository atheleteHeaderRepository;

    @GetMapping(value="/all")

    public List<AtheleteHeader> getAtheleteHeaderDetail() {return atheleteHeaderRepository.findAll();}

    public AtheleteHeaderApiController(AtheleteHeaderRepository atheleteHeaderRepository)
    {
        this.atheleteHeaderRepository = atheleteHeaderRepository;
    }


    @RequestMapping(method = RequestMethod.POST)
    public void atheletehead(
            @RequestParam(value ="atheleteid", required=false) String atheleteid,
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="batch", required=false) String batch,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="loginuser", required=false) String loginuser


    ) {
        AtheleteHeader athleteHead = new AtheleteHeader();
        StudentBaseInformation studentBaseInformation = new StudentBaseInformation(regno);
        athleteHead.setAtheleteid (atheleteid);
        athleteHead.setRegno(regno);
        athleteHead.setBranchcode(branchcode);
        athleteHead.setBatch(batch);
        athleteHead.setSemester(semester);
        athleteHead.setAcademicyear(academicyear);
        athleteHead.setLoginuser(loginuser);

        atheleteHeaderRepository.save(athleteHead);



    }


}
