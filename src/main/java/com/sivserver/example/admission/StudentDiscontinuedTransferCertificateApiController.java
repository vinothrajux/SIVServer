package com.sivserver.example.admission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by GBCorp on 01/07/2017.
 */
@RestController
@RequestMapping("/api/v1/studentdiscontinuedtranscert")

public class StudentDiscontinuedTransferCertificateApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private StudentDiscontinuedTransferCertificateRepository studentDiscontinuedTransferCertificateRepository;

//    @Autowired
//    private ApplicationSaleRepository applicationSaleRepository;
//
//
//    @RequestMapping(method = RequestMethod.GET, value="/getApplcationDetail")
//    public ApplicationSaleDetailProjection getApplcationDetail(@RequestParam (value ="applno") String applicationNumber) {
//        ApplicationSaleDetailProjection applicationDetail = applicationSaleRepository.findOneByApplno(applicationNumber);
//        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
//
//        return applicationDetail;
//
//    }


    @RequestMapping(method = RequestMethod.POST)
    public void studentDiscontinuedTransferCertificate(
            @RequestParam(value = "entrydate", required = false) Date entrydate,
            @RequestParam(value = "tcserialno", required = false) String tcserialno,
            @RequestParam(value = "regno", required = false) String regno,
            @RequestParam(value = "admissionno", required = false) String admissionno,
            @RequestParam(value = "candname", required = false) String candname,
            @RequestParam(value = "fathername", required = false) String fathername,
            @RequestParam(value = "mothername", required = false) String mothername,
            @RequestParam(value = "branch", required = false) String branch,
            @RequestParam(value = "branchcode", required = false) String branchcode,
            @RequestParam(value = "batch", required = false) String batch,
            @RequestParam(value = "semester", required = false) Integer semester,
            @RequestParam(value = "academicYear", required = false) String academicYear,
            @RequestParam(value = "studenttype", required = false) String studenttype,
            @RequestParam(value = "dob", required = false) Date dob,
            @RequestParam(value = "dobw", required = false) String dobw,
            @RequestParam(value = "religion", required = false) String religion,
            @RequestParam(value = "nationality", required = false) String nationality,
            @RequestParam(value = "gender", required = false) String gender,
            @RequestParam(value = "community", required = false) String community,
            @RequestParam(value = "caste", required = false) String caste,
            @RequestParam(value = "dateofadmission", required = false) Date dateofadmission,
            @RequestParam(value = "leftdate", required = false) Date leftdate,
            @RequestParam(value = "yearofstudent", required = false) String yearofstudent,
            @RequestParam(value = "lastappearedexam", required = false) String lastappearedexam,
            @RequestParam(value = "qualified", required = false) String qualified,
            @RequestParam(value = "reasonfortc", required = false) String reasonfortc,
            @RequestParam(value = "feesbalance", required = false) Long feesbalance,
            @RequestParam(value = "durationfrom", required = false) String durationfrom,
            @RequestParam(value = "durationto", required = false) String durationto,
            @RequestParam(value = "approved", required = false) String approved,
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        StudentDiscontinuedTransferCertificate studDisTranscert = new StudentDiscontinuedTransferCertificate();
        studDisTranscert.setEntrydate(entrydate);
        studDisTranscert.setTcserialno(tcserialno);
        studDisTranscert.setRegno(regno);
        studDisTranscert.setAdmissionno(admissionno);
        studDisTranscert.setCandidatename(candname);
        studDisTranscert.setFathername(fathername);
        studDisTranscert.setMothername(mothername);
        studDisTranscert.setBranch(branch);
        studDisTranscert.setBranchcode(branchcode);
        studDisTranscert.setBatch(batch);
        studDisTranscert.setSemester(semester);
        studDisTranscert.setAcademicyear(academicYear);
        studDisTranscert.setStudenttype(studenttype);
        studDisTranscert.setDateofbirth(dob);
        studDisTranscert.setDateofbirthwords(dobw);
        studDisTranscert.setReligion(religion);
        studDisTranscert.setNationality(nationality);
        studDisTranscert.setGender(gender);
        studDisTranscert.setCommunity(community);
        studDisTranscert.setCaste(caste);
        studDisTranscert.setDateofadmission(dateofadmission);
        studDisTranscert.setLeftdate(leftdate);
        studDisTranscert.setYearofstudent(yearofstudent);
        studDisTranscert.setLastappearedexam(lastappearedexam);
        studDisTranscert.setQualified(qualified);
        studDisTranscert.setReasonfortc(reasonfortc);
        studDisTranscert.setFeesbalance(feesbalance);
        studDisTranscert.setDurationfrom(durationfrom);
        studDisTranscert.setDurationto(durationto);
        studDisTranscert.setApproved(approved);
        studDisTranscert.setLoginuser(loginuser);


        studentDiscontinuedTransferCertificateRepository.save(studDisTranscert);


    }
}