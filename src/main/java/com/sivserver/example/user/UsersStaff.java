package com.sivserver.example.user;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by GBCorp on 24/06/2017.
 */
@Entity
@Table(name = "users_staff")
public class UsersStaff {
    public String getUserName(){
        return username;
    }
    public void setUserName(String username) {
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

    public String getStaffId() {
        return staffId;
    }
    public void setStaffId(String staffId) {
        this.staffId = staffId;
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

    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }



    public String getAcadamicYear() {
        return academicYear;
    }
    public void setAcadamicYear(String academicyear) {
        this.academicYear = academicyear;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String userRole;

    @NotNull
    private String staffId;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String branchCode;

    @NotNull
    private String designation;

    @NotNull
    private String academicYear;
}
