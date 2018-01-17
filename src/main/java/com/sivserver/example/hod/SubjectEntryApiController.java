package com.sivserver.example.hod;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;


/**
 * Created by Seetha on 28-Jun-17.
 */

@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/subjectentry")

public class SubjectEntryApiController extends WebMvcConfigurerAdapter {

    @Autowired
    private SubjectEntryRepository subjectentryRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void subjectEntry(
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "branchcode", required = false) String branchcode,
            @RequestParam(value = "semester", required = false) String semester,
            @RequestParam(value = "subjectcode", required = false) String subjectcode,
            @RequestParam(value = "subjectname", required = false) String subjectname,
            @RequestParam(value = "scheme", required = false) String scheme,
            @RequestParam(value = "hours", required = false) String hours,
            @RequestParam(value = "reqhours", required = false) String reqhours,
            @RequestParam(value = "inshort", required = false) String inshort,
            @RequestParam(value = "allottedhours", required = false) String allottedhours,
            @RequestParam(value = "subjecttype", required = false) String subjecttype,
            @RequestParam(value = "columnname", required = false) String columnname,
            @RequestParam(value = "loginuser", required = false) String loginuser
    ) {
        SubjectEntry subjent = new SubjectEntry();
        Hod_Subject_Entry_Compound_Key key = new Hod_Subject_Entry_Compound_Key(academicyear, branchcode, semester, subjectcode);

        subjent.setHod_subject_entry_compound_key(key);
        subjent.setSubjectname(subjectname);
        subjent.setScheme(scheme);
        subjent.setHours(hours);
        subjent.setReqhours(reqhours);
        subjent.setInshort(inshort);
        subjent.setAllottedhours(allottedhours);
        subjent.setSubjecttype(subjecttype);
        subjent.setColumnname(columnname);
        subjent.setLoginuser(loginuser);

        subjectentryRepository.save(subjent);
    }
}
