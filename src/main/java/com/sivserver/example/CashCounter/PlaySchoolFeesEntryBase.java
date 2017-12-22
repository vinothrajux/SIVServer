package com.sivserver.example.CashCounter;

import com.sivserver.example.student.PlaySchoolStudentPersonalInformation;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by GBCorp on 01/11/2017.
 */
@Entity
@Table(name="playschoolfeesentrybase")
public class PlaySchoolFeesEntryBase {
    @Id
    @Column(name="registernumber")
    private String registernumber;

    private Long materialkitfees;

    private Long activityfees;

    private Long tuitionfees;

    private Long totalfees;

    private Long installment1fees;

    private Long installment2fees;

    private Date admissionfeesduedate;

    private String academicyear;

    private String loginuser;

    @OneToOne
    @JoinColumn(name="student_base_registernumber",nullable=false,referencedColumnName = "registernumber")
    private PlaySchoolStudentPersonalInformation play_school_student_personal_regno;

    public PlaySchoolFeesEntryBase() {
    }

    public PlaySchoolFeesEntryBase(String registernumber) {
        this.registernumber = registernumber;
    }

    public String getRegisternumber() {
        return registernumber;
    }

    public PlaySchoolFeesEntryBase setRegisternumber(String registernumber) {
        this.registernumber = registernumber;
        return this;
    }

    public Long getMaterialkitfees() {
        return materialkitfees;
    }

    public PlaySchoolFeesEntryBase setMaterialkitfees(Long materialkitfees) {
        this.materialkitfees = materialkitfees;
        return this;
    }

    public Long getActivityfees() {
        return activityfees;
    }

    public PlaySchoolFeesEntryBase setActivityfees(Long activityfees) {
        this.activityfees = activityfees;
        return this;
    }

    public Long getTuitionfees() {
        return tuitionfees;
    }

    public PlaySchoolFeesEntryBase setTuitionfees(Long tuitionfees) {
        this.tuitionfees = tuitionfees;
        return this;
    }

    public Long getTotalfees() {
        return totalfees;
    }

    public PlaySchoolFeesEntryBase setTotalfees(Long totalfees) {
        this.totalfees = totalfees;
        return this;
    }

    public Long getInstallment1fees() {
        return installment1fees;
    }

    public PlaySchoolFeesEntryBase setInstallment1fees(Long installment1fees) {
        this.installment1fees = installment1fees;
        return this;
    }

    public Long getInstallment2fees() {
        return installment2fees;
    }

    public PlaySchoolFeesEntryBase setInstallment2fees(Long installment2fees) {
        this.installment2fees = installment2fees;
        return this;
    }

    public Date getAdmissionfeesduedate() {
        return admissionfeesduedate;
    }

    public PlaySchoolFeesEntryBase setAdmissionfeesduedate(Date admissionfeesduedate) {
        this.admissionfeesduedate = admissionfeesduedate;
        return this;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public PlaySchoolFeesEntryBase setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
        return this;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public PlaySchoolFeesEntryBase setLoginuser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }

    public PlaySchoolStudentPersonalInformation getPlay_school_student_personal_regno() {
        return play_school_student_personal_regno;
    }

    public PlaySchoolFeesEntryBase setPlay_school_student_personal_regno(PlaySchoolStudentPersonalInformation play_school_student_personal_regno) {
        this.play_school_student_personal_regno = play_school_student_personal_regno;
        return this;
    }
}
