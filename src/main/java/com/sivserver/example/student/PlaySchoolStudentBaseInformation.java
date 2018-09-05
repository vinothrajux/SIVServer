package com.sivserver.example.student;

import com.sivserver.example.CashCounter.FeesPaymentPlaySchool;
import com.sivserver.example.teachingstaff.ChildsPickupPlaySchool;
import com.sivserver.example.teachingstaff.EmergencyMessagePlaySchool;
import com.sivserver.example.teachingstaff.StudentAttendanceDetailPlaySchool;
import com.sivserver.example.teachingstaff.StudentsMonthlyProgressPlaySchool;
import com.sivserver.example.transport.TransportChangePlaySchool;

import javax.persistence.*;
import java.util.List;

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

    private String standardstudying;

    private String section;

    private String academicyear;

    private String studentstatus;

    private String loginuser;

    private String instituteregisternumber;

    private Integer instituteid;

    @OneToOne
    @JoinColumn(name="student_base_registernumber",nullable=false,referencedColumnName = "registernumber")
    private PlaySchoolStudentPersonalInformation play_school_student_personal_regno;

//    @OneToOne
//    @JoinColumn(name="student_base_registernumber",nullable=false,referencedColumnName = "registernumber")
//    private SchoolStudentPersonalInformation school_student_personal_regno;

    @OneToMany
    @JoinColumn(name="registernumber",referencedColumnName = "registernumber")
    private List<StudentAttendanceDetailPlaySchool> studentAttendanceDetailPlaySchoolRegno;

    @OneToMany
    @JoinColumn(name="registernumber",referencedColumnName = "registernumber")
    private List<FeesPaymentPlaySchool> feesPaymentPlaySchoolRegno;

    @OneToMany
    @JoinColumn(name="registernumber",referencedColumnName = "registernumber")
    private List<TransportChangePlaySchool> transportChangePlaySchoolRegno;

    @OneToMany
    @JoinColumn(name="registernumber",referencedColumnName = "registernumber")
    private List<EmergencyMessagePlaySchool> emergencyMessagePlaySchoolRegno;

    @OneToMany
    @JoinColumn(name="registernumber",referencedColumnName = "registernumber")
    private List<ChildsPickupPlaySchool> childsPickupPlaySchoolRegno;

    @OneToMany
    @JoinColumn(name="registernumber",referencedColumnName = "registernumber")
    private List<StudentsMonthlyProgressPlaySchool> studentsMonthlyProgressPlaySchoolRegno;

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

    public String getStandardstudying() {
        return standardstudying;
    }

    public PlaySchoolStudentBaseInformation setStandardstudying(String standardstudying) {
        this.standardstudying = standardstudying;
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

    public String getStudentstatus() {
        return studentstatus;
    }

    public PlaySchoolStudentBaseInformation setStudentstatus(String studentstatus) {
        this.studentstatus = studentstatus;
        return this;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public PlaySchoolStudentBaseInformation setLoginuser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }

    public String getInstituteregisternumber() {
        return instituteregisternumber;
    }

    public PlaySchoolStudentBaseInformation setInstituteregisternumber(String instituteregisternumber) {
        this.instituteregisternumber = instituteregisternumber;
        return this;
    }

    public Integer getInstituteid() {
        return instituteid;
    }

    public PlaySchoolStudentBaseInformation setInstituteid(Integer instituteid) {
        this.instituteid = instituteid;
        return this;
    }

    public PlaySchoolStudentPersonalInformation getPlay_school_student_personal_regno() {
        return play_school_student_personal_regno;
    }

    public PlaySchoolStudentBaseInformation setPlay_school_student_personal_regno(PlaySchoolStudentPersonalInformation play_school_student_personal_regno) {
        this.play_school_student_personal_regno = play_school_student_personal_regno;
        return this;
    }

//    public SchoolStudentPersonalInformation getSchool_student_personal_regno() {
//        return school_student_personal_regno;
//    }
//
//    public PlaySchoolStudentBaseInformation setSchool_student_personal_regno(SchoolStudentPersonalInformation school_student_personal_regno) {
//        this.school_student_personal_regno = school_student_personal_regno;
//        return this;
//
//    }


    public List<StudentAttendanceDetailPlaySchool> getStudentAttendanceDetailPlaySchoolRegno() {
        return studentAttendanceDetailPlaySchoolRegno;
    }

    public void setStudentAttendanceDetailPlaySchoolRegno(List<StudentAttendanceDetailPlaySchool> studentAttendanceDetailPlaySchoolRegno) {
        this.studentAttendanceDetailPlaySchoolRegno = studentAttendanceDetailPlaySchoolRegno;
    }

    public List<FeesPaymentPlaySchool> getFeesPaymentPlaySchoolRegno() {
        return feesPaymentPlaySchoolRegno;
    }

    public void setFeesPaymentPlaySchoolRegno(List<FeesPaymentPlaySchool> feesPaymentPlaySchoolRegno) {
        this.feesPaymentPlaySchoolRegno = feesPaymentPlaySchoolRegno;
    }

    public List<TransportChangePlaySchool> getTransportChangePlaySchoolRegno() {
        return transportChangePlaySchoolRegno;
    }

    public void setTransportChangePlaySchoolRegno(List<TransportChangePlaySchool> transportChangePlaySchoolRegno) {
        this.transportChangePlaySchoolRegno = transportChangePlaySchoolRegno;
    }

    public List<EmergencyMessagePlaySchool> getEmergencyMessagePlaySchoolRegno() {
        return emergencyMessagePlaySchoolRegno;
    }

    public void setEmergencyMessagePlaySchoolRegno(List<EmergencyMessagePlaySchool> emergencyMessagePlaySchoolRegno) {
        this.emergencyMessagePlaySchoolRegno = emergencyMessagePlaySchoolRegno;
    }

    public List<ChildsPickupPlaySchool> getChildsPickupPlaySchoolRegno() {
        return childsPickupPlaySchoolRegno;
    }

    public void setChildsPickupPlaySchoolRegno(List<ChildsPickupPlaySchool> childsPickupPlaySchoolRegno) {
        this.childsPickupPlaySchoolRegno = childsPickupPlaySchoolRegno;
    }

    public List<StudentsMonthlyProgressPlaySchool> getStudentsMonthlyProgressPlaySchoolRegno() {
        return studentsMonthlyProgressPlaySchoolRegno;
    }

    public void setStudentsMonthlyProgressPlaySchoolRegno(List<StudentsMonthlyProgressPlaySchool> studentsMonthlyProgressPlaySchoolRegno) {
        this.studentsMonthlyProgressPlaySchoolRegno = studentsMonthlyProgressPlaySchoolRegno;
    }

//    public SchoolStudentPersonalInformation getSchool_student_personal_regno() {
//        return school_student_personal_regno;
//    }
//
//    public void setSchool_student_personal_regno(SchoolStudentPersonalInformation school_student_personal_regno) {
//        this.school_student_personal_regno = school_student_personal_regno;
//    }
}
