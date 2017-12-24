package com.sivserver.example.CashCounter;

import com.sivserver.example.student.PlaySchoolStudentPersonalInformation;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by GBCorp on 01/11/2017.
 */
@Entity
@Table(name="playschoolbalancefeestable")
public class PlaySchoolBalanceFees {

    @Id
    @Column(name="registernumber")
    private String registernumber;

    private Double registrationfees;

    private Double materialkitfees;

    private Double activityfees;

    private Double tuitionfees;

    private Double totalfees;

    private Double installment1fees;

    private Double installment2fees;

    private Date installment1duedate;

    private Date installment2duedate;

    private String academicyear;

    private String loginuser;

    @OneToOne
    @JoinColumn(name="student_base_registernumber",nullable=false,referencedColumnName = "registernumber")
    private PlaySchoolStudentPersonalInformation play_school_student_personal_regno;

    public PlaySchoolBalanceFees() {
    }

    public PlaySchoolBalanceFees(String registernumber) {
        this.registernumber = registernumber;
    }


    public String getRegisternumber() {
        return registernumber;
    }

    public PlaySchoolBalanceFees setRegisternumber(String registernumber) {
        this.registernumber = registernumber;
        return this;
    }

    public Double getRegistrationfees() {
        return registrationfees;
    }

    public PlaySchoolBalanceFees setRegistrationfees(Double registrationfees) {
        this.registrationfees = registrationfees;
        return this;
    }

    public Double getMaterialkitfees() {
        return materialkitfees;
    }

    public PlaySchoolBalanceFees setMaterialkitfees(Double materialkitfees) {
        this.materialkitfees = materialkitfees;
        return this;
    }

    public Double getActivityfees() {
        return activityfees;
    }

    public PlaySchoolBalanceFees setActivityfees(Double activityfees) {
        this.activityfees = activityfees;
        return this;
    }

    public Double getTuitionfees() {
        return tuitionfees;
    }

    public PlaySchoolBalanceFees setTuitionfees(Double tuitionfees) {
        this.tuitionfees = tuitionfees;
        return this;
    }

    public Double getTotalfees() {
        return totalfees;
    }

    public PlaySchoolBalanceFees setTotalfees(Double totalfees) {
        this.totalfees = totalfees;
        return this;
    }

    public Double getInstallment1fees() {
        return installment1fees;
    }

    public PlaySchoolBalanceFees setInstallment1fees(Double installment1fees) {
        this.installment1fees = installment1fees;
        return this;
    }

    public Double getInstallment2fees() {
        return installment2fees;
    }

    public PlaySchoolBalanceFees setInstallment2fees(Double installment2fees) {
        this.installment2fees = installment2fees;
        return this;
    }


    public Date getInstallment1duedate() {
        return installment1duedate;
    }

    public PlaySchoolBalanceFees setInstallment1duedate(Date installment1duedate) {
        this.installment1duedate = installment1duedate;
        return this;
    }

    public Date getInstallment2duedate() {
        return installment2duedate;
    }

    public PlaySchoolBalanceFees setInstallment2duedate(Date installment2duedate) {
        this.installment2duedate = installment2duedate;
        return this;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public PlaySchoolBalanceFees setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
        return this;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public PlaySchoolBalanceFees setLoginuser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }

    public PlaySchoolStudentPersonalInformation getPlay_school_student_personal_regno() {
        return play_school_student_personal_regno;
    }

    public PlaySchoolBalanceFees setPlay_school_student_personal_regno(PlaySchoolStudentPersonalInformation play_school_student_personal_regno) {
        this.play_school_student_personal_regno = play_school_student_personal_regno;
        return this;
    }
}
