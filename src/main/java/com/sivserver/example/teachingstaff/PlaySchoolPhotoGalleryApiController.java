package com.sivserver.example.teachingstaff;

import com.sivserver.example.student.PlaySchoolStudentBaseInformation;
import com.sivserver.example.utils.SivUtils;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 16-Dec-17.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/playschoolphotogallery")
public class PlaySchoolPhotoGalleryApiController {
    @Autowired
    private PlaySchoolPhotoGalleryRepository playSchoolPhotoGalleryRepository;

//    @Autowired
//    private  playSchoolPhotoGalleryRepository;

    @RequestMapping(value="/all", method = RequestMethod.POST)
    public List<PlaySchoolPhotoGallery> getPlaySchoolPhotoGallery() { return playSchoolPhotoGalleryRepository.findAll();}

    public PlaySchoolPhotoGalleryApiController (PlaySchoolPhotoGalleryRepository playSchoolPhotoGalleryRepository){
        this.playSchoolPhotoGalleryRepository = playSchoolPhotoGalleryRepository;
    }


    @RequestMapping(method = RequestMethod.POST)
    public void playschoolphotoupload(
            @RequestParam(value = "uploaddate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date uploaddate,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "program", required = false) String program,
            @RequestParam(value = "section", required = false) String section,
            @RequestParam(value = "uploadedby", required = false) String uploadedby,
            @RequestParam(value = "studentlist", required = false) String studentlist,
            @RequestParam(value = "imagepath", required = false) String imagepath,
            @RequestParam(value = "imagetitle", required = false) String imagetitle,
            @RequestParam(value = "encodedimage", required = false) String encodedimage,
            @RequestParam(value = "loginuser", required = false) String loginuser,
            @RequestParam(value = "instituteid", required = false) Integer instituteid

    ){
        SivUtils sivUtils = new SivUtils();
        String serverfilepath = sivUtils.getServerPhotoGalleryLocalPath();
        byte decodedimage[] = Base64.decodeBase64(encodedimage);
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File(serverfilepath+imagepath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            fos.write(decodedimage);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        PlaySchoolPhotoGallery playSchoolPhotoGallery = new PlaySchoolPhotoGallery();

        System.out.println(encodedimage);
        System.out.println(uploaddate);
        System.out.println(academicyear);
        System.out.println(program);
        System.out.println(section);
        System.out.println(uploadedby);
        System.out.println(studentlist);
        System.out.println(imagepath);
        System.out.println(imagetitle);
        imagepath = sivUtils.getServerPhotoGalleryPath()+imagepath;
        playSchoolPhotoGallery.setUploaddate(uploaddate);
        playSchoolPhotoGallery.setAcademicyear(academicyear);
        playSchoolPhotoGallery.setProgram(program);
        playSchoolPhotoGallery.setSection(section);
        playSchoolPhotoGallery.setUploadedby(uploadedby);
        playSchoolPhotoGallery.setStudentlist(studentlist);
        playSchoolPhotoGallery.setImagepath(imagepath);
        playSchoolPhotoGallery.setImagetitle(imagetitle);
        playSchoolPhotoGallery.setLoginuser(loginuser);
        playSchoolPhotoGallery.setInstituteid(instituteid);

        playSchoolPhotoGalleryRepository.save(playSchoolPhotoGallery);
    }

    @RequestMapping(method = RequestMethod.POST, value="/getStudentListAttendance")
    public Iterable<PlaySchoolStudentBaseInformation> getStudentLists(
            @RequestParam(value ="program", required=false) String program,
            @RequestParam (value="section", required=false) String section,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="instituteid", required=false) Integer instituteid

    ){


//        StudentAttendanceHeaderEntryCheckPlaySchoolProjection playschoolstudentattendanceentrycheckDetail = studentAttendanceHeaderPlaySchoolRepository.findOneByStudentattendanceplayschoolcompoundkey(studattpscompkey);

        Iterable<PlaySchoolStudentBaseInformation> studentList = null;
//        if(playschoolstudentattendanceentrycheckDetail==null){
//            System.out.println("is null");
//            studentList = playSchoolStudentBaseInformationRepository.findAllByStandardstudyingAndSectionAndAcademicyearAndStudentstatusAndInstituteid(standardstudying, section, academicyear, studentstatus, instituteid);
//        }else{
//            System.out.println("is not null");
//        }
//
//
//        System.out.println("Inside getApplicationDetail");
        return studentList;
    }
}
