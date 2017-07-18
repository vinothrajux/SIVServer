package com.sivserver.example.sports;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 17/07/2017.
 */
@Entity
@Table(name = "sportspddetail")

public class SportsPdDetail {
    public String getInstitutecode() {
        return institutecode;
    }

    public void setInstitutecode(String institutecode) {
        this.institutecode = institutecode;
    }

    public String getInstitutename() {
        return institutename;
    }

    public void setInstitutename(String institutename) {
        this.institutename = institutename;
    }

    public String getInstituteaddress1() {
        return instituteaddress1;
    }

    public void setInstituteaddress1(String instituteaddress1) {
        this.instituteaddress1 = instituteaddress1;
    }

    public String getInstituteaddress2() {
        return instituteaddress2;
    }

    public void setInstituteaddress2(String instituteaddress2) {
        this.instituteaddress2 = instituteaddress2;
    }


    public String getInstitutearea() {
        return institutearea;
    }

    public void setInstitutearea(String institutearea) {
        this.institutearea = institutearea;
    }

    public String getInstitutepin() {
        return institutepin;
    }

    public void setInstitutepin(String institutepin) {
        this.institutepin = institutepin;
    }

    public String getPhysicaldirector1name() {
        return physicaldirector1name;
    }

    public void setPhysicaldirector1name(String physicaldirector1name) {
        this.physicaldirector1name = physicaldirector1name;
    }

    public String getPhysicaldirector1mobile() {
        return physicaldirector1mobile;
    }

    public void setPhysicaldirector1mobile(String physicaldirector1mobile) {
        this.physicaldirector1mobile = physicaldirector1mobile;
    }

    public String getPhysicaldirector1altmobile() {
        return physicaldirector1altmobile;
    }

    public void setPhysicaldirector1altmobile(String physicaldirector1altmobile) {
        this.physicaldirector1altmobile = physicaldirector1altmobile;
    }

    public String getPhysicaldirector1email() {
        return physicaldirector1email;
    }

    public void setPhysicaldirector1email(String physicaldirector1email) {
        this.physicaldirector1email = physicaldirector1email;
    }

    public String getPhysicaldirector1altemail() {
        return physicaldirector1altemail;
    }

    public void setPhysicaldirector1altemail(String physicaldirector1altemail) {
        this.physicaldirector1altemail = physicaldirector1altemail;
    }

    public String getPhysicaldirector2name() {
        return physicaldirector2name;
    }

    public void setPhysicaldirector2name(String physicaldirector2name) {
        this.physicaldirector2name = physicaldirector2name;
    }

    public String getPhysicaldirector2mobile() {
        return physicaldirector2mobile;
    }

    public void setPhysicaldirector2mobile(String physicaldirector2mobile) {
        this.physicaldirector2mobile = physicaldirector2mobile;
    }

    public String getPhysicaldirector2altmobile() {
        return physicaldirector2altmobile;
    }

    public void setPhysicaldirector2altmobile(String physicaldirector2altmobile) {
        this.physicaldirector2altmobile = physicaldirector2altmobile;
    }

    public String getPhysicaldirector2email() {
        return physicaldirector2email;
    }

    public void setPhysicaldirector2email(String physicaldirector2email) {
        this.physicaldirector2email = physicaldirector2email;
    }

    public String getPhysicaldirector2altemail() {
        return physicaldirector2altemail;
    }

    public void setPhysicaldirector2altemail(String physicaldirector2altemail) {
        this.physicaldirector2altemail = physicaldirector2altemail;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }


    @Id
    private String institutecode;

    @NotNull
    private String institutename;

    @NotNull
    private String instituteaddress1;

    @NotNull
    private String instituteaddress2;

    @NotNull
    private String institutearea;

    @NotNull
    private String institutepin;

    @NotNull
    private String physicaldirector1name;

    @NotNull
    private String physicaldirector1mobile;

    @NotNull
    private String physicaldirector1altmobile;

    @NotNull
    private String physicaldirector1email;

    @NotNull
    private String physicaldirector1altemail;

    @NotNull
    private String physicaldirector2name;

    @NotNull
    private String physicaldirector2mobile;

    @NotNull
    private String physicaldirector2altmobile;

    @NotNull
    private String physicaldirector2email;

    @NotNull
    private String physicaldirector2altemail;

    @NotNull
    private String loginuser;


}

