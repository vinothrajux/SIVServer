package com.sivserver.example.admission;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

/**
 * Created by Seetha on 30-Jun-17.
 */

@Entity
@Table(name = "bonafide")
public class Bonafide {

    public String getRegNo(){
        return regno;
    }
    public void setRegNo(String regno) {
        this.regno = regno;
    }

    public String getAdmissionNo() {
        return admissionno;
    }
    public void setAdmissionNo(String admissionno) {
        this.admissionno = admissionno;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getBranchName() {
        return branchname;
    }
    public void setBranchName(String branchname) {
        this.branchname = branchname;
    }

    public String getBranchCode() {
        return branchcode;
    }
    public void setBranchCode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getAcademicYear() {
        return academicyear;
    }
    public void setAcademicYear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getFatherName() {
        return fathername;
    }
    public void setFatherName(String fathername) {
        this.fathername = fathername;
    }

    public Date getIssuedDate() {
        return issueddate;
    }
    public void setIssuedDate(Date issueddate) {
        this.issueddate = issueddate;
    }

    public String getCertficateFor() {
        return certificatefor;
    }
    public void setCertficateFor(String certificatefor) {
        this.certificatefor = certificatefor;
    }

    public Integer getNoOfYears() {
        return noofyears;
    }
    public void setNoOfYears(Integer noofyears) {
        this.noofyears = noofyears;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }


    @Id
    private String regno;

    @NotNull
    private String admissionno;

    @NotNull
    private String name;

    @NotNull
    private String semester;

    @NotNull
    private String branchname;

    @NotNull
    private String branchcode;

    @NotNull
    private String academicyear;

    @NotNull
    private String fathername;

    @NotNull
    private Date issueddate;

    @NotNull
    private String certificatefor;

    @NotNull
    private Integer noofyears;

    @NotNull
    private String loginuser;


}
