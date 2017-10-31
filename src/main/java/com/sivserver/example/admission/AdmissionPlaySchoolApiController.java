package com.sivserver.example.admission;

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
            @RequestParam (value="mothersofficeextensionno", required=false) String mothersofficeextensionno,
            @RequestParam (value="pickuppersonname", required=false) String pickuppersonname,
            @RequestParam (value="pickuppersoncontactno", required=false) String pickuppersoncontactno,
            @RequestParam (value="pickuppersonaltcontactno", required=false) String pickuppersonaltcontactno,
            @RequestParam (value="pickuppersonrelationship", required=false) String pickuppersonrelationship,
            @RequestParam (value="admissionstatus", required=false) String admissionstatus,
            @RequestParam (value="registernumber", required=false) String registernumber,
            @RequestParam (value="transport", required=false) String transport,
            @RequestParam (value="transportstage", required=false) String transportstage,
            @RequestParam (value="loginuser", required=false) String loginuser




    ) {
        AdmissionPlaySchool admissionplayschool = new AdmissionPlaySchool();
        ApplicationSalePlaySchool appsale = new ApplicationSalePlaySchool(applno);

        admissionplayschool.setApplno(applno)
                            .setAdmissiondate(admissiondate)
                            .setFathersoccupation(fathersoccupation)
                            .setFathersofficename(fathersofficename)
                            .setFathersofficeaddress1(fathersofficeaddress1)
                            .setFathersofficeaddress2(fathersofficeaddress2)
                            .setFathersofficearea(fathersofficearea)
                            .setFathersofficepincode(fathersofficepincode)
                            .setFathersofficestate(fathersofficestate)
                            .setFathersofficephoneno(fathersofficephoneno)
                            .setFathersofficealtphoneno(fathersofficealtphoneno)
                            .setFathersofficeextensionno(fathersofficeextensionno)
                            .setMothersoccupation(mothersoccupation)
                            .setMothersofficename(mothersofficename)
                            .setMothersofficeaddress1(mothersofficeaddress1)
                            .setMothersofficeaddress2(mothersofficeaddress2)
                            .setMothersofficearea(mothersofficearea)
                            .setMothersofficepincode(mothersofficepincode)
                            .setMothersofficestate(mothersofficestate)
                            .setMothersofficephoneno(mothersofficephoneno)
                            .setMothersofficealtphoneno(mothersofficealtphoneno)
                            .setMothersofficeextensionno(mothersofficeextensionno)
                            .setFathersdob(fathersdob)
                            .setMothersdob(mothersdob)
                            .setParentsweddingdate(parentsweddingdate)
                            .setPickuppersonname(pickuppersonname)
                            .setPickuppersoncontactno(pickuppersoncontactno)
                            .setPickuppersonaltcontactno(pickuppersonaltcontactno)
                            .setPickuppersonrelationship(pickuppersonrelationship)
                            .setAdmissionstatus(admissionstatus)
                            .setRegisternumber(registernumber)
                            .setTransport(transport)
                            .setTransportstage(transportstage)
                            .setLoginuser(loginuser)
                            .setAppsale(appsale);


        admissionPlaySchoolRepository.save(admissionplayschool);




    }

    }
