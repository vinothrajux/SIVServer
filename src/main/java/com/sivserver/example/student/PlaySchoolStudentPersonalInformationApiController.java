package com.sivserver.example.student;

import com.sivserver.example.teachingstaff.ChildsPickupPlaySchoolProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 01/11/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
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
            @RequestParam (value="dateofbirth", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date dateofbirth,
            @RequestParam (value="age", required=false) float age,
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
            @RequestParam (value="followupdate", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date followupdate,
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
            @RequestParam (value="mothersofficeextensionno", required=false) String mothersofficeextensionno,
            @RequestParam (value="siblings", required=false) String siblings,
            @RequestParam (value="siblingname", required=false) String siblingname,
            @RequestParam (value="siblingdob", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date siblingdob,
            @RequestParam (value="siblingage", required=false) float siblingage,
            @RequestParam (value="medicaldetails", required=false) String medicaldetails,
            @RequestParam (value="allergies", required=false) String allergies,

            @RequestParam (value="fathersdob", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date fathersdob,
            @RequestParam (value="mothersdob", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date mothersdob,
            @RequestParam (value="parentsweddingdate", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date parentsweddingdate,
            @RequestParam (value="religion", required=false) String religion,

            @RequestParam (value="pickuppersonname", required=false) String pickuppersonname,
            @RequestParam (value="pickuppersoncontactno", required=false) String pickuppersoncontactno,
            @RequestParam (value="pickuppersonaltcontactno", required=false) String pickuppersonaltcontactno,
            @RequestParam (value="pickuppersonrelationship", required=false) String pickuppersonrelationship,
            @RequestParam (value="transport", required=false) String transport,
            @RequestParam (value="transportstage", required=false) String transportstage,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="loginuser", required=false) String loginuser,
            @RequestParam (value="instituteid", required=false) Integer instituteid,

            @RequestParam (value="emisno", required=false) String emisno,

            @RequestParam (value="bloodgroup", required=false) String bloodgroup,
            @RequestParam (value="community", required=false) String community,
            @RequestParam (value="caste", required=false) String caste,
            @RequestParam (value="fathermonthlyincome", required=false) Double fathermonthlyincome,
            @RequestParam (value="mothersmonthlyincome", required=false) Double mothersmonthlyincome,
            @RequestParam (value="lastschoolname", required=false) String lastschoolname,
            @RequestParam (value="lastschoolclass", required=false) String lastschoolclass,
            @RequestParam (value="lastschoolclassqualified", required=false) String lastschoolclassqualified,
            @RequestParam (value="lastschooltcattached", required=false) String lastschooltcattached,
            @RequestParam (value="lastschoolmedium", required=false) String lastschoolmedium,
            @RequestParam (value="lastschoolyearofstudy", required=false) String lastschoolyearofstudy,
            @RequestParam (value="classintoadmission", required=false) String classintoadmission,
            @RequestParam (value="mothertoungue", required=false) String mothertoungue,
            @RequestParam (value="aadharno", required=false) String aadharno,
            @RequestParam (value="extracurricular", required=false) String extracurricular,
            @RequestParam (value="achievements", required=false) String achievements,
            @RequestParam (value="identificationmarks", required=false) String identificationmarks,
            @RequestParam (value="siblingclass", required=false) String siblingclass,
            @RequestParam (value="siblingsection", required=false) String siblingsection

            ) {
        PlaySchoolStudentPersonalInformation playschoolstudentpersonalinformation = new PlaySchoolStudentPersonalInformation();

        playschoolstudentpersonalinformation.setRegisternumber(registernumber);
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
//        playschoolstudentpersonalinformation.setPresentstate(presentstate);
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
        playschoolstudentpersonalinformation.setSiblings(siblings);
        playschoolstudentpersonalinformation.setSiblingname(siblingname);
        playschoolstudentpersonalinformation.setSiblingdob(siblingdob);
        playschoolstudentpersonalinformation.setSiblingage(siblingage);
        playschoolstudentpersonalinformation.setMedicaldetails(medicaldetails);
        playschoolstudentpersonalinformation.setAllergies(allergies);
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
        playschoolstudentpersonalinformation.setInstituteid(instituteid);

        playschoolstudentpersonalinformation.setEmisno(emisno);
        playschoolstudentpersonalinformation.setBloodgroup(bloodgroup);
        playschoolstudentpersonalinformation.setCommunity(community);
        playschoolstudentpersonalinformation.setCaste(caste);
        playschoolstudentpersonalinformation.setFathermonthlyincome(fathermonthlyincome);
        playschoolstudentpersonalinformation.setMothersmonthlyincome(mothersmonthlyincome);
        playschoolstudentpersonalinformation.setLastschoolname(lastschoolname);
        playschoolstudentpersonalinformation.setLastschoolclass(lastschoolclass);
        playschoolstudentpersonalinformation.setLastschoolclassqualified(lastschoolclassqualified);
        playschoolstudentpersonalinformation.setLastschooltcattached(lastschooltcattached);
        playschoolstudentpersonalinformation.setLastschoolmedium(lastschoolmedium);
        playschoolstudentpersonalinformation.setLastschoolyearofstudy(lastschoolyearofstudy);
        playschoolstudentpersonalinformation.setClassintoadmission(classintoadmission);
        playschoolstudentpersonalinformation.setMothertoungue(mothertoungue);
        playschoolstudentpersonalinformation.setAadharno(aadharno);
        playschoolstudentpersonalinformation.setExtracurricular(extracurricular);
        playschoolstudentpersonalinformation.setAchievements(achievements);
        playschoolstudentpersonalinformation.setIdentificationmarks(identificationmarks);
        playschoolstudentpersonalinformation.setSiblingclass(siblingclass);
        playschoolstudentpersonalinformation.setSiblingsection(siblingsection);


        playSchoolStudentPersonalInformationRepository.save(playschoolstudentpersonalinformation);
    }

    PlaySchoolStudentProfileInformation playSchoolStudentProfileInformation;
    @RequestMapping(method = RequestMethod.POST, value="/getPlaySchoolStudentProfileInformationDetail")

    public List<Object> getPlaySchoolStudentProfileInformationDetail(@RequestParam (value ="registernumber") String registerNumber,
                                                                     @RequestParam (value ="instituteid") Integer instituteid) {
        /* fetching data from table1*/

        PlaySchoolStudentBaseInformationProjection playSchoolStudentBaseInformationDetail = playSchoolStudentBaseInformationRepository.findOneByRegisternumberAndInstituteid(registerNumber, instituteid);

        /* fetching data from table2 */

        PlaySchoolStudentPersonalInformationProjection playSchoolStudentPersonalInformationDetail = playSchoolStudentPersonalInformationRepository.findOneByRegisternumberAndInstituteid(registerNumber, instituteid);

        List<Object> list = new ArrayList<Object>();

        list.add(playSchoolStudentBaseInformationDetail);
        list.add(playSchoolStudentPersonalInformationDetail);

        return list;

    }



    }
