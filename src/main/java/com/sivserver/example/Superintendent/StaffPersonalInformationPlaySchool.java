package com.sivserver.example.Superintendent;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by GBCorp on 07/11/2017.
 */
@Entity
@Table(name="staffpersonalinformationplayschool")
public class StaffPersonalInformationPlaySchool {

    private Date date_of_join;

    @Id
    private String staffid;

    private String staffname;

    private String designation;

    private Date dateofbirth;

    private Integer age;

    private String bloodgroup;

    private String maritalstatus;

    private String fathersname;

    private String mothersname;

    private String spousename;

    private String addressline1;

    private String addressline2;

    private String area;

    private String pin;

    private String mobilenumber;

    private String alternativemobilenumber;

    private String emailid;

    private String qualification;

    private String course;

    private String university;

    private Long percentage;

    private String month_year_of_pass;

    private String experience;

    private Integer no_of_years;

    private String logiuser;

    public StaffPersonalInformationPlaySchool() {
    }

    public StaffPersonalInformationPlaySchool(String staffid) {
        this.staffid = staffid;
    }

    public Date getDate_of_join() {
        return date_of_join;
    }

    public void setDate_of_join(Date date_of_join) {
        this.date_of_join = date_of_join;
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public String getFathersname() {
        return fathersname;
    }

    public void setFathersname(String fathersname) {
        this.fathersname = fathersname;
    }

    public String getMothersname() {
        return mothersname;
    }

    public void setMothersname(String mothersname) {
        this.mothersname = mothersname;
    }

    public String getSpousename() {
        return spousename;
    }

    public void setSpousename(String spousename) {
        this.spousename = spousename;
    }

    public String getAddressline1() {
        return addressline1;
    }

    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }

    public String getAddressline2() {
        return addressline2;
    }

    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getAlternativemobilenumber() {
        return alternativemobilenumber;
    }

    public void setAlternativemobilenumber(String alternativemobilenumber) {
        this.alternativemobilenumber = alternativemobilenumber;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Long getPercentage() {
        return percentage;
    }

    public void setPercentage(Long percentage) {
        this.percentage = percentage;
    }

    public String getMonth_year_of_pass() {
        return month_year_of_pass;
    }

    public void setMonth_year_of_pass(String month_year_of_pass) {
        this.month_year_of_pass = month_year_of_pass;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Integer getNo_of_years() {
        return no_of_years;
    }

    public void setNo_of_years(Integer no_of_years) {
        this.no_of_years = no_of_years;
    }

    public String getLogiuser() {
        return logiuser;
    }

    public void setLogiuser(String logiuser) {
        this.logiuser = logiuser;
    }
}

