package com.sivserver.example.hod;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by Seetha on 29-Jun-17.
 */

@Entity
@Table(name = "questionentry")

public class QuestionEntry {

    public Integer getSNO(){return sno;}
    public void setSNO(Integer sno) {
        this.sno = sno;
    }

    public String getBranchName(){
        return branchname;
    }
    public void setBranchName(String branchname) {
        this.branchname = branchname;
    }

    public String getBranchCode() {
        return branchcode;
    }
    public void setBranchCode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getAcademicYear() {
        return academicyear;
    }
    public void setAcademicYear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getSemester() {
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getScheme() {
        return scheme;
    }
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getBatch() {
        return batch;
    }
    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getSubjectName() {
        return subjectname;
    }
    public void setSubjectName(String subjectname) {
        this.subjectname = subjectname;
    }

    public String getSubjectCode() {return subjectcode;}
    public void setSubjectCode(String subjectcode) {
        this.subjectcode = subjectcode;
    }

    public Integer getMark() {
        return mark;
    }
    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getCategory() {return category;}
    public void setCategory(String category) {
        this.category = category;
    }

    public String getQuestionType() {
        return questiontype;
    }
    public void setQuestionType(String questiontype) {
        this.questiontype = questiontype;
    }

    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }

    public Boolean getImportant() {
        return important;
    }
    public void setImportant(Boolean important) {
        this.important = important;
    }

    public Boolean getSelected() {
        return selected;
    }
    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }


    @Id
    private Integer sno;

    @NotNull
    private String branchname;

    @NotNull
    private String branchcode;

    @NotNull
    private String academicyear;

    @NotNull
    private String scheme;

    @NotNull
    private String semester;

    @NotNull
    private String batch;

    @NotNull
    private String subjectname;

    @NotNull
    private String subjectcode;

    @NotNull
    private Integer mark;

    @NotNull
    private String unit;

    @NotNull
    private String model;

    @NotNull
    private String category;

    @NotNull
    private String questiontype;

    @NotNull
    private String question;

    @NotNull
    private Boolean important;

    @NotNull
    private Boolean selected;

    @NotNull
    private String loginuser;

}
