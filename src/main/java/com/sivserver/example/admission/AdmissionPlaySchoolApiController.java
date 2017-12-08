package com.sivserver.example.admission;

import com.sivserver.example.CashCounter.PlaySchoolBalanceFees;
import com.sivserver.example.CashCounter.PlaySchoolBalanceFeesRepository;
import com.sivserver.example.CashCounter.PlaySchoolFeesEntryBase;
import com.sivserver.example.CashCounter.PlaySchoolFeesEntryBaseRepository;
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
            @RequestParam(value ="admissionfor", required=false) String admissionfor,
            @RequestParam (value="admissionstatus", required=false) String admissionstatus,
            @RequestParam (value="registernumber", required=false) String registernumber,
            @RequestParam (value="section", required=false) String section,
            @RequestParam (value="transport", required=false) String transport,
            @RequestParam (value="transportstage", required=false) String transportstage,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="loginuser", required=false) String loginuser,
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
            @RequestParam (value="admissionfees", required=false) Long admissionfees,
            @RequestParam (value="transportfees", required=false) Long transportfees,
            @RequestParam (value="total_admission_fees", required=false) Long total_admission_fees,
            @RequestParam (value="admission_fees_due_date", required=false) Date admission_fees_due_date,
            @RequestParam (value="term1fees", required=false) Long term1fees,
            @RequestParam (value="term1transportfees", required=false) Long term1transportfees,
            @RequestParam (value="total_term1_fees", required=false) Long total_term1_fees,
            @RequestParam (value="term1_fees_due_date", required=false) Date term1_fees_due_date,
            @RequestParam (value="term2fees", required=false) Long term2fees,
            @RequestParam (value="term2transportfees", required=false) Long term2transportfees,
            @RequestParam (value="total_term2_fees", required=false) Long total_term2_fees,
            @RequestParam (value="term2_fees_due_date", required=false) Date term2_fees_due_date,
            @RequestParam (value="grand_total_fees", required=false) Long grand_total_fees


    ) {
        AdmissionPlaySchool admissionplayschool = new AdmissionPlaySchool();
        ApplicationSalePlaySchool appsale = new ApplicationSalePlaySchool(applno);
        PlaySchoolStudentPersonalInformation ps_student_pers_info = new PlaySchoolStudentPersonalInformation(registernumber);
        PlaySchoolStudentBaseInformation ps_student_base_info = new PlaySchoolStudentBaseInformation();
        PlaySchoolFeesEntryBase ps_fees_base_info = new PlaySchoolFeesEntryBase();
        PlaySchoolBalanceFees ps_fees_bal_info = new PlaySchoolBalanceFees();

        admissionplayschool.setApplno(applno)
                .setAdmissiondate(admissiondate)
                .setAdmissionfor(admissionfor)
                .setAdmissionstatus(admissionstatus)
                .setRegisternumber(registernumber)
                .setSection(section)
                .setTransport(transport)
                .setTransportstage(transportstage)
                .setAcademicyear(academicyear)
                .setLoginuser(loginuser)
                .setAppsale(appsale);

        admissionPlaySchoolRepository.save(admissionplayschool);


        ps_student_pers_info.setRegisternumber(registernumber);
        ps_student_pers_info.setCandidatename(candidatename);
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
                            .setCandidatename(candidatename)
                            .setStandardstudying(admissionfor)
                            .setSection(section)
                            .setAcademicyear(academicyear)
                            .setStudentstatus(admissionstatus)
                            .setLoginuser(loginuser)
                            .setPlay_school_student_personal_regno(ps_student_pers_info);

        playSchoolStudentBaseInformationRepository.save(ps_student_base_info);

        ps_fees_base_info.setRegisternumber(registernumber)
                            .setAdmissionfees(admissionfees)
                            .setTransportfees(transportfees)
                            .setTotal_admission_fees(total_admission_fees)
                            .setTerm1fees(term1fees)
                            .setTerm1transportfees(term1transportfees)
                            .setTotal_term1_fees(total_term1_fees)
                            .setTerm2fees(term2fees)
                            .setTerm2transportfees(term2transportfees)
                            .setTotal_term2_fees(total_term2_fees)
                            .setGrand_total_fees(grand_total_fees)
                            .setAcademicyear(academicyear)
                            .setLoginuser(loginuser)
                            .setPlay_school_student_personal_regno(ps_student_pers_info);

        playSchoolFeesEntryBaseRepository.save(ps_fees_base_info);

        ps_fees_bal_info.setRegisternumber(registernumber)
                        .setAdmissionfees(admissionfees)
                        .setTransportfees(transportfees)
                        .setTotal_admission_fees(total_admission_fees)
                        .setAdmission_fees_due_date(admission_fees_due_date)
                        .setTerm1fees(term1fees)
                        .setTerm1transportfees(term1transportfees)
                        .setTotal_term1_fees(total_term1_fees)
                        .setTerm1_fees_due_date(term1_fees_due_date)
                        .setTerm2fees(term2fees)
                        .setTerm2transportfees(term2transportfees)
                        .setTotal_term2_fees(total_term2_fees)
                        .setTerm2_fees_due_date(term2_fees_due_date)
                        .setGrand_total_fees(grand_total_fees)
                        .setAcademicyear(academicyear)
                        .setLoginuser(loginuser)
                        .setPlay_school_student_personal_regno(ps_student_pers_info);

        playSchoolBalanceFeesRepository.save(ps_fees_bal_info);






    }

    }
