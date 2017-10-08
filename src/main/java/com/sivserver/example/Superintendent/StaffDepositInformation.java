package com.sivserver.example.Superintendent;

import javax.persistence.*;

/**
 * Created by GBCorp on 29/09/2017.
 */
@Entity
@Table(name="staffdepositinformation")
public class StaffDepositInformation {



    @Id
    @Column(name="staffid")
    private String staffid;

    private String typeofdeposit;

    private Boolean originaldegreecertificate;

    private String degreecertificateslno;

    private Boolean originaltransfercertificate;

    private String transfercertificateslno;

    private Boolean originalmarksheet;

    private String marksheetslno;

    private Boolean othercertificate;

    private String othercertificateslno;

    private Long salarydeposited;

    private String loginuser;

    @OneToOne
    @JoinColumn(name="staff_deposit_staffid",nullable=false,referencedColumnName = "staffid")
    private StaffPersonalInformation staff_personal_staffid;

    public StaffDepositInformation() {
    }

    public StaffDepositInformation(String staffid) {
        this.staffid = staffid;
    }

    public String getStaffid() {
        return staffid;
    }

    public StaffDepositInformation setStaffid(String staffid) {
        this.staffid = staffid;
        return this;
    }

    public String getTypeofdeposit() {
        return typeofdeposit;
    }

    public StaffDepositInformation setTypeofdeposit(String typeofdeposit) {
        this.typeofdeposit = typeofdeposit;
        return this;
    }

    public Boolean getOriginaldegreecertificate() {
        return originaldegreecertificate;
    }

    public StaffDepositInformation setOriginaldegreecertificate(Boolean originaldegreecertificate) {
        this.originaldegreecertificate = originaldegreecertificate;
        return this;
    }

    public String getDegreecertificateslno() {
        return degreecertificateslno;
    }

    public StaffDepositInformation setDegreecertificateslno(String degreecertificateslno) {
        this.degreecertificateslno = degreecertificateslno;
        return this;
    }

    public Boolean getOriginaltransfercertificate() {
        return originaltransfercertificate;
    }

    public StaffDepositInformation setOriginaltransfercertificate(Boolean originaltransfercertificate) {
        this.originaltransfercertificate = originaltransfercertificate;
        return this;
    }

    public String getTransfercertificateslno() {
        return transfercertificateslno;
    }

    public StaffDepositInformation setTransfercertificateslno(String transfercertificateslno) {
        this.transfercertificateslno = transfercertificateslno;
        return this;
    }

    public Boolean getOriginalmarksheet() {
        return originalmarksheet;
    }

    public StaffDepositInformation setOriginalmarksheet(Boolean originalmarksheet) {
        this.originalmarksheet = originalmarksheet;
        return this;
    }

    public String getMarksheetslno() {
        return marksheetslno;
    }

    public StaffDepositInformation setMarksheetslno(String marksheetslno) {
        this.marksheetslno = marksheetslno;
        return this;
    }

    public Boolean getOthercertificate() {
        return othercertificate;
    }

    public StaffDepositInformation setOthercertificate(Boolean othercertificate) {
        this.othercertificate = othercertificate;
        return this;
    }

    public String getOthercertificateslno() {
        return othercertificateslno;
    }

    public StaffDepositInformation setOthercertificateslno(String othercertificateslno) {
        this.othercertificateslno = othercertificateslno;
        return this;
    }

    public Long getSalarydeposited() {
        return salarydeposited;
    }

    public StaffDepositInformation setSalarydeposited(Long salarydeposited) {
        this.salarydeposited = salarydeposited;
        return this;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public StaffDepositInformation setLoginuser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }

    public StaffPersonalInformation getStaff_personal_staffid() {
        return staff_personal_staffid;
    }

    public StaffDepositInformation setStaff_personal_staffid(StaffPersonalInformation staff_personal_staffid) {
        this.staff_personal_staffid = staff_personal_staffid;
        return this;
    }
}
