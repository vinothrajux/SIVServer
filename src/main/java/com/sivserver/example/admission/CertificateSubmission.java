package com.sivserver.example.admission;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Created by Seetha on 09-Jun-17.
 */

@Entity
@Table(name = "certificatesubmission")
public class CertificateSubmission {
    public String getAdmissionNo(){
        return admissionno;
    }
    public void setAdmissionNo(String admissionno) {
        this.admissionno = admissionno;
    }

    public String getRegno() {
        return regno;
    }
    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getCandName() {
        return candidatename;
    }
    public void setCandName(String candidatename) {
        this.candidatename = candidatename;
    }

    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBranchCode() {
        return branchCode;
    }
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public Integer getSemester() {
        return semester;
    }
    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getAcadYear() {
        return academicYear;
    }
    public void setAcadYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getStudType() {
        return studentType;
    }
    public void setStudType(String studentType) {
        this.studentType = studentType;
    }

    public String getFolioNo() {
        return foloiNo;
    }
    public void setFolioNo(String foloiNo) {
        this.foloiNo = foloiNo;
    }

    public Boolean getMarkSheetSubmitted() {
        return marksheetsubmitted;
    }
    public void setMarkSheetSubmitted(Boolean marksheetsubmitted) {
        this.marksheetsubmitted = marksheetsubmitted;
    }

    public String getMarksheetSlno() {
        return marksheetSlNo;
    }
    public void setMarksheetSlno(String marksheetSlNo) {
        this.marksheetSlNo = marksheetSlNo;
    }

    public Boolean getTransferCertifcateSubmitted() {
        return transfercertificatesubmitted;
    }
    public void setTransferCertifcateSubmitted(Boolean transfercertificatesubmitted) {
        this.transfercertificatesubmitted = transfercertificatesubmitted;
    }

    public String getTransferCertificateSlNo() {
        return transferCertificateSlNo;
    }
    public void setTransferCertificateSlNo(String transferCertificateSlNo) {
        this.transferCertificateSlNo = transferCertificateSlNo;
    }

    public Boolean getCommunityCertificateSubmitted() {
        return communitycertificatesubmitted;
    }
    public void setCommunityCertificateSubmitted(Boolean communitycertificatesubmitted) {
        this.communitycertificatesubmitted = communitycertificatesubmitted;
    }

    public String getCommunityCertificateSlNo() {
        return communityCertificateSlNo;
    }
    public void setCommunityCertificateSlNo(String communityCertificateSlNo) {
        this.communityCertificateSlNo = communityCertificateSlNo;
    }

    public Boolean getXeroxMarkSheetSubmitted() {
        return xeroxmarksheetsubmitted;
    }
    public void setXeroxMarkSheetSubmitted(Boolean xeroxmarksheetsubmitted) {
        this.xeroxmarksheetsubmitted = xeroxmarksheetsubmitted;
    }

    public Integer getXeroxMarksheetCopies() {
        return xeroxMarksheetCopies;
    }
    public void setXeroxMarksheetCopies(Integer xeroxMarksheetCopies) {
        this.xeroxMarksheetCopies = xeroxMarksheetCopies;
    }

    public Boolean getXeroxTransferCertifcateSubmitted() {
        return xeroxTransfercertificatesubmitted;
    }
    public void setXeroxTransferCertifcateSubmitted(Boolean xeroxTransfercertificatesubmitted) {
        this.xeroxTransfercertificatesubmitted = xeroxTransfercertificatesubmitted;
    }

    public Integer getXeroxTransferCertificateCopies() {
        return xeroxTransferCertificateCopies;
    }
    public void setXeroxTransferCertificateCopies(Integer xeroxTransferCertificateCopies) {
        this.xeroxTransferCertificateCopies = xeroxTransferCertificateCopies;
    }

    public Boolean getXeroxCommunityCertificateSubmitted() {
        return xeroxCommunitycertificatesubmitted;
    }
    public void setXeroxCommunityCertificateSubmitted(Boolean xeroxCommunitycertificatesubmitted) {
        this.xeroxCommunitycertificatesubmitted = xeroxCommunitycertificatesubmitted;
    }

    public Integer getXeroxCommunityCertificateCopies() {
        return xeroxCommunityCertificateCopies;
    }
    public void setXeroxCommunityCertificateCopies(Integer xeroxCommunityCertificateCopies) {
        this.xeroxCommunityCertificateCopies = xeroxCommunityCertificateCopies;
    }
    public Boolean getMigrationCertifcateSubmitted() {
        return migrationcertificatesubmitted;
    }
    public void setMigrationCertifcateSubmitted(Boolean migrationcertificatesubmitted) {
        this.migrationcertificatesubmitted = migrationcertificatesubmitted;
    }

    public String getMigrationCertificateSlNo() {
        return migrationCertificateSlNo;
    }
    public void setMigrationCertificateSlNo(String migrationCertificateSlNo) {
        this.migrationCertificateSlNo = migrationCertificateSlNo;
    }

    public Boolean getConductCertifcateSubmitted() {
        return conductcertificatesubmitted;
    }
    public void setConductCertifcateSubmitted(Boolean conductcertificatesubmitted) {
        this.conductcertificatesubmitted = conductcertificatesubmitted;
    }

    public String getConductCertificateSlNo() {
        return conductCertificateSlNo;
    }
    public void setConductCertificateSlNo(String conductCertificateSlNo) {
        this.conductCertificateSlNo = conductCertificateSlNo;
    }

    public Boolean getStampSizePotoSubmitted() {
        return stampSizePhotosubmitted;
    }
    public void setStampSizePotoSubmitted(Boolean stampSizePhotosubmitted) {
        this.stampSizePhotosubmitted = stampSizePhotosubmitted;
    }

    public Integer getStampSizePotoNos() {
        return stampSizePhotoCopies;
    }
    public void setStampSizePotoNos(Integer stampSizePhotoCopies) {
        this.stampSizePhotoCopies = stampSizePhotoCopies;
    }

    public Boolean getPassPortSizePotoSubmitted() {
        return passPortPhotosubmitted;
    }
    public void setPassPortSizeSubmitted(Boolean passPortPhotosubmitted) {
        this.passPortPhotosubmitted = passPortPhotosubmitted;
    }

    public Integer getPassPortSizePotoNos() {
        return passportSizePhotoCopies;
    }
    public void setPassPortSizePotoNos(Integer passportSizePhotoCopies) {
        this.passportSizePhotoCopies = passportSizePhotoCopies;
    }

    public String getLoginUser() {
        return loginUser;
    }
    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    @Id
    private String admissionno;

    @NotNull
    private String regno;

    @NotNull
    private String candidatename;

    @NotNull
    private String branch;

    @NotNull
    private String branchCode;

    @NotNull
    private Integer semester;

    @NotNull
    private String academicYear;

    @NotNull
    private String studentType;

    @NotNull
    private String foloiNo;

    @NotNull
    private Boolean marksheetsubmitted;

    @NotNull
    private String marksheetSlNo;

    @NotNull
    private Boolean transfercertificatesubmitted;

    @NotNull
    private String transferCertificateSlNo;

    @NotNull
    private Boolean communitycertificatesubmitted;

    @NotNull
    private String communityCertificateSlNo;

    @NotNull
    private Boolean xeroxmarksheetsubmitted;

    @NotNull
    private Integer xeroxMarksheetCopies;

    @NotNull
    private Boolean xeroxTransfercertificatesubmitted;

    @NotNull
    private Integer xeroxTransferCertificateCopies;

    @NotNull
    private Boolean xeroxCommunitycertificatesubmitted;

    @NotNull
    private Integer xeroxCommunityCertificateCopies;

    @NotNull
    private Boolean migrationcertificatesubmitted;

    @NotNull
    private String migrationCertificateSlNo;

    @NotNull
    private Boolean conductcertificatesubmitted;

    @NotNull
    private String conductCertificateSlNo;

    @NotNull
    private Boolean stampSizePhotosubmitted;

    @NotNull
    private Integer stampSizePhotoCopies;

    @NotNull
    private Boolean passPortPhotosubmitted;

    @NotNull
    private Integer passportSizePhotoCopies;

    @NotNull
    private String loginUser;

    //    @OneToMany(mappedBy="applicationno")
//    private Set<ApplicationSale> appsale;

}
