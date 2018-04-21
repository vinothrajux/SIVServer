package com.sivserver.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 29-Mar-18.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/schoolstudentpersonalinformation")

public class SchoolStudentPersonalInformationApiController {

    private SchoolStudentPersonalInformationRepository schoolStudentPersonalInformationRepository;

    @Autowired
    private PlaySchoolStudentBaseInformationRepository playSchoolStudentBaseInformationRepository;

    @GetMapping(value = "/all")

    public List<SchoolStudentPersonalInformation> getSchoolStudentPersonalInformationDetails() {
        return schoolStudentPersonalInformationRepository.findAll();
    }

    public SchoolStudentPersonalInformationApiController(SchoolStudentPersonalInformationRepository schoolStudentPersonalInformationRepository) {
        this.schoolStudentPersonalInformationRepository = schoolStudentPersonalInformationRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void playschoolapplicationsale(
            @RequestParam(value = "registernumber", required = false) String registernumber,
            @RequestParam(value = "emisno", required = false) String emisno,
            @RequestParam(value = "candidatename", required = false) String candidatename,
            @RequestParam(value = "dateofbirth", required = false) @DateTimeFormat(pattern = "dd/MM/yyyy") Date dateofbirth,
            @RequestParam(value = "age", required = false) float age,
            @RequestParam(value = "gender", required = false) String gender,
            @RequestParam(value = "bloodgroup", required = false) String bloodgroup,
            @RequestParam(value = "religion", required = false) String religion,
            @RequestParam(value = "community", required = false) String community,
            @RequestParam(value = "caste", required = false) String caste,
            @RequestParam(value = "candfathername", required = false) String candfathername,
            @RequestParam(value = "candmothername", required = false) String candmothername,
            @RequestParam(value = "presentaddress1", required = false) String presentaddress1,
            @RequestParam(value = "presentaddress2", required = false) String presentaddress2,
            @RequestParam(value = "presentarea", required = false) String presentarea,
            @RequestParam(value = "presentpincode", required = false) String presentpincode,
            @RequestParam(value = "presentstate", required = false) String presentstate,
            @RequestParam(value = "fathersmobileno", required = false) String fathersmobileno,
            @RequestParam(value = "fathersaltmobno", required = false) String fathersaltmobno,
            @RequestParam(value = "mothersmobileno", required = false) String mothersmobileno,
            @RequestParam(value = "mothersaltmobno", required = false) String mothersaltmobno,
            @RequestParam(value = "fathersemail", required = false) String fathersemail,
            @RequestParam(value = "mothersemail", required = false) String mothersemail,
            @RequestParam(value = "reference", required = false) String reference,
            @RequestParam(value = "fathersoccupation", required = false) String fathersoccupation,
            @RequestParam(value = "fathersofficename", required = false) String fathersofficename,
            @RequestParam(value = "fathersofficeaddress1", required = false) String fathersofficeaddress1,
            @RequestParam(value = "fathersofficeaddress2", required = false) String fathersofficeaddress2,
            @RequestParam(value = "fathersofficearea", required = false) String fathersofficearea,
            @RequestParam(value = "fathersofficepincode", required = false) String fathersofficepincode,
            @RequestParam(value = "fathersofficestate", required = false) String fathersofficestate,
            @RequestParam(value = "fathersofficephoneno", required = false) String fathersofficephoneno,
            @RequestParam(value = "fathersofficealtphoneno", required = false) String fathersofficealtphoneno,
            @RequestParam(value = "fathersofficeextensionno", required = false) String fathersofficeextensionno,
            @RequestParam(value = "fathermonthlyincome", required = false) Double fathermonthlyincome,
            @RequestParam(value = "mothersoccupation", required = false) String mothersoccupation,
            @RequestParam(value = "mothersofficename", required = false) String mothersofficename,
            @RequestParam(value = "mothersofficeaddress1", required = false) String mothersofficeaddress1,
            @RequestParam(value = "mothersofficeaddress2", required = false) String mothersofficeaddress2,
            @RequestParam(value = "mothersofficearea", required = false) String mothersofficearea,
            @RequestParam(value = "mothersofficepincode", required = false) String mothersofficepincode,
            @RequestParam(value = "mothersofficestate", required = false) String mothersofficestate,
            @RequestParam(value = "mothersofficephoneno", required = false) String mothersofficephoneno,
            @RequestParam(value = "mothersofficealtphoneno", required = false) String mothersofficealtphoneno,
            @RequestParam(value = "mothersofficeextensionno", required = false) String mothersofficeextensionno,
            @RequestParam(value = "mothersmonthlyincome", required = false) Double mothersmonthlyincome,
            @RequestParam(value = "lastschoolname", required = false) String lastschoolname,
            @RequestParam(value = "lastschoolclass", required = false) String lastschoolclass,
            @RequestParam(value = "lastschoolclassqualified", required = false) String lastschoolclassqualified,
            @RequestParam(value = "lastschooltcattached", required = false) String lastschooltcattached,
            @RequestParam(value = "lastschoolmedium", required = false) String lastschoolmedium,
            @RequestParam(value = "lastschoolyearofstudy", required = false) String lastschoolyearofstudy,
            @RequestParam(value = "classintoadmission", required = false) String classintoadmission,
            @RequestParam(value = "mothertoungue", required = false) String mothertoungue,
            @RequestParam(value = "aadharno", required = false) String aadharno,
            @RequestParam(value = "extracurricular", required = false) String extracurricular,
            @RequestParam(value = "achievements", required = false) String achievements,
            @RequestParam(value = "identificationmarks", required = false) String identificationmarks,
            @RequestParam(value = "siblings", required = false) String siblings,
            @RequestParam(value = "siblingname", required = false) String siblingname,
            @RequestParam(value = "siblingdob", required = false) @DateTimeFormat(pattern = "dd/MM/yyyy") Date siblingdob,
            @RequestParam(value = "siblingage", required = false) float siblingage,
            @RequestParam(value = "medicaldetails", required = false) String medicaldetails,
            @RequestParam(value = "siblingclass", required = false) String siblingclass,
            @RequestParam(value = "siblingsection", required = false) String siblingsection,
            @RequestParam(value = "allergies", required = false) String allergies,

            @RequestParam(value = "fathersdob", required = false) @DateTimeFormat(pattern = "dd/MM/yyyy") Date fathersdob,
            @RequestParam(value = "mothersdob", required = false) @DateTimeFormat(pattern = "dd/MM/yyyy") Date mothersdob,
            @RequestParam(value = "parentsweddingdate", required = false) @DateTimeFormat(pattern = "dd/MM/yyyy") Date parentsweddingdate,


            @RequestParam(value = "transport", required = false) String transport,
            @RequestParam(value = "transportstage", required = false) String transportstage,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "loginuser", required = false) String loginuser,
            @RequestParam(value = "instituteid", required = false) Integer instituteid


    ) {
        SchoolStudentPersonalInformation schoolStudentPersonalInformation = new SchoolStudentPersonalInformation();
        schoolStudentPersonalInformation.setRegisternumber(registernumber);
        schoolStudentPersonalInformation.setEmisno(emisno);

        schoolStudentPersonalInformation.setCandidatename(candidatename);
        schoolStudentPersonalInformation.setDateofbirth(dateofbirth);
        schoolStudentPersonalInformation.setAge(age);
        schoolStudentPersonalInformation.setGender(gender);
        schoolStudentPersonalInformation.setBloodgroup(bloodgroup);
        schoolStudentPersonalInformation.setReligion(religion);
        schoolStudentPersonalInformation.setCommunity(community);
        schoolStudentPersonalInformation.setCaste(caste);
        schoolStudentPersonalInformation.setCandfathername(candfathername);
        schoolStudentPersonalInformation.setCandmothername(candmothername);
        schoolStudentPersonalInformation.setPresentaddress1(presentaddress1);
        schoolStudentPersonalInformation.setPresentaddress2(presentaddress2);
        schoolStudentPersonalInformation.setPresentarea(presentarea);
        schoolStudentPersonalInformation.setPresentpincode(presentpincode);
//        schoolStudentPersonalInformation.setPresentstate(presentstate);
        schoolStudentPersonalInformation.setFathersmobileno(fathersmobileno);
        schoolStudentPersonalInformation.setFathersaltmobno(fathersaltmobno);
        schoolStudentPersonalInformation.setMothersmobileno(mothersmobileno);
        schoolStudentPersonalInformation.setMothersaltmobno(mothersaltmobno);
        schoolStudentPersonalInformation.setFathersemail(fathersemail);
        schoolStudentPersonalInformation.setMothersemail(mothersemail);
        schoolStudentPersonalInformation.setReference(reference);

        schoolStudentPersonalInformation.setFathersoccupation(fathersoccupation);
        schoolStudentPersonalInformation.setFathersofficename(fathersofficename);
        schoolStudentPersonalInformation.setFathersofficeaddress1(fathersofficeaddress1);
        schoolStudentPersonalInformation.setFathersofficeaddress2(fathersofficeaddress2);
        schoolStudentPersonalInformation.setFathersofficearea(fathersofficearea);
        schoolStudentPersonalInformation.setFathersofficepincode(fathersofficepincode);
        schoolStudentPersonalInformation.setFathersofficestate(fathersofficestate);
        schoolStudentPersonalInformation.setFathersofficephoneno(fathersofficephoneno);
        schoolStudentPersonalInformation.setFathersofficealtphoneno(fathersofficealtphoneno);
        schoolStudentPersonalInformation.setFathersofficeextensionno(fathersofficeextensionno);
        schoolStudentPersonalInformation.setFathermonthlyincome(fathermonthlyincome);
        schoolStudentPersonalInformation.setMothersoccupation(mothersoccupation);
        schoolStudentPersonalInformation.setMothersofficename(mothersofficename);
        schoolStudentPersonalInformation.setMothersofficeaddress1(mothersofficeaddress1);
        schoolStudentPersonalInformation.setMothersofficeaddress2(mothersofficeaddress2);
        schoolStudentPersonalInformation.setMothersofficearea(mothersofficearea);
        schoolStudentPersonalInformation.setMothersofficepincode(mothersofficepincode);
        schoolStudentPersonalInformation.setMothersofficestate(mothersofficestate);
        schoolStudentPersonalInformation.setMothersofficephoneno(mothersofficephoneno);
        schoolStudentPersonalInformation.setMothersofficealtphoneno(mothersofficealtphoneno);
        schoolStudentPersonalInformation.setMothersofficeextensionno(mothersofficeextensionno);
        schoolStudentPersonalInformation.setMothersmonthlyincome(mothersmonthlyincome);
        schoolStudentPersonalInformation.setLastschoolname(lastschoolname);
        schoolStudentPersonalInformation.setLastschoolclass(lastschoolclass);
        schoolStudentPersonalInformation.setLastschoolclassqualified(lastschoolclassqualified);
        schoolStudentPersonalInformation.setLastschooltcattached(lastschooltcattached);
        schoolStudentPersonalInformation.setLastschoolmedium(lastschoolmedium);
        schoolStudentPersonalInformation.setLastschoolyearofstudy(lastschoolyearofstudy);
        schoolStudentPersonalInformation.setClassintoadmission(classintoadmission);
        schoolStudentPersonalInformation.setMothertoungue(mothertoungue);
        schoolStudentPersonalInformation.setAadharno(aadharno);
        schoolStudentPersonalInformation.setExtracurricular(extracurricular);
        schoolStudentPersonalInformation.setAchievements(achievements);
        schoolStudentPersonalInformation.setIdentificationmarks(identificationmarks);

        schoolStudentPersonalInformation.setSiblings(siblings);
        schoolStudentPersonalInformation.setSiblingname(siblingname);
        schoolStudentPersonalInformation.setSiblingdob(siblingdob);
        schoolStudentPersonalInformation.setSiblingage(siblingage);
        schoolStudentPersonalInformation.setSiblingclass(siblingclass);
        schoolStudentPersonalInformation.setSiblingsection(siblingsection);
        schoolStudentPersonalInformation.setMedicaldetails(medicaldetails);
        schoolStudentPersonalInformation.setAllergies(allergies);
        schoolStudentPersonalInformation.setFathersdob(fathersdob);
        schoolStudentPersonalInformation.setMothersdob(mothersdob);
        schoolStudentPersonalInformation.setParentsweddingdate(parentsweddingdate);

        schoolStudentPersonalInformation.setTransport(transport);
        schoolStudentPersonalInformation.setTransportstage(transportstage);
        schoolStudentPersonalInformation.setAcademicyear(academicyear);
        schoolStudentPersonalInformation.setLoginuser(loginuser);
        schoolStudentPersonalInformation.setInstituteid(instituteid);

        schoolStudentPersonalInformationRepository.save(schoolStudentPersonalInformation);
    }
}
