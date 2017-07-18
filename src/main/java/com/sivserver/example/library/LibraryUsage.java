package com.sivserver.example.library;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 18/07/2017.
 */
@Entity
@Table(name = "libraryusage")

public class LibraryUsage {

    public Date getCurrentdate(){
        return currentdate;
    }
    public void setCurrentdate(Date currentdate) {
        this.currentdate = currentdate;
    }

    public String getMemberid(){
        return memberid;
    }
    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    public String getBranchcode(){
        return branchcode;
    }
    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getBatch(){
        return batch;
    }
    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Integer getSemester(){
        return semester;
    }
    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getAcademicyear(){
        return academicyear;
    }
    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getTimefrom(){
        return timefrom;
    }
    public void setTimefrom(String timefrom) {
        this.timefrom = timefrom;
    }

    public String getTimeto(){
        return timeto;
    }
    public void setTimeto(String timeto) {
        this.timeto = timeto;
    }
    public String getPurpose(){
        return purpose;
    }
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getRemarks(){
        return remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLoginuser(){
        return loginuser;
    }
    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }




    @NotNull
    private Date currentdate;

    @Id
    private String memberid;

    @NotNull
    private String branchcode;

    @NotNull
    private String batch;

    @NotNull
    private Integer semester;

    @NotNull
    private String academicyear;

    @NotNull
    private String timefrom;

    @NotNull
    private String timeto;

    @NotNull
    private String purpose;

    @NotNull
    private String remarks;

    @NotNull
    private String loginuser;



}
