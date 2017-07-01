package com.sivserver.example.hod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Seetha on 29-Jun-17.
 */

@RestController
@RequestMapping("/api/v1/subjectallocation")

public class SubjectAllocationApiController extends WebMvcConfigurerAdapter

    {

        @Autowired
        private SubjectAllocationRepository subjectallocationRepository;


        @RequestMapping(method = RequestMethod.POST)

        public void subjectAllocation(
            @RequestParam(value = "branchname", required = false) String branchname,
            @RequestParam(value = "branchcode", required = false) String branchcode,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "semester", required = false) String semester,
            @RequestParam(value = "batch", required = false) String batch,
            @RequestParam(value = "scheme", required = false) String scheme,
            @RequestParam(value = "subjecttype", required = false) String subjecttype,
            @RequestParam(value = "subjectname", required = false) String subjectname,
            @RequestParam(value = "subjectcode", required = false) String subjectcode,
            @RequestParam(value = "columnname", required = false) String columnname,
            @RequestParam(value = "inshort", required = false) String inshort,
            @RequestParam(value = "reqhours", required = false) Integer reqhours,
            @RequestParam(value = "allottedhours", required = false) Integer allottedhours,
            @RequestParam(value = "hourspersyllabus", required = false) Integer hourspersyllabus,
            @RequestParam(value = "staff1_id", required = false) String staff1_id,
            @RequestParam(value = "staff1_name", required = false) String staff1_name,
            @RequestParam(value = "staff2_id", required = false) String staff2_id,
            @RequestParam(value = "staff2_name", required = false) String staff2_name,
            @RequestParam(value = "day", required = false) String day,
            @RequestParam(value = "hour", required = false) Integer hour,
            @RequestParam(value = "columnno", required = false) Integer columnno,
            @RequestParam(value = "totweekhours", required = false) Integer totweekhours,
            @RequestParam(value = "loadhours1", required = false) Integer loadhours1,
            @RequestParam(value = "loadhours2", required = false) Integer loadhours2,
            @RequestParam(value = "classroomno", required = false) Integer classroomno,
            @RequestParam(value = "loginuser", required = false) String loginuser
    ) {
        SubjectAllocation subjalloc = new SubjectAllocation();

        subjalloc.setBranchName(branchname);
        subjalloc.setBranchCode(branchcode);
        subjalloc.setAcademicYear(academicyear);
        subjalloc.setSemester(semester);
        subjalloc.setBatch(batch);
        subjalloc.setScheme(scheme);
        subjalloc.setSubjectType(subjecttype);
        subjalloc.setSubjectName(subjectname);
        subjalloc.setSubjectCode(subjectcode);
        subjalloc.setColumnName(columnname);
        subjalloc.setInShort(inshort);
        subjalloc.setRequiredHours(reqhours);
        subjalloc.setAllottedHours(allottedhours);
        subjalloc.setHoursPerSyllabus(hourspersyllabus);
        subjalloc.setStaff1_ID(staff1_id);
        subjalloc.setStaff1_Name(staff1_name);
        subjalloc.setStaff2_ID(staff2_id);
        subjalloc.setStaff2_Name(staff2_name);
        subjalloc.setDay(day);
        subjalloc.setHour(hour);
        subjalloc.setColumnNo(columnno);
        subjalloc.setTotalWeekHours(totweekhours);
        subjalloc.setLoadHours1(loadhours1);
        subjalloc.setLoadHours2(loadhours2);
        subjalloc.setClassRoomNo(classroomno);
        subjalloc.setLoginUser(loginuser);

        subjectallocationRepository.save(subjalloc);
    }
}
