package com.sivserver.example.parent;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 02-Aug-17.
 */
@Entity
@Table(name = "parentfeedback")

public class ParentFeedBack {

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

    public String getAdmissionno(){
        return admissionno;
    }
    public void setAdmissionno(String admissionno) {
        this.admissionno = admissionno;
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

    public String getmessageto() {
        return messageto;
    }
    public void setmessageto(String messageto) {
        this.messageto = messageto;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }

    @NotNull
    private Date currentdate;

    @Id
    private String regno;

    @NotNull
    private String admissionno;

    @NotNull
    private String branchcode;

    @NotNull
    private String batch;

    @NotNull
    private Integer semester;

    @NotNull
    private String academicyear;

    @NotNull
    private String messageto;

    @NotNull
    private String message;

    @NotNull
    private String loginuser;

}
