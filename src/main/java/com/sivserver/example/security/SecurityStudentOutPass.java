package com.sivserver.example.security;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 03/08/2017.
 */
@Entity
@Table(name = "securitystudentoutpass")

public class SecurityStudentOutPass {

    @Id
    private String outpassid;

    private Date currentdate;

    private String typeofperson;

    @Column(name="regno")
    private String regno;

    private String branchcode;

    private String batch;

    private Integer semester;

    private String academicyear;

    private Integer nooftimesmonth;

    private Integer nooftimesoverall;

    private String reason;

    private String timeout;

    private String loginuser;

    public SecurityStudentOutPass() {
    }

    public String getOutpassid() {
        return outpassid;
    }

    public void setOutpassid(String outpassid) {
        this.outpassid = outpassid;
    }

    public Date getCurrentdate() {
        return currentdate;
    }

    public void setCurrentdate(Date currentdate) {
        this.currentdate = currentdate;
    }

    public String getTypeofperson() {
        return typeofperson;
    }

    public void setTypeofperson(String typeofperson) {
        this.typeofperson = typeofperson;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
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
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public Integer getNooftimesmonth() {
        return nooftimesmonth;
    }

    public void setNooftimesmonth(Integer nooftimesmonth) {
        this.nooftimesmonth = nooftimesmonth;
    }

    public Integer getNooftimesoverall() {
        return nooftimesoverall;
    }

    public void setNooftimesoverall(Integer nooftimesoverall) {
        this.nooftimesoverall = nooftimesoverall;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
