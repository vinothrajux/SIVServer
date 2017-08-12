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

    public String getBranchcode() {
        return branchcode;
    }
    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    public Integer getSemester() {
        return semester;
    }
    public void setSemester(Integer semester) {
        this.semester = semester;
    }


    public String getAcadyear() {
        return academicYear;
    }
    public void setAcadyear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getFoodtype() {
        return foodtype;
    }
    public void setFoodtype(String foodtype) {
        this.foodtype = foodtype;
    }

    public Long getFoodfees() {
        return foodfees;
    }
    public void setFoodfees(Long foodfees) {
        this.foodfees = foodfees;
    }

    public String getLoginuser() {
        return loginuser;
    }
    public void setLoginuser(String loginuser) {
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
