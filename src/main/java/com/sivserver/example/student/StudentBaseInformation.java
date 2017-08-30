package com.sivserver.example.student;

import com.sivserver.example.admission.StudentPersonalInformation;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
//import java.util.Date;

/**
 * Created by Seetha on 28-Jun-17.
 */
@Entity
@Table(name = "studentbaseinformation")

public class StudentBaseInformation {

    public StudentBaseInformation() {
    }

    public String getRegNo(){
        return regno;
    }
    public StudentBaseInformation setRegNo(String regno) {
        this.regno = regno;
        return this;
    }

    public String getAdmissionNo() {return admissionno;}

    public StudentBaseInformation setAdmissionNo(String admissionno) {
        this.admissionno = admissionno;
        return this;
    }

    public String getStudentName() {
        return name;
    }
    public StudentBaseInformation setStudentName(String name) {
        this.name = name;
        return this;
    }

    public String getSemester() {
        return semester;
    }
    public StudentBaseInformation setSemester(String semester) {
        this.semester = semester;
        return this;
    }

    public String getBranch() {
        return branch;
    }
    public StudentBaseInformation setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    public String getBranchcode() {
        return branchcode;
    }
    public StudentBaseInformation setBranchcode(String branchcode) {
        this.branchcode = branchcode;
        return this;
    }

    public String getBatch() {
        return batch;
    }
    public StudentBaseInformation setBatch(String batch) {
        this.batch = batch;
        return this;
    }

    public String getScheme() {
        return scheme;
    }
    public StudentBaseInformation setScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    public String getAcademicYear() {
        return academicyear;
    }
    public StudentBaseInformation setAcademicYear(String academicyear) {
        this.academicyear = academicyear;
        return this;
    }

    public String getStudentType() {
        return studenttype;
    }
    public StudentBaseInformation setStudentType(String studenttype) {
        this.studenttype = studenttype;
        return this;
    }

    public String getPoto() {
        return poto;
    }
    public StudentBaseInformation setPoto(String poto) {
        this.poto = poto;
        return this;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public StudentBaseInformation setLoginUser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }

    public StudentPersonalInformation getStudent_personal_regno() {
        return student_personal_regno;
    }

    public StudentBaseInformation setStudent_personal_regno(StudentPersonalInformation student_personal_regno) {
        this.student_personal_regno = student_personal_regno;
        return this;
    }

    @Id
    @Column(name="regno")
    private String regno;


    private String admissionno;


    private String name;


    private String semester;


    private String branch;


    private String branchcode;


    private String batch;


    private String scheme;


    private String academicyear;


    private String studenttype;


    private String poto;


    private String loginuser;

    @OneToOne
    @JoinColumn(name="student_base_regno",nullable=false,referencedColumnName = "regno")
    private StudentPersonalInformation student_personal_regno;


}
