package com.sivserver.example.admission;

//import com.google.gson.Gson;
import com.sivserver.example.student.StudentBaseInformationProjection;
import com.sivserver.example.student.StudentBaseInformationRepository;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Seetha on 28-Jun-17.
 */
@RestController
@RequestMapping("/api/v1/studentpersonalinformation")

public class StudentPersonalInformationApiController  {

    @Autowired
    private StudentPersonalInformationRepository studentPersonalInformationRepository;

    @Autowired
    private StudentBaseInformationRepository studentBaseInformationRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void studentpersonalinformation(
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam (value="admissionno", required=false) String admissionno,
            @RequestParam (value="name", required=false) String name,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="dateofbirth", required=false) Date dateofbirth,
            @RequestParam (value="gender", required=false) String gender,
            @RequestParam (value="fathername", required=false) String fathername,
            @RequestParam (value="mothername", required=false) String mothername,
            @RequestParam (value="presentaddress1", required=false) String presentaddress1,
            @RequestParam (value="presentaddress2", required=false) String presentaddress2,
            @RequestParam (value="presentarea", required=false) String presentarea,
            @RequestParam (value="presentpincode", required=false) String presentpincode,
            @RequestParam (value="presentstate", required=false) String presentstate,
            @RequestParam (value="presentmobileno", required=false) String presentmobileno,
            @RequestParam (value="presentaltmobileno", required=false) String presentaltmobileno,
            @RequestParam(value ="presentemail", required=false) String presentemail,
            @RequestParam(value ="presentaltemail", required=false) String presentaltemail,
            @RequestParam (value="permanentaddress1", required=false) String permanentaddress1,
            @RequestParam (value="permanentaddress2", required=false) String permanentaddress2,
            @RequestParam (value="permanentarea", required=false) String permanentarea,
            @RequestParam (value="permanentpincode", required=false) String permanentpincode,
            @RequestParam (value="permanentstate", required=false) String permanentstate,
            @RequestParam (value="permanentmobileno", required=false) String permanentmobileno,
            @RequestParam (value="permanentaltmobileno", required=false) String permanentaltmobileno,
            @RequestParam (value="permanentemail", required=false) String permanentemail,
            @RequestParam (value="permanentaltemail", required=false) String permanentaltemail,
            @RequestParam (value="reference", required=false) String reference,
            @RequestParam (value="loginuser", required=false) String loginuser

    ) {
        StudentPersonalInformation studpersonalinfo = new StudentPersonalInformation();
        studpersonalinfo.setRegno(regno);
        studpersonalinfo.setAdmissionno(admissionno);
        studpersonalinfo.setName(name);
        studpersonalinfo.setAcademicyear(academicyear);
        studpersonalinfo.setDateofbirth(dateofbirth);
        studpersonalinfo.setGender(gender);
        studpersonalinfo.setFathername(fathername);
        studpersonalinfo.setMothername(mothername);
        studpersonalinfo.setPresentaddress1(presentaddress1);
        studpersonalinfo.setPresentaddress2(presentaddress2);
        studpersonalinfo.setPresentarea(presentarea);
        studpersonalinfo.setPresentpincode(presentpincode);
        studpersonalinfo.setPresentstate(presentstate);
        studpersonalinfo.setPresentmobileno(presentmobileno);
        studpersonalinfo.setPresentaltmobileno(presentaltmobileno);
        studpersonalinfo.setPresentemail(presentemail);
        studpersonalinfo.setPresentaltemail(presentaltemail);
        studpersonalinfo.setPermanentaddress1(permanentaddress1);
        studpersonalinfo.setPermanentaddress2(permanentaddress2);
        studpersonalinfo.setPermanentarea(permanentarea);
        studpersonalinfo.setPermanentpincode(permanentpincode);
        studpersonalinfo.setPermanentstate(permanentstate);
        studpersonalinfo.setPermanentmobileno(permanentmobileno);
        studpersonalinfo.setPermanentaltmobileno(permanentaltmobileno);
        studpersonalinfo.setPermanentemail(permanentemail);
        studpersonalinfo.setPermanentaltemail(permanentemail);
        studpersonalinfo.setReference(reference);
        studpersonalinfo.setLoginuser(loginuser);

        studentPersonalInformationRepository.save(studpersonalinfo);



    }

    @RequestMapping(method = RequestMethod.POST, value="/getStudentPersonalInformationDetail")
    public StudentPersonalInformationProjection getStudentPersonalInformationDetail(@RequestParam (value ="regno") String registerNumber) {
        StudentPersonalInformationProjection studentPersonalInformationDetail = studentPersonalInformationRepository.findOneByRegno(registerNumber);
        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getStudentPersonalInformationDetail");
        return studentPersonalInformationDetail;
    }

    StudentProfileInformation studentProfileInformation;
    @RequestMapping(method = RequestMethod.POST, value="/getStudentProfileInformationDetail")
    public List<Object> getStudentProfileInformationDetail(@RequestParam (value ="regno") String registerNumber) {
        /* fetching data from table1*/
        StudentPersonalInformationProjection studentPersonalInformationDetail = studentPersonalInformationRepository.findOneByRegno(registerNumber);
        /* fetching data from table2*/
        StudentBaseInformationProjection studentBaseInformationDetail = studentBaseInformationRepository.findOneByRegno(registerNumber);
        List<Object> list = new ArrayList<Object>();
        list.add(studentPersonalInformationDetail);
        list.add(studentBaseInformationDetail);

        return list;
    }


}
