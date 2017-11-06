package com.sivserver.example.Superintendent;

import javax.persistence.*;

/**
 * Created by GBCorp on 28/09/2017.
 */
@Entity
@Table(name="staffacademicinformation")
public class StaffAcademicInformation {

    @Id
    @Column(name="staffid")
    private String staffid;

    private String qualifiication;

    private String degree;

    private String course;

    private String board;

    private Long percentage;

    private String monthandyearofpass;

    private String experiencecategory;

    private String organisationname;

    private String experiencedesignation;

    private Integer experiencenoofyears;

    private Boolean awardwinner;

    private Boolean training;

    private Boolean seminars;

    private Boolean paperpresentation;

    private Boolean nss;

    private Boolean ncc;

    private String loginuser;

    @OneToOne
    @JoinColumn(name="staff_academic_staffid",nullable=false,referencedColumnName = "staffid")
    private StaffPersonalInformation staff_personal_staffid;


    public StaffAcademicInformation() {
    }

    public StaffAcademicInformation(String staffid) {
        this.staffid = staffid;
    }

    public String getStaffid() {
        return staffid;
    }

    public StaffAcademicInformation setStaffid(String staffid) {
        this.staffid = staffid;
        return this;
    }

    public String getQualifiication() {
        return qualifiication;
    }

    public StaffAcademicInformation setQualifiication(String qualifiication) {
        this.qualifiication = qualifiication;
        return this;
    }

    public String getDegree() {
        return degree;
    }

    public StaffAcademicInformation setDegree(String degree) {
        this.degree = degree;
        return this;
    }

    public String getCourse() {
        return course;
    }

    public StaffAcademicInformation setCourse(String course) {
        this.course = course;
        return this;
    }

    public String getBoard() {
        return board;
    }

    public StaffAcademicInformation setBoard(String board) {
        this.board = board;
        return this;
    }

    public Long getPercentage() {
        return percentage;
    }

    public StaffAcademicInformation setPercentage(Long percentage) {
        this.percentage = percentage;
        return this;
    }

    public String getMonthandyearofpass() {
        return monthandyearofpass;
    }

    public StaffAcademicInformation setMonthandyearofpass(String monthandyearofpass) {
        this.monthandyearofpass = monthandyearofpass;
        return this;
    }

    public String getExperiencecategory() {
        return experiencecategory;
    }

    public StaffAcademicInformation setExperiencecategory(String experiencecategory) {
        this.experiencecategory = experiencecategory;
        return this;
    }

    public String getOrganisationname() {
        return organisationname;
    }

    public StaffAcademicInformation setOrganisationname(String organisationname) {
        this.organisationname = organisationname;
        return this;
    }

    public String getExperiencedesignation() {
        return experiencedesignation;
    }

    public StaffAcademicInformation setExperiencedesignation(String experiencedesignation) {
        this.experiencedesignation = experiencedesignation;
        return this;
    }

    public Integer getExperiencenoofyears() {
        return experiencenoofyears;
    }

    public StaffAcademicInformation setExperiencenoofyears(Integer experiencenoofyears) {
        this.experiencenoofyears = experiencenoofyears;
        return this;
    }

    public Boolean getAwardwinner() {
        return awardwinner;
    }

    public StaffAcademicInformation setAwardwinner(Boolean awardwinner) {
        this.awardwinner = awardwinner;
        return this;
    }

    public Boolean getTraining() {
        return training;
    }

    public StaffAcademicInformation setTraining(Boolean training) {
        this.training = training;
        return this;
    }

    public Boolean getSeminars() {
        return seminars;
    }

    public StaffAcademicInformation setSeminars(Boolean seminars) {
        this.seminars = seminars;
        return this;
    }

    public Boolean getPaperpresentation() {
        return paperpresentation;
    }

    public StaffAcademicInformation setPaperpresentation(Boolean paperpresentation) {
        this.paperpresentation = paperpresentation;
        return this;
    }

    public Boolean getNss() {
        return nss;
    }

    public StaffAcademicInformation setNss(Boolean nss) {
        this.nss = nss;
        return this;
    }

    public Boolean getNcc() {
        return ncc;
    }

    public StaffAcademicInformation setNcc(Boolean ncc) {
        this.ncc = ncc;
        return this;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public StaffAcademicInformation setLoginuser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }

    public StaffPersonalInformation getStaff_personal_staffid() {
        return staff_personal_staffid;
    }

    public StaffAcademicInformation setStaff_personal_staffid(StaffPersonalInformation staff_personal_staffid) {
        this.staff_personal_staffid = staff_personal_staffid;
        return this;
    }
}
