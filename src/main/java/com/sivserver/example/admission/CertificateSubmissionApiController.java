package com.sivserver.example.admission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 19-Jun-17.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/certificatesubmission")

public class CertificateSubmissionApiController  {

    //@Autowired
    private CertificateSubmissionRepository certificateSubmissionRepository;

    @RequestMapping(value="/all")
    public List<CertificateSubmission> getCertificateSubmissionDetail() {return certificateSubmissionRepository.findAll();}

    public CertificateSubmissionApiController(CertificateSubmissionRepository certificateSubmissionRepository)
    {
        this.certificateSubmissionRepository = certificateSubmissionRepository;
    }

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
    public void certificateSubmission(
            @RequestParam(value ="admissionno", required=false) String admissionno,
            @RequestParam (value="regno", required=false) String regno,
            @RequestParam (value="candidatename", required=false) String candidatename,
            @RequestParam (value="branch", required=false) String branch,
            @RequestParam (value="branchCode", required=false) String branchCode,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="academicYear", required=false) String academicYear,
            @RequestParam (value="studentType", required=false) String studentType,
            @RequestParam (value="foloiNo", required=false) String foloiNo,
            @RequestParam (value="marksheetsubmitted", required=false) Boolean marksheetsubmitted,
            @RequestParam (value="marksheetSlNo", required=false) String marksheetSlNo,
            @RequestParam (value="transfercertificatesubmitted", required=false) Boolean transfercertificatesubmitted,
            @RequestParam (value="transferCertificateSlNo", required=false) String transferCertificateSlNo,
            @RequestParam (value="communitycertificatesubmitted", required=false) Boolean communitycertificatesubmitted,
            @RequestParam (value="communityCertificateSlNo", required=false) String communityCertificateSlNo,
            @RequestParam (value="xeroxmarksheetsubmitted", required=false) Boolean xeroxmarksheetsubmitted,
            @RequestParam (value="xeroxMarksheetCopies", required=false) Integer xeroxMarksheetCopies,
            @RequestParam (value="xeroxTransfercertificatesubmitted", required=false) Boolean xeroxTransfercertificatesubmitted,
            @RequestParam (value="xeroxTransferCertificateCopies", required=false) Integer xeroxTransferCertificateCopies,
            @RequestParam (value="xeroxCommunitycertificatesubmitted", required=false) Boolean xeroxCommunitycertificatesubmitted,
            @RequestParam (value="xeroxCommunityCertificateCopies", required=false) Integer xeroxCommunityCertificateCopies,
            @RequestParam (value="migrationcertificatesubmitted", required=false) Boolean migrationcertificatesubmitted,
            @RequestParam (value="migrationCertificateSlNo", required=false) String migrationCertificateSlNo,
            @RequestParam (value="conductcertificatesubmitted", required=false) Boolean conductcertificatesubmitted,
            @RequestParam (value="conductCertificateSlNo", required=false) String conductCertificateSlNo,
            @RequestParam (value="stampSizePhotosubmitted", required=false) Boolean stampSizePhotosubmitted,
            @RequestParam (value="stampSizePhotoCopies", required=false) Integer stampSizePhotoCopies,
            @RequestParam (value="passPortPhotosubmitted", required=false) Boolean passPortPhotosubmitted,
            @RequestParam (value="passportSizePhotoCopies", required=false) Integer passportSizePhotoCopies,
            @RequestParam (value="loginUser", required=false) String loginUser
    ) {
        CertificateSubmission certificateSubmission = new CertificateSubmission();
        StudentPersonalInformation student_personal_regno = new StudentPersonalInformation(regno);
        certificateSubmission.setAdmissionno(admissionno)
                             .setRegno(regno)
                             .setCandidatename(candidatename)
                             .setBranch(branch)
                             .setBranchCode(branchCode)
                             .setSemester(semester)
                             .setAcademicYear(academicYear)
                             .setStudentType(studentType)
                             .setFoloiNo(foloiNo)
                             .setMarksheetsubmitted(marksheetsubmitted)
                             .setMarksheetSlNo(marksheetSlNo)
                             .setTransfercertificatesubmitted (transfercertificatesubmitted)
                             .setTransferCertificateSlNo(transferCertificateSlNo)
                             .setCommunitycertificatesubmitted(communitycertificatesubmitted)
                             .setCommunityCertificateSlNo(communityCertificateSlNo)
                             .setXeroxmarksheetsubmitted(xeroxmarksheetsubmitted)
                             .setXeroxMarksheetCopies(xeroxMarksheetCopies)
                             .setXeroxTransfercertificatesubmitted(xeroxTransfercertificatesubmitted)
                             .setXeroxTransferCertificateCopies(xeroxTransferCertificateCopies)
                             .setXeroxCommunitycertificatesubmitted(xeroxCommunitycertificatesubmitted)
                             .setXeroxCommunityCertificateCopies(xeroxCommunityCertificateCopies)
                             .setMigrationcertificatesubmitted(migrationcertificatesubmitted)
                             .setMigrationCertificateSlNo(migrationCertificateSlNo)
                             .setConductcertificatesubmitted(conductcertificatesubmitted)
                             .setConductCertificateSlNo(conductCertificateSlNo)
                             .setStampSizePhotosubmitted(stampSizePhotosubmitted)
                             .setStampSizePhotoCopies(stampSizePhotoCopies)
                             .setPassPortPhotosubmitted(passPortPhotosubmitted)
                             .setPassportSizePhotoCopies(passportSizePhotoCopies)
                             .setLoginUser(loginUser)
                             .setStudent_personal_regno(student_personal_regno);


        certificateSubmissionRepository.save(certificateSubmission);



    }

    @RequestMapping(method = RequestMethod.POST, value="/getStudentCertificateSubmissionDetail")
    public CertificateSubmission getStudentCertificateSubmissionDetail(@RequestParam (value ="regno") String registerNumber) {
        CertificateSubmission studentCertificateSubmissionDetail = certificateSubmissionRepository.findOneByRegno(registerNumber);
        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
//        System.out.println("Inside getStudentCertificateSubmissionDetail");
        return studentCertificateSubmissionDetail;
    }

}
