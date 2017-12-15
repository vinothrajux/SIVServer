package com.sivserver.example.admission;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Seetha on 15-Dec-17.
 */
@Entity
@Table(name = "playschoolprogramadmissionnogenerate")

public class PlaySchoolProgramAdmissionNoGenerate {

    @Id
    private Integer idno;

    private Long todprgno;

    private Long prekgprgno;

    private Long kgoneprgno;

    private Long kgtwoprgno;

    private Long waitlistno;

    public PlaySchoolProgramAdmissionNoGenerate() {
    }

    public Integer getIdno() {
        return idno;
    }

    public void setIdno(Integer idno) {
        this.idno = idno;
    }

    public Long getTodprgno() {
        return todprgno;
    }

    public void setTodprgno(Long todprgno) {
        this.todprgno = todprgno;
    }

    public Long getPrekgprgno() {
        return prekgprgno;
    }

    public void setPrekgprgno(Long prekgprgno) {
        this.prekgprgno = prekgprgno;
    }

    public Long getKgoneprgno() {
        return kgoneprgno;
    }

    public void setKgoneprgno(Long kgoneprgno) {
        this.kgoneprgno = kgoneprgno;
    }

    public Long getKgtwoprgno() {
        return kgtwoprgno;
    }

    public void setKgtwoprgno(Long kgtwoprgno) {
        this.kgtwoprgno = kgtwoprgno;
    }

    public Long getWaitlistno() {
        return waitlistno;
    }

    public void setWaitlistno(Long waitlistno) {
        this.waitlistno = waitlistno;
    }
}

