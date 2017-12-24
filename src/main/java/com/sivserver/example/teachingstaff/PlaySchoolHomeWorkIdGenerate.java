package com.sivserver.example.teachingstaff;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by GB Corp on 12/23/2017.
 */
@Entity
@Table(name = "playschoolhomeworkidgenerate")
public class PlaySchoolHomeWorkIdGenerate {


    @Id
    private Integer idno;

    private Integer homeworkid;


    public PlaySchoolHomeWorkIdGenerate() {
    }

    public Integer getIdno() {
        return idno;
    }

    public void setIdno(Integer idno) {
        this.idno = idno;
    }

    public Integer getHomeworkid() {
        return homeworkid;
    }

    public void setHomeworkid(Integer homeworkid) {
        this.homeworkid = homeworkid;
    }

}
