package com.sivserver.example.admission;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 01/07/2017.
 */
@Entity
@Table(name = "bformdetail")

public class BformDetail  {
    public String getApplicatonno(){
        return applicationno;
    }
    public void setApplicationno(String applicationno) {
        this.applicationno = applicationno;
    }

    public String getPhotoid(){
        return photoid;
    }
    public void setPhotoid(String photoid) {
        this.photoid = photoid;
    }

    public Integer getSubject1(){
        return subject1;
    }
    public void setSubject1(Integer subject1) {
        this.subject1 = subject1;
    }

    public Integer getSubject2(){
        return subject2;
    }
    public void setSubject2(Integer subject2) {
        this.subject2 = subject2;
    }


    public Integer getSubject3() {
        return subject3;
    }
    public void setSubect3(Integer subject3) {
        this.subject3 = subject3;
    }

    public Integer getTotal() {
        return total;
    }
    public void setTotal(Integer total) {
        this.total = total;
    }

    public Long getPecentage() {
        return percentage;
    }
    public void setPercentage(Long percentage) {
        this.percentage = percentage;
    }


    @NotNull
    private String applicationno;

    @Id
    private String photoid;

    @NotNull
    private Integer subject1;

    @NotNull
    private Integer subject2;

    @NotNull
    private Integer subject3;

    @NotNull
    private Integer total;

    @NotNull
    private Long percentage;

}
