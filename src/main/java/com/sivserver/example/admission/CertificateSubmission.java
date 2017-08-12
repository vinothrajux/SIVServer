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
    public String getAdmissionno(){
        return admissionno;
    }
    public void setAdmissionno(String admissionno) {
        this.admissionno = admissionno;
    }

    public String getRegno() {
        return regno;
    }
    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getCandname() {
        return candidatename;
    }
    public void setCandname(String candidatename) {
        this.candidatename = candidatename;
    }

    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBranchcode() {
        return branchCode;
    }
    public void setBranchcode(String branchCode) {
        this.branchCode = branchCode;
    }

    public Integer getSemester() {
        return semester;
    }
    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getAcadyear() {
        return academicYear;
    }
    public void setAcadyear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getStudtype() {
        return studentType;
    }
    public void setStudtype(String studentType) {
        this.studentType = studentType;
    }

    public String getFoliono() {
        return foloiNo;
    }
    public void setFoliono(String foloiNo) {
        this.foloiNo = foloiNo;
    }

    public Boolean getMarksheetsubmitted() {
        return marksheetsubmitted;
    }
    public void setMarksheetsubmitted(Boolean marksheetsubmitted) {
        this.marksheetsubmitted = marksheetsubmitted;
    }

    public String getMarksheetslno() {
        return marksheetSlNo;
    }
    public void setMarksheetslno(String marksheetSlNo) {
        this.marksheetSlNo = marksheetSlNo;
    }

    public Boolean getTransfercertifcatesubmitted() {
        return transfercertificatesubmitted;
    }
    public void setTransfercertifcatesubmitted(Boolean transfercertificatesubmitted) {
        this.transfercertificatesubmitted = transfercertificatesubmitted;
    }

    public String getTransfercertificateslno() {
        return transferCertificateSlNo;
    }
    public void setTransfercertificateslno(String transferCertificateSlNo) {
        this.transferCertificateSlNo = transferCertificateSlNo;
    }

    public Boolean getCommunitycertificatesubmitted() {
        return communitycertificatesubmitted;
    }
    public void setCommunitycertificatesubmitted(Boolean communitycertificatesubmitted) {
        this.communitycertificatesubmitted = communitycertificatesubmitted;
    }

    public String getCommunitycertificateslno() {
        return communityCertificateSlNo;
    }
    public void setCommunitycertificateslno(String communityCertificateSlNo) {
        this.communityCertificateSlNo = communityCertificateSlNo;
    }

    public Boolean getXeroxmarksheetsubmitted() {
        return xeroxmarksheetsubmitted;
    }
    public void setXeroxmarksheetsubmitted(Boolean xeroxmarksheetsubmitted) {
        this.xeroxmarksheetsubmitted = xeroxmarksheetsubmitted;
    }

    public Integer getXeroxmarksheetcopies() {
        return xeroxMarksheetCopies;
    }
    public void setXeroxmarksheetcopies(Integer xeroxMarksheetCopies) {
        this.xeroxMarksheetCopies = xeroxMarksheetCopies;
    }

    public Boolean getXeroxtransfercertifcatesubmitted() {
        return xeroxTransfercertificatesubmitted;
    }
    public void setXeroxtransfercertifcatesubmitted(Boolean xeroxTransfercertificatesubmitted) {
        this.xeroxTransfercertificatesubmitted = xeroxTransfercertificatesubmitted;
    }

    public Integer getXeroxtransfercertificatecopies() {
        return xeroxTransferCertificateCopies;
    }
    public void setXeroxtransfercertificatecopies(Integer xeroxTransferCertificateCopies) {
        this.xeroxTransferCertificateCopies = xeroxTransferCertificateCopies;
    }

    public Boolean getXeroxcommunitycertificatesubmitted() {
        return xeroxCommunitycertificatesubmitted;
    }
    public void setXeroxcommunitycertificatesubmitted(Boolean xeroxCommunitycertificatesubmitted) {
        this.xeroxCommunitycertificatesubmitted = xeroxCommunitycertificatesubmitted;
    }

    public Integer getXeroxcommunitycertificatecopies() {
        return xeroxCommunityCertificateCopies;
    }
    public void setXeroxcommunitycertificatecopies(Integer xeroxCommunityCertificateCopies) {
        this.xeroxCommunityCertificateCopies = xeroxCommunityCertificateCopies;
    }
    public Boolean getMigrationcertifcatesubmitted() {
        return migrationcertificatesubmitted;
    }
    public void setMigrationcertifcatesubmitted(Boolean migrationcertificatesubmitted) {
        this.migrationcertificatesubmitted = migrationcertificatesubmitted;
    }

    public String getMigrationcertificateslno() {
        return migrationCertificateSlNo;
    }
    public void setMigrationcertificateslno(String migrationCertificateSlNo) {
        this.migrationCertificateSlNo = migrationCertificateSlNo;
    }

    public Boolean getConductcertifcatesubmitted() {
        return conductcertificatesubmitted;
    }
    public void setConductcertifcatesubmitted(Boolean conductcertificatesubmitted) {
        this.conductcertificatesubmitted = conductcertificatesubmitted;
    }

    public String getConductcertificateslno() {
        return conductCertificateSlNo;
    }
    public void setConductcertificateslno(String conductCertificateSlNo) {
        this.conductCertificateSlNo = conductCertificateSlNo;
    }

    public Boolean getStampsizepotosubmitted() {
        return stampSizePhotosubmitted;
    }
    public void setStampsizepotosubmitted(Boolean stampSizePhotosubmitted) {
        this.stampSizePhotosubmitted = stampSizePhotosubmitted;
    }

    public Integer getStampsizepotonos() {
        return stampSizePhotoCopies;
    }
    public void setStampsizepotonos(Integer stampSizePhotoCopies) {
        this.stampSizePhotoCopies = stampSizePhotoCopies;
    }

    public Boolean getPassportsizepotosubmitted() {
        return passPortPhotosubmitted;
    }
    public void setPassportsizesubmitted(Boolean passPortPhotosubmitted) {
        this.passPortPhotosubmitted = passPortPhotosubmitted;
    }

    public Integer getPassportsizepotonos() {
        return passportSizePhotoCopies;
    }
    public void setPassportsizepotonos(Integer passportSizePhotoCopies) {
        this.passportSizePhotoCopies = passportSizePhotoCopies;
    }

    public String getLoginuser() {
        return loginUser;
    }
    public void setLoginuser(String loginUser) {
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
