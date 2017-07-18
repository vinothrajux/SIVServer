package com.sivserver.example.library;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 17/07/2017.
 */
@Entity
@Table(name = "librarymemberdetail")

public class LibraryMemberDetail {
    public String getMemberid(){
        return memberid;
    }
    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }
    public String getMembertype(){
        return membertype;
    }
    public void setMembertype(String membertype) {
        this.membertype = membertype;
    }

    public String getRegno(){
        return regno;
    }
    public void setRegno(String regno) {
        this.regno = regno;
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

    public Integer getEligiblenoofbooks() {
        return eligiblenoofbooks;
    }
    public void setEligiblenoofbooks(Integer eligiblenoofbooks) {
        this.eligiblenoofbooks = eligiblenoofbooks;
    }

    public Integer getNoofbookstaken() {
        return noofbookstaken;
    }
    public void setNoofbookstaken(Integer noofbookstaken) {
        this.noofbookstaken = noofbookstaken;
    }

    public String getLoginuser() {
        return loginuser;
    }
    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }


    @NotNull
    private String memberid;

    @NotNull
    private String membertype;

    @Id
    private String regno;

    @NotNull
    private String branchcode;

    @NotNull
    private String batch;

    @NotNull
    private Integer semester;

    @NotNull
    private String academicyear;

    @NotNull
    private Integer eligiblenoofbooks;

    @NotNull
    private Integer noofbookstaken;

    @NotNull
    private String loginuser;

}

