package com.sivserver.example.placement;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by GBCorp on 07/07/2017.
 */
@Entity
@Table(name = "corporatedetail")

public class CorporateDetail {
    public String getCorporateid(){
        return corporateid;
    }
    public void setCorporateid(String corporateid) {
        this.corporateid = corporateid;
    }

    public String getRequiredbranchcode(){
        return requiredBranchCode;
    }
    public void setRequiredbranchcode(String requiredBranchCode) {
        this.requiredBranchCode = requiredBranchCode;
    }

    public String getRequiredstudentcategory() {
        return requiredStudentCategory;
    }
    public void setRequiredstudentcategory(String requiredStudentCategory) {
        this.requiredStudentCategory = requiredStudentCategory;
    }


    @NotNull
    private String corporateid;

    @Id
    private String requiredBranchCode;

    @NotNull
    private String requiredStudentCategory;


}

