package com.sivserver.example.teachingstaff;

import com.sivserver.example.utils.SivUtils;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created by Seetha on 16-Dec-17.
 */
@RestController
@RequestMapping("/api/v1/playschoolphotogallery")
public class PlaySchoolPhotoGalleryApiController {
    @Autowired
    private PlaySchoolPhotoGalleryRepository playSchoolPhotoGalleryRepository;

    @RequestMapping(value="/all", method = RequestMethod.POST)
    public List<PlaySchoolPhotoGallery> getPlaySchoolPhotoGallery() { return playSchoolPhotoGalleryRepository.findAll();}

    public PlaySchoolPhotoGalleryApiController (PlaySchoolPhotoGalleryRepository playSchoolPhotoGalleryRepository){
        this.playSchoolPhotoGalleryRepository = playSchoolPhotoGalleryRepository;
    }


    @RequestMapping(method = RequestMethod.POST)
    public void playschoolphotoupload(
            @RequestParam(value = "uploaddate", required = false) Date uploaddate,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "program", required = false) String program,
            @RequestParam(value = "section", required = false) String section,
            @RequestParam(value = "uploadedby", required = false) String uploadedby,
            @RequestParam(value = "studentlist", required = false) String studentlist,
            @RequestParam(value = "imagepath", required = false) String imagepath,
            @RequestParam(value = "imagetitle", required = false) String imagetitle,
            @RequestParam(value = "encodedimage", required = false) String encodedimage

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

        playSchoolPhotoGalleryRepository.save(playSchoolPhotoGallery);
    }
}
