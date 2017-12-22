package com.sivserver.example.admission;

import com.sivserver.example.CashCounter.*;
import com.sivserver.example.student.PlaySchoolStudentBaseInformation;
import com.sivserver.example.student.PlaySchoolStudentBaseInformationRepository;
import com.sivserver.example.student.PlaySchoolStudentPersonalInformation;
import com.sivserver.example.student.PlaySchoolStudentPersonalInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 31/10/2017.
 */
@RestController
@RequestMapping("/api/v1/admissionplayschool")

public class AdmissionPlaySchoolApiController {

    private AdmissionPlaySchoolRepository admissionPlaySchoolRepository;

    @Autowired
    private PlaySchoolStudentPersonalInformationRepository playSchoolStudentPersonalInformationRepository;

    @Autowired
    private PlaySchoolStudentBaseInformationRepository playSchoolStudentBaseInformationRepository;

    @Autowired
    private PlaySchoolFeesEntryBaseRepository playSchoolFeesEntryBaseRepository;

    @Autowired
    private PlaySchoolBalanceFeesRepository playSchoolBalanceFeesRepository;

    @Autowired
    private PlaySchoolProgramAdmissionNoGenerateRepository playSchoolProgramAdmissionNoGenerateRepository;

    @Autowired
    private PlaySchoolTransportFeesEntryRepository playSchoolTransportFeesEntryRepository;


    @GetMapping(value="/all")

    public List<AdmissionPlaySchool> getAdmissionPlaySchoolDetails() {return admissionPlaySchoolRepository.findAll();}

    public AdmissionPlaySchoolApiController(AdmissionPlaySchoolRepository admissionPlaySchoolRepository)
    {
        this.admissionPlaySchoolRepository = admissionPlaySchoolRepository;
    }



    @RequestMapping(method = RequestMethod.POST)
    public void admissionPlaySchool(
            @RequestParam(value ="applno", required=false) String applno,
            @RequestParam(value ="admissiondate", required=false) Date admissiondate,
            @RequestParam(value ="appfor", required=false) String appfor,
            @RequestParam (value="admissionstatus", required=false) String admissionstatus,
            @RequestParam (value="registernumber", required=false) String registernumber,
            @RequestParam (value="section", required=false) String section,
            @RequestParam (value="transport", required=false) String transport,
            @RequestParam (value="transportstage", required=false) String transportstage,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="loginuser", required=false) String loginuser,
            @RequestParam (value="candfirstname", required=false) String candfirstname,
            @RequestParam (value="candmiddlename", required=false) String candmiddlename,
            @RequestParam (value="candlastname", required=false) String candlastname,
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
            @RequestParam (value="fathersoccupation", required=false) String fathersoccupation,
            @RequestParam (value="fathersofficename", required=false) String fathersofficename,
            @RequestParam (value="fathersofficeaddress1", required=false) String fathersofficeaddress1,
            @RequestParam (value="fathersofficeaddress2", required=false) String fathersofficeaddress2,
            @RequestParam (value="fathersofficearea", required=false) String fathersofficearea,
            @RequestParam (value="fathersofficepincode", required=false) String fathersofficepincode,
            @RequestParam (value="fathersofficestate", required=false) String fathersofficestate,
            @RequestParam (value="fathersofficephoneno", required=false) String fathersofficephoneno,
            @RequestParam (value="fathersofficealtphoneno", required=false) String fathersofficealtphoneno,
            @RequestParam (value="fathersoffficeextensionno", required=false) String fathersoffficeextensionno,
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
            @RequestParam (value="fathersdob", required=false) Date fathersdob,
            @RequestParam (value="mothersdob", required=false) Date mothersdob,
            @RequestParam (value="parentsweddingdate", required=false) Date parentsweddingdate,
            @RequestParam (value="religion", required=false) String religion,
            @RequestParam (value="pickuppersonname", required=false) String pickuppersonname,
            @RequestParam (value="pickuppersoncontactno", required=false) String pickuppersoncontactno,
            @RequestParam (value="pickuppersonaltcontactno", required=false) String pickuppersonaltcontactno,
            @RequestParam (value="pickuppersonrelationship", required=false) String pickuppersonrelationship,
            @RequestParam (value="materialkitfees", required=false) Long materialkitfees,
            @RequestParam (value="activityfees", required=false) Long activityfees,
            @RequestParam (value="tuitionfees", required=false) Long tuitionfees,
            @RequestParam (value="transportfees", required=false) Long transportfees,
            @RequestParam (value="totalfees", required=false) Long totalfees,
            @RequestParam (value="installment1fees", required=false) Long installment1fees,
            @RequestParam (value="installment2fees", required=false) Long installment2fees,
            @RequestParam (value="admissionfeesduedate", required=false) Date admissionfeesduedate,
            @RequestParam (value="transportduedate", required=false) Date transportduedate,
            @RequestParam (value="paymentmethod", required=false) String paymentmethod,
            @RequestParam (value="idno", required=false) Integer idno,
            @RequestParam (value="todprgno", required=false) Long todprgno,
            @RequestParam (value="prekgprgno", required=false) Long prekgprgno,
            @RequestParam (value="kgoneprgno", required=false) Long kgoneprgno,
            @RequestParam (value="kgtwoprgno", required=false) Long kgtwoprgno,
            @RequestParam (value="waitlistno", required=false) Long waitlistno


    ) {
        AdmissionPlaySchool admissionplayschool = new AdmissionPlaySchool();
        ApplicationSalePlaySchool appsale = new ApplicationSalePlaySchool(applno);
        PlaySchoolStudentPersonalInformation ps_student_pers_info = new PlaySchoolStudentPersonalInformation(registernumber);
        PlaySchoolStudentBaseInformation ps_student_base_info = new PlaySchoolStudentBaseInformation();
        PlaySchoolFeesEntryBase ps_fees_base_info = new PlaySchoolFeesEntryBase();
        PlaySchoolBalanceFees ps_fees_bal_info = new PlaySchoolBalanceFees();
        PlaySchoolProgramAdmissionNoGenerate psadmissionno = new PlaySchoolProgramAdmissionNoGenerate();
        PlaySchoolTransportFeesEntry pstransportfees = new PlaySchoolTransportFeesEntry();

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
                .setAppsale(appsale);

        admissionPlaySchoolRepository.save(admissionplayschool);

        candfirstname = candfirstname + ' ' + candmiddlename + ' ' + candlastname;

        ps_student_pers_info.setRegisternumber(registernumber);
        ps_student_pers_info.setCandidatename(candfirstname);
        ps_student_pers_info.setDateofbirth(dateofbirth);
        ps_student_pers_info.setAge(age);
        ps_student_pers_info.setGender(gender);
        ps_student_pers_info.setCandfathername(candfathername);
        ps_student_pers_info.setCandmothername(candmothername);
        ps_student_pers_info.setPresentaddress1(presentaddress1);
        ps_student_pers_info.setPresentaddress2(presentaddress2);
        ps_student_pers_info.setPresentarea(presentarea);
        ps_student_pers_info.setPresentpincode(presentpincode);
        ps_student_pers_info.setPresentstate(presentstate);
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
        ps_student_pers_info.setFathersofficeextensionno(fathersoffficeextensionno);
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
        ps_student_pers_info.setFathersdob(fathersdob);
        ps_student_pers_info.setMothersdob(mothersdob);
        ps_student_pers_info.setParentsweddingdate(parentsweddingdate);
        ps_student_pers_info.setReligion(religion);
        ps_student_pers_info.setPickuppersonname(pickuppersonname);
        ps_student_pers_info.setPickuppersoncontactno(pickuppersoncontactno);
        ps_student_pers_info.setPickuppersonaltcontactno(pickuppersonaltcontactno);
        ps_student_pers_info.setPickuppersonrelationship(pickuppersonrelationship);
        ps_student_pers_info.setTransport(transport);
        ps_student_pers_info.setTransportstage(transportstage);
        ps_student_pers_info.setAcademicyear(academicyear);
        ps_student_pers_info.setLoginuser(loginuser);

        playSchoolStudentPersonalInformationRepository.save(ps_student_pers_info);

        ps_student_base_info.setRegisternumber(registernumber)
                            .setCandidatename(candfirstname)
                            .setStandardstudying(appfor)
                            .setSection(section)
                            .setAcademicyear(academicyear)
                            .setStudentstatus(admissionstatus)
                            .setLoginuser(loginuser)
                            .setPlay_school_student_personal_regno(ps_student_pers_info);

        playSchoolStudentBaseInformationRepository.save(ps_student_base_info);

        ps_fees_base_info.setRegisternumber(registernumber)
                            .setMaterialkitfees(materialkitfees)
                            .setActivityfees(activityfees)
                            .setTuitionfees(tuitionfees)
                            .setTotalfees(totalfees)
                            .setInstallment1fees(installment1fees)
                            .setInstallment2fees(installment2fees)
                            .setAdmissionfeesduedate(admissionfeesduedate)
                            .setAcademicyear(academicyear)
                            .setLoginuser(loginuser)
                            .setPlay_school_student_personal_regno(ps_student_pers_info);

        playSchoolFeesEntryBaseRepository.save(ps_fees_base_info);

        ps_fees_bal_info.setRegisternumber(registernumber)
                        .setMaterialkitfees(materialkitfees)
                        .setActivityfees(activityfees)
                        .setTuitionfees(tuitionfees)
                        .setTotalfees(totalfees)
                        .setInstallment1fees(installment1fees)
                        .setInstallment2fees(installment2fees)
                        .setAdmissionfeesduedate(admissionfeesduedate)
                        .setAcademicyear(academicyear)
                        .setLoginuser(loginuser)
                        .setPlay_school_student_personal_regno(ps_student_pers_info);

        playSchoolBalanceFeesRepository.save(ps_fees_bal_info);

        psadmissionno.setIdno(idno);
        psadmissionno.setTodprgno(todprgno);
        psadmissionno.setPrekgprgno(prekgprgno);
        psadmissionno.setKgoneprgno(kgoneprgno);
        psadmissionno.setKgtwoprgno(kgtwoprgno);
        psadmissionno.setWaitlistno(waitlistno);

        playSchoolProgramAdmissionNoGenerateRepository.save(psadmissionno);

        pstransportfees.setRegisternumber(registernumber)
                        .setTransport(transport)
                        .setStage(transportstage)
                        .setPaymentmethod(paymentmethod)
                        .setTransportfees(transportfees)
                        .setTransportduedate(transportduedate)
                        .setAcademicyear(academicyear)
                        .setLoginuser(loginuser)
                        .setPlay_school_student_personal_regno(ps_student_pers_info);



    }

        @RequestMapping(method = RequestMethod.POST, value="/getPlaySchoolAdmissionDetail")
    public AdmissionPlaySchoolProjection getPlaySchoolAdmissionDetail(@RequestParam (value ="applno") String applicationNumber) {
        AdmissionPlaySchoolProjection playschooladmissionDetail = admissionPlaySchoolRepository.findOneByApplno(applicationNumber);
        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getPlaySchoolAdmissionDetail");
        return playschooladmissionDetail;
    }


}
