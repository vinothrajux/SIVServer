package com.sivserver.example.teachingstaff;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sivserver.example.student.PlaySchoolStudentBaseInformation;
import com.sivserver.example.student.PlaySchoolStudentBaseInformationProjection;
import com.sivserver.example.student.PlaySchoolStudentBaseInformationRepository;
import com.sivserver.example.student.StudentBaseInformation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 24-Apr-18.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/schooltestexammarkentry")

public class SchoolTestExamMarkDetailsApiController {

    private SchoolTestExamMarkDetailsRepository schoolTestExamMarkDetailsRepository;

    @Autowired
    private PlaySchoolStudentBaseInformationRepository playSchoolStudentBaseInformationRepository;

    @Autowired
    private SchoolTestExamTimeTableRepository schoolTestExamTimeTableRepository;

    @GetMapping(value="/all")

    public List<SchoolTestExamMarkDetails> getSchoolTestExamMarkDetails() {return schoolTestExamMarkDetailsRepository.findAll();}

    public SchoolTestExamMarkDetailsApiController(SchoolTestExamMarkDetailsRepository schoolTestExamMarkDetailsRepository)
    {
        this.schoolTestExamMarkDetailsRepository = schoolTestExamMarkDetailsRepository;

    }

    @RequestMapping(method = RequestMethod.POST)

    public void schooltestexammarkdet(
            @RequestParam(value ="markentryparam", required=false) JSONObject markentryparam,
            @RequestParam(value ="studentlist", required=false) String markdetails
    ) {
        System.out.println("=====================");
        System.out.println(markentryparam.toString());
        System.out.println(markdetails);
        Integer instituteid = null, maxmarks=null, minmarks = null;
        String testtype="", standard= "", academicyear = "", loginuser ="",section="";
        try {
            instituteid = markentryparam.getInt("instituteid");
            testtype = markentryparam.getString("testtype");
            standard = markentryparam.getString("program");
            section = markentryparam.getString("section");
            academicyear = markentryparam.getString("academicyear");
            loginuser = markentryparam.getString("loginuser");
            maxmarks = markentryparam.getInt("subjectmaxmarks");
            minmarks = markentryparam.getInt("subjectpassmarks");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        SchoolTestExamMarkDetails schoolTestExamMarkDetails = new SchoolTestExamMarkDetails();
       // SchoolTestExamTimeTableCompoundKey key = new SchoolTestExamTimeTableCompoundKey(instituteid, testtype, standard, academicyear);

        //schoolTestExamMarkDetails.setSchoolTestExamTimeTableCompoundKey(key);
        schoolTestExamMarkDetails.setInstituteid(instituteid);
        schoolTestExamMarkDetails.setStandard(standard);
        schoolTestExamMarkDetails.setTesttype(testtype);
        schoolTestExamMarkDetails.setAcademicyear(academicyear);
        schoolTestExamMarkDetails.setSection(section);
        schoolTestExamMarkDetails.setMaxmarks(maxmarks);
        schoolTestExamMarkDetails.setMinmarks(minmarks);
        schoolTestExamMarkDetails.setSubjectmarkdetails(markdetails);
        schoolTestExamMarkDetails.setLoginuser(loginuser);

        schoolTestExamMarkDetailsRepository.save(schoolTestExamMarkDetails);


    }



    @RequestMapping(method = RequestMethod.POST, value="/getStudentList")
    public String getStudentLists(
            @RequestParam(value ="program", required=false) String standardstudying,
            @RequestParam (value="section", required=false) String section,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="instituteid", required=false) Integer instituteid,
            @RequestParam (value="testtype", required=false) String testtype


    ){
        String result = null;
        Map<String, Object> returnobj = new HashMap<>();
//        System.out.println("branch:"+standardstudying);
//        System.out.println("batch:"+section);
//        System.out.println("academicyear:"+academicyear);

        SchoolTestExamMarkDetails schoolTestExamMarkDetails = new SchoolTestExamMarkDetails();
        long schoolTestExamMarkDetailsCount = schoolTestExamMarkDetailsRepository.countByInstituteidAndAcademicyearAndStandardAndSectionAndTesttype(instituteid,academicyear,standardstudying,section,testtype);


            Iterable<PlaySchoolStudentBaseInformation> studentList = playSchoolStudentBaseInformationRepository.findAllByStandardstudyingAndSectionAndAcademicyearAndInstituteid(standardstudying, section, academicyear, instituteid);


            returnobj.put("studentlist",studentList);


            SchoolTestExamTimeTableCompoundKey schoolTestExamTimeTableCompoundKey = new SchoolTestExamTimeTableCompoundKey(instituteid,testtype,standardstudying,academicyear);
            SchoolTestExamTimeTable schoolTestExamTimeTable = schoolTestExamTimeTableRepository.findBySchoolTestExamTimeTableCompoundKey(schoolTestExamTimeTableCompoundKey);
            if(schoolTestExamTimeTable == null){
//            System.out.println("No Time Table Scheduled");
//            return result;

                JSONObject errorMsgObj = new JSONObject();
                try {
                    errorMsgObj.put("errorMessage", "No Time Table Scheduled");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                result = errorMsgObj.toString();

            }else{
                if(schoolTestExamMarkDetailsCount == 0) {
                    returnobj.put("timetabledetails",schoolTestExamTimeTable);
                    System.out.println(schoolTestExamTimeTable.getSubjectdetails());
                    ObjectMapper mapper = new ObjectMapper();
                    try {
                        result = mapper.writeValueAsString(returnobj);
                    } catch (JsonProcessingException e) {
                        e.printStackTrace();
                    }
                } else {
                    JSONObject errorMsgObj = new JSONObject();
                    try {
                        errorMsgObj.put("errorMessage", "Data Already Entered!");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    result = errorMsgObj.toString();
                }
            }

        System.out.println("count:"+schoolTestExamMarkDetailsCount);

        return result;
    }

    @RequestMapping(method = RequestMethod.POST, value="/getStudentMarks")
    public String getMediaList(
            @RequestParam (value="registernumber", required=false) String registernumber,
            @RequestParam (value="instituteid", required=false) Integer instituteid

    ){
//        PlaySchoolStudentBaseInformation playSchoolStudentBaseInformation = new PlaySchoolStudentBaseInformation();
        PlaySchoolStudentBaseInformationProjection playSchoolStudentBaseInformationProjection = playSchoolStudentBaseInformationRepository.findOneByRegisternumberAndInstituteid(registernumber, instituteid);
        String academicyear = playSchoolStudentBaseInformationProjection.getAcademicyear();
        String standard = playSchoolStudentBaseInformationProjection.getStandardstudying();
        String section = playSchoolStudentBaseInformationProjection.getSection();
//        SchoolTestExamTimeTableCompoundKey schoolTestExamTimeTableCompoundKey =new SchoolTestExamTimeTableCompoundKey(instituteid, "", standard, academicyear);
        Iterable<SchoolTestExamMarkDetails> schoolTestExamMarkDetails = schoolTestExamMarkDetailsRepository.findByInstituteidAndAcademicyearAndStandardAndSection(instituteid, academicyear, standard, section);

        JSONArray resultArray = new JSONArray();
        schoolTestExamMarkDetails.forEach((schoolTestExamMarkDetail)->{

            String testtype = schoolTestExamMarkDetail.getTesttype();
            Integer maxmarks = schoolTestExamMarkDetail.getMaxmarks();
            Integer minmarks = schoolTestExamMarkDetail.getMinmarks();
            String subMarkDetails = schoolTestExamMarkDetail.getSubjectmarkdetails();
            JSONObject currentStudentMarkDetails = new JSONObject();
            try {
                JSONArray subMarkDetailsArray = new JSONArray(subMarkDetails);
                for (int i=0; i<subMarkDetailsArray.length();i++){
                    JSONObject obj = subMarkDetailsArray.getJSONObject(i);
                    String regnoInObj = obj.getString("registernumber");
                    if(regnoInObj.equals(registernumber)){
                        currentStudentMarkDetails = obj;

                        JSONObject exammarkObj = new JSONObject();

                        exammarkObj.put("academicyear", academicyear);
                        exammarkObj.put("instituteid", instituteid);
                        exammarkObj.put("standard", standard);
                        exammarkObj.put("section", section);
                        exammarkObj.put("testtype", testtype);
                        exammarkObj.put("maxmarks", maxmarks);
                        exammarkObj.put("minmarks", minmarks);
                        exammarkObj.put("section", section);
                        exammarkObj.put("studentmarks", currentStudentMarkDetails);

                        resultArray.put(exammarkObj);
                    }
                }

            } catch (JSONException e) {
                e.printStackTrace();
            }
        });
        System.out.println("Inside getApplicationDetail");
        return resultArray.toString();
    }


}
