package com.sivserver.example.teachingstaff;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by GBCorp on 03/11/2017.
 */
@Entity
@Table(name="studentattendancedetailplayschool")
public class StudentAttendanceDetailPlaySchool {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Date entrydate;

    @Column(name="registernumber")
    private String registernumber;

    private String status;

    public StudentAttendanceDetailPlaySchool() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    public String getRegisternumber() {
        return registernumber;
    }

    public void setRegisternumber(String registernumber) {
        this.registernumber = registernumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

