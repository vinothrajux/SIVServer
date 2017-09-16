package com.sivserver.example.admission;

import org.hibernate.annotations.NaturalId;

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
    public CertificateSubmission() {
    }

    public CertificateSubmission(String regno) {
        this.regno = regno;
    }

    public String getRegno() {
        return regno;
    }

    public CertificateSubmission setRegno(String regno) {
        this.regno = regno;
        return this;
    }

    public String getAdmissionno() {
        return admissionno;
    }

    public CertificateSubmission setAdmissionno(String admissionno) {
        this.admissionno = admissionno;
        return this;
    }

    public String getCandidatename() {
        return candidatename;
    }

    public CertificateSubmission setCandidatename(String candidatename) {
        this.candidatename = candidatename;
        return this;
    }

    public String getBranch() {
        return branch;
    }

    public CertificateSubmission setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public CertificateSubmission setBranchCode(String branchCode) {
        this.branchCode = branchCode;
        return this;
    }

    public Integer getSemester() {
        return semester;
    }

    public CertificateSubmission setSemester(Integer semester) {
        this.semester = semester;
        return this;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public CertificateSubmission setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
        return this;
    }

    public String getStudentType() {
        return studentType;
    }

    public CertificateSubmission setStudentType(String studentType) {
        this.studentType = studentType;
        return this;
    }

    public String getFoloiNo() {
        return foloiNo;
    }

    public CertificateSubmission setFoloiNo(String foloiNo) {
        this.foloiNo = foloiNo;
        return this;
    }

    public Boolean getMarksheetsubmitted() {
        return marksheetsubmitted;
    }

    public CertificateSubmission setMarksheetsubmitted(Boolean marksheetsubmitted) {
        this.marksheetsubmitted = marksheetsubmitted;
        return this;
    }

    public String getMarksheetSlNo() {
        return marksheetSlNo;
    }

    public CertificateSubmission setMarksheetSlNo(String marksheetSlNo) {
        this.marksheetSlNo = marksheetSlNo;
        return this;
    }

    public Boolean getTransfercertificatesubmitted() {
        return transfercertificatesubmitted;
    }

    public CertificateSubmission setTransfercertificatesubmitted(Boolean transfercertificatesubmitted) {
        this.transfercertificatesubmitted = transfercertificatesubmitted;
        return this;
    }

    public String getTransferCertificateSlNo() {
        return transferCertificateSlNo;
    }

    public CertificateSubmission setTransferCertificateSlNo(String transferCertificateSlNo) {
        this.transferCertificateSlNo = transferCertificateSlNo;
        return this;
    }

    public Boolean getCommunitycertificatesubmitted() {
        return communitycertificatesubmitted;
    }

    public CertificateSubmission setCommunitycertificatesubmitted(Boolean communitycertificatesubmitted) {
        this.communitycertificatesubmitted = communitycertificatesubmitted;
        return this;
    }

    public String getCommunityCertificateSlNo() {
        return communityCertificateSlNo;
    }

    public CertificateSubmission setCommunityCertificateSlNo(String communityCertificateSlNo) {
        this.communityCertificateSlNo = communityCertificateSlNo;
        return this;
    }

    public Boolean getXeroxmarksheetsubmitted() {
        return xeroxmarksheetsubmitted;
    }

    public CertificateSubmission setXeroxmarksheetsubmitted(Boolean xeroxmarksheetsubmitted) {
        this.xeroxmarksheetsubmitted = xeroxmarksheetsubmitted;
        return this;
    }

    public Integer getXeroxMarksheetCopies() {
        return xeroxMarksheetCopies;
    }

    public CertificateSubmission setXeroxMarksheetCopies(Integer xeroxMarksheetCopies) {
        this.xeroxMarksheetCopies = xeroxMarksheetCopies;
        return this;
    }

    public Boolean getXeroxTransfercertificatesubmitted() {
        return xeroxTransfercertificatesubmitted;
    }

    public CertificateSubmission setXeroxTransfercertificatesubmitted(Boolean xeroxTransfercertificatesubmitted) {
        this.xeroxTransfercertificatesubmitted = xeroxTransfercertificatesubmitted;
        return this;
    }

    public Integer getXeroxTransferCertificateCopies() {
        return xeroxTransferCertificateCopies;
    }

    public CertificateSubmission setXeroxTransferCertificateCopies(Integer xeroxTransferCertificateCopies) {
        this.xeroxTransferCertificateCopies = xeroxTransferCertificateCopies;
        return this;
    }

    public Boolean getXeroxCommunitycertificatesubmitted() {
        return xeroxCommunitycertificatesubmitted;
    }

    public CertificateSubmission setXeroxCommunitycertificatesubmitted(Boolean xeroxCommunitycertificatesubmitted) {
        this.xeroxCommunitycertificatesubmitted = xeroxCommunitycertificatesubmitted;
        return this;
    }

    public Integer getXeroxCommunityCertificateCopies() {
        return xeroxCommunityCertificateCopies;
    }

    public CertificateSubmission setXeroxCommunityCertificateCopies(Integer xeroxCommunityCertificateCopies) {
        this.xeroxCommunityCertificateCopies = xeroxCommunityCertificateCopies;
        return this;
    }

    public Boolean getMigrationcertificatesubmitted() {
        return migrationcertificatesubmitted;
    }

    public CertificateSubmission setMigrationcertificatesubmitted(Boolean migrationcertificatesubmitted) {
        this.migrationcertificatesubmitted = migrationcertificatesubmitted;
        return this;
    }

    public String getMigrationCertificateSlNo() {
        return migrationCertificateSlNo;
    }

    public CertificateSubmission setMigrationCertificateSlNo(String migrationCertificateSlNo) {
        this.migrationCertificateSlNo = migrationCertificateSlNo;
        return this;
    }

    public Boolean getConductcertificatesubmitted() {
        return conductcertificatesubmitted;
    }

    public CertificateSubmission setConductcertificatesubmitted(Boolean conductcertificatesubmitted) {
        this.conductcertificatesubmitted = conductcertificatesubmitted;
        return this;
    }

    public String getConductCertificateSlNo() {
        return conductCertificateSlNo;
    }

    public CertificateSubmission setConductCertificateSlNo(String conductCertificateSlNo) {
        this.conductCertificateSlNo = conductCertificateSlNo;
        return this;
    }

    public Boolean getStampSizePhotosubmitted() {
        return stampSizePhotosubmitted;
    }

    public CertificateSubmission setStampSizePhotosubmitted(Boolean stampSizePhotosubmitted) {
        this.stampSizePhotosubmitted = stampSizePhotosubmitted;
        return this;
    }

    public Integer getStampSizePhotoCopies() {
        return stampSizePhotoCopies;
    }

    public CertificateSubmission setStampSizePhotoCopies(Integer stampSizePhotoCopies) {
        this.stampSizePhotoCopies = stampSizePhotoCopies;
        return this;
    }

    public Boolean getPassPortPhotosubmitted() {
        return passPortPhotosubmitted;
    }

    public CertificateSubmission setPassPortPhotosubmitted(Boolean passPortPhotosubmitted) {
        this.passPortPhotosubmitted = passPortPhotosubmitted;
        return this;
    }

    public Integer getPassportSizePhotoCopies() {
        return passportSizePhotoCopies;
    }

    public CertificateSubmission setPassportSizePhotoCopies(Integer passportSizePhotoCopies) {
        this.passportSizePhotoCopies = passportSizePhotoCopies;
        return this;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public CertificateSubmission setLoginUser(String loginUser) {
        this.loginUser = loginUser;
        return this;
    }

    public StudentPersonalInformation getStudent_personal_regno() {
        return student_personal_regno;
    }

    public CertificateSubmission setStudent_personal_regno(StudentPersonalInformation student_personal_regno) {
        this.student_personal_regno = student_personal_regno;
        return this;
    }

    @Id
    @Column(name="regno")
    private String regno;


    private String admissionno;


    private String candidatename;


    private String branch;


    private String branchCode;


    private Integer semester;


    private String academicYear;


    private String studentType;

    @NaturalId
    private String foloiNo;


    private Boolean marksheetsubmitted;


    private String marksheetSlNo;


    private Boolean transfercertificatesubmitted;


    private String transferCertificateSlNo;


    private Boolean communitycertificatesubmitted;


    private String communityCertificateSlNo;


    private Boolean xeroxmarksheetsubmitted;


    private Integer xeroxMarksheetCopies;


    private Boolean xeroxTransfercertificatesubmitted;


    private Integer xeroxTransferCertificateCopies;


    private Boolean xeroxCommunitycertificatesubmitted;


    private Integer xeroxCommunityCertificateCopies;


    private Boolean migrationcertificatesubmitted;


    private String migrationCertificateSlNo;


    private Boolean conductcertificatesubmitted;


    private String conductCertificateSlNo;


    private Boolean stampSizePhotosubmitted;


    private Integer stampSizePhotoCopies;


    private Boolean passPortPhotosubmitted;


    private Integer passportSizePhotoCopies;


    private String loginUser;

    @OneToOne
    @JoinColumn(name="student_certificate_regno",nullable=false,referencedColumnName = "regno")
    private StudentPersonalInformation student_personal_regno;



    //    @OneToMany(mappedBy="applicationno")
//    private Set<ApplicationSale> appsale;

}
