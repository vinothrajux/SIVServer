package com.sivserver.example.user;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Seetha on 09-Jun-17.
 */

@Entity
@Table(name = "users")
public class User {

    public User() {
    }

    public Integer getInstituteid() {
        return instituteid;
    }

    public void setInstituteid(Integer instituteid) {
        this.instituteid = instituteid;
    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserRole() {
        return userRole;
    }
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBranchCode() {
        return branchCode;
    }
    public void setBranchCode(String branchcode) {
        this.branchCode = branchcode;
    }

    public Integer getSemester() {
        return semester;
    }
    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getAcadamicYear() {
        return academicYear;
    }
    public void setAcadamicYear(String academicyear) {
        this.academicYear = academicyear;
    }

    public String getStaffId() {
        return staffId;
    }
    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }


    @Column(name="instituteid")
    private Integer instituteid;

    @Id
    private String username;


    private String password;


    private String userRole;


    private String studentId;


    private String firstName;


    private String lastName;


    private String branchCode;


    private Integer semester;


    private String academicYear;


    private String designation;


    private String staffId;

}
