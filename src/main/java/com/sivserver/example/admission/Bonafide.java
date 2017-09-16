package com.sivserver.example.admission;

import javax.persistence.Column;
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

    public String getBonafideid() {
        return bonafideid;
    }

    public void setBonafideid(String bonafideid) {
        this.bonafideid = bonafideid;
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

    public String getBranchname() {
        return branchname;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public Date getIssueddate() {
        return issueddate;
    }

    public void setIssueddate(Date issueddate) {
        this.issueddate = issueddate;
    }

    public String getCertificatefor() {
        return certificatefor;
    }

    public void setCertificatefor(String certificatefor) {
        this.certificatefor = certificatefor;
    }

    public Integer getNoofyears() {
        return noofyears;
    }

    public void setNoofyears(Integer noofyears) {
        this.noofyears = noofyears;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }

    @Id
    private String bonafideid;

    @Column(name="regno")
    private String regno;


    private String admissionno;


    private String name;


    private String semester;


    private String branchname;


    private String branchcode;


    private String academicyear;


    private String fathername;


    private Date issueddate;


    private String certificatefor;


    private Integer noofyears;


    private String loginuser;


}
