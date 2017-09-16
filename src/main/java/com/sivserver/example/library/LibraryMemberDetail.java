package com.sivserver.example.library;

import com.sivserver.example.hod.StudentRemarksEntry;
import com.sivserver.example.student.StudentBaseInformation;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 17/07/2017.
 */
@Entity
@Table(name = "librarymemberdetail")

public class LibraryMemberDetail {


    @Id
    @Column(name="regno")
    private String regno;

    @NaturalId
    private String memberid;

    private String branchcode;

    private String batch;

    private Integer semester;

    private String academicyear;

    private Integer eligiblenoofbooks;

    private Integer noofbookstaken;

    private String loginuser;

    @OneToOne
    @JoinColumn(name="student_base_regno",nullable=false,referencedColumnName = "regno")
    private StudentBaseInformation student_base_regno;

    @OneToMany
    @JoinColumn(name="regno",referencedColumnName = "regno")
    private List<LibraryBookIssueReturnHeader> LibraryBookIssueReturnHeader_regno;


    public LibraryMemberDetail() {
    }

    public LibraryMemberDetail(String regno) {
        this.regno = regno;
    }

    public String getMemberid() {
        return memberid;
    }

    public LibraryMemberDetail setMemberid(String memberid) {
        this.memberid = memberid;
        return this;
    }

    public String getRegno() {
        return regno;
    }

    public LibraryMemberDetail setRegno(String regno) {
        this.regno = regno;
        return this;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public LibraryMemberDetail setBranchcode(String branchcode) {
        this.branchcode = branchcode;
        return this;
    }

    public String getBatch() {
        return batch;
    }

    public LibraryMemberDetail setBatch(String batch) {
        this.batch = batch;
        return this;
    }

    public Integer getSemester() {
        return semester;
    }

    public LibraryMemberDetail setSemester(Integer semester) {
        this.semester = semester;
        return this;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public LibraryMemberDetail setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
        return this;
    }

    public Integer getEligiblenoofbooks() {
        return eligiblenoofbooks;
    }

    public LibraryMemberDetail setEligiblenoofbooks(Integer eligiblenoofbooks) {
        this.eligiblenoofbooks = eligiblenoofbooks;
        return this;
    }

    public Integer getNoofbookstaken() {
        return noofbookstaken;
    }

    public LibraryMemberDetail setNoofbookstaken(Integer noofbookstaken) {
        this.noofbookstaken = noofbookstaken;
        return this;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public LibraryMemberDetail setLoginuser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }

    public StudentBaseInformation getStudent_base_regno() {
        return student_base_regno;
    }

    public LibraryMemberDetail setStudent_base_regno(StudentBaseInformation student_base_regno) {
        this.student_base_regno = student_base_regno;
        return this;
    }

    public List<LibraryBookIssueReturnHeader> getLibraryBookIssueReturnHeader_regno() {
        return LibraryBookIssueReturnHeader_regno;
    }

    public void setLibraryBookIssueReturnHeader_regno(List<LibraryBookIssueReturnHeader> libraryBookIssueReturnHeader_regno) {
        LibraryBookIssueReturnHeader_regno = libraryBookIssueReturnHeader_regno;
    }
}

