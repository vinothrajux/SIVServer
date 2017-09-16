package com.sivserver.example.placement;

import javax.persistence.Column;
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

    @Id
    private Integer id;

    @Column(name="corporateid")
    private String corporateid;

    private String requiredBranchCode;

    private String requiredStudentCategory;

    public CorporateDetail() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCorporateid() {
        return corporateid;
    }

    public void setCorporateid(String corporateid) {
        this.corporateid = corporateid;
    }

    public String getRequiredBranchCode() {
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
}

