package com.sivserver.example.hostel;

import com.sivserver.example.student.StudentBaseInformation;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by GBCorp on 18/07/2017.
 */
@Entity
@Table(name = "hostelstudentdetail")

public class HostelStudentDetail {



    @Id
    @Column(name="regno")
    private String regno;

    private String admissionno;

    private String branchcode;

    private String batch;

    private Integer semester;

    private String academicyear;

    private String guardian1name;

    private String guardian1address1;

    private String guardian1address2;

    private String guardian1area;

    private String guardian1pincode;

    private String guardian1state;

    private String guardian1mobile;

    private String guardian1altmobile;

    private String guardian1email;

    private String guardian1altemail;

    private String guardian2name;

    private String guardian2address1;

    private String guardian2address2;

    private String guardian2area;

    private String guardian2pincode;

    private String guardian2state;

    private String guardian2mobile;

    private String guardian2altmobile;

    private String guardian2email;

    private String guardian2altemail;

    private String previoushostelexperience;

    private String previoushostelname;

    private String previoushosteladdress1;

    private String previoushosteladdress2;

    private String previoushostelarea;

    private String previoushostelpincode;

    private String previoushostelstate;

    private String previoushostelmobile;

    private String previoushostelaltmobile;

    private String previoushostelemail;

    private String previoushostelaltemail;

    private String loginuser;

    @OneToOne
    @JoinColumn(name="student_base_regno",nullable=false,referencedColumnName = "regno")
    private StudentBaseInformation student_base_regno;

    @OneToMany
    @JoinColumn(name="regno",referencedColumnName = "regno")
    private List<HostelStudentLeaveDetail> hostelStudentLeaveDetail_regno;

    @OneToMany
    @JoinColumn(name="regno",referencedColumnName = "regno")
    private List<HostelStudentVisitorDetail> hostelStudentVisitorDetail_regno;

    public HostelStudentDetail() {
    }

    public HostelStudentDetail(String regno) {
        this.regno = regno;
    }

    public String getRegno() {
        return regno;
    }

    public HostelStudentDetail setRegno(String regno) {
        this.regno = regno;
        return this;
    }

    public String getAdmissionno() {
        return admissionno;
    }

    public HostelStudentDetail setAdmissionno(String admissionno) {
        this.admissionno = admissionno;
        return this;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public HostelStudentDetail setBranchcode(String branchcode) {
        this.branchcode = branchcode;
        return this;
    }

    public String getBatch() {
        return batch;
    }

    public HostelStudentDetail setBatch(String batch) {
        this.batch = batch;
        return this;
    }

    public Integer getSemester() {
        return semester;
    }

    public HostelStudentDetail setSemester(Integer semester) {
        this.semester = semester;
        return this;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public HostelStudentDetail setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
        return this;
    }

    public String getGuardian1name() {
        return guardian1name;
    }

    public HostelStudentDetail setGuardian1name(String guardian1name) {
        this.guardian1name = guardian1name;
        return this;
    }

    public String getGuardian1address1() {
        return guardian1address1;
    }

    public HostelStudentDetail setGuardian1address1(String guardian1address1) {
        this.guardian1address1 = guardian1address1;
        return this;
    }

    public String getGuardian1address2() {
        return guardian1address2;
    }

    public HostelStudentDetail setGuardian1address2(String guardian1address2) {
        this.guardian1address2 = guardian1address2;
        return this;
    }

    public String getGuardian1area() {
        return guardian1area;
    }

    public HostelStudentDetail setGuardian1area(String guardian1area) {
        this.guardian1area = guardian1area;
        return this;
    }

    public String getGuardian1pincode() {
        return guardian1pincode;
    }

    public HostelStudentDetail setGuardian1pincode(String guardian1pincode) {
        this.guardian1pincode = guardian1pincode;
        return this;
    }

    public String getGuardian1state() {
        return guardian1state;
    }

    public HostelStudentDetail setGuardian1state(String guardian1state) {
        this.guardian1state = guardian1state;
        return this;
    }

    public String getGuardian1mobile() {
        return guardian1mobile;
    }

    public HostelStudentDetail setGuardian1mobile(String guardian1mobile) {
        this.guardian1mobile = guardian1mobile;
        return this;
    }

    public String getGuardian1altmobile() {
        return guardian1altmobile;
    }

    public HostelStudentDetail setGuardian1altmobile(String guardian1altmobile) {
        this.guardian1altmobile = guardian1altmobile;
        return this;
    }

    public String getGuardian1email() {
        return guardian1email;
    }

    public HostelStudentDetail setGuardian1email(String guardian1email) {
        this.guardian1email = guardian1email;
        return this;
    }

    public String getGuardian1altemail() {
        return guardian1altemail;
    }

    public HostelStudentDetail setGuardian1altemail(String guardian1altemail) {
        this.guardian1altemail = guardian1altemail;
        return this;
    }

    public String getGuardian2name() {
        return guardian2name;
    }

    public HostelStudentDetail setGuardian2name(String guardian2name) {
        this.guardian2name = guardian2name;
        return this;
    }

    public String getGuardian2address1() {
        return guardian2address1;
    }

    public HostelStudentDetail setGuardian2address1(String guardian2address1) {
        this.guardian2address1 = guardian2address1;
        return this;
    }

    public String getGuardian2address2() {
        return guardian2address2;
    }

    public HostelStudentDetail setGuardian2address2(String guardian2address2) {
        this.guardian2address2 = guardian2address2;
        return this;
    }

    public String getGuardian2area() {
        return guardian2area;
    }

    public HostelStudentDetail setGuardian2area(String guardian2area) {
        this.guardian2area = guardian2area;
        return this;
    }

    public String getGuardian2pincode() {
        return guardian2pincode;
    }

    public HostelStudentDetail setGuardian2pincode(String guardian2pincode) {
        this.guardian2pincode = guardian2pincode;
        return this;
    }

    public String getGuardian2state() {
        return guardian2state;
    }

    public HostelStudentDetail setGuardian2state(String guardian2state) {
        this.guardian2state = guardian2state;
        return this;
    }

    public String getGuardian2mobile() {
        return guardian2mobile;
    }

    public HostelStudentDetail setGuardian2mobile(String guardian2mobile) {
        this.guardian2mobile = guardian2mobile;
        return this;
    }

    public String getGuardian2altmobile() {
        return guardian2altmobile;
    }

    public HostelStudentDetail setGuardian2altmobile(String guardian2altmobile) {
        this.guardian2altmobile = guardian2altmobile;
        return this;
    }

    public String getGuardian2email() {
        return guardian2email;
    }

    public HostelStudentDetail setGuardian2email(String guardian2email) {
        this.guardian2email = guardian2email;
        return this;
    }

    public String getGuardian2altemail() {
        return guardian2altemail;
    }

    public HostelStudentDetail setGuardian2altemail(String guardian2altemail) {
        this.guardian2altemail = guardian2altemail;
        return this;
    }

    public String getPrevioushostelexperience() {
        return previoushostelexperience;
    }

    public HostelStudentDetail setPrevioushostelexperience(String previoushostelexperience) {
        this.previoushostelexperience = previoushostelexperience;
        return this;
    }

    public String getPrevioushostelname() {
        return previoushostelname;
    }

    public HostelStudentDetail setPrevioushostelname(String previoushostelname) {
        this.previoushostelname = previoushostelname;
        return this;
    }

    public String getPrevioushosteladdress1() {
        return previoushosteladdress1;
    }

    public HostelStudentDetail setPrevioushosteladdress1(String previoushosteladdress1) {
        this.previoushosteladdress1 = previoushosteladdress1;
        return this;
    }

    public String getPrevioushosteladdress2() {
        return previoushosteladdress2;
    }

    public HostelStudentDetail setPrevioushosteladdress2(String previoushosteladdress2) {
        this.previoushosteladdress2 = previoushosteladdress2;
        return this;
    }

    public String getPrevioushostelarea() {
        return previoushostelarea;
    }

    public HostelStudentDetail setPrevioushostelarea(String previoushostelarea) {
        this.previoushostelarea = previoushostelarea;
        return this;
    }

    public String getPrevioushostelpincode() {
        return previoushostelpincode;
    }

    public HostelStudentDetail setPrevioushostelpincode(String previoushostelpincode) {
        this.previoushostelpincode = previoushostelpincode;
        return this;
    }

    public String getPrevioushostelstate() {
        return previoushostelstate;
    }

    public HostelStudentDetail setPrevioushostelstate(String previoushostelstate) {
        this.previoushostelstate = previoushostelstate;
        return this;
    }

    public String getPrevioushostelmobile() {
        return previoushostelmobile;
    }

    public HostelStudentDetail setPrevioushostelmobile(String previoushostelmobile) {
        this.previoushostelmobile = previoushostelmobile;
        return this;
    }

    public String getPrevioushostelaltmobile() {
        return previoushostelaltmobile;
    }

    public HostelStudentDetail setPrevioushostelaltmobile(String previoushostelaltmobile) {
        this.previoushostelaltmobile = previoushostelaltmobile;
        return this;
    }

    public String getPrevioushostelemail() {
        return previoushostelemail;
    }

    public HostelStudentDetail setPrevioushostelemail(String previoushostelemail) {
        this.previoushostelemail = previoushostelemail;
        return this;
    }

    public String getPrevioushostelaltemail() {
        return previoushostelaltemail;
    }

    public HostelStudentDetail setPrevioushostelaltemail(String previoushostelaltemail) {
        this.previoushostelaltemail = previoushostelaltemail;
        return this;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public HostelStudentDetail setLoginuser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }

    public StudentBaseInformation getStudent_base_regno() {
        return student_base_regno;
    }

    public HostelStudentDetail setStudent_base_regno(StudentBaseInformation student_base_regno) {
        this.student_base_regno = student_base_regno;
        return this;
    }

    public List<HostelStudentLeaveDetail> getHostelStudentLeaveDetail_regno() {
        return hostelStudentLeaveDetail_regno;
    }

    public void setHostelStudentLeaveDetail_regno(List<HostelStudentLeaveDetail> hostelStudentLeaveDetail_regno) {
        this.hostelStudentLeaveDetail_regno = hostelStudentLeaveDetail_regno;
    }

    public List<HostelStudentVisitorDetail> getHostelStudentVisitorDetail_regno() {
        return hostelStudentVisitorDetail_regno;
    }

    public void setHostelStudentVisitorDetail_regno(List<HostelStudentVisitorDetail> hostelStudentVisitorDetail_regno) {
        this.hostelStudentVisitorDetail_regno = hostelStudentVisitorDetail_regno;
    }
}
