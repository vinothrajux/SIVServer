package com.sivserver.example.Superintendent;

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
@RequestMapping("/api/v1/equivalencesubject")

public class EquivalenceSubjectApiController extends WebMvcConfigurerAdapter {

    @Autowired
    private EquivalenceSubjectRepository equivalencesubjectRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void equivalencesubject(
            @RequestParam(value ="academicYear", required=false) String academicYear,
            @RequestParam (value="oldbranch", required=false) String oldbranch,
            @RequestParam (value="oldbranchcode", required=false) String oldbranchcode,
            @RequestParam (value="oldsemester", required=false) String oldsemester,
            @RequestParam (value="oldcolumnno", required=false) String oldcolumnno,
            @RequestParam (value="oldscheme", required=false) String oldscheme,
            @RequestParam (value="oldsubjectname", required=false) String oldsubjectname,
            @RequestParam (value="oldsubjectcode", required=false) String oldsubjectcode,
            @RequestParam (value="newbranch", required=false) String newbranch,
            @RequestParam (value="newbranchcode", required=false) String newbranchcode,
            @RequestParam (value="newsemester", required=false) String newsemester,
            @RequestParam (value="newscheme", required=false) String newscheme,
            @RequestParam (value="newcolumnno", required=false) String newcolumnno,
            @RequestParam (value="newsubjectname", required=false) String newsubjectname,
            @RequestParam (value="newsubjectcode", required=false) String newsubjectcode,
            @RequestParam (value="loginuser", required=false) String loginuser

    )
    {
        EquivalenceSubject equivalence = new EquivalenceSubject();
        equivalence.setAcademicYear(academicYear);
        equivalence.setOldBranch(oldbranch);
        equivalence.setOldBranchCode(oldbranchcode);
        equivalence.setOldSemester(oldsemester);
        equivalence.setOldColumnNo(oldcolumnno);
        equivalence.setOldScheme(oldscheme);
        equivalence.setOldSubjectName(oldsubjectname);
        equivalence.setOldSubjectCode(oldsubjectcode);
        equivalence.setNewBranch(newbranch);
        equivalence.setNewBranchCode(newbranchcode);
        equivalence.setNewSemester(newsemester);
        equivalence.setNewScheme(newscheme);
        equivalence.setNewColumnNo(newcolumnno);
        equivalence.setNewSubjectName(newsubjectname);
        equivalence.setNewSubjectCode(newsubjectcode);
        equivalence.setLoginUser(loginuser);

        equivalencesubjectRepository.save(equivalence);



    }
}
