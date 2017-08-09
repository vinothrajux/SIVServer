package com.sivserver.example.security;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 03/08/2017.
 */
@Entity
@Table(name = "securityoutpass")

public class SecurityOutPass {
    public String getOutpassid(){
        return outpassid;
    }
    public void setOutpassid(String outpassid) {
        this.outpassid = outpassid;
    }

    public Date getCurrentdate(){
        return currentdate;
    }
    public void setCurrentdate(Date currentdate) {
        this.currentdate = currentdate;
    }

    public String getTypeofperson(){
        return typeofperson;
    }
    public void setTypeofperson(String typeofperson) {
        this.typeofperson = typeofperson;
    }

    public String getRegno(){
        return registerno;
    }
    public void setRegno(String registerno) {
        this.registerno = registerno;
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


    public String getAcadyear() {
        return academicyear;
    }
    public void setAcadyear(String academicyear) {
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

    public String gettimeout() {
        return timeout;
    }
    public void settimeout(String timeout) {
        this.timeout = timeout;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }

    @Id
    private String outpassid;

    @NotNull
    private Date currentdate;

    @NotNull
    private String typeofperson;

    @NotNull
    private String registerno;

    @NotNull
    private String branchcode;

    @NotNull
    private String batch;

    @NotNull
    private Integer semester;

    @NotNull
    private String academicyear;

    @NotNull
    private Integer nooftimesmonth;

    @NotNull
    private Integer nooftimesoverall;

    @NotNull
    private String reason;

    @NotNull
    private String timeout;

    @NotNull
    private String loginuser;

}
