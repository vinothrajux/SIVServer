package com.sivserver.example.hod;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by Seetha on 29-Jun-17.
 */

@Entity
@Table(name = "subjectallocation")

public class SubjectAllocation {


    public String getBranchName() {return branchname;}
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

    public String getBatch() {
        return batch;
    }
    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getScheme() {
        return scheme;
    }
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getSubjectType() {
        return subjecttype;
    }
    public void setSubjectType(String subjecttype) {
        this.subjecttype = subjecttype;
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

    public String getColumnName() {
        return columnname;
    }
    public void setColumnName(String columnname) {
        this.columnname = columnname;
    }

    public String getInShort() {return inshort;}
    public void setInShort(String inshort) {
        this.inshort = inshort;
    }


    public Integer getRequiredHours() {
        return reqhours;
    }
    public void setRequiredHours(Integer reqhours) {
        this.reqhours = reqhours;
    }


    public Integer getAllottedHours() {
        return allottedhours;
    }
    public void setAllottedHours(Integer allottedhours) {
        this.allottedhours = allottedhours;
    }

    public Integer getHoursPerSyllabus() {
        return hourspersyllabus;
    }
    public void setHoursPerSyllabus(Integer hourspersyllabus) {
        this.hourspersyllabus = hourspersyllabus;
    }

    public String getStaff1_ID() {
        return staff1_id;
    }
    public void setStaff1_ID(String staff1_id) {
        this.staff1_id = staff1_id;
    }

    public String getStaff1_Name() {
        return staff1_name;
    }
    public void setStaff1_Name(String staff1_name) {
        this.staff1_name = staff1_name;
    }

    public String getStaff2_ID() {
        return staff2_id;
    }
    public void setStaff2_ID(String staff2_id) {
        this.staff2_id = staff2_id;
    }

    public String getStaff2_Name() {
        return staff2_name;
    }
    public void setStaff2_Name(String staff2_name) {
        this.staff2_name = staff2_name;
    }

    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day = day;
    }

    public Integer getHour() {
        return hour;
    }
    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Integer getColumnNo() {
        return columnno;
    }
    public void setColumnNo(Integer columnno) {
        this.columnno = columnno;
    }

    public Integer getTotalWeekHours() {
        return totweekhours;
    }
    public void setTotalWeekHours(Integer totweekhours) {
        this.totweekhours = totweekhours;
    }

    public Integer getLoadHours1() {
        return loadhours1;
    }
    public void setLoadHours1(Integer loadhours1) {
        this.loadhours1 = loadhours1;
    }

    public Integer getLoadHours2() {
        return loadhours2;
    }
    public void setLoadHours2(Integer loadhours2) {
        this.loadhours2 = loadhours2;
    }

    public Integer getClassRoomNo() {
        return classroomno;
    }
    public void setClassRoomNo(Integer classroomno) {
        this.classroomno = classroomno;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }


    @NotNull
    private String branchname;

    @NotNull
    private String branchcode;

    @NotNull
    private String academicyear;

    @NotNull
    private String semester;

    @NotNull
    private String batch;

    @NotNull
    private String scheme;

    @NotNull
    private String subjecttype;

    @NotNull
    private String subjectname;

    @Id
    private String subjectcode;

    @NotNull
    private String columnname;

    @NotNull
    private String inshort;

    @NotNull
    private Integer reqhours;

    @NotNull
    private Integer allottedhours;

    @NotNull
    private Integer hourspersyllabus;

    @NotNull
    private String staff1_id;

    @NotNull
    private String staff1_name;

    @NotNull
    private String staff2_id;

    @NotNull
    private String staff2_name;

    @NotNull
    private String day;

    @NotNull
    private Integer hour;

    @NotNull
    private Integer columnno;

    @NotNull
    private Integer totweekhours;

    @NotNull
    private Integer loadhours1;

    @NotNull
    private Integer loadhours2;

    @NotNull
    private Integer classroomno;

    @NotNull
    private String loginuser;


}
