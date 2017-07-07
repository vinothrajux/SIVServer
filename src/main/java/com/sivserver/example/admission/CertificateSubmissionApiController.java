package com.sivserver.example.admission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by Seetha on 19-Jun-17.
 */
@RestController
@RequestMapping("/api/v1/certificatesubmission")

public class CertificateSubmissionApiController extends WebMvcConfigurerAdapter {

    @Autowired
    private CertificateSubmissionRepository certificateSubmissionRepository;

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
        certificateSubmission.setAdmissionNo(admissionno);
        certificateSubmission.setRegno(regno);
        certificateSubmission.setCandName(candidatename);
        certificateSubmission.setBranch(branch);
        certificateSubmission.setBranchCode(branchCode);
        certificateSubmission.setSemester(semester);
        certificateSubmission.setAcadYear(academicYear);
        certificateSubmission.setStudType(studentType);
        certificateSubmission.setFolioNo(foloiNo);
        certificateSubmission.setMarkSheetSubmitted(marksheetsubmitted);
        certificateSubmission.setMarksheetSlno(marksheetSlNo);
        certificateSubmission.setTransferCertifcateSubmitted(transfercertificatesubmitted);
        certificateSubmission.setTransferCertificateSlNo(transferCertificateSlNo);
        certificateSubmission.setCommunityCertificateSubmitted(communitycertificatesubmitted);
        certificateSubmission.setCommunityCertificateSlNo(communityCertificateSlNo);
        certificateSubmission.setXeroxMarkSheetSubmitted(xeroxmarksheetsubmitted);
        certificateSubmission.setXeroxMarksheetCopies(xeroxMarksheetCopies);
        certificateSubmission.setXeroxTransferCertifcateSubmitted(xeroxTransfercertificatesubmitted);
        certificateSubmission.setXeroxTransferCertificateCopies(xeroxTransferCertificateCopies);
        certificateSubmission.setXeroxCommunityCertificateSubmitted(xeroxCommunitycertificatesubmitted);
        certificateSubmission.setXeroxCommunityCertificateCopies(xeroxCommunityCertificateCopies);
        certificateSubmission.setMigrationCertifcateSubmitted(migrationcertificatesubmitted);
        certificateSubmission.setMigrationCertificateSlNo(migrationCertificateSlNo);
        certificateSubmission.setConductCertifcateSubmitted(conductcertificatesubmitted);
        certificateSubmission.setConductCertificateSlNo(conductCertificateSlNo);
        certificateSubmission.setStampSizePotoSubmitted(stampSizePhotosubmitted);
        certificateSubmission.setStampSizePotoNos(stampSizePhotoCopies);
        certificateSubmission.setPassPortSizeSubmitted(passPortPhotosubmitted);
        certificateSubmission.setPassPortSizePotoNos(passportSizePhotoCopies);
        certificateSubmission.setLoginUser(loginUser);

        certificateSubmissionRepository.save(certificateSubmission);



    }


}
