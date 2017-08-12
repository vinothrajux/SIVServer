package com.sivserver.example.admission;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 30/06/2017.
 */
@Entity
@Table(name = "studentcollegeid")

public class StudentCollegeId {

    public String getRegno(){      return regno;    }
    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getAdmissionno() {
        return admissionno;
    }
    public void setAdmissionno(String admissionno) {
        this.admissionno = admissionno;
    }

    public String getCandidatename() {return candidatename;}
    public void setCandidatename(String candidatename) {
        this.candidatename = candidatename;
    }

    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBrachcode() {      return branchcode;    }
    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getBatch() {
        return Batch;
    }
    public void setBatch(String Batch) {
        this.Batch = Batch;
    }

    public Integer getSemester() {
        return semester;
    }
    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getAcademicyear() {return academicYear;}
    public void setAcademicyear(String academicYear) {this.academicYear = academicYear;}

    public Date getIdissuedate() {     return idissueddate;    }
    public void setIdissuedate(Date idissueddate) {
        this.idissueddate = idissueddate;
    }

    public String getIdcardno() {
        return idcardno;
    }
    public void setidcardno(String idcardno) {
        this.idcardno = idcardno;
    }

    public String getIdtype() {
        return idtype;
    }
    public void setIdtype(String idtype) {   this.idtype = idtype;  }

    public String getIdstatus() {
        return idstatus;
    }
    public void setIdstatus(String idstatus) {   this.idstatus = idstatus;  }

    public String getLoginuser() {
        return loginuser;
    }
    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }

    @Id
    private String regno;

    @NotNull
    private String admissionno;

    @NotNull
    private String candidatename;

    @NotNull
    private String branch;

    @NotNull
    private String branchcode;

    @NotNull
    private String Batch;

    @NotNull
    private Integer semester;

    @NotNull
    private String academicYear;

    @NotNull
    private Date idissueddate;

    @NotNull
    private String idcardno;

    @NotNull
    private String idtype;

    @NotNull
    private String idstatus;

    @NotNull
    private String loginuser;

}
