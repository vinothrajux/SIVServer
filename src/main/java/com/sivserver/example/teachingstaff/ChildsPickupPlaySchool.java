package com.sivserver.example.teachingstaff;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by GBCorp on 07/11/2017.
 */
@Entity
@Table(name="childspickupplayschool")
public class ChildsPickupPlaySchool {

    @Id
    private String pickupid;

    private Date pickupddate;

    private String pickupday;

    private String pickuptime;

    @Column(name="registernumber")
    private String registernumber;

    private String name;

    private String program;

    private String section;

    private String academicyear;

    private String pickup_person_name;

    private String pickup_person_relation;

    private String pickup_person_mobileno;

    private String remarks;

    private String loginuser;

    public ChildsPickupPlaySchool() {
    }

    public String getPickupid() {
        return pickupid;
    }

    public void setPickupid(String pickupid) {
        this.pickupid = pickupid;
    }

    public Date getPickupddate() {
        return pickupddate;
    }

    public void setPickupddate(Date pickupddate) {
        this.pickupddate = pickupddate;
    }

    public String getPickupday() {
        return pickupday;
    }

    public void setPickupday(String pickupday) {
        this.pickupday = pickupday;
    }

    public String getPickuptime() {
        return pickuptime;
    }

    public void setPickuptime(String pickuptime) {
        this.pickuptime = pickuptime;
    }

    public String getRegisternumber() {
        return registernumber;
    }

    public void setRegisternumber(String registernumber) {
        this.registernumber = registernumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getPickup_person_name() {
        return pickup_person_name;
    }

    public void setPickup_person_name(String pickup_person_name) {
        this.pickup_person_name = pickup_person_name;
    }

    public String getPickup_person_relation() {
        return pickup_person_relation;
    }

    public void setPickup_person_relation(String pickup_person_relation) {
        this.pickup_person_relation = pickup_person_relation;
    }

    public String getPickup_person_mobileno() {
        return pickup_person_mobileno;
    }

    public void setPickup_person_mobileno(String pickup_person_mobileno) {
        this.pickup_person_mobileno = pickup_person_mobileno;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
