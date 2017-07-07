package com.sivserver.example.admission;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 01/07/2017.
 */
@Entity
@Table(name = "studentdiscontinuedtctab")

public class StudentDiscontinuedTransferCertificate {
    public Date getEntryDate(){
        return entrydate;
    }
    public void setEntryDate(Date entrydate) {
        this.entrydate = entrydate;
    }

    public String getTcSerialNo() {
        return tcserialno;
    }
    public void setTcSerialNo(String tcserialno) {
        this.tcserialno = tcserialno;
    }

    public String getRegno() {
        return regno;
    }
    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getAdmissionNo() {
        return admissionno;
    }
    public void setAdmissionNo(String admissionno) {
        this.admissionno = admissionno;
    }


    public String getCandidateName() {
        return candname;
    }
    public void setCandidateName(String candname) {
        this.candname = candname;
    }

    public String getFatherName() {
        return fathername;
    }
    public void setFatherName(String fathername) {
        this.fathername = fathername;
    }

    public String getMotherName() {
        return mothername;
    }
    public void setMotherName(String mothername) {
        this.mothername = mothername;
    }

    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBranchCode() {
        return branchcode;
    }
    public void setBranchCode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getBatch() {
        return batch;
    }
    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Integer getSemester() {
        return semester;
    }
    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getAcademicYear() {
        return academicYear;
    }
    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getStudentType() {
        return studenttype;
    }
    public void setStudentType(String studenttype) {
        this.studenttype = studenttype;
    }

    public Date getDateofBirth() {
        return dob;
    }
    public void setDateofBirth(Date dob) {
        this.dob = dob;
    }

    public String getDateofBirthWords() {
        return dobw;
    }
    public void setDateofBirthWords(String dobw) {
        this.dobw = dobw;
    }

    public String getReligion() {
        return religion;
    }
    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCommunity() {
        return community;
    }
    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCaste() {
        return caste;
    }
    public void setCaste(String caste) {
        this.caste = caste;
    }

    public Date getDateofAdmission() {
        return dateofadmission;
    }
    public void setDateofAdmission(Date dateofadmission) {
        this.dateofadmission = dateofadmission;
    }

    public Date getLeftDate() {
        return leftdate;
    }
    public void setLeftDate(Date leftdate) {
        this.leftdate = leftdate;
    }

    public String getYearofStudent() {
        return yearofstudent;
    }
    public void setYearofStudent(String yearofstudent) {
        this.yearofstudent = yearofstudent;
    }

    public String getLastAppearedExam() {
        return lastappearedexam;
    }
    public void setLastAppearedExam(String lastappearedexam) {
        this.lastappearedexam = lastappearedexam;
    }

    public String getQualified() {
        return qualified;
    }
    public void setQualified(String qualified) {
        this.qualified = qualified;
    }

    public String getReasonforTc() {
        return reasonfortc;
    }
    public void setReasonforTc(String reasonfortc) {
        this.reasonfortc = reasonfortc;
    }

    public Long getFeesBalance() {
        return feesbalance;
    }
    public void setFeesBalance(Long feesbalance) {
        this.feesbalance = feesbalance;
    }

    public String getDurationFrom() {
        return durationfrom;
    }
    public void setDurationFrom(String durationfrom) {
        this.durationfrom = durationfrom;
    }

    public String getDurationTo() {
        return durationto;
    }
    public void setDurationTo(String durationto) {
        this.durationto = durationto;
    }

    public String getApproved() {
        return approved;
    }
    public void setApproved(String approved) {
        this.approved = approved;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }

    @NotNull
    private Date entrydate;

    @NotNull
    private String tcserialno;

    @Id
    private String regno;

    @NotNull
    private String admissionno;

    @NotNull
    private String candname;

    @NotNull
    private String fathername;

    @NotNull
    private String mothername;

    @NotNull
    private String branch;

    @NotNull
    private String branchcode;

    @NotNull
    private String batch;

    @NotNull
    private Integer semester;

    @NotNull
    private String academicYear;

    @NotNull
    private String studenttype;

    @NotNull
    private Date dob;

    @NotNull
    private String dobw;

    @NotNull
    private String religion;

    @NotNull
    private String nationality;

    @NotNull
    private String gender;

    @NotNull
    private String community;

    @NotNull
    private String caste;

    @NotNull
    private Date dateofadmission;

    @NotNull
    private Date leftdate;

    @NotNull
    private String yearofstudent;

    @NotNull
    private String lastappearedexam;

    @NotNull
    private String qualified;

    @NotNull
    private String reasonfortc;

    @NotNull
    private Long feesbalance;

    @NotNull
    private String durationfrom;

    @NotNull
    private String durationto;

    @NotNull
    private String approved;

    @NotNull
    private String loginuser;

}
