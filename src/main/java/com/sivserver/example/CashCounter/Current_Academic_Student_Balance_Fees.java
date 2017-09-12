package com.sivserver.example.CashCounter;

import com.sivserver.example.student.StudentBaseInformation;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by GBCorp on 10/09/2017.
 */
@Entity
@Table(name = "current_academic_student_balance_fees")

public class Current_Academic_Student_Balance_Fees {

    @Id
    @Column(name="regno")
    private String regno;

    private String branchcode;

    private String batch;

    private String semester;

    private Long admissionfeesbalance;

    private Long tuitionfeesbalance;

    private Long transportFeesbalance;

    private Long hostelfeesbalance;

    private Long foodfeesbalance;

    private Long textbookstationaryfeesbalance;

    private Long miscellaneousfeesbalance;

    private Long specialfeesbalance;

    private Long penaltyfeesbalance;

    private Long previousbalancefeesbalance;

    private Long groupinsurancefeesbalance;

    private Long othersfeesbalance;

    private Long totalfeesbalance;

    private String academicyear;

    private String loginuser;

    @OneToOne
    @JoinColumn(name="student_base_regno",nullable=false,referencedColumnName = "regno")
    private Current_Academic_Student_Actual_Fees current_Academic_Student_Actual_Fees_regno;


    public Current_Academic_Student_Balance_Fees() {
    }

    public String getRegno() {
        return regno;
    }

    public Current_Academic_Student_Balance_Fees setRegno(String regno) {
        this.regno = regno;
        return this;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public Current_Academic_Student_Balance_Fees setBranchcode(String branchcode) {
        this.branchcode = branchcode;
        return this;
    }

    public String getBatch() {
        return batch;
    }

    public Current_Academic_Student_Balance_Fees setBatch(String batch) {
        this.batch = batch;
        return this;
    }

    public String getSemester() {
        return semester;
    }

    public Current_Academic_Student_Balance_Fees setSemester(String semester) {
        this.semester = semester;
        return this;
    }

    public Long getAdmissionfeesbalance() {
        return admissionfeesbalance;
    }

    public Current_Academic_Student_Balance_Fees setAdmissionfeesbalance(Long admissionfeesbalance) {
        this.admissionfeesbalance = admissionfeesbalance;
        return this;
    }

    public Long getTuitionfeesbalance() {
        return tuitionfeesbalance;
    }

    public Current_Academic_Student_Balance_Fees setTuitionfeesbalance(Long tuitionfeesbalance) {
        this.tuitionfeesbalance = tuitionfeesbalance;
        return this;
    }

    public Long getTransportFeesbalance() {
        return transportFeesbalance;
    }

    public Current_Academic_Student_Balance_Fees setTransportFeesbalance(Long transportFeesbalance) {
        this.transportFeesbalance = transportFeesbalance;
        return this;
    }

    public Long getHostelfeesbalance() {
        return hostelfeesbalance;
    }

    public Current_Academic_Student_Balance_Fees setHostelfeesbalance(Long hostelfeesbalance) {
        this.hostelfeesbalance = hostelfeesbalance;
        return this;
    }

    public Long getFoodfeesbalance() {
        return foodfeesbalance;
    }

    public Current_Academic_Student_Balance_Fees setFoodfeesbalance(Long foodfeesbalance) {
        this.foodfeesbalance = foodfeesbalance;
        return this;
    }

    public Long getTextbookstationaryfeesbalance() {
        return textbookstationaryfeesbalance;
    }

    public Current_Academic_Student_Balance_Fees setTextbookstationaryfeesbalance(Long textbookstationaryfeesbalance) {
        this.textbookstationaryfeesbalance = textbookstationaryfeesbalance;
        return this;
    }

    public Long getMiscellaneousfeesbalance() {
        return miscellaneousfeesbalance;
    }

    public Current_Academic_Student_Balance_Fees setMiscellaneousfeesbalance(Long miscellaneousfeesbalance) {
        this.miscellaneousfeesbalance = miscellaneousfeesbalance;
        return this;
    }

    public Long getSpecialfeesbalance() {
        return specialfeesbalance;
    }

    public Current_Academic_Student_Balance_Fees setSpecialfeesbalance(Long specialfeesbalance) {
        this.specialfeesbalance = specialfeesbalance;
        return this;
    }

    public Long getPenaltyfeesbalance() {
        return penaltyfeesbalance;
    }

    public Current_Academic_Student_Balance_Fees setPenaltyfeesbalance(Long penaltyfeesbalance) {
        this.penaltyfeesbalance = penaltyfeesbalance;
        return this;
    }

    public Long getPreviousbalancefeesbalance() {
        return previousbalancefeesbalance;
    }

    public Current_Academic_Student_Balance_Fees setPreviousbalancefeesbalance(Long previousbalancefeesbalance) {
        this.previousbalancefeesbalance = previousbalancefeesbalance;
        return this;
    }

    public Long getGroupinsurancefeesbalance() {
        return groupinsurancefeesbalance;
    }

    public Current_Academic_Student_Balance_Fees setGroupinsurancefeesbalance(Long groupinsurancefeesbalance) {
        this.groupinsurancefeesbalance = groupinsurancefeesbalance;
        return this;
    }

    public Long getOthersfeesbalance() {
        return othersfeesbalance;
    }

    public Current_Academic_Student_Balance_Fees setOthersfeesbalance(Long othersfeesbalance) {
        this.othersfeesbalance = othersfeesbalance;
        return this;
    }

    public Long getTotalfeesbalance() {
        return totalfeesbalance;
    }

    public Current_Academic_Student_Balance_Fees setTotalfeesbalance(Long totalfeesbalance) {
        this.totalfeesbalance = totalfeesbalance;
        return this;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public Current_Academic_Student_Balance_Fees setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
        return this;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public Current_Academic_Student_Balance_Fees setLoginuser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }

    public Current_Academic_Student_Actual_Fees getCurrent_Academic_Student_Actual_Fees_regno() {
        return current_Academic_Student_Actual_Fees_regno;
    }

    public Current_Academic_Student_Balance_Fees setCurrent_Academic_Student_Actual_Fees_regno(Current_Academic_Student_Actual_Fees current_Academic_Student_Actual_Fees_regno) {
        this.current_Academic_Student_Actual_Fees_regno = current_Academic_Student_Actual_Fees_regno;
        return this;
    }
}
