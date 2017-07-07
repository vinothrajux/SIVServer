package com.sivserver.example.admission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by Seetha on 28-Jun-17.
 */
@RestController
@RequestMapping("/api/v1/studentpersonalinformation")

public class StudentPersonalInformationApiController extends WebMvcConfigurerAdapter {

    @Autowired
    private StudentPersonalInformationRepository studentPersonalInformationRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void studentpersonalinformation(
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam (value="admissionno", required=false) String admissionno,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="dob", required=false) Date dob,
            @RequestParam (value="gender", required=false) String gender,
            @RequestParam (value="fathername", required=false) String fathername,
            @RequestParam (value="mothername", required=false) String mothername,
            @RequestParam (value="presentaddress1", required=false) String presentaddress1,
            @RequestParam (value="presentaddress2", required=false) String presentaddress2,
            @RequestParam (value="presentarea", required=false) String presentarea,
            @RequestParam (value="presentpincode", required=false) Long presentpincode,
            @RequestParam (value="presentmobileno", required=false) Long presentmobileno,
            @RequestParam (value="presentaltmobno", required=false) Long presentaltmobno,
            @RequestParam(value ="presentemail", required=false) String presentemail,
            @RequestParam(value ="presentaltemail", required=false) String presentaltemail,
            @RequestParam (value="permanentaddress1", required=false) String permanentaddress1,
            @RequestParam (value="permanentaddress2", required=false) String permanentaddress2,
            @RequestParam (value="permanentarea", required=false) String permanentarea,
            @RequestParam (value="permanentpincode", required=false) Long permanentpincode,
            @RequestParam (value="permanentmobileno", required=false) Long permanentmobileno,
            @RequestParam (value="permanentaltmobileno", required=false) Long permanentaltmobileno,
            @RequestParam (value="permanentemail", required=false) String permanentemail,
            @RequestParam (value="permanentaltemail", required=false) String permanentaltemail,
            @RequestParam (value="reference", required=false) String reference,
            @RequestParam (value="loginuser", required=false) String loginuser

    ) {
        StudentPersonalInformation studpersonalinfo = new StudentPersonalInformation();
        studpersonalinfo.setRegNo(regno);
        studpersonalinfo.setAdmissionno(admissionno);
        studpersonalinfo.setAcademicYear(academicyear);
        studpersonalinfo.setDateofbirth(dob);
        studpersonalinfo.setGender(gender);
        studpersonalinfo.setFatherName(fathername);
        studpersonalinfo.setMotherName(mothername);
        studpersonalinfo.setPresentAddress1(presentaddress1);
        studpersonalinfo.setPresentAddress2(presentaddress2);
        studpersonalinfo.setPresentArea(presentarea);
        studpersonalinfo.setPresentPincode(presentpincode);
        studpersonalinfo.setPresentMobileNo(presentmobileno);
        studpersonalinfo.setPresentAltMobileNo(presentaltmobno);
        studpersonalinfo.setPresentEmail(presentemail);
        studpersonalinfo.setPresentAltEmail(presentaltemail);
        studpersonalinfo.setPermanentAddress1(permanentaddress1);
        studpersonalinfo.setPermanentAddress2(permanentaddress2);
        studpersonalinfo.setPermanentArea(permanentarea);
        studpersonalinfo.setPermanentPincode(permanentpincode);
        studpersonalinfo.setPermanentMobileNo(permanentmobileno);
        studpersonalinfo.setPermanentAltMobileNo(permanentaltmobileno);
        studpersonalinfo.setPermanentEmail(permanentemail);
        studpersonalinfo.setPermanentAltEmail(permanentemail);
        studpersonalinfo.setReference(reference);
        studpersonalinfo.setLoginUser(loginuser);

        studentPersonalInformationRepository.save(studpersonalinfo);



    }

}
