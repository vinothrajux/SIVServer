package com.sivserver.example.Superintendent;

//import com.sivserver.example.student.StudentBaseInformation;
//import com.sivserver.example.student.StudentBaseInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 01-Jul-17.
 */

@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/egovspellentry")

public class EgovSpellEntryApiController extends WebMvcConfigurerAdapter {

    @Autowired
    private EgovSpellEntryRepository egovSpellEntryRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void egovspellentry(
            @RequestParam(value = "spellno", required = false) String spellno,
            @RequestParam(value = "semester", required = false) String semester,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "fromdate", required = false) Date fromdate,
            @RequestParam(value = "todate", required = false) Date todate,
            @RequestParam(value = "noofhours", required = false) Integer noofhours,
            @RequestParam(value = "loginuser", required = false) String loginuser
    )
    {
        EgovSpellEntry egov = new EgovSpellEntry();
        Egovernance_SpellEntry_Compound_Key key = new Egovernance_SpellEntry_Compound_Key(spellno,semester,academicyear);

        egov.setFromdate(fromdate);
        egov.setTodate(todate);
        egov.setNoofhours(noofhours);
        egov.setLoginuser(loginuser);

        egovSpellEntryRepository.save(egov);


    }
}
