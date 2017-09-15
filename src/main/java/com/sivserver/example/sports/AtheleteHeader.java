package com.sivserver.example.sports;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by GBCorp on 14/07/2017.
 */
@Entity
@Table(name = "atheleteheader")

public class AtheleteHeader {

    @Id
    private String atheleteid;

    @Column(name="regno")
    private String regno;


    private String branchcode;


    private String batch;


    private Integer semester;


    private String academicyear;


    private String loginuser;

    @OneToMany
    @JoinColumn(name="atheleteid",referencedColumnName = "atheleteid")
    private List<AtheleteDetail> atheleteDetail_regno;


    public AtheleteHeader() {
    }

    public AtheleteHeader(String atheleteid) {
        this.atheleteid = atheleteid;
    }

    public String getAtheleteid() {
        return atheleteid;
    }

    public void setAtheleteid(String atheleteid) {
        this.atheleteid = atheleteid;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
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

    public List<AtheleteDetail> getAtheleteDetail_regno() {
        return atheleteDetail_regno;
    }

    public void setAtheleteDetail_regno(List<AtheleteDetail> atheleteDetail_regno) {
        this.atheleteDetail_regno = atheleteDetail_regno;
    }
}

