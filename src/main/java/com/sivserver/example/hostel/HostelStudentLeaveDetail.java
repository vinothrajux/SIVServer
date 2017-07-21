package com.sivserver.example.hostel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 19/07/2017.
 */
@Entity
@Table(name = "hostelstudentleavedetail")

public class HostelStudentLeaveDetail {
    public Date getCurrentdate(){
        return currentdate;
    }
    public void setCurrentdate(Date currentdate) {
        this.currentdate = currentdate;
    }


    public String getRegno(){
        return regno;
    }
    public void setRegno(String regno) {
        this.regno = regno;
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

    public Date getFromdate(){
        return fromdate;
    }
    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
    }

    public Date getTodate(){
        return todate;
    }
    public void setTodate(Date todate) {
        this.todate = todate;
    }

    public Integer getNoofdays(){
        return noofdays;
    }
    public void setNoofdays(Integer noofdays) {
        this.noofdays = noofdays;
    }

    public String getReason(){
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRequestedby(){
        return requestedby;
    }
    public void setRequestedby(String requestedby) {
        this.requestedby = requestedby;
    }

    public String getRequestedpersoncontactno(){
        return requestedpersoncontactno;
    }
    public void setRequestedpersoncontactno(String requestedpersoncontactno) {
        this.requestedpersoncontactno = requestedpersoncontactno;
    }

    public String getApprovedby(){
        return approvedby;
    }
    public void setApprovedby(String approvedby) {
        this.approvedby = approvedby;
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
    private Date fromdate;

    @NotNull
    private Date todate;

    @NotNull
    private Integer noofdays;

    @NotNull
    private String reason;

    @NotNull
    private String requestedby;

    @NotNull
    private String requestedpersoncontactno;

    @NotNull
    private String approvedby;

    @NotNull
    private String remarks;

    @NotNull
    private String loginuser;

}
