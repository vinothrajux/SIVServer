package com.sivserver.example.student;

import com.sivserver.example.teachingstaff.ChildsPickupPlaySchool;
import com.sivserver.example.teachingstaff.StudentAttendanceDetailPlaySchool;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Seetha on 02-Apr-18.
 */
@Entity
@Table(name="schoolstudentbaseinformation")
public class SchoolStudentBaseInformation {

    @Id
    @Column(name="registernumber")
    private String registernumber;

    private String candidatename;

    private String standardstudying;

    private String section;

    private String academicyear;

    private String studentstatus;

    private String loginuser;

    @NaturalId
    private String instituteregisternumber;

    @NaturalId
    private String emisno;

    private Integer instituteid;


//    @OneToOne
//    @JoinColumn(name="student_base_registernumber",nullable=false,referencedColumnName = "registernumber")
//    private SchoolStudentPersonalInformation school_student_personal_regno;

//    @OneToMany
//    @JoinColumn(name="registernumber",referencedColumnName = "registernumber")
//    private List<StudentAttendanceDetailPlaySchool> studentAttendanceDetailPlaySchoolRegno;
//
//    @OneToMany
//    @JoinColumn(name="registernumber",referencedColumnName = "registernumber")
//    private List<ChildsPickupPlaySchool> childsPickupPlaySchoolRegno;


    public SchoolStudentBaseInformation() {
    }

    public SchoolStudentBaseInformation(String registernumber) {
        this.registernumber = registernumber;
    }

    public String getRegisternumber() {
        return registernumber;
    }

    public SchoolStudentBaseInformation setRegisternumber(String registernumber) {
        this.registernumber = registernumber;
        return this;
    }

    public String getCandidatename() {
        return candidatename;
    }

    public SchoolStudentBaseInformation setCandidatename(String candidatename) {
        this.candidatename = candidatename;
        return this;
    }

    public String getStandardstudying() {
        return standardstudying;
    }

    public SchoolStudentBaseInformation setStandardstudying(String standardstudying) {
        this.standardstudying = standardstudying;
        return this;
    }

    public String getSection() {
        return section;
    }

    public SchoolStudentBaseInformation setSection(String section) {
        this.section = section;
        return this;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public SchoolStudentBaseInformation setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
        return this;
    }

    public String getStudentstatus() {
        return studentstatus;
    }

    public SchoolStudentBaseInformation setStudentstatus(String studentstatus) {
        this.studentstatus = studentstatus;
        return this;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public SchoolStudentBaseInformation setLoginuser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }

    public String getInstituteregisternumber() {
        return instituteregisternumber;
    }

    public SchoolStudentBaseInformation setInstituteregisternumber(String instituteregisternumber) {
        this.instituteregisternumber = instituteregisternumber;
        return this;
    }

    public String getEmisno() {
        return emisno;
    }

    public SchoolStudentBaseInformation setEmisno(String emisno) {
        this.emisno = emisno;
        return this;
    }

    public Integer getInstituteid() {
        return instituteid;
    }

    public SchoolStudentBaseInformation setInstituteid(Integer instituteid) {
        this.instituteid = instituteid;
        return this;
    }

//    public SchoolStudentPersonalInformation getSchool_student_personal_regno() {
//        return school_student_personal_regno;
//    }
//
//    public SchoolStudentBaseInformation setSchool_student_personal_regno(SchoolStudentPersonalInformation school_student_personal_regno) {
//        this.school_student_personal_regno = school_student_personal_regno;
//        return this;
//    }

//    public List<StudentAttendanceDetailPlaySchool> getStudentAttendanceDetailPlaySchoolRegno() {
//        return studentAttendanceDetailPlaySchoolRegno;
//    }
//
//    public void setStudentAttendanceDetailPlaySchoolRegno(List<StudentAttendanceDetailPlaySchool> studentAttendanceDetailPlaySchoolRegno) {
//        this.studentAttendanceDetailPlaySchoolRegno = studentAttendanceDetailPlaySchoolRegno;
//    }
//
//    public List<ChildsPickupPlaySchool> getChildsPickupPlaySchoolRegno() {
//        return childsPickupPlaySchoolRegno;
//    }
//
//    public void setChildsPickupPlaySchoolRegno(List<ChildsPickupPlaySchool> childsPickupPlaySchoolRegno) {
//        this.childsPickupPlaySchoolRegno = childsPickupPlaySchoolRegno;
//    }
}
