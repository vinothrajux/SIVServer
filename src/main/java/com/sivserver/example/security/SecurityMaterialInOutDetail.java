package com.sivserver.example.security;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 03/08/2017.
 */
@Entity
@Table(name = "securitymaterialinoutdetail")
public class SecurityMaterialInOutDetail {
    public String getMatgatepassid(){
        return matgatepassid;
    }
    public void setMatgatepassid(String matgatepassid) {
        this.matgatepassid = matgatepassid;
    }

    public String getMaterialcode(){
        return materialcode;
    }
    public void setMaterialcode(String materialcode) {
        this.materialcode = materialcode;
    }

    public String getMaterialname(){
        return materialname;
    }
    public void setMaterialname(String materialname) {
        this.materialname = materialname;
    }

    public String getMaterialcondition(){
        return materialcondition;
    }
    public void setMaterialcondition(String materialcondition) {
        this.materialcondition = materialcondition;
    }

    public Integer getNoofitems(){
        return noofitems;
    }
    public void setNoofitems(Integer noofitems) {
        this.noofitems = noofitems;
    }


    @Id
    private String matgatepassid;

    @NotNull
    private String materialcode;

    @NotNull
    private String materialname;

    @NotNull
    private String materialcondition;

    @NotNull
    private Integer noofitems;


}

