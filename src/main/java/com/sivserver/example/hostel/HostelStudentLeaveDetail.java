package com.sivserver.example.hostel;

import javax.persistence.Column;
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

    private Date currentdate;

    @Column(name="regno")
    private String regno;

    private String admissionno;

    private String branchcode;

    private String batch;

    private Integer semester;

    private String academicyear;

    @Id
    private Date fromdate;

    private Date todate;

    private Integer noofdays;

    private String reason;

    private String requestedby;

    private String requestedpersoncontactno;

    private String approvedby;

    private String remarks;

    private String loginuser;

    public HostelStudentLeaveDetail() {
    }

    public Date getCurrentdate() {
        return currentdate;
    }

    public void setCurrentdate(Date currentdate) {
        this.currentdate = currentdate;
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

    public Date getFromdate() {
        return fromdate;
    }

    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
    }

    public Date getTodate() {
        return todate;
    }

    public void setTodate(Date todate) {
        this.todate = todate;
    }

    public Integer getNoofdays() {
        return noofdays;
    }

    public void setNoofdays(Integer noofdays) {
        this.noofdays = noofdays;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRequestedby() {
        return requestedby;
    }

    public void setRequestedby(String requestedby) {
        this.requestedby = requestedby;
    }

    public String getRequestedpersoncontactno() {
        return requestedpersoncontactno;
    }

    public void setRequestedpersoncontactno(String requestedpersoncontactno) {
        this.requestedpersoncontactno = requestedpersoncontactno;
    }

    public String getApprovedby() {
        return approvedby;
    }

    public void setApprovedby(String approvedby) {
        this.approvedby = approvedby;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
