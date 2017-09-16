package com.sivserver.example.management;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by GBCorp on 14/09/2017.
 */
@Entity
@Table(name="foodfeessetting")
public class FoodFeesSetting {

    @Id
    private String academicyear;

    private Date feessettingdate;

    private Long nonvegfoodfees;

    private Long vegfoodfees;

    private String loginuser;

    public FoodFeesSetting() {
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public Date getFeessettingdate() {
        return feessettingdate;
    }

    public void setFeessettingdate(Date feessettingdate) {
        this.feessettingdate = feessettingdate;
    }

    public Long getNonvegfoodfees() {
        return nonvegfoodfees;
    }

    public void setNonvegfoodfees(Long nonvegfoodfees) {
        this.nonvegfoodfees = nonvegfoodfees;
    }

    public Long getVegfoodfees() {
        return vegfoodfees;
    }

    public void setVegfoodfees(Long vegfoodfees) {
        this.vegfoodfees = vegfoodfees;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
