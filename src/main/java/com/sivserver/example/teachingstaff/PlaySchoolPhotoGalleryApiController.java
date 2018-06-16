package com.sivserver.example.teachingstaff;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.*;
import org.apache.commons.io.FilenameUtils;

import com.sivserver.example.student.PlaySchoolStudentBaseInformation;
import com.sivserver.example.student.PlaySchoolStudentBaseInformationRepository;
import com.sivserver.example.utils.SivUtils;
import org.apache.tomcat.util.codec.binary.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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
    @Autowired
    private PlaySchoolStudentBaseInformationRepository playSchoolStudentBaseInformationRepository;

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
        playSchoolPhotoGallery.setName(studentlist);
        playSchoolPhotoGallery.setImagepath(imagepath);
        playSchoolPhotoGallery.setImagetitle(imagetitle);
        playSchoolPhotoGallery.setLoginuser(loginuser);
        playSchoolPhotoGallery.setInstituteid(instituteid);

        playSchoolPhotoGalleryRepository.save(playSchoolPhotoGallery);
    }

    @RequestMapping(method = RequestMethod.POST, value="/uploadPhotos")
    public @ResponseBody String playschooluploadPhotos(
//            @RequestParam(value = "photouploadplayschooldata", required = false) String photouploadplayschooldata,
//            @RequestParam(value = "students", required = false) String students,
            @RequestParam("files") MultipartFile multipartFiles,
            @RequestParam("program") String program,
            @RequestParam("section") String section,
            @RequestParam("academicyear") String academicyear,
            @RequestParam("imagetitle") String imagetitle,
            @RequestParam("instituteid") int instituteid,
            @RequestParam("studentlist") String studentlist,
            @RequestParam("uploadid") String uploadid


    ) throws IOException{
        SivUtils sivUtils = new SivUtils();

        java.sql.Timestamp timestamp = new java.sql.Timestamp(System.currentTimeMillis());
        timestamp.getTime();
        String imagename = timestamp.getTime()+multipartFiles.getOriginalFilename();
        System.out.println("imagename");
        System.out.println(imagename);
        String serverfilepath = "images/uploaded/"+imagename;
        String imagePath = "http://siv.gbcorp.in/"+serverfilepath;
//        System.out.println(new ProfileCredentialsProvider().getCredentials().getAWSAccessKeyId());
        AmazonS3 s3client = new AmazonS3Client(new ProfileCredentialsProvider());
        try{
            InputStream is = multipartFiles.getInputStream();
            s3client.putObject(new PutObjectRequest("siv.gbcorp.in",serverfilepath,is,new ObjectMetadata()).withCannedAcl(CannedAccessControlList.PublicRead));
            S3Object s3object = s3client.getObject(new GetObjectRequest("siv.gbcorp.in", serverfilepath));
            System.out.println(s3object.getObjectContent().getHttpRequest().getURI().toString());


            try {
                JSONArray studentListArrayObj = new JSONArray(studentlist);
//            String entrydate=pickupdetailsattributesObj.getString("entrydate");
//            Date pickupdate=null;
//            try {
//                pickupdate=new SimpleDateFormat("dd/MM/yyyy").parse(entrydate);
//            } catch (ParseException e) {
//                e.printStackTrace();
//            }
                String studentphotoaccess = "";
                DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                Date today = new Date();
                Date todayWithZeroTime = null;
                try {
                    todayWithZeroTime = formatter.parse(formatter.format(today));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                for (int i=0; i<studentListArrayObj.length(); i++ ){
                    System.out.println("student photoacces"+i+":");
                    System.out.println(studentphotoaccess);
                    JSONObject objectInArray = studentListArrayObj.getJSONObject(i);
                    PlaySchoolPhotoGallery playSchoolPhotoGallery = new PlaySchoolPhotoGallery();
                    studentphotoaccess = objectInArray.getString("studentphotoaccess");
                    if(studentphotoaccess.equals("1")){
                        System.out.println(objectInArray.getString("candidatename"));
                        playSchoolPhotoGallery.setRegisternumber(objectInArray.getString("registernumber"));
                        playSchoolPhotoGallery.setProgram(program);
                        playSchoolPhotoGallery.setSection(section);
                        playSchoolPhotoGallery.setAcademicyear(academicyear);
                        playSchoolPhotoGallery.setInstituteid(instituteid);
                        playSchoolPhotoGallery.setName(objectInArray.getString("candidatename"));
                        playSchoolPhotoGallery.setImagepath(imagePath);
                        playSchoolPhotoGallery.setImagetitle(imagetitle);
                        playSchoolPhotoGallery.setUploaddate(todayWithZeroTime);
                        playSchoolPhotoGalleryRepository.save(playSchoolPhotoGallery);

//                    System.out.println("Id:"+playSchoolPhotoGallery.getPhotoid());
//                    playSchoolPhotoGallery.setPhotoid(playSchoolPhotoGallery.getPhotoid());
//                    imagepath = sivUtils.getServerPhotoGalleryPath()+playSchoolPhotoGallery.getPhotoid()+"."+FilenameUtils.getExtension(multipartFiles.getOriginalFilename());


//        try {
//            System.out.println("size:"+multipartFiles.getBytes());
//            System.out.println("size:"+multipartFiles.getOriginalFilename());
//            if(!multipartFiles.isEmpty()){
//                String filename = playSchoolPhotoGallery.getPhotoid()+"."+FilenameUtils.getExtension(multipartFiles.getOriginalFilename());
//                String directory = sivUtils.getServerUploadPath();
//
//                System.out.println("size:"+Paths.get(directory, filename).toString());
//                String filepath = Paths.get(directory, filename).toString();
//
//                // Save the file locally
//                BufferedOutputStream stream =
//                        new BufferedOutputStream(new FileOutputStream(new File(filepath)));
//                stream.write(multipartFiles.getBytes());
//                stream.close();
//
////                AmazonS3 s3Client = new AmazonS3Client();
////                    s3Client.putObject(new PutObjectRequest("siv.gbcorp.in", "images/uploaded/", multipartFiles))
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }








                    }

                }
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        catch (IOException e){

            e.printStackTrace();
        }
        return uploadid;
    }

    @RequestMapping(method = RequestMethod.POST, value="/getMediaList")
    public Iterable<PlaySchoolPhotoGallery> getMediaList(
            @RequestParam (value="registernumber", required=false) String registernumber,
            @RequestParam (value="instituteid", required=false) Integer instituteid

    ){
        Iterable<PlaySchoolPhotoGallery> mediaList = playSchoolPhotoGalleryRepository.findByRegisternumberAndInstituteid(registernumber, instituteid);
        System.out.println("Inside getApplicationDetail");
        return mediaList;
    }


    @RequestMapping(method = RequestMethod.POST, value="/getStudentList")
    public Iterable<PlaySchoolStudentBaseInformation> getStudentLists(
            @RequestParam(value ="program", required=false) String program,
            @RequestParam (value="section", required=false) String section,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="instituteid", required=false) Integer instituteid

    ){


//        StudentAttendanceHeaderEntryCheckPlaySchoolProjection playschoolstudentattendanceentrycheckDetail = studentAttendanceHeaderPlaySchoolRepository.findOneByStudentattendanceplayschoolcompoundkey(studattpscompkey);

        Iterable<PlaySchoolStudentBaseInformation> studentList = playSchoolStudentBaseInformationRepository.findAllByStandardstudyingAndSectionAndAcademicyearAndInstituteid(program, section, academicyear, instituteid);
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
