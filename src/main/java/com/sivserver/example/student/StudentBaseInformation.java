package com.sivserver.example.student;

import com.sivserver.example.admission.Bonafide;
import com.sivserver.example.admission.StudentPersonalInformation;
import com.sivserver.example.hod.DiplomaInternalBranchTestTimetableDetail;
import com.sivserver.example.hod.DiplomaInternalSem1TestTimetableDetail;
import com.sivserver.example.hod.DiplomaInternalSem2TestTimetableDetail;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
//import java.util.Date;

/**
 * Created by Seetha on 28-Jun-17.
 */
@Entity
@Table(name = "studentbaseinformation")

public class StudentBaseInformation {

    public StudentBaseInformation() {
    }

    public StudentBaseInformation(String regno) {
        this.regno = regno;
    }

    public String getRegno(){
        return regno;
    }
    public StudentBaseInformation setRegno(String regno) {
        this.regno = regno;
        return this;
    }

    public String getAdmissionno() {return admissionno;}

    public StudentBaseInformation setAdmissionno(String admissionno) {
        this.admissionno = admissionno;
        return this;
    }

    public String getStudentname() {
        return studentname;
    }
    public StudentBaseInformation setStudentname(String studentname) {
        this.studentname = studentname;
        return this;
    }

    public Integer getSemester() {
        return semester;
    }
    public StudentBaseInformation setSemester(Integer semester) {
        this.semester = semester;
        return this;
    }

    public String getBranch() {
        return branch;
    }
    public StudentBaseInformation setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    public String getBranchcode() {
        return branchcode;
    }
    public StudentBaseInformation setBranchcode(String branchcode) {
        this.branchcode = branchcode;
        return this;
    }

    public String getBatch() {
        return batch;
    }
    public StudentBaseInformation setBatch(String batch) {
        this.batch = batch;
        return this;
    }

    public String getScheme() {
        return scheme;
    }
    public StudentBaseInformation setScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    public String getAcademicyear() {
        return academicyear;
    }
    public StudentBaseInformation setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
        return this;
    }

    public String getStudenttype() {
        return studenttype;
    }
    public StudentBaseInformation setStudenttype(String studenttype) {
        this.studenttype = studenttype;
        return this;
    }

    public String getPoto() {
        return poto;
    }
    public StudentBaseInformation setPoto(String poto) {
        this.poto = poto;
        return this;
    }

    public String getLoginuser() {
        return loginuser;
    }
    public StudentBaseInformation setLoginuser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }

    public StudentPersonalInformation getStudent_personal_regno() {
        return student_personal_regno;
    }

    public StudentBaseInformation setStudent_personal_regno(StudentPersonalInformation student_personal_regno) {
        this.student_personal_regno = student_personal_regno;
        return this;
    }

    public List<DiplomaInternalBranchTestTimetableDetail> getDiplomaInternalBranchTestTimetableDetail_regno() {
        return diplomaInternalBranchTestTimetableDetail_regno;
    }

    public void setDiplomaInternalBranchTestTimetableDetail_regno(List<DiplomaInternalBranchTestTimetableDetail> diplomaInternalBranchTestTimetableDetail_regno) {
        this.diplomaInternalBranchTestTimetableDetail_regno = diplomaInternalBranchTestTimetableDetail_regno;
    }

    public List<DiplomaInternalSem1TestTimetableDetail> getDiplomaInternalSem1TestTimetableDetail_regno() {
        return diplomaInternalSem1TestTimetableDetail_regno;
    }

    public void setDiplomaInternalSem1TestTimetableDetail_regno(List<DiplomaInternalSem1TestTimetableDetail> diplomaInternalSem1TestTimetableDetail_regno) {
        this.diplomaInternalSem1TestTimetableDetail_regno = diplomaInternalSem1TestTimetableDetail_regno;
    }

    public List<DiplomaInternalSem2TestTimetableDetail> getDiplomaInternalSem2TestTimetableDetail_regno() {
        return diplomaInternalSem2TestTimetableDetail_regno;
    }

    public void setDiplomaInternalSem2TestTimetableDetail_regno(List<DiplomaInternalSem2TestTimetableDetail> diplomaInternalSem2TestTimetableDetail_regno) {
        this.diplomaInternalSem2TestTimetableDetail_regno = diplomaInternalSem2TestTimetableDetail_regno;
    }

    @Id
    @Column(name="regno")
    private String regno;


    private String admissionno;


    private String studentname;


    private Integer semester;


    private String branch;


    private String branchcode;


    private String batch;


    private String scheme;


    private String academicyear;


    private String studenttype;


    private String poto;


    private String loginuser;

    @OneToOne
    @JoinColumn(name="student_base_regno",nullable=false,referencedColumnName = "regno")
    private StudentPersonalInformation student_personal_regno;

    @OneToMany
    @JoinColumn(name="regno",referencedColumnName = "regno")
    private List<DiplomaInternalBranchTestTimetableDetail> diplomaInternalBranchTestTimetableDetail_regno;

    @OneToMany
    @JoinColumn(name="regno",referencedColumnName = "regno")
    private List<DiplomaInternalSem1TestTimetableDetail> diplomaInternalSem1TestTimetableDetail_regno;

    @OneToMany
    @JoinColumn(name="regno",referencedColumnName = "regno")
    private List<DiplomaInternalSem2TestTimetableDetail> diplomaInternalSem2TestTimetableDetail_regno;

}
