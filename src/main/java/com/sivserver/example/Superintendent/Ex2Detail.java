package com.sivserver.example.Superintendent;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 07/07/2017.
 */
@Entity
@Table(name = "ex2detail")

public class Ex2Detail {

    public String getQuestionCode() {
        return questioncode;
    }
    public void setQuestionCode(String questioncode) {
        this.questioncode = questioncode;
    }

    public String getRegno() {
        return regno;
    }
    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getAttendanceStatus() {
        return attendancestatus;
    }
    public void setAttendanceStatus(String attendancestatus) {
        this.attendancestatus = attendancestatus;
    }

    @Id
    private String questioncode;

    @NotNull
    private String regno;

    @NotNull
    private String attendancestatus;


}
