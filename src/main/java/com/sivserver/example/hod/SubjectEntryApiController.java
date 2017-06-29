package com.sivserver.example.hod;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



/**
 * Created by Seetha on 28-Jun-17.
 */

@RestController
@RequestMapping("/api/v1/subjectentry")

public class SubjectEntryApiController extends WebMvcConfigurerAdapter {

    @Autowired
    private SubjectEntryRepository subjectentryRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void subjectEntry(
            @RequestParam(value = "branchname", required = false) String branchname,
            @RequestParam(value = "branchcode", required = false) String branchcode,
            @RequestParam(value = "semester", required = false) String semester,
            @RequestParam(value = "subjectname", required = false) String subjectname,
            @RequestParam(value = "subjectcode", required = false) String subjectcode,
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

        subjent.setBranchName(branchname);
        subjent.setBranchCode(branchcode);
        subjent.setSemester(semester);
        subjent.setSubjectName(subjectname);
        subjent.setSubjectCode(subjectcode);
        subjent.setScheme(scheme);
        subjent.setHours(hours);
        subjent.setRequiredHours(reqhours);
        subjent.setInShort(inshort);
        subjent.setAllottedHours(allottedhours);
        subjent.setSubjectType(subjecttype);
        subjent.setColumnName(columnname);
        subjent.setLoginUser(loginuser);

        subjectentryRepository.save(subjent);
    }
}
