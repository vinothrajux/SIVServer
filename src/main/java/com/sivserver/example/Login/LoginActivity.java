package com.sivserver.example.Login;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Seetha on 03-Dec-18.
 */
@Entity
@Table(name="loginactivity")

public class LoginActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String registernumber;

    private Date  logindate;

    private String device;

    private Integer instituteid;

    private String userrole;

    private String userfullname;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getLogindate() {
        return logindate;
    }

    public void setLogindate(Date logindate) {
        this.logindate = logindate;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public Integer getInstituteid() {
        return instituteid;
    }

    public void setInstituteid(Integer instituteid) {
        this.instituteid = instituteid;
    }

    public String getUserrole() {
        return userrole;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole;
    }

    public String getUserfullname() {
        return userfullname;
    }

    public void setUserfullname(String userfullname) {
        this.userfullname = userfullname;
    }

    public String getRegisternumber() {
        return registernumber;
    }

    public void setRegisternumber(String registernumber) {
        this.registernumber = registernumber;
    }
}
