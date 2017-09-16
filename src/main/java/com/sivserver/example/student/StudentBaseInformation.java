package com.sivserver.example.student;

import com.sivserver.example.Superintendent.Scholarship;
import com.sivserver.example.admission.Bonafide;
import com.sivserver.example.admission.StudentPersonalInformation;
import com.sivserver.example.hod.DiplomaInternalBranchTestTimetableDetail;
import com.sivserver.example.hod.DiplomaInternalSem1TestTimetableDetail;
import com.sivserver.example.hod.DiplomaInternalSem2TestTimetableDetail;
import com.sivserver.example.hod.StudentRemarksEntry;
import com.sivserver.example.hostel.HostelStudentLeaveDetail;
import com.sivserver.example.library.LibraryUsage;
import com.sivserver.example.parent.StudentLeaveLetter;
import com.sivserver.example.security.SecurityStudentLateComers;
import com.sivserver.example.security.SecurityStudentOutPass;
import com.sivserver.example.security.SecurityStudentVisitorPass;
import com.sivserver.example.sports.AtheleteHeader;
import com.sivserver.example.sports.SportsOdForm;
import com.sivserver.example.stores.StoresSalesHeader;
import com.sivserver.example.transport.MtcConcession;
import com.sivserver.example.transport.StudentTransport;
import com.sivserver.example.transport.TrainConcession;

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

    public List<StudentRemarksEntry> getStudentRemarksEntry_regno() {
        return studentRemarksEntry_regno;
    }

    public void setStudentRemarksEntry_regno(List<StudentRemarksEntry> studentRemarksEntry_regno) {
        this.studentRemarksEntry_regno = studentRemarksEntry_regno;
    }

    public List<LibraryUsage> getLibraryUsage_regno() {
        return libraryUsage_regno;
    }

    public void setLibraryUsage_regno(List<LibraryUsage> libraryUsage_regno) {
        this.libraryUsage_regno = libraryUsage_regno;
    }

    public List<StudentLeaveLetter> getStudentLeaveLetter_regno() {
        return studentLeaveLetter_regno;
    }

    public void setStudentLeaveLetter_regno(List<StudentLeaveLetter> studentLeaveLetter_regno) {
        this.studentLeaveLetter_regno = studentLeaveLetter_regno;
    }

    public List<SecurityStudentVisitorPass> getSecurityStudentVisitorPass_regno() {
        return securityStudentVisitorPass_regno;
    }

    public void setSecurityStudentVisitorPass_regno(List<SecurityStudentVisitorPass> securityStudentVisitorPass_regno) {
        this.securityStudentVisitorPass_regno = securityStudentVisitorPass_regno;
    }

    public List<SecurityStudentLateComers> getSecurityStudentLateComers_regno() {
        return securityStudentLateComers_regno;
    }

    public void setSecurityStudentLateComers_regno(List<SecurityStudentLateComers> securityStudentLateComers_regno) {
        this.securityStudentLateComers_regno = securityStudentLateComers_regno;
    }

    public List<SecurityStudentOutPass> getSecurityStudentOutPass_regno() {
        return securityStudentOutPass_regno;
    }

    public void setSecurityStudentOutPass_regno(List<SecurityStudentOutPass> securityStudentOutPass_regno) {
        this.securityStudentOutPass_regno = securityStudentOutPass_regno;
    }

    public List<AtheleteHeader> getAtheleteHeader_regno() {
        return atheleteHeader_regno;
    }

    public void setAtheleteHeader_regno(List<AtheleteHeader> atheleteHeader_regno) {
        this.atheleteHeader_regno = atheleteHeader_regno;
    }

    public List<SportsOdForm> getSportsOdForm_regno() {
        return sportsOdForm_regno;
    }

    public void setSportsOdForm_regno(List<SportsOdForm> sportsOdForm_regno) {
        this.sportsOdForm_regno = sportsOdForm_regno;
    }

    public List<StoresSalesHeader> getStoresSalesHeader_regno() {
        return storesSalesHeader_regno;
    }

    public void setStoresSalesHeader_regno(List<StoresSalesHeader> storesSalesHeader_regno) {
        this.storesSalesHeader_regno = storesSalesHeader_regno;
    }

    public List<Scholarship> getScholarship_regno() {
        return scholarship_regno;
    }

    public void setScholarship_regno(List<Scholarship> scholarship_regno) {
        this.scholarship_regno = scholarship_regno;
    }

    public List<MtcConcession> getMtcConcession_regno() {
        return mtcConcession_regno;
    }

    public void setMtcConcession_regno(List<MtcConcession> mtcConcession_regno) {
        this.mtcConcession_regno = mtcConcession_regno;
    }

    public List<StudentTransport> getStudentTransport_regno() {
        return studentTransport_regno;
    }

    public void setStudentTransport_regno(List<StudentTransport> studentTransport_regno) {
        this.studentTransport_regno = studentTransport_regno;
    }

    public List<TrainConcession> getTrainConcession_regno() {
        return trainConcession_regno;
    }

    public void setTrainConcession_regno(List<TrainConcession> trainConcession_regno) {
        this.trainConcession_regno = trainConcession_regno;
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

    @OneToMany
    @JoinColumn(name="regno",referencedColumnName = "regno")
    private List<StudentRemarksEntry> studentRemarksEntry_regno;

    @OneToMany
    @JoinColumn(name="regno",referencedColumnName = "regno")
    private List<LibraryUsage> libraryUsage_regno;

    @OneToMany
    @JoinColumn(name="regno",referencedColumnName = "regno")
    private List<StudentLeaveLetter> studentLeaveLetter_regno;

    @OneToMany
    @JoinColumn(name="regno",referencedColumnName = "regno")
    private List<SecurityStudentVisitorPass> securityStudentVisitorPass_regno;

    @OneToMany
    @JoinColumn(name="regno",referencedColumnName = "regno")
    private List<SecurityStudentLateComers> securityStudentLateComers_regno;

    @OneToMany
    @JoinColumn(name="regno",referencedColumnName = "regno")
    private List<SecurityStudentOutPass> securityStudentOutPass_regno;

    @OneToMany
    @JoinColumn(name="regno",referencedColumnName = "regno")
    private List<AtheleteHeader> atheleteHeader_regno;

    @OneToMany
    @JoinColumn(name="regno",referencedColumnName = "regno")
    private List<SportsOdForm> sportsOdForm_regno;

    @OneToMany
    @JoinColumn(name="regno",referencedColumnName = "regno")
    private List<StoresSalesHeader> storesSalesHeader_regno;

    @OneToMany
    @JoinColumn(name="regno",referencedColumnName = "regno")
    private List<Scholarship> scholarship_regno;

    @OneToMany
    @JoinColumn(name="regno",referencedColumnName = "regno")
    private List<MtcConcession> mtcConcession_regno;

    @OneToMany
    @JoinColumn(name="regno",referencedColumnName = "regno")
    private List<StudentTransport> studentTransport_regno;

    @OneToMany
    @JoinColumn(name="regno",referencedColumnName = "regno")
    private List<TrainConcession> trainConcession_regno;

}
