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
    public String getCorporateId(){
        return corporateid;
    }
    public void setCorporateId(String corporateid) {
        this.corporateid = corporateid;
    }

    public String getRequiredBranchCode(){
        return requiredBranchCode;
    }
    public void setRequiredBranchCode(String requiredBranchCode) {
        this.requiredBranchCode = requiredBranchCode;
    }

    public String getRequiredStudentCategory() {
        return requiredStudentCategory;
    }
    public void setRequiredStudentCategory(String requiredStudentCategory) {
        this.requiredStudentCategory = requiredStudentCategory;
    }


    @NotNull
    private String corporateid;

    @Id
    private String requiredBranchCode;

    @NotNull
    private String requiredStudentCategory;


}

