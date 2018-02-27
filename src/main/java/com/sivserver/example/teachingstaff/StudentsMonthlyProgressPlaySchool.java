package com.sivserver.example.teachingstaff;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by GBCorp on 08/11/2017.
 */
@Entity
@Table(name="studentsmonthlyprogressplayschool")
public class StudentsMonthlyProgressPlaySchool {

    @Id
    Student_Assessment_Play_School_Compound_Key student_assessment_play_school_compound_key;

    private Date entrydate;

    private String name;

    private String program;

    private String section;

    private String academicyear;

    private Integer grossmotorskills;

    private Integer finemotorskills;

    private Integer conceptknowledge;

    private Integer activityparticipation;

    private Integer socialbehavior;

    private Integer diningetiquettes;

    private Integer languageskills;

    private Integer listeningskills;

    private Integer noofworkingdays;

    private Integer noofdaysattended;

    private Integer fluency;

    private Integer accuracy;

    private Integer clarity;

    private Integer legibility;

    private Integer neatness;

    private Integer games;

    private Integer artsandcrafts;

    private Integer obedience;

    private Integer responsibility;

    private Integer punctuality;

    private Integer regularity;

    private Integer homework;

    private Integer handwriting;

    private Integer personalhygiene;

    private Integer sharing;

    private Integer uniform;

    private Integer nails;

    private Integer hair;

    private Integer cleanliness;

    private float height;

    private float weight;

    private String loginuser;


    public StudentsMonthlyProgressPlaySchool() {
    }

    public Student_Assessment_Play_School_Compound_Key getStudent_assessment_play_school_compound_key() {
        return student_assessment_play_school_compound_key;
    }

    public void setStudent_assessment_play_school_compound_key(Student_Assessment_Play_School_Compound_Key student_assessment_play_school_compound_key) {
        this.student_assessment_play_school_compound_key = student_assessment_play_school_compound_key;
    }

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
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

    public Integer getGrossmotorskills() {
        return grossmotorskills;
    }

    public void setGrossmotorskills(Integer grossmotorskills) {
        this.grossmotorskills = grossmotorskills;
    }

    public Integer getFinemotorskills() {
        return finemotorskills;
    }

    public void setFinemotorskills(Integer finemotorskills) {
        this.finemotorskills = finemotorskills;
    }

    public Integer getConceptknowledge() {
        return conceptknowledge;
    }

    public void setConceptknowledge(Integer conceptknowledge) {
        this.conceptknowledge = conceptknowledge;
    }

    public Integer getActivityparticipation() {
        return activityparticipation;
    }

    public void setActivityparticipation(Integer activityparticipation) {
        this.activityparticipation = activityparticipation;
    }

    public Integer getSocialbehavior() {
        return socialbehavior;
    }

    public void setSocialbehavior(Integer socialbehavior) {
        this.socialbehavior = socialbehavior;
    }

    public Integer getDiningetiquettes() {
        return diningetiquettes;
    }

    public void setDiningetiquettes(Integer diningetiquettes) {
        this.diningetiquettes = diningetiquettes;
    }

    public Integer getLanguageskills() {
        return languageskills;
    }

    public void setLanguageskills(Integer languageskills) {
        this.languageskills = languageskills;
    }

    public Integer getListeningskills() {
        return listeningskills;
    }

    public void setListeningskills(Integer listeningskills) {
        this.listeningskills = listeningskills;
    }

    public Integer getNoofworkingdays() {
        return noofworkingdays;
    }

    public void setNoofworkingdays(Integer noofworkingdays) {
        this.noofworkingdays = noofworkingdays;
    }

    public Integer getNoofdaysattended() {
        return noofdaysattended;
    }

    public void setNoofdaysattended(Integer noofdaysattended) {
        this.noofdaysattended = noofdaysattended;
    }

    public Integer getFluency() {
        return fluency;
    }

    public void setFluency(Integer fluency) {
        this.fluency = fluency;
    }

    public Integer getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    public Integer getClarity() {
        return clarity;
    }

    public void setClarity(Integer clarity) {
        this.clarity = clarity;
    }

    public Integer getLegibility() {
        return legibility;
    }

    public void setLegibility(Integer legibility) {
        this.legibility = legibility;
    }

    public Integer getNeatness() {
        return neatness;
    }

    public void setNeatness(Integer neatness) {
        this.neatness = neatness;
    }

    public Integer getGames() {
        return games;
    }

    public void setGames(Integer games) {
        this.games = games;
    }

    public Integer getArtsandcrafts() {
        return artsandcrafts;
    }

    public void setArtsandcrafts(Integer artsandcrafts) {
        this.artsandcrafts = artsandcrafts;
    }

    public Integer getObedience() {
        return obedience;
    }

    public void setObedience(Integer obedience) {
        this.obedience = obedience;
    }

    public Integer getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(Integer responsibility) {
        this.responsibility = responsibility;
    }

    public Integer getPunctuality() {
        return punctuality;
    }

    public void setPunctuality(Integer punctuality) {
        this.punctuality = punctuality;
    }

    public Integer getRegularity() {
        return regularity;
    }

    public void setRegularity(Integer regularity) {
        this.regularity = regularity;
    }

    public Integer getHomework() {
        return homework;
    }

    public void setHomework(Integer homework) {
        this.homework = homework;
    }

    public Integer getHandwriting() {
        return handwriting;
    }

    public void setHandwriting(Integer handwriting) {
        this.handwriting = handwriting;
    }

    public Integer getPersonalhygiene() {
        return personalhygiene;
    }

    public void setPersonalhygiene(Integer personalhygiene) {
        this.personalhygiene = personalhygiene;
    }

    public Integer getSharing() {
        return sharing;
    }

    public void setSharing(Integer sharing) {
        this.sharing = sharing;
    }

    public Integer getUniform() {
        return uniform;
    }

    public void setUniform(Integer uniform) {
        this.uniform = uniform;
    }

    public Integer getNails() {
        return nails;
    }

    public void setNails(Integer nails) {
        this.nails = nails;
    }

    public Integer getHair() {
        return hair;
    }

    public void setHair(Integer hair) {
        this.hair = hair;
    }

    public Integer getCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(Integer cleanliness) {
        this.cleanliness = cleanliness;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }

}
