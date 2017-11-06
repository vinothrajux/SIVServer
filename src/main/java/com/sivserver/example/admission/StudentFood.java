package com.sivserver.example.admission;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by GBCorp on 28/06/2017.
 */
@Entity
@Table(name = "studentfood")
public class StudentFood {

    public StudentFood() {
    }

    public StudentFood(String regno) {
        this.regno = regno;
    }

    public String getRegno() {
        return regno;

    }

    public StudentFood setRegno(String regno) {
        this.regno = regno;
        return this;
    }

    public String getBranch() {
        return branch;
    }

    public StudentFood setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public StudentFood setBranchcode(String branchcode) {
        this.branchcode = branchcode;
        return this;
    }

    public Integer getSemester() {
        return semester;
    }

    public StudentFood setSemester(Integer semester) {
        this.semester = semester;
        return this;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public StudentFood setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
        return this;
    }

    public String getFoodtype() {
        return foodtype;
    }

    public StudentFood setFoodtype(String foodtype) {
        this.foodtype = foodtype;
        return this;
    }

    public Long getFoodfees() {
        return foodfees;
    }

    public StudentFood setFoodfees(Long foodfees) {
        this.foodfees = foodfees;
        return this;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public StudentFood setLoginuser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }

    public StudentPersonalInformation getStudent_personal_regno() {
        return student_personal_regno;
    }

    public StudentFood setStudent_personal_regno(StudentPersonalInformation student_personal_regno) {
        this.student_personal_regno = student_personal_regno;
        return this;
    }


        @Id
    @Column(name="regno")
    private String regno;

    @NotNull
    private String branch;

    @NotNull
    private String branchcode;

    @NotNull
    private Integer semester;

    @NotNull
    private String academicYear;

    @NotNull
    private String foodtype;

    @NotNull
    private Long foodfees;

   @NotNull
    private String loginuser;

    @OneToOne
    @JoinColumn(name="student_food_regno",nullable=false,referencedColumnName = "regno")
    private StudentPersonalInformation student_personal_regno;


}

