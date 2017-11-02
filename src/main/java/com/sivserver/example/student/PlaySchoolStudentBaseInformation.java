package com.sivserver.example.student;

import com.sivserver.example.admission.StudentPersonalInformation;

import javax.persistence.*;

/**
 * Created by GBCorp on 01/11/2017.
 */
@Entity
@Table(name="playschoolstudentbaseinformation")
public class PlaySchoolStudentBaseInformation {
    @Id
    @Column(name="registernumber")
    private String registernumber;

    private String candidatename;

    private String class_studying;

    private String section;

    private String academicyear;

    private String student_status;

    private String loginuser;

    @OneToOne
    @JoinColumn(name="student_base_registernumber",nullable=false,referencedColumnName = "registernumber")
    private PlaySchoolStudentPersonalInformation play_school_student_personal_regno;

    public PlaySchoolStudentBaseInformation() {
    }

    public PlaySchoolStudentBaseInformation(String registernumber) {
        this.registernumber = registernumber;
    }

    public String getRegisternumber() {
        return registernumber;
    }

    public PlaySchoolStudentBaseInformation setRegisternumber(String registernumber) {
        this.registernumber = registernumber;
        return this;
    }

    public String getCandidatename() {
        return candidatename;
    }

    public PlaySchoolStudentBaseInformation setCandidatename(String candidatename) {
        this.candidatename = candidatename;
        return this;
    }

    public String getClass_studying() {
        return class_studying;
    }

    public PlaySchoolStudentBaseInformation setClass_studying(String class_studying) {
        this.class_studying = class_studying;
        return this;
    }

    public String getSection() {
        return section;
    }

    public PlaySchoolStudentBaseInformation setSection(String section) {
        this.section = section;
        return this;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public PlaySchoolStudentBaseInformation setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
        return this;
    }

    public String getStudent_status() {
        return student_status;
    }

    public PlaySchoolStudentBaseInformation setStudent_status(String student_status) {
        this.student_status = student_status;
        return this;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public PlaySchoolStudentBaseInformation setLoginuser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }

    public PlaySchoolStudentPersonalInformation getPlay_school_student_personal_regno() {
        return play_school_student_personal_regno;
    }

    public PlaySchoolStudentBaseInformation setPlay_school_student_personal_regno(PlaySchoolStudentPersonalInformation play_school_student_personal_regno) {
        this.play_school_student_personal_regno = play_school_student_personal_regno;
        return this;
    }
}
