package com.sivserver.example.admission;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by GBCorp on 28/06/2017.
 */
@Entity
@Table(name = "studentfood")
public class StudentFood {
    public String getRegno(){
        return regno;
    }
    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBranchCode() {
        return branchcode;
    }
    public void setBranchCode(String branchcode) {
        this.branchcode = branchcode;
    }

    public Integer getSemester() {
        return semester;
    }
    public void setSemester(Integer semester) {
        this.semester = semester;
    }


    public String getAcadYear() {
        return academicYear;
    }
    public void setAcadYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getFoodType() {
        return foodtype;
    }
    public void setFoodType(String foodtype) {
        this.foodtype = foodtype;
    }

    public Long getFoodFees() {
        return foodfees;
    }
    public void setFoodFees(Long foodfees) {
        this.foodfees = foodfees;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }

    @Id
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

}
