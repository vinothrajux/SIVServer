package com.sivserver.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 01/11/2017.
 */
@RestController
@RequestMapping("/api/v1/playschoolstudentpersonalinformation")
public class PlaySchoolStudentPersonalInformationApiController {

    private PlaySchoolStudentPersonalInformationRepository playSchoolStudentPersonalInformationRepository;

    @Autowired
    private PlaySchoolStudentBaseInformationRepository playSchoolStudentBaseInformationRepository;

    @GetMapping(value="/all")

    public List<PlaySchoolStudentPersonalInformation> getPlaySchoolStudentPersonalInformationDetails() { return playSchoolStudentPersonalInformationRepository.findAll(); }

    public PlaySchoolStudentPersonalInformationApiController(PlaySchoolStudentPersonalInformationRepository playSchoolStudentPersonalInformationRepository)
    {
        this.playSchoolStudentPersonalInformationRepository = playSchoolStudentPersonalInformationRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void playschoolapplicationsale(
            @RequestParam (value="registernumber", required=false) String registernumber,
            @RequestParam (value="candidatename", required=false) String candidatename,
            @RequestParam (value="dateofbirth", required=false) Date dateofbirth,
            @RequestParam (value="age", required=false) Long age,
            @RequestParam (value="gender", required=false) String gender,
            @RequestParam (value="candfathername", required=false) String candfathername,
            @RequestParam (value="candmothername", required=false) String candmothername,
            @RequestParam (value="presentaddress1", required=false) String presentaddress1,
            @RequestParam (value="presentaddress2", required=false) String presentaddress2,
            @RequestParam (value="presentarea", required=false) String presentarea,
            @RequestParam (value="presentpincode", required=false) String presentpincode,
            @RequestParam (value="presentstate", required=false) String presentstate,
            @RequestParam (value="fathersmobileno", required=false) String fathersmobileno,
            @RequestParam (value="fathersaltmobno", required=false) String fathersaltmobno,
            @RequestParam (value="mothersmobileno", required=false) String mothersmobileno,
            @RequestParam (value="mothersaltmobno", required=false) String mothersaltmobno,
            @RequestParam (value="fathersemail", required=false) String fathersemail,
            @RequestParam (value="mothersemail", required=false) String mothersemail,
            @RequestParam (value="reference", required=false) String reference,
            @RequestParam (value="willingtojoin", required=false) String willingtojoin,
            @RequestParam (value="followupdate", required=false) Date followupdate,
            @RequestParam (value="applicationprice", required=false) Long applicationprice,
            @RequestParam (value="applicationpaidmode", required=false) String applicationpaidmode,
            @RequestParam (value="remarks", required=false) String remarks,
            @RequestParam (value="fathersoccupation", required=false) String fathersoccupation,
            @RequestParam (value="fathersofficename", required=false) String fathersofficename,
            @RequestParam (value="fathersofficeaddress1", required=false) String fathersofficeaddress1,
            @RequestParam (value="fathersofficeaddress2", required=false) String fathersofficeaddress2,
            @RequestParam (value="fathersofficearea", required=false) String fathersofficearea,
            @RequestParam (value="fathersofficepincode", required=false) String fathersofficepincode,
            @RequestParam (value="fathersofficestate", required=false) String fathersofficestate,
            @RequestParam (value="fathersofficephoneno", required=false) String fathersofficephoneno,
            @RequestParam (value="fathersofficealtphoneno", required=false) String fathersofficealtphoneno,
            @RequestParam (value="fathersofficeextensionno", required=false) String fathersofficeextensionno,
            @RequestParam (value="mothersoccupation", required=false) String mothersoccupation,
            @RequestParam (value="mothersofficename", required=false) String mothersofficename,
            @RequestParam (value="mothersofficeaddress1", required=false) String mothersofficeaddress1,
            @RequestParam (value="mothersofficeaddress2", required=false) String mothersofficeaddress2,
            @RequestParam (value="mothersofficearea", required=false) String mothersofficearea,
            @RequestParam (value="mothersofficepincode", required=false) String mothersofficepincode,
            @RequestParam (value="mothersofficestate", required=false) String mothersofficestate,
            @RequestParam (value="mothersofficephoneno", required=false) String mothersofficephoneno,
            @RequestParam (value="mothersofficealtphoneno", required=false) String mothersofficealtphoneno,
            @RequestParam (value="fathersdob", required=false) Date fathersdob,
            @RequestParam (value="mothersdob", required=false) Date mothersdob,
            @RequestParam (value="parentsweddingdate", required=false) Date parentsweddingdate,
            @RequestParam (value="religion", required=false) String religion,
            @RequestParam (value="mothersofficeextensionno", required=false) String mothersofficeextensionno,
            @RequestParam (value="pickuppersonname", required=false) String pickuppersonname,
            @RequestParam (value="pickuppersoncontactno", required=false) String pickuppersoncontactno,
            @RequestParam (value="pickuppersonaltcontactno", required=false) String pickuppersonaltcontactno,
            @RequestParam (value="pickuppersonrelationship", required=false) String pickuppersonrelationship,
            @RequestParam (value="transport", required=false) String transport,
            @RequestParam (value="transportstage", required=false) String transportstage,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="loginuser", required=false) String loginuser


            ) {
        PlaySchoolStudentPersonalInformation playschoolstudentpersonalinformation = new PlaySchoolStudentPersonalInformation();

        playschoolstudentpersonalinformation.setCandidatename(candidatename);
        playschoolstudentpersonalinformation.setDateofbirth(dateofbirth);
        playschoolstudentpersonalinformation.setAge(age);
        playschoolstudentpersonalinformation.setGender(gender);
        playschoolstudentpersonalinformation.setCandfathername(candfathername);
        playschoolstudentpersonalinformation.setCandmothername(candmothername);
        playschoolstudentpersonalinformation.setPresentaddress1(presentaddress1);
        playschoolstudentpersonalinformation.setPresentaddress2(presentaddress2);
        playschoolstudentpersonalinformation.setPresentarea(presentarea);
        playschoolstudentpersonalinformation.setPresentpincode(presentpincode);
        playschoolstudentpersonalinformation.setPresentstate(presentstate);
        playschoolstudentpersonalinformation.setFathersmobileno(fathersmobileno);
        playschoolstudentpersonalinformation.setFathersaltmobno(fathersaltmobno);
        playschoolstudentpersonalinformation.setMothersmobileno(mothersmobileno);
        playschoolstudentpersonalinformation.setMothersaltmobno(mothersaltmobno);
        playschoolstudentpersonalinformation.setFathersemail(fathersemail);
        playschoolstudentpersonalinformation.setMothersemail(mothersemail);
        playschoolstudentpersonalinformation.setReference(reference);

        playschoolstudentpersonalinformation.setFathersoccupation(fathersoccupation);
        playschoolstudentpersonalinformation.setFathersofficename(fathersofficename);
        playschoolstudentpersonalinformation.setFathersofficeaddress1(fathersofficeaddress1);
        playschoolstudentpersonalinformation.setFathersofficeaddress2(fathersofficeaddress2);
        playschoolstudentpersonalinformation.setFathersofficearea(fathersofficearea);
        playschoolstudentpersonalinformation.setFathersofficepincode(fathersofficepincode);
        playschoolstudentpersonalinformation.setFathersofficestate(fathersofficestate);
        playschoolstudentpersonalinformation.setFathersofficephoneno(fathersofficephoneno);
        playschoolstudentpersonalinformation.setFathersofficealtphoneno(fathersofficealtphoneno);
        playschoolstudentpersonalinformation.setFathersofficeextensionno(fathersofficeextensionno);
        playschoolstudentpersonalinformation.setMothersoccupation(mothersoccupation);
        playschoolstudentpersonalinformation.setMothersofficename(mothersofficename);
        playschoolstudentpersonalinformation.setMothersofficeaddress1(mothersofficeaddress1);
        playschoolstudentpersonalinformation.setMothersofficeaddress2(mothersofficeaddress2);
        playschoolstudentpersonalinformation.setMothersofficearea(mothersofficearea);
        playschoolstudentpersonalinformation.setMothersofficepincode(mothersofficepincode);
        playschoolstudentpersonalinformation.setMothersofficestate(mothersofficestate);
        playschoolstudentpersonalinformation.setMothersofficephoneno(mothersofficephoneno);
        playschoolstudentpersonalinformation.setMothersofficealtphoneno(mothersofficealtphoneno);
        playschoolstudentpersonalinformation.setMothersofficeextensionno(mothersofficeextensionno);
        playschoolstudentpersonalinformation.setFathersdob(fathersdob);
        playschoolstudentpersonalinformation.setMothersdob(mothersdob);
        playschoolstudentpersonalinformation.setParentsweddingdate(parentsweddingdate);
        playschoolstudentpersonalinformation.setReligion(religion);
        playschoolstudentpersonalinformation.setPickuppersonname(pickuppersonname);
        playschoolstudentpersonalinformation.setPickuppersoncontactno(pickuppersoncontactno);
        playschoolstudentpersonalinformation.setPickuppersonaltcontactno(pickuppersonaltcontactno);
        playschoolstudentpersonalinformation.setPickuppersonrelationship(pickuppersonrelationship);
        playschoolstudentpersonalinformation.setTransport(transport);
        playschoolstudentpersonalinformation.setTransportstage(transportstage);
        playschoolstudentpersonalinformation.setAcademicyear(academicyear);
        playschoolstudentpersonalinformation.setLoginuser(loginuser);

        playSchoolStudentPersonalInformationRepository.save(playschoolstudentpersonalinformation);
    }

    PlaySchoolStudentProfileInformation playSchoolStudentProfileInformation;
    @RequestMapping(method = RequestMethod.POST, value="/getPlaySchoolStudentProfileInformationDetail")

    public List<Object> getPlaySchoolStudentProfileInformationDetail(@RequestParam (value ="registernumber") String registerNumber) {
        /* fetching data from table1*/

        PlaySchoolStudentBaseInformationProjection playSchoolStudentBaseInformationDetail = playSchoolStudentBaseInformationRepository.findOneByRegisternumber(registerNumber);

        /* fetching data from table2 */

        PlaySchoolStudentPersonalInformationProjection playSchoolStudentPersonalInformationDetail = playSchoolStudentPersonalInformationRepository.findOneByRegisternumber(registerNumber);

        List<Object> list = new ArrayList<Object>();

        list.add(playSchoolStudentBaseInformationDetail);
        list.add(playSchoolStudentPersonalInformationDetail);

        return list;

    }

    }
