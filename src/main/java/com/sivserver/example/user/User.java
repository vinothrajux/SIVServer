package com.sivserver.example.user;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Seetha on 09-Jun-17.
 */

@Entity
@Table(name = "users_student")
public class User {

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
    private String studentId;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String branchCode;

    @NotNull
    private Integer semester;

    @NotNull
    private String academicYear;
}
