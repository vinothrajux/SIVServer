package com.sivserver.example.teachingstaff;

import com.sivserver.example.institute.InstituteSchoolSubjectDetails;
import com.sivserver.example.institute.InstituteSchoolSubjectDetailsRepository;
import com.sivserver.example.steno.EventsCircularsPlaySchool;
import com.sivserver.example.steno.EventsCircularsPlaySchoolRepository;
import com.sivserver.example.steno.PlaySchoolEventIdGenerate;
import com.sivserver.example.steno.PlaySchoolEventIdGenerateRepository;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 24-Apr-18.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/schooltestexamtimetable")

public class SchoolTestExamTimeTableApiController {
    @Autowired
    private SchoolTestExamTimeTableRepository schoolTestExamTimeTableRepository;
    @Autowired
    private InstituteSchoolSubjectDetailsRepository instituteSchoolSubjectDetailsRepository;
    @Autowired
    private EventsCircularsPlaySchoolRepository eventsCircularsPlaySchoolRepository;

    @Autowired
    private PlaySchoolEventIdGenerateRepository playSchoolEventIdGenerateRepository;


    @GetMapping(value="/all")

    public List<SchoolTestExamTimeTable> getSchoolTestExamTimeTableDetails() {return schoolTestExamTimeTableRepository.findAll();}

    public SchoolTestExamTimeTableApiController(SchoolTestExamTimeTableRepository schoolTestExamTimeTableRepository)
    {
        this.schoolTestExamTimeTableRepository = schoolTestExamTimeTableRepository;

    }

    @RequestMapping(method = RequestMethod.POST)

    public void schooltestexamtimetabledet(
            @RequestParam(value ="instituteid", required=false) Integer instituteid,
            @RequestParam(value ="testtype", required=false) String testtype,
            @RequestParam(value ="standard", required=false) String standard,
            @RequestParam(value ="academicyear", required=false) String academicyear,
            @RequestParam(value ="subjectdetails", required=false) String subjectdetails,
            @RequestParam(value ="loginuser", required=false) String loginuser
    ) {
        SchoolTestExamTimeTable schoolTestExamTimeTable = new SchoolTestExamTimeTable();
        SchoolTestExamTimeTableCompoundKey key = new SchoolTestExamTimeTableCompoundKey(instituteid, testtype, standard, academicyear);

        schoolTestExamTimeTable.setSchoolTestExamTimeTableCompoundKey(key);
        schoolTestExamTimeTable.setSubjectdetails(subjectdetails);
        schoolTestExamTimeTable.setLoginuser(loginuser);

        schoolTestExamTimeTableRepository.save(schoolTestExamTimeTable);


    }

    @RequestMapping(method = RequestMethod.POST, value="/getschooltestexamtimetable")
    public String getPlaySchoolAdmissionDetail(
            @RequestParam(value ="program", required=false) String program,
            @RequestParam(value ="section", required=false) String section,
            @RequestParam(value ="academicyear", required=false) String academicyear,
            @RequestParam(value ="testtype", required=false) String testtype,
            @RequestParam(value ="instituteid", required=false) Integer instituteid
            ) {
        InstituteSchoolSubjectDetails instituteSchoolSubjectDetails = new InstituteSchoolSubjectDetails();
        instituteSchoolSubjectDetails = instituteSchoolSubjectDetailsRepository.findByInstituteid(instituteid);
        JSONObject returnSubjectDetails = null;
        JSONArray subjectDetailsArray = null;
        if(instituteSchoolSubjectDetails == null){
            return "No data";
        }else {
            String subjectdetails = instituteSchoolSubjectDetails.getSubjectdetails();


            try {
                subjectDetailsArray = new JSONArray(subjectdetails);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < subjectDetailsArray.length(); i++) {
                JSONObject jsonObject = null;
                try {
                    jsonObject = subjectDetailsArray.getJSONObject(i);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                try {
                    if (jsonObject.getString("standard").equals(program)) {
                        returnSubjectDetails = jsonObject;
                        break;
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        if(returnSubjectDetails==null){
            String temp="{\"returnmessage\":\"No Data\"}";
            return temp;
        }else{
            return returnSubjectDetails.toString();
        }
    }

    @RequestMapping(method = RequestMethod.POST, value="/uploadTimeTable")
    public String getPlaySchoolAdmissionDetail(
            @RequestParam(value ="getTimeTableData", required=false) JSONObject getTimeTableData,
            @RequestParam(value ="subjectdetails", required=false) JSONArray subjectdetails
    ) {
        try {
            System.out.println(getTimeTableData.getString("academicyear"));
            String academicyear = getTimeTableData.getString("academicyear");
            String program = getTimeTableData.getString("program");
            String testtype = getTimeTableData.getString("testtype");
            String loginuser = getTimeTableData.getString("loginuser");
            Integer instituteid = getTimeTableData.getInt("instituteid");
            Integer id = getTimeTableData.getInt("id");
            Integer evecirid = getTimeTableData.getInt("evecirid");
            String eventid = getTimeTableData.getString("eventid");
            String section = getTimeTableData.getString("section");

            SchoolTestExamTimeTable schoolTestExamTimeTable = new SchoolTestExamTimeTable();
            SchoolTestExamTimeTableCompoundKey key = new SchoolTestExamTimeTableCompoundKey(instituteid, testtype, program, academicyear);

            schoolTestExamTimeTable.setSchoolTestExamTimeTableCompoundKey(key);
            schoolTestExamTimeTable.setSubjectdetails(subjectdetails.toString());
            schoolTestExamTimeTable.setLoginuser(loginuser);

            schoolTestExamTimeTableRepository.save(schoolTestExamTimeTable);

            String examtimetableTextFormat = "";
            Date lastexamdate = new Date();

            for(int i=0;i<subjectdetails.length();i++){
                JSONObject subjectdetailObj = subjectdetails.getJSONObject(i);
                String subjectname = subjectdetailObj.getString("subjectname");
                String subjectcode = subjectdetailObj.getString("subjectcode");
                String subjecttype = subjectdetailObj.getString("subjecttype");
                String examdate = subjectdetailObj.getString("date");

                Date examdateObj = null;
                String dayOfWeek = "";
                try {
                    examdateObj=new SimpleDateFormat("dd/MM/yyyy").parse(examdate);

                    dayOfWeek = new SimpleDateFormat("E", Locale.ENGLISH).format(examdateObj);
                    if (lastexamdate.compareTo(examdateObj) > 0) {
                        System.out.println("Date1 is before Date2");
                    }else {
                        lastexamdate = examdateObj;
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                examtimetableTextFormat = examtimetableTextFormat + "[<<"+(i+1)+", "+subjectcode+", "+subjectname+", "+examdate+","+dayOfWeek+">>], ";

            }


            EventsCircularsPlaySchool ps_events_circulars = new EventsCircularsPlaySchool();
            PlaySchoolEventIdGenerate pseventidgen = new PlaySchoolEventIdGenerate();

            Date date = new Date();
            String modifiedDate= new SimpleDateFormat("MM/dd/yyyy").format(date);
            Date convertedDate =null;
            try {
                convertedDate= new SimpleDateFormat("MM/dd/yyyy").parse(modifiedDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }


            ps_events_circulars.setEventid(eventid);
            ps_events_circulars.setEntrydate(convertedDate);
            ps_events_circulars.setEventdate(lastexamdate);
            ps_events_circulars.setProgram(program);
            ps_events_circulars.setSection(section);
            ps_events_circulars.setAcademicyear(academicyear);
            ps_events_circulars.setEventtitle(testtype);
            ps_events_circulars.setMessage(examtimetableTextFormat);
            ps_events_circulars.setLoginuser(loginuser);
            ps_events_circulars.setInstituteid(instituteid);


            eventsCircularsPlaySchoolRepository.save(ps_events_circulars);

            pseventidgen.setId(id);
            pseventidgen.setEvecirid(evecirid);

            playSchoolEventIdGenerateRepository.save(pseventidgen);
            return "{\"returnmessage\":\"saved\"}";
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return "{\"returnmessage\":\"failed\"}";
    }
}

