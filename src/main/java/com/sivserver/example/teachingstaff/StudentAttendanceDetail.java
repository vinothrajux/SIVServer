package com.sivserver.example.teachingstaff;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 01/07/2017.
 */
@Entity
@Table(name = "studentattendancedetail")

public class StudentAttendanceDetail {
    public Date getAttendanceEntryDate(){
        return entrydate;
    }
    public void setAttendanceEntryDate(Date entrydate) {
        this.entrydate = entrydate;
    }

    public Integer getHour() {
        return hour;
    }
    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public String getRegno() {
        return regno;
    }
    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }


    @NotNull
    private Date entrydate;

    @NotNull
    private Integer hour;

    @Id
    private String regno;

    @NotNull
    private String status;

    

}
