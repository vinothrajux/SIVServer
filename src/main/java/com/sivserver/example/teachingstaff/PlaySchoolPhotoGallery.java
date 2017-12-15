package com.sivserver.example.teachingstaff;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Seetha on 16-Dec-17.
 */
@Entity
@Table(name="playschoolphotogallery")
public class PlaySchoolPhotoGallery {


//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Integer photoid;

    private Date uploaddate;

    private String academicyear;

    private String program;

    private String section;

    private String uploadedby;

    private String studentlist;

    @Id
    private String imagepath;

    private String imagetitle;

    public PlaySchoolPhotoGallery() {
    }

//    public Integer getPhotoid() {
//        return photoid;
//    }
//
//    public void setPhotoid(Integer photoid) {
//        this.photoid = photoid;
//    }

    public Date getUploaddate() {
        return uploaddate;
    }

    public void setUploaddate(Date uploaddate) {
        this.uploaddate = uploaddate;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getUploadedby() {
        return uploadedby;
    }

    public void setUploadedby(String uploadedby) {
        this.uploadedby = uploadedby;
    }

    public String getStudentlist() {
        return studentlist;
    }

    public void setStudentlist(String studentlist) {
        this.studentlist = studentlist;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    public String getImagetitle() {
        return imagetitle;
    }

    public void setImagetitle(String imagetitle) {
        this.imagetitle = imagetitle;
    }
}
