package com.sivserver.example.steno;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 06-Jul-17.
 */

@Entity
@Table(name = "stenocircular")

public class Circular {


    @Id
    private String circularid;

    private Date currentdate;

    private String circulartype;

    private Date circulardate;

    private String circularparticular;

    private String branch;

    private String branchcode;

    private String semester;

    private String academicyear;

    private String loginuser;

    public Circular() {
    }

    public String getCircularid() {
        return circularid;
    }

    public void setCircularid(String circularid) {
        this.circularid = circularid;
    }

    public Date getCurrentdate() {
        return currentdate;
    }

    public void setCurrentdate(Date currentdate) {
        this.currentdate = currentdate;
    }

    public String getCirculartype() {
        return circulartype;
    }

    public void setCirculartype(String circulartype) {
        this.circulartype = circulartype;
    }

    public Date getCirculardate() {
        return circulardate;
    }

    public void setCirculardate(Date circulardate) {
        this.circulardate = circulardate;
    }

    public String getCircularparticular() {
        return circularparticular;
    }

    public void setCircularparticular(String circularparticular) {
        this.circularparticular = circularparticular;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
