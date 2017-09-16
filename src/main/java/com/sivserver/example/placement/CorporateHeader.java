package com.sivserver.example.placement;

import com.sivserver.example.parent.StudentLeaveLetter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 07/07/2017.
 */
@Entity
@Table(name = "corporateheader")

public class CorporateHeader {

    @Id
    @Column(name="corporateid")
    private String corporateid;


    private String corporatename;


    private String corporatetype;


    private String hrname;


    private String hrcontactnumber;


    private String hralternatecontactno;


    private String hrmailid;


    private String hraltmailid;


    private String loginuser;

    @OneToMany
    @JoinColumn(name="corporateid",referencedColumnName = "corporateid")
    private List<CorporateDetail> corporateDetail_regno;

    @OneToMany
    @JoinColumn(name="corporateid",referencedColumnName = "corporateid")
    private List<CampusRequestHeader> campusRequestHeader_corporateid;


    public CorporateHeader() {
    }

    public CorporateHeader(String corporateid) {
        this.corporateid = corporateid;
    }

    public String getCorporateid() {
        return corporateid;
    }

    public void setCorporateid(String corporateid) {
        this.corporateid = corporateid;
    }

    public String getCorporatename() {
        return corporatename;
    }

    public void setCorporatename(String corporatename) {
        this.corporatename = corporatename;
    }

    public String getCorporatetype() {
        return corporatetype;
    }

    public void setCorporatetype(String corporatetype) {
        this.corporatetype = corporatetype;
    }

    public String getHrname() {
        return hrname;
    }

    public void setHrname(String hrname) {
        this.hrname = hrname;
    }

    public String getHrcontactnumber() {
        return hrcontactnumber;
    }

    public void setHrcontactnumber(String hrcontactnumber) {
        this.hrcontactnumber = hrcontactnumber;
    }

    public String getHralternatecontactno() {
        return hralternatecontactno;
    }

    public void setHralternatecontactno(String hralternatecontactno) {
        this.hralternatecontactno = hralternatecontactno;
    }

    public String getHrmailid() {
        return hrmailid;
    }

    public void setHrmailid(String hrmailid) {
        this.hrmailid = hrmailid;
    }

    public String getHraltmailid() {
        return hraltmailid;
    }

    public void setHraltmailid(String hraltmailid) {
        this.hraltmailid = hraltmailid;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }

    public List<CorporateDetail> getCorporateDetail_regno() {
        return corporateDetail_regno;
    }

    public void setCorporateDetail_regno(List<CorporateDetail> corporateDetail_regno) {
        this.corporateDetail_regno = corporateDetail_regno;
    }

    public List<CampusRequestHeader> getCampusRequestHeader_corporateid() {
        return campusRequestHeader_corporateid;
    }

    public void setCampusRequestHeader_corporateid(List<CampusRequestHeader> campusRequestHeader_corporateid) {
        this.campusRequestHeader_corporateid = campusRequestHeader_corporateid;
    }
}
