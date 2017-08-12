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
    public Date getEntrydate(){
        return entrydate;
    }
    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    public String getTcserialno() {
        return tcserialno;
    }
    public void setTcserialno(String tcserialno) {
        this.tcserialno = tcserialno;
    }

    public String getRegno() {
        return regno;
    }
    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getAdmissionno() {
        return admissionno;
    }
    public void setAdmissionno(String admissionno) {
        this.admissionno = admissionno;
    }


    public String getCandidatename() {
        return candname;
    }
    public void setCandidatename(String candname) {
        this.candname = candname;
    }

    public String getFathername() {
        return fathername;
    }
    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getMothername() {
        return mothername;
    }
    public void setMothername(String mothername) {
        this.mothername = mothername;
    }

    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBranchcode() {
        return branchcode;
    }
    public void setBranchcode(String branchcode) {
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

    public String getAcademicyear() {
        return academicYear;
    }
    public void setAcademicyear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getStudenttype() {
        return studenttype;
    }
    public void setStudenttype(String studenttype) {
        this.studenttype = studenttype;
    }

    public Date getDateofbirth() {
        return dob;
    }
    public void setDateofbirth(Date dob) {
        this.dob = dob;
    }

    public String getDateofbirthwords() {
        return dobw;
    }
    public void setDateofbirthwords(String dobw) {
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

    public Date getDateofadmission() {
        return dateofadmission;
    }
    public void setDateofadmission(Date dateofadmission) {
        this.dateofadmission = dateofadmission;
    }

    public Date getLeftdate() {
        return leftdate;
    }
    public void setLeftdate(Date leftdate) {
        this.leftdate = leftdate;
    }

    public String getYearofstudent() {
        return yearofstudent;
    }
    public void setYearofstudent(String yearofstudent) {
        this.yearofstudent = yearofstudent;
    }

    public String getLastappearedexam() {
        return lastappearedexam;
    }
    public void setLastappearedexam(String lastappearedexam) {
        this.lastappearedexam = lastappearedexam;
    }

    public String getQualified() {
        return qualified;
    }
    public void setQualified(String qualified) {
        this.qualified = qualified;
    }

    public String getReasonfortc() {
        return reasonfortc;
    }
    public void setReasonfortc(String reasonfortc) {
        this.reasonfortc = reasonfortc;
    }

    public Long getFeesbalance() {
        return feesbalance;
    }
    public void setFeesbalance(Long feesbalance) {
        this.feesbalance = feesbalance;
    }

    public String getDurationfrom() {
        return durationfrom;
    }
    public void setDurationfrom(String durationfrom) {
        this.durationfrom = durationfrom;
    }

    public String getDurationto() {
        return durationto;
    }
    public void setDurationto(String durationto) {
        this.durationto = durationto;
    }

    public String getApproved() {
        return approved;
    }
    public void setApproved(String approved) {
        this.approved = approved;
    }

    public String getLoginuser() {
        return loginuser;
    }
    public void setLoginuser(String loginuser) {
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
