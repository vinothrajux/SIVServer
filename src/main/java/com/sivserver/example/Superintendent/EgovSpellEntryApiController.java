package com.sivserver.example.Superintendent;

//import com.sivserver.example.student.StudentBaseInformation;
//import com.sivserver.example.student.StudentBaseInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by Seetha on 01-Jul-17.
 */

@RestController
@RequestMapping("/api/v1/egovspellentry")

public class EgovSpellEntryApiController extends WebMvcConfigurerAdapter {

    @Autowired
    private EgovSpellEntryRepository egovSpellEntryRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void egovspellentry(
            @RequestParam(value = "spellno", required = false) String spellno,
            @RequestParam(value = "fromdate", required = false) Date fromdate,
            @RequestParam(value = "todate", required = false) Date todate,
            @RequestParam(value = "semester", required = false) String semester,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "loginuser", required = false) String loginuser
    )
    {
        EgovSpellEntry egov = new EgovSpellEntry();
        egov.setSpellno(spellno);
        egov.setFromdate(fromdate);
        egov.setTodate(todate);
        egov.setSemester(semester);
        egov.setAcademicyear(academicyear);
        egov.setLoginuser(loginuser);

        egovSpellEntryRepository.save(egov);


    }
}
