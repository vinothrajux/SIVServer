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

    public String getRegno(){return regno;}
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
    public void setBranchname(String branchname) {this.branchname = branchname; }

    public String getBranchcode() {return branchcode;}
    public void setBranchcode(String branchcode) {this.branchcode = branchcode;}

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

    public String getCertficatefor() {
        return certificatefor;
    }
    public void setCertficatefor(String certificatefor) {
        this.certificatefor = certificatefor;
    }

    public Integer getNoOfyears() {
        return noofyears;
    }
    public void setNoOfyears(Integer noofyears) {
        this.noofyears = noofyears;
    }

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
