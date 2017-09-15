package com.sivserver.example.library;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 18/07/2017.
 */
@Entity
@Table(name = "librarybookissuereturnheader")

public class LibraryBookIssueReturnHeader {

    private Date currentdate;

    @Id
    @Column(name="regno")
    private String regno;

    private String memberid;

    private String branchcode;

    private String batch;

    private Integer semester;

    private String academicyear;

    private String loginuser;

    @OneToMany
    @JoinColumn(name="regno",referencedColumnName = "regno")
    private List<LibraryBookIssueReturnDetail> LibraryBookIssueReturnDetail_regno;


    public LibraryBookIssueReturnHeader() {
    }

    public LibraryBookIssueReturnHeader(String regno) {
        this.regno = regno;
    }

    public Date getCurrentdate() {
        return currentdate;
    }

    public void setCurrentdate(Date currentdate) {
        this.currentdate = currentdate;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }

    public List<LibraryBookIssueReturnDetail> getLibraryBookIssueReturnDetail_regno() {
        return LibraryBookIssueReturnDetail_regno;
    }

    public void setLibraryBookIssueReturnDetail_regno(List<LibraryBookIssueReturnDetail> libraryBookIssueReturnDetail_regno) {
        LibraryBookIssueReturnDetail_regno = libraryBookIssueReturnDetail_regno;
    }
}
