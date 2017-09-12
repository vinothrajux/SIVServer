package com.sivserver.example.CashCounter;

import com.sivserver.example.admission.Bonafide;
import com.sivserver.example.admission.StudentPersonalInformation;
import com.sivserver.example.student.StudentBaseInformation;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;


/**
 * Created by GBCorp on 10/09/2017.
 */

@Entity
@Table(name = "current_academic_student_actual_fees")

public class Current_Academic_Student_Actual_Fees {
    @Id
    @Column(name="regno")
    private String regno;

    private String admissionno;

    private String branchcode;

    private String batch;

    private String semester;

    private Long admissionfees;

    private Long tuitionfees;

    private Long transportFees;

    private Long hostelfees;

    private Long foodfees;

    private Long textbookstationaryfees;

    private Long miscellaneousfees;

    private Long specialfees;

    private Long penaltyfees;

    private Long previousbalancefees;

    private Long groupinsurancefees;

    private Long othersfees;

    private Long totalfees;

    private String academicyear;

    private String loginuser;

    @OneToOne
    @JoinColumn(name="student_base_regno",nullable=false,referencedColumnName = "regno")
    private StudentBaseInformation student_base_regno;

    @OneToMany
    @JoinColumn(name="regno",referencedColumnName = "regno")
    private List<Current_Academic_Student_Fees_Payment> current_Academic_Student_Fees_Payment_Regno;

    public Current_Academic_Student_Actual_Fees() {
    }

    public Current_Academic_Student_Actual_Fees(String regno) {
        this.regno = regno;
    }

    public String getRegno() {
        return regno;
    }

    public Current_Academic_Student_Actual_Fees setRegno(String regno) {
        this.regno = regno;
        return this;
    }

    public String getAdmissionno() {
        return admissionno;
    }

    public Current_Academic_Student_Actual_Fees setAdmissionno(String admissionno) {
        this.admissionno = admissionno;
        return this;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public Current_Academic_Student_Actual_Fees setBranchcode(String branchcode) {
        this.branchcode = branchcode;
        return this;
    }

    public String getBatch() {
        return batch;
    }

    public Current_Academic_Student_Actual_Fees setBatch(String batch) {
        this.batch = batch;
        return this;
    }

    public String getSemester() {
        return semester;
    }

    public Current_Academic_Student_Actual_Fees setSemester(String semester) {
        this.semester = semester;
        return this;
    }

    public Long getAdmissionfees() {
        return admissionfees;
    }

    public Current_Academic_Student_Actual_Fees setAdmissionfees(Long admissionfees) {
        this.admissionfees = admissionfees;
        return this;
    }

    public Long getTuitionfees() {
        return tuitionfees;
    }

    public Current_Academic_Student_Actual_Fees setTuitionfees(Long tuitionfees) {
        this.tuitionfees = tuitionfees;
        return this;
    }

    public Long getTransportFees() {
        return transportFees;
    }

    public Current_Academic_Student_Actual_Fees setTransportFees(Long transportFees) {
        this.transportFees = transportFees;
        return this;
    }

    public Long getHostelfees() {
        return hostelfees;
    }

    public Current_Academic_Student_Actual_Fees setHostelfees(Long hostelfees) {
        this.hostelfees = hostelfees;
        return this;
    }

    public Long getFoodfees() {
        return foodfees;
    }

    public Current_Academic_Student_Actual_Fees setFoodfees(Long foodfees) {
        this.foodfees = foodfees;
        return this;
    }

    public Long getTextbookstationaryfees() {
        return textbookstationaryfees;
    }

    public Current_Academic_Student_Actual_Fees setTextbookstationaryfees(Long textbookstationaryfees) {
        this.textbookstationaryfees = textbookstationaryfees;
        return this;
    }

    public Long getMiscellaneousfees() {
        return miscellaneousfees;
    }

    public Current_Academic_Student_Actual_Fees setMiscellaneousfees(Long miscellaneousfees) {
        this.miscellaneousfees = miscellaneousfees;
        return this;
    }

    public Long getSpecialfees() {
        return specialfees;
    }

    public Current_Academic_Student_Actual_Fees setSpecialfees(Long specialfees) {
        this.specialfees = specialfees;
        return this;
    }

    public Long getPenaltyfees() {
        return penaltyfees;
    }

    public Current_Academic_Student_Actual_Fees setPenaltyfees(Long penaltyfees) {
        this.penaltyfees = penaltyfees;
        return this;
    }

    public Long getPreviousbalancefees() {
        return previousbalancefees;
    }

    public Current_Academic_Student_Actual_Fees setPreviousbalancefees(Long previousbalancefees) {
        this.previousbalancefees = previousbalancefees;
        return this;
    }

    public Long getGroupinsurancefees() {
        return groupinsurancefees;
    }

    public Current_Academic_Student_Actual_Fees setGroupinsurancefees(Long groupinsurancefees) {
        this.groupinsurancefees = groupinsurancefees;
        return this;
    }

    public Long getOthersfees() {
        return othersfees;
    }

    public Current_Academic_Student_Actual_Fees setOthersfees(Long othersfees) {
        this.othersfees = othersfees;
        return this;
    }

    public Long getTotalfees() {
        return totalfees;
    }

    public Current_Academic_Student_Actual_Fees setTotalfees(Long totalfees) {
        this.totalfees = totalfees;
        return this;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public Current_Academic_Student_Actual_Fees setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
        return this;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public Current_Academic_Student_Actual_Fees setLoginuser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }

    public StudentBaseInformation getStudent_base_regno() {
        return student_base_regno;
    }

    public Current_Academic_Student_Actual_Fees setStudent_base_regno(StudentBaseInformation student_base_regno) {
        this.student_base_regno = student_base_regno;
        return this;
    }

    public List<Current_Academic_Student_Fees_Payment> getCurrent_Academic_Student_Fees_Payment_Regno() {
        return current_Academic_Student_Fees_Payment_Regno;
    }

    public void setCurrent_Academic_Student_Fees_Payment_Regno(List<Current_Academic_Student_Fees_Payment> current_Academic_Student_Fees_Payment_Regno) {
        this.current_Academic_Student_Fees_Payment_Regno = current_Academic_Student_Fees_Payment_Regno;
    }
}
