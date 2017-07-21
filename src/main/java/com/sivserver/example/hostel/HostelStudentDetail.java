package com.sivserver.example.hostel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by GBCorp on 18/07/2017.
 */
@Entity
@Table(name = "hostelstudentdetail")

public class HostelStudentDetail {
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

    public String getGuardian1name(){
        return guardian1name;
    }
    public void setGuardian1name(String guardian1name) {
        this.guardian1name = guardian1name;
    }

    public String getGuardian1address1(){
        return guardian1address1;
    }
    public void setGuardian1address1(String guardian1address1) {
        this.guardian1address1 = guardian1address1;
    }

    public String getGuardian1address2(){
        return guardian1address2;
    }
    public void setGuardian1address2(String guardian1address2) {
        this.guardian1address2 = guardian1address2;
    }

    public String getGuardian1area(){
        return guardian1area;
    }
    public void setGuardian1area(String guardian1area) {
        this.guardian1area = guardian1area;
    }

    public String getGuardian1pincode(){
        return guardian1pincode;
    }
    public void setGuardian1pincode(String guardian1pincode) {
        this.guardian1pincode = guardian1pincode;
    }

    public String getGuardian1state(){
        return guardian1state;
    }
    public void setGuardian1state(String guardian1state) {
        this.guardian1state = guardian1state;
    }

    public String getGuardian1mobile(){
        return guardian1mobile;
    }
    public void setGuardian1mobile(String guardian1mobile) {
        this.guardian1mobile = guardian1mobile;
    }

    public String getGuardian1altmobile(){
        return guardian1altmobile;
    }
    public void setGuardian1altmobile(String guardian1altmobile) {
        this.guardian1altmobile = guardian1altmobile;
    }

    public String getGuardian1email(){
        return guardian1email;
    }
    public void setGuardian1email(String guardian1email) {
        this.guardian1email = guardian1email;
    }

    public String getGuardian1altemail(){
        return guardian1altemail;
    }
    public void setGuardian1altemail(String guardian1altemail) {
        this.guardian1altemail = guardian1altemail;
    }

    public String getGuardian2name(){
        return guardian2name;
    }
    public void setGuardian2name(String guardian2name) {
        this.guardian2name = guardian2name;
    }

    public String getGuardian2address1(){
        return guardian2address1;
    }
    public void setGuardian2address1(String guardian2address1) {
        this.guardian2address1 = guardian2address1;
    }

    public String getGuardian2address2(){
        return guardian2address2;
    }
    public void setGuardian2address2(String guardian2address2) {
        this.guardian2address2 = guardian2address2;
    }

    public String getGuardian2area(){
        return guardian2area;
    }
    public void setGuardian2area(String guardian2area) {
        this.guardian2area = guardian2area;
    }

    public String getGuardian2pincode(){
        return guardian2pincode;
    }
    public void setGuardian2pincode(String guardian2pincode) {
        this.guardian2pincode = guardian2pincode;
    }

    public String getGuardian2state(){
        return guardian2state;
    }
    public void setGuardian2state(String guardian2state) {
        this.guardian2state = guardian2state;
    }

    public String getGuardian2mobile(){
        return guardian2mobile;
    }
    public void setGuardian2mobile(String guardian2mobile) {
        this.guardian2mobile = guardian2mobile;
    }

    public String getGuardian2altmobile(){
        return guardian2altmobile;
    }
    public void setGuardian2altmobile(String guardian2altmobile) {
        this.guardian2altmobile = guardian2altmobile;
    }

    public String getGuardian2email(){
        return guardian2email;
    }
    public void setGuardian2email(String guardian2email) {
        this.guardian2email = guardian2email;
    }

    public String getGuardian2altemail(){
        return guardian2altemail;
    }
    public void setGuardian2altemail(String guardian2altemail) {
        this.guardian2altemail = guardian2altemail;
    }

    public String getPrevioushostelexperience(){
        return previoushostelexperience;
    }
    public void setPrevioushostelexperience(String previoushostelexperience) {
        this.previoushostelexperience = previoushostelexperience;
    }

    public String getPrevioushostelname(){
        return previoushostelname;
    }
    public void setPrevioushostelname(String previoushostelname) {
        this.previoushostelname = previoushostelname;
    }

    public String getPrevioushosteladdress1(){
        return previoushosteladdress1;
    }
    public void setPrevioushosteladdress1(String previoushosteladdress1) {
        this.previoushosteladdress1 = previoushosteladdress1;
    }

    public String getPrevioushosteladdress2(){
        return previoushosteladdress2;
    }
    public void setPrevioushosteladdress2(String previoushosteladdress2) {
        this.previoushosteladdress2 = previoushosteladdress2;
    }

    public String getPrevioushostelarea(){
        return previoushostelarea;
    }
    public void setPrevioushostelarea(String previoushostelarea) {
        this.previoushostelarea = previoushostelarea;
    }

    public String getPrevioushostelpincode(){
        return previoushostelpincode;
    }
    public void setPrevioushostelpincode(String previoushostelpincode) {
        this.previoushostelpincode = previoushostelpincode;
    }

    public String getPrevioushostelstate(){
        return previoushostelstate;
    }
    public void setPrevioushostelstate(String previoushostelstate) {
        this.previoushostelstate = previoushostelstate;
    }

    public String getPrevioushostelmobile(){
        return previoushostelmobile;
    }
    public void setPrevioushostelmobile(String previoushostelmobile) {
        this.previoushostelmobile = previoushostelmobile;
    }

    public String getPrevioushostelaltmobile(){
        return previoushostelaltmobile;
    }
    public void setPrevioushostelaltmobile(String previoushostelaltmobile) {
        this.previoushostelaltmobile = previoushostelaltmobile;
    }

    public String getPrevioushostelemail(){
        return previoushostelemail;
    }
    public void setPrevioushostelemail(String previoushostelemail) {
        this.previoushostelemail = previoushostelemail;
    }

    public String getPrevioushostelaltemail(){
        return previoushostelaltemail;
    }
    public void setPrevioushostelaltemail(String previoushostelaltemail) {
        this.previoushostelaltemail = previoushostelaltemail;
    }

    public String getLoginuser(){
        return loginuser;
    }
    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }

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
    private String guardian1name;

    @NotNull
    private String guardian1address1;

    @NotNull
    private String guardian1address2;

    @NotNull
    private String guardian1area;

    @NotNull
    private String guardian1pincode;

    @NotNull
    private String guardian1state;

    @NotNull
    private String guardian1mobile;

    @NotNull
    private String guardian1altmobile;

    @NotNull
    private String guardian1email;

    @NotNull
    private String guardian1altemail;

    @NotNull
    private String guardian2name;

    @NotNull
    private String guardian2address1;

    @NotNull
    private String guardian2address2;

    @NotNull
    private String guardian2area;

    @NotNull
    private String guardian2pincode;

    @NotNull
    private String guardian2state;

    @NotNull
    private String guardian2mobile;

    @NotNull
    private String guardian2altmobile;

    @NotNull
    private String guardian2email;

    @NotNull
    private String guardian2altemail;

    @NotNull
    private String previoushostelexperience;

    @NotNull
    private String previoushostelname;

    @NotNull
    private String previoushosteladdress1;

    @NotNull
    private String previoushosteladdress2;

    @NotNull
    private String previoushostelarea;

    @NotNull
    private String previoushostelpincode;

    @NotNull
    private String previoushostelstate;

    @NotNull
    private String previoushostelmobile;

    @NotNull
    private String previoushostelaltmobile;

    @NotNull
    private String previoushostelemail;

    @NotNull
    private String previoushostelaltemail;

    @NotNull
    private String loginuser;

}
