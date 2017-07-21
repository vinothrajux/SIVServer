package com.sivserver.example.transport;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 07-Jul-17.
 */

@Entity
@Table(name = "transportidcard")
public class TransportIdCard {

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

    public String getCandidateName() {return candidatename;}
    public void setCandidateName(String candidatename) {
        this.candidatename = candidatename;
    }

    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBrachCode() {return branchcode;    }
    public void setBranchCode(String branchcode) {
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

    public String getAcademicYear() {return academicYear;}
    public void setAcademicYear(String academicYear) {this.academicYear = academicYear;    }

    public Date getIdIssueDate() {return idissueddate;}
    public void setIdIssueDate(Date idissueddate) {
        this.idissueddate = idissueddate;
    }

    public String getIdcardno() {
        return idcardno;
    }
    public void setidcardno(String idcardno) {
        this.idcardno = idcardno;
    }

    public String getIdType() {
        return idtype;
    }
    public void setIdtype(String idtype) {   this.idtype = idtype;  }

    public String getIdstatus() {
        return idstatus;
    }
    public void setIdstatus(String idstatus) {this.idstatus = idstatus;  }

    public String getRoutname() {
        return routename;
    }
    public void setRoutename(String routename) {this.routename = routename;  }

    public Integer getRouteno() {
        return routeno;
    }
    public void setRouteno(Integer routeno) {this.routeno = routeno;  }

    public String getStage() {
        return stage;
    }
    public void setStage(String stage) {this.stage = stage;  }

    public String getSeatno() {
        return seatno;
    }
    public void setSeatno(String seatno) {this.seatno = seatno;  }

    public String getLoginUser() {return loginuser;}
    public void setLoginUser(String loginuser) {
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
    private String routename;

    @NotNull
    private Integer routeno;

    @NotNull
    private String stage;

    @NotNull
    private String seatno;

    @NotNull
    private String loginuser;


}
