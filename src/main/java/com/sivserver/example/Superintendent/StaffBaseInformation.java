package com.sivserver.example.Superintendent;

import com.sivserver.example.admission.StudentPersonalInformation;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by GBCorp on 28/09/2017.
 */
@Entity
@Table(name="staffbaseinformation")
public class StaffBaseInformation {

    @Id
    @Column(name="staffid")
    private String staffid;

    private String staffname;

    private Date dateofjoin;

    private String designation;

    private String branch;

    private String branchcode;

    private String status;

    private String loginuser;

    @OneToOne
    @JoinColumn(name="staff_base_staffid",nullable=false,referencedColumnName = "staffid")
    private StaffPersonalInformation staff_personal_staffid;
    public StaffBaseInformation() {
    }

    public StaffBaseInformation(String staffid) {
        this.staffid = staffid;
    }

    public String getStaffid() {
        return staffid;
    }

    public StaffBaseInformation setStaffid(String staffid) {
        this.staffid = staffid;
        return this;
    }

    public String getStaffname() {
        return staffname;
    }

    public StaffBaseInformation setStaffname(String staffname) {
        this.staffname = staffname;
        return this;
    }

    public Date getDateofjoin() {
        return dateofjoin;
    }

    public StaffBaseInformation setDateofjoin(Date dateofjoin) {
        this.dateofjoin = dateofjoin;
        return this;
    }

    public String getDesignation() {
        return designation;
    }

    public StaffBaseInformation setDesignation(String designation) {
        this.designation = designation;
        return this;
    }

    public String getBranch() {
        return branch;
    }

    public StaffBaseInformation setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public StaffBaseInformation setBranchcode(String branchcode) {
        this.branchcode = branchcode;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public StaffBaseInformation setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public StaffBaseInformation setLoginuser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }

    public StaffPersonalInformation getStaff_personal_staffid() {
        return staff_personal_staffid;
    }

    public StaffBaseInformation setStaff_personal_staffid(StaffPersonalInformation staff_personal_staffid) {
        this.staff_personal_staffid = staff_personal_staffid;
        return this;
    }
}
