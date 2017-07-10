package com.sivserver.example.placement;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 07/07/2017.
 */
@Entity
@Table(name = "corporateheader")

public class CorporateHeader {
    public String getCorporateId(){
        return corporateid;
    }
    public void setCorporateId(String corporateid) {
        this.corporateid = corporateid;
    }

    public String getCorporateName(){
        return corporatename;
    }
    public void setCorporateName(String corporatename) {
        this.corporatename = corporatename;
    }

    public String getCorporateTpe() {
        return corporatetype;
    }
    public void setCoporateType(String corporatetype) {
        this.corporatetype = corporatetype;
    }

    public String getHRName() {
        return hrname;
    }
    public void setHRName(String hrname) {
        this.hrname = hrname;
    }

    public String getContactNumber() {
        return hrcontactnumber;
    }
    public void setContactNumber(String hrcontactnumber) {
        this.hrcontactnumber = hrcontactnumber;
    }
    public String getHRAlternateContactNo() {
        return hralternatecontactno;
    }
    public void setHRAlternateContactNo(String hralternatecontactno) {
        this.hralternatecontactno = hralternatecontactno;
    }

    public String getHRMailId() {
        return hrmailid;
    }
    public void setHRMailId(String hrmailid) {
        this.hrmailid = hrmailid;
    }

    public String getHRAltMailId() {
        return hraltmailid;
    }
    public void setHRAltMailId(String hraltmailid) {
        this.hraltmailid = hraltmailid;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }

    @NotNull
    private String corporateid;

    @Id
    private String corporatename;

    @NotNull
    private String corporatetype;

    @NotNull
    private String hrname;

    @NotNull
    private String hrcontactnumber;

    @NotNull
    private String hralternatecontactno;

    @NotNull
    private String hrmailid;

    @NotNull
    private String hraltmailid;

    @NotNull
    private String loginuser;


}
