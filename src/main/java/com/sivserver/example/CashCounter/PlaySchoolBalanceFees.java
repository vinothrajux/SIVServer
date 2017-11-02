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

    private Long admissionfees;

    private Long transportfees;

    private Long total_admission_fees;

    private Date admission_fees_due_date;

    private Long term1fees;

    private Long term1transportfees;

    private Long total_term1_fees;

    private Date term1_fees_due_date;

    private Long term2fees;

    private Long term2transportfees;

    private Long total_term2_fees;

    private Date term2_fees_due_date;

    private Long grand_total_fees;

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

    public Long getAdmissionfees() {
        return admissionfees;
    }

    public PlaySchoolBalanceFees setAdmissionfees(Long admissionfees) {
        this.admissionfees = admissionfees;
        return this;
    }

    public Long getTransportfees() {
        return transportfees;
    }

    public PlaySchoolBalanceFees setTransportfees(Long transportfees) {
        this.transportfees = transportfees;
        return this;
    }

    public Long getTotal_admission_fees() {
        return total_admission_fees;
    }

    public PlaySchoolBalanceFees setTotal_admission_fees(Long total_admission_fees) {
        this.total_admission_fees = total_admission_fees;
        return this;
    }

    public Date getAdmission_fees_due_date() {
        return admission_fees_due_date;
    }

    public PlaySchoolBalanceFees setAdmission_fees_due_date(Date admission_fees_due_date) {
        this.admission_fees_due_date = admission_fees_due_date;
        return this;
    }

    public Long getTerm1fees() {
        return term1fees;
    }

    public PlaySchoolBalanceFees setTerm1fees(Long term1fees) {
        this.term1fees = term1fees;
        return this;
    }

    public Long getTerm1transportfees() {
        return term1transportfees;
    }

    public PlaySchoolBalanceFees setTerm1transportfees(Long term1transportfees) {
        this.term1transportfees = term1transportfees;
        return this;
    }

    public Long getTotal_term1_fees() {
        return total_term1_fees;
    }

    public PlaySchoolBalanceFees setTotal_term1_fees(Long total_term1_fees) {
        this.total_term1_fees = total_term1_fees;
        return this;
    }

    public Date getTerm1_fees_due_date() {
        return term1_fees_due_date;
    }

    public PlaySchoolBalanceFees setTerm1_fees_due_date(Date term1_fees_due_date) {
        this.term1_fees_due_date = term1_fees_due_date;
        return this;
    }

    public Long getTerm2fees() {
        return term2fees;
    }

    public PlaySchoolBalanceFees setTerm2fees(Long term2fees) {
        this.term2fees = term2fees;
        return this;
    }

    public Long getTerm2transportfees() {
        return term2transportfees;
    }

    public PlaySchoolBalanceFees setTerm2transportfees(Long term2transportfees) {
        this.term2transportfees = term2transportfees;
        return this;
    }

    public Long getTotal_term2_fees() {
        return total_term2_fees;
    }

    public PlaySchoolBalanceFees setTotal_term2_fees(Long total_term2_fees) {
        this.total_term2_fees = total_term2_fees;
        return this;
    }

    public Date getTerm2_fees_due_date() {
        return term2_fees_due_date;
    }

    public PlaySchoolBalanceFees setTerm2_fees_due_date(Date term2_fees_due_date) {
        this.term2_fees_due_date = term2_fees_due_date;
        return this;
    }

    public Long getGrand_total_fees() {
        return grand_total_fees;
    }

    public PlaySchoolBalanceFees setGrand_total_fees(Long grand_total_fees) {
        this.grand_total_fees = grand_total_fees;
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
