package com.sivserver.example.admission;

import com.sivserver.example.CashCounter.*;
import com.sivserver.example.student.*;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 02-Apr-18.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/admissionschool")

public class AdmissionSchoolApiController {

    private AdmissionSchoolRepository admissionSchoolRepository;

    @Autowired
    private SchoolStudentPersonalInformationRepository schoolStudentPersonalInformationRepository;

    @Autowired
    private PlaySchoolStudentBaseInformationRepository playSchoolStudentBaseInformationRepository;

    @Autowired
    private SchoolFeesEntryBaseRepository schoolFeesEntryBaseRepository;

    @Autowired
    private SchoolBalanceFeesRepository schoolBalanceFeesRepository;

    @Autowired
    private SchoolTransportFeesEntryRepository schoolTransportFeesEntryRepository;


    @GetMapping(value="/all")

    public List<AdmissionSchool> getAdmissionSchoolDetails() {return admissionSchoolRepository.findAll();}

    public AdmissionSchoolApiController(AdmissionSchoolRepository admissionSchoolRepository)
    {
        this.admissionSchoolRepository = admissionSchoolRepository;
    }



    @RequestMapping(method = RequestMethod.POST)
    public String admissionSchool(
            @RequestParam(value ="applno", required=false) String applno,
            @RequestParam(value ="admissiondate", required=false) Date admissiondate,
            @RequestParam(value ="appfor", required=false) String appfor,
            @RequestParam (value="admissionstatus", required=false) String admissionstatus,
            @RequestParam (value="classintoadmission", required=false) String classintoadmission,
            @RequestParam (value="instituteregisternumber", required=false) String instituteregisternumber,
            @RequestParam (value="section", required=false) String section,
            @RequestParam (value="transport", required=false) String transport,
            @RequestParam (value="transportstage", required=false) String transportstage,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="loginuser", required=false) String loginuser,
            @RequestParam (value="candfirstname", required=false) String candfirstname,
            @RequestParam (value="candmiddlename", required=false) String candmiddlename,
            @RequestParam (value="candlastname", required=false) String candlastname,
            @RequestParam (value="dateofbirth", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date dateofbirth,
            @RequestParam (value="age", required=false) float age,
            @RequestParam (value="gender", required=false) String gender,
            @RequestParam (value="religion", required=false) String religion,
            @RequestParam (value="community", required=false) String community,
            @RequestParam (value="caste", required=false) String caste,
            @RequestParam (value="aadharno", required=false) String aadharno,
            @RequestParam (value="bloodgroup", required=false) String bloodgroup,
            @RequestParam (value="medicaldetails", required=false) String medicaldetails,
            @RequestParam (value="allergies", required=false) String allergies,
            @RequestParam (value="identificationmarks", required=false) String identificationmarks,
            @RequestParam (value="mothertongue", required=false) String mothertongue,
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
            @RequestParam (value="fathermonthlyincome", required=false) Double fathermonthlyincome,
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
            @RequestParam (value="mothersmonthlyincome", required=false) Double mothersmonthlyincome,
            @RequestParam (value="fathersdob", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date fathersdob,
            @RequestParam (value="mothersdob", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date mothersdob,
            @RequestParam (value="parentsweddingdate", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date parentsweddingdate,
            @RequestParam (value="siblings", required=false) String siblings,
            @RequestParam (value="siblingname", required=false) String siblingname,
            @RequestParam (value="siblingdob", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date siblingdob,
            @RequestParam (value="siblingage", required=false) float siblingage,
            @RequestParam (value="siblingclass", required=false) String siblingclass,
            @RequestParam (value="siblingsection", required=false) String siblingsection,
            @RequestParam (value="lastschoolname", required=false) String lastschoolname,
            @RequestParam (value="lastschoolclass", required=false) String lastschoolclass,
            @RequestParam (value="lastschoolclassqualified", required=false) String lastschoolclassqualified,
            @RequestParam (value="lastschooltcattached", required=false) String lastschooltcattached,
            @RequestParam (value="lastschoolmedium", required=false) String lastschoolmedium,
            @RequestParam (value="lastschoolyearofstudy", required=false) String lastschoolyearofstudy,
            @RequestParam (value="extracurricular", required=false) String extracurricular,
            @RequestParam (value="achievements", required=false) String achievements,
            @RequestParam (value="admittedinto", required=false) String admittedinto,
            @RequestParam (value="emisno", required=false) String emisno,
            @RequestParam (value="transportfeesmethod", required=false) String transportfeesmethod,
            @RequestParam (value="tuitionfeesmethod", required=false) String tuitionfeesmethod,
            @RequestParam (value="facilityfees", required=false) Double facilityfees,
            @RequestParam (value="facilityfeesduedate", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date facilityfeesduedate,
            @RequestParam (value="booksnotebookfees", required=false) Double booksnotebookfees,
            @RequestParam (value="booksnotebookfeesduedate", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date booksnotebookfeesduedate,
            @RequestParam (value="othersfees", required=false) Double othersfees,
            @RequestParam (value="othersfeesduedate", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date othersfeesduedate,
            @RequestParam (value="tuitionfeesmonthly", required=false) Double tuitionfeesmonthly,
            @RequestParam (value="tuitionfeesmonthlyduedate", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date tuitionfeesmonthlyduedate,
            @RequestParam (value="tuitionfeestermly", required=false) Double tuitionfeestermly,
            @RequestParam (value="tuitionfeestermlyduedate", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date tuitionfeestermlyduedate,
            @RequestParam (value="totalfees", required=false) Double totalfees,
            @RequestParam (value="transportfees", required=false) Double transportfees,
            @RequestParam (value="transportduedate", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date transportduedate,
            @RequestParam (value="pickuppersonname", required=false) String pickuppersonname,
            @RequestParam (value="pickuppersoncontactno", required=false) String pickuppersoncontactno,
            @RequestParam (value="pickuppersonaltcontactno", required=false) String pickuppersonaltcontactno,
            @RequestParam (value="pickuppersonrelationship", required=false) String pickuppersonrelationship,
//            @RequestParam (value="idno", required=false) Integer idno,
//            @RequestParam (value="todprgno", required=false) Long todprgno,
//            @RequestParam (value="prekgprgno", required=false) Long prekgprgno,
//            @RequestParam (value="kgoneprgno", required=false) Long kgoneprgno,
//            @RequestParam (value="kgtwoprgno", required=false) Long kgtwoprgno,
//            @RequestParam (value="waitlistno", required=false) Long waitlistno,
            @RequestParam (value="instituteid", required=false) Integer instituteid


    ) {

        String registernumber = "";
        AdmissionSchool admissionSchoolObj2 = new AdmissionSchool();
        admissionSchoolObj2 = admissionSchoolRepository.findTopByInstituteidAndAcademicyearOrderByRegisternumberDesc(instituteid,academicyear);
        if(admissionSchoolObj2 == null){
            DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
            String yearyy = df.format(Calendar.getInstance().getTime());
            registernumber = yearyy+instituteid.toString() + "0001";
        }else{
            registernumber = admissionSchoolObj2.getRegisternumber();
            Integer regsisternumberInt = Integer.parseInt(registernumber);
            regsisternumberInt++;
            registernumber =  regsisternumberInt.toString();
        }

        AdmissionSchool admissionplayschool = new AdmissionSchool();
        ApplicationSaleSchool appsale = new ApplicationSaleSchool(applno);
        SchoolStudentPersonalInformation ps_student_pers_info = new SchoolStudentPersonalInformation(registernumber);
        PlaySchoolStudentBaseInformation school_student_base_info = new PlaySchoolStudentBaseInformation();
        SchoolFeesEntryBase schoolfeesentrybaseinfo = new SchoolFeesEntryBase();
        SchoolBalanceFees schoolbalancefees = new SchoolBalanceFees();
       // SchoolProgramAdmissionNoGenerate psadmissionno = new SchoolProgramAdmissionNoGenerate();
        SchoolTransportFeesEntry pstransportfees = new SchoolTransportFeesEntry();


        admissionplayschool.setApplno(applno)
                .setAdmissiondate(admissiondate)
                .setAppfor(appfor)
                .setAdmissionstatus(admissionstatus)
                .setRegisternumber(registernumber)
                .setSection(section)
                .setTransport(transport)
                .setTransportstage(transportstage)
                .setAcademicyear(academicyear)
                .setLoginuser(loginuser)
                .setInstituteid(instituteid)
                .setAppsale(appsale);

        admissionSchoolRepository.save(admissionplayschool);

        String candidatename="";
        candidatename = candfirstname + ' ' + candmiddlename + ' ' + candlastname;

        ps_student_pers_info.setRegisternumber(registernumber);
        ps_student_pers_info.setEmisno(emisno);

        ps_student_pers_info.setCandidatename(candidatename);
        ps_student_pers_info.setDateofbirth(dateofbirth);
        ps_student_pers_info.setAge(age);
        ps_student_pers_info.setGender(gender);
        ps_student_pers_info.setBloodgroup(bloodgroup);
        ps_student_pers_info.setReligion(religion);
        ps_student_pers_info.setCommunity(community);
        ps_student_pers_info.setCaste(caste);
        ps_student_pers_info.setCandfathername(candfathername);
        ps_student_pers_info.setCandmothername(candmothername);
        ps_student_pers_info.setPresentaddress1(presentaddress1);
        ps_student_pers_info.setPresentaddress2(presentaddress2);
        ps_student_pers_info.setPresentarea(presentarea);
        ps_student_pers_info.setPresentpincode(presentpincode);
//        schoolStudentPersonalInformation.setPresentstate(presentstate);
        ps_student_pers_info.setFathersmobileno(fathersmobileno);
        ps_student_pers_info.setFathersaltmobno(fathersaltmobno);
        ps_student_pers_info.setMothersmobileno(mothersmobileno);
        ps_student_pers_info.setMothersaltmobno(mothersaltmobno);
        ps_student_pers_info.setFathersemail(fathersemail);
        ps_student_pers_info.setMothersemail(mothersemail);
        ps_student_pers_info.setReference(reference);

        ps_student_pers_info.setFathersoccupation(fathersoccupation);
        ps_student_pers_info.setFathersofficename(fathersofficename);
        ps_student_pers_info.setFathersofficeaddress1(fathersofficeaddress1);
        ps_student_pers_info.setFathersofficeaddress2(fathersofficeaddress2);
        ps_student_pers_info.setFathersofficearea(fathersofficearea);
        ps_student_pers_info.setFathersofficepincode(fathersofficepincode);
        ps_student_pers_info.setFathersofficestate(fathersofficestate);
        ps_student_pers_info.setFathersofficephoneno(fathersofficephoneno);
        ps_student_pers_info.setFathersofficealtphoneno(fathersofficealtphoneno);
        ps_student_pers_info.setFathersofficeextensionno(fathersofficeextensionno);
        ps_student_pers_info.setFathermonthlyincome(fathermonthlyincome);
        ps_student_pers_info.setMothersoccupation(mothersoccupation);
        ps_student_pers_info.setMothersofficename(mothersofficename);
        ps_student_pers_info.setMothersofficeaddress1(mothersofficeaddress1);
        ps_student_pers_info.setMothersofficeaddress2(mothersofficeaddress2);
        ps_student_pers_info.setMothersofficearea(mothersofficearea);
        ps_student_pers_info.setMothersofficepincode(mothersofficepincode);
        ps_student_pers_info.setMothersofficestate(mothersofficestate);
        ps_student_pers_info.setMothersofficephoneno(mothersofficephoneno);
        ps_student_pers_info.setMothersofficealtphoneno(mothersofficealtphoneno);
        ps_student_pers_info.setMothersofficeextensionno(mothersofficeextensionno);
        ps_student_pers_info.setMothersmonthlyincome(mothersmonthlyincome);
        ps_student_pers_info.setLastschoolname(lastschoolname);
        ps_student_pers_info.setLastschoolclass(lastschoolclass);
        ps_student_pers_info.setLastschoolclassqualified(lastschoolclassqualified);
        ps_student_pers_info.setLastschooltcattached(lastschooltcattached);
        ps_student_pers_info.setLastschoolmedium(lastschoolmedium);
        ps_student_pers_info.setLastschoolyearofstudy(lastschoolyearofstudy);
        ps_student_pers_info.setClassintoadmission(classintoadmission);
        ps_student_pers_info.setMothertoungue(mothertongue);
        ps_student_pers_info.setAadharno(aadharno);
        ps_student_pers_info.setExtracurricular(extracurricular);
        ps_student_pers_info.setAchievements(achievements);
        ps_student_pers_info.setIdentificationmarks(identificationmarks);

        ps_student_pers_info.setSiblings(siblings);
        ps_student_pers_info.setSiblingname(siblingname);
        ps_student_pers_info.setSiblingdob(siblingdob);
        ps_student_pers_info.setSiblingage(siblingage);
        ps_student_pers_info.setSiblingclass(siblingclass);
        ps_student_pers_info.setSiblingsection(siblingsection);
        ps_student_pers_info.setMedicaldetails(medicaldetails);
        ps_student_pers_info.setAllergies(allergies);
        ps_student_pers_info.setFathersdob(fathersdob);
        ps_student_pers_info.setMothersdob(mothersdob);
        ps_student_pers_info.setParentsweddingdate(parentsweddingdate);

        ps_student_pers_info.setTransport(transport);
        ps_student_pers_info.setTransportstage(transportstage);
        ps_student_pers_info.setAcademicyear(academicyear);
        ps_student_pers_info.setLoginuser(loginuser);
        ps_student_pers_info.setInstituteid(instituteid);
        ps_student_pers_info.setPickuppersonname(pickuppersonname);
        ps_student_pers_info.setPickuppersoncontactno(pickuppersoncontactno);
        ps_student_pers_info.setPickuppersonaltcontactno(pickuppersonaltcontactno);
        ps_student_pers_info.setPickuppersonrelationship(pickuppersonrelationship);

        schoolStudentPersonalInformationRepository.save(ps_student_pers_info);

        school_student_base_info.setRegisternumber(registernumber)
                .setCandidatename(candidatename)
                .setStandardstudying(admittedinto)
                .setSection(section)
                .setAcademicyear(academicyear)
                .setStudentstatus(admissionstatus)
                .setLoginuser(loginuser)
                .setInstituteregisternumber(instituteregisternumber)
                .setInstituteid(instituteid);
                //.setSchool_student_personal_regno(ps_student_pers_info);

        playSchoolStudentBaseInformationRepository.save(school_student_base_info);

        schoolfeesentrybaseinfo.setRegisternumber(registernumber)
                .setInstituteregisternumber(instituteregisternumber)
                .setFacilityfees(facilityfees)
                .setFacilityfeesduedate(facilityfeesduedate)
                .setBooksnotebookfees(booksnotebookfees)
                .setBooksnotebookfeesduedate(booksnotebookfeesduedate)
                .setOthersfees(othersfees)
                .setOthersfeesduedate(othersfeesduedate)
                .setTuitionfeesmonthly(tuitionfeesmonthly)
                .setTuitionfeesmonthlyduedate(tuitionfeesmonthlyduedate)
                .setTuitionfeestermlyduedate(tuitionfeestermlyduedate)
                .setTotalfees(totalfees)
                .setTuitionfeesmethod(tuitionfeesmethod)
                .setAcademicyear(academicyear)
                .setLoginuser(loginuser)
                .setInstituteid(instituteid)
                .setSchool_student_personal_regno(ps_student_pers_info);

        schoolFeesEntryBaseRepository.save(schoolfeesentrybaseinfo);

        schoolbalancefees.setRegisternumber(registernumber)
                .setInstituteregisternumber(instituteregisternumber)
                .setFacilityfees(facilityfees)
                .setFacilityfeesduedate(facilityfeesduedate)
                .setBooksnotebookfees(booksnotebookfees)
                .setBooksnotebookfeesduedate(booksnotebookfeesduedate)
                .setOthersfees(othersfees)
                .setOthersfeesduedate(othersfeesduedate)
                .setTuitionfeesmonthly(tuitionfeesmonthly)
                .setTuitionfeesmonthlyduedate(tuitionfeesmonthlyduedate)
                .setTuitionfeestermlyduedate(tuitionfeestermlyduedate)
                .setTotalfees(totalfees)
                .setTuitionfeesmethod(tuitionfeesmethod)
                .setAcademicyear(academicyear)
                .setLoginuser(loginuser)
                .setInstituteid(instituteid)
                .setSchool_student_personal_regno(ps_student_pers_info);

        schoolBalanceFeesRepository.save(schoolbalancefees);

//        psadmissionno.setIdno(idno);
//        psadmissionno.setTodprgno(todprgno);
//        psadmissionno.setPrekgprgno(prekgprgno);
//        psadmissionno.setKgoneprgno(kgoneprgno);
//        psadmissionno.setKgtwoprgno(kgtwoprgno);
//        psadmissionno.setWaitlistno(waitlistno);

//        playSchoolProgramAdmissionNoGenerateRepository.save(psadmissionno);



        if (transport.equals("SCHOOL VAN")) {
            pstransportfees.setRegisternumber(registernumber)
                    .setTransport(transport)
                    .setStage(transportstage)
                    .setTransportfeesmethod(transportfeesmethod)
                    .setTransportfees(transportfees)
                    .setTransportduedate(transportduedate)
                    .setAcademicyear(academicyear)
                    .setLoginuser(loginuser)
                    .setInstituteid(instituteid)
                    .setPlay_school_student_personal_regno(ps_student_pers_info);

            schoolTransportFeesEntryRepository.save(pstransportfees);

        }
        JSONObject resultObject = new JSONObject();
        try {
            resultObject.put("registernumber", registernumber);
            resultObject.put("applicationnumber", applno);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return resultObject.toString();
    }

    @RequestMapping(method = RequestMethod.POST, value="/getSchoolAdmissionDetail")
    public AdmissionSchoolProjection getSchoolAdmissionDetail(@RequestParam (value ="applno") String applicationNumber) {
        AdmissionSchoolProjection schooladmissionDetail = admissionSchoolRepository.findOneByApplno(applicationNumber);
        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getSchoolAdmissionDetail");
        return schooladmissionDetail;
    }




}


