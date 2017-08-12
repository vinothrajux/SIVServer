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
    public String getCorporateid(){
        return corporateid;
    }
    public void setCorporateid(String corporateid) {
        this.corporateid = corporateid;
    }

    public String getCorporatename(){
        return corporatename;
    }
    public void setCorporatename(String corporatename) {
        this.corporatename = corporatename;
    }

    public String getCorporatetpe() {
        return corporatetype;
    }
    public void setCoporatetype(String corporatetype) {
        this.corporatetype = corporatetype;
    }

    public String getHrname() {
        return hrname;
    }
    public void setHrname(String hrname) {
        this.hrname = hrname;
    }

    public String getContactnumber() {
        return hrcontactnumber;
    }
    public void setContactnumber(String hrcontactnumber) {
        this.hrcontactnumber = hrcontactnumber;
    }
    public String getHralternatecontactno() {
        return hralternatecontactno;
    }
    public void setHralternatecontactno(String hralternatecontactno) {
        this.hralternatecontactno = hralternatecontactno;
    }

    public String getHrmailId() {
        return hrmailid;
    }
    public void setHrmailId(String hrmailid) {
        this.hrmailid = hrmailid;
    }

    public String getHraltmailId() {
        return hraltmailid;
    }
    public void setHraltmailId(String hraltmailid) {
        this.hraltmailid = hraltmailid;
    }

    public String getLoginuser() {
        return loginuser;
    }
    public void setLoginuser(String loginuser) {
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
