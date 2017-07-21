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
@Table(name = "hostelstudentvisitordetail")

public class HostelStudentVisitorDetail {
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

    public String getVisitortype(){
        return visitortype;
    }
    public void setVisitortype(String visitortype) {
        this.visitortype = visitortype;
    }

    public String getVisitorname(){
        return visitorname;
    }
    public void setVisitorname(String visitorname) {
        this.visitorname = visitorname;
    }

    public String getVisitorgender(){
        return visitorgender;
    }
    public void setVisitorgender(String visitorgender) {
        this.visitorgender = visitorgender;
    }

    public String getVisitoraddress1(){
        return visitoraddress1;
    }
    public void setVisitoraddress1(String visitoraddress1) {
        this.visitoraddress1 = visitoraddress1;
    }

    public String getVisitoraddress2(){
        return visitoraddress2;
    }
    public void setVisitoraddress2(String visitoraddress2) {
        this.visitoraddress2 = visitoraddress2;
    }

    public String getVisitorarea(){
        return visitorarea;
    }
    public void setVisitorarea(String visitorarea) {
        this.visitorarea = visitorarea;
    }

    public String getVisitorpincode(){
        return visitorpincode;
    }
    public void setVisitorpincode(String visitorpincode) {
        this.visitorpincode = visitorpincode;
    }

    public String getVisitorstate(){
        return visitorstate;
    }
    public void setVisitorstate(String visitorstate) {
        this.visitorstate = visitorstate;
    }

    public String getVisitormobilenumber(){
        return visitormobilenumber;
    }
    public void setVisitormobilenumber(String visitormobilenumber) {
        this.visitormobilenumber = visitormobilenumber;
    }

    public String getVisitoraltmobilenumber(){
        return visitoraltmobilenumber;
    }
    public void setVisitoraltmobilenumber(String visitoraltmobilenumber) {
        this.visitoraltmobilenumber = visitoraltmobilenumber;
    }

    public String getVisitoremail(){
        return visitoremail;
    }
    public void setVisitoremail(String visitoremail) {
        this.visitoremail = visitoremail;
    }

    public Integer getNoofvisitorcompanion(){
        return noofvisitorcompanion;
    }
    public void setNoofvisitorcompanion(Integer noofvisitorcompanion) {
        this.noofvisitorcompanion = noofvisitorcompanion;
    }

    public String getVisitorrelationship(){
        return visitorrelationship;
    }
    public void setVisitorrelationship(String visitorrelationship) {
        this.visitorrelationship = visitorrelationship;
    }

    public String getVisitorintime(){
        return visitorintime;
    }
    public void setVisitorintime(String visitorintime) {
        this.visitorintime = visitorintime;
    }

    public String getVisitorouttime(){
        return visitorouttime;
    }
    public void setVisitorouttime(String visitorouttime) {
        this.visitorouttime = visitorouttime;
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
    private String visitortype;

    @NotNull
    private String visitorname;

    @NotNull
    private String visitorgender;

    @NotNull
    private String visitoraddress1;

    @NotNull
    private String visitoraddress2;

    @NotNull
    private String visitorarea;

    @NotNull
    private String visitorpincode;

    @NotNull
    private String visitorstate;

    @NotNull
    private String visitormobilenumber;

    @NotNull
    private String visitoraltmobilenumber;

    @NotNull
    private String visitoremail;

    @NotNull
    private Integer noofvisitorcompanion;

    @NotNull
    private String visitorrelationship;

    @NotNull
    private String visitorintime;

    @NotNull
    private String visitorouttime;

    @NotNull
    private String remarks;

    @NotNull
    private String loginuser;

}
