package com.sivserver.example.teachingstaff;

import com.sivserver.example.student.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 07/11/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/childspickupplayschool")
public class ChildsPickupPlaySchoolApiController {


    private ChildsPickupPlaySchoolRepository childsPickupPlaySchoolRepository;

    @Autowired
    private PlaySchoolStudentBaseInformationRepository playSchoolStudentBaseInformationRepository;

    @Autowired
    private SchoolStudentBaseInformationRepository schoolStudentBaseInformationRepository;

    @Autowired
    private StudentAttendanceHeaderPlaySchoolRepository studentAttendanceHeaderPlaySchoolRepository;

    @GetMapping(value="/all")

    public List<ChildsPickupPlaySchool> getChildsPickupPlaySchoolDetails() {return childsPickupPlaySchoolRepository.findAll();}

    public ChildsPickupPlaySchoolApiController(ChildsPickupPlaySchoolRepository childsPickupPlaySchoolRepository)
    {
        this.childsPickupPlaySchoolRepository = childsPickupPlaySchoolRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void childspickupplayschool(
            @RequestParam(value = "pickupid", required = false) Integer pickupid,
            @RequestParam(value = "pickupddate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date pickupddate,
            @RequestParam(value = "pickupday", required = false) String pickupday,
            @RequestParam(value = "pickuptime", required = false) String pickuptime,
            @RequestParam(value = "registernumber", required = false) String registernumber,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "program", required = false) String program,
            @RequestParam(value = "section", required = false) String section,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "pickuppersonname", required = false) String pickuppersonname,
            @RequestParam(value = "pickuppersonrelation", required = false) String pickuppersonrelation,
            @RequestParam(value = "pickuppersonmobileno", required = false) String pickuppersonmobileno,
            @RequestParam(value = "remarks", required = false) String remarks,
            @RequestParam(value = "loginuser", required = false) String loginuser,
            @RequestParam(value = "instituteid", required = false) Integer instituteid



    )
    {
        ChildsPickupPlaySchool ps_childs_pickup = new ChildsPickupPlaySchool();
        PlaySchoolStudentBaseInformation ps_student_base_info = new PlaySchoolStudentBaseInformation();

        ps_childs_pickup.setPickupid(pickupid);
        ps_childs_pickup.setPickupddate(pickupddate);
        ps_childs_pickup.setPickupday(pickupday);
        ps_childs_pickup.setPickuptime(pickuptime);
        ps_childs_pickup.setRegisternumber(registernumber);
        ps_childs_pickup.setName(name);
        ps_childs_pickup.setProgram(program);
        ps_childs_pickup.setSection(section);
        ps_childs_pickup.setAcademicyear(academicyear);
        ps_childs_pickup.setPickuppersonname(pickuppersonname);
        ps_childs_pickup.setPickuppersonrelation(pickuppersonrelation);
        ps_childs_pickup.setPickuppersonmobileno(pickuppersonmobileno);
        ps_childs_pickup.setRemarks(remarks);
        ps_childs_pickup.setLoginuser(loginuser);
        ps_childs_pickup.setInstituteid(instituteid);



        childsPickupPlaySchoolRepository.save(ps_childs_pickup);


    }
    @RequestMapping(method = RequestMethod.POST, value="/getStudentListPickup")
    public List<PlaySchoolStudentBaseInformation> getStudentLists(
            @RequestParam(value ="standardstudying", required=false) String standardstudying,
            @RequestParam (value="section", required=false) String section,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="studentstatus", required=false) String studentstatus,
            @RequestParam (value="instituteid", required=false) Integer instituteid,
            @RequestParam (value="entrydate", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date entrydate

    ){
        ChildPickUpJoinHibernate childPickUpJoinHibernate = new ChildPickUpJoinHibernate();
        List<PlaySchoolStudentBaseInformation> students;
        students=childPickUpJoinHibernate.jointable(standardstudying, section, academicyear, entrydate, instituteid);

        for (PlaySchoolStudentBaseInformation student : students){
            for(int i=0; i<student.getStudentAttendanceDetailPlaySchoolRegno().size() ; i++){
                if (!(student.getStudentAttendanceDetailPlaySchoolRegno().get(i).getEntrydate().getTime() == entrydate.getTime())) {
                    student.getStudentAttendanceDetailPlaySchoolRegno().remove(i);
                    i--;
                }
            }
        }
        List<Integer> removeindex=new ArrayList<>();
        int in=0;
        for (PlaySchoolStudentBaseInformation student : students){
            if(student.getStudentAttendanceDetailPlaySchoolRegno().get(0).getStatus().equals("0")){
                removeindex.add(in);
            }
            in++;
        }
        if(removeindex.size()!=0) {
            for (int j = (removeindex.size() - 1); j >= 0; j--) {
                int position = removeindex.get(j);
                students.remove(position);
            }
        }

        System.out.println("Inside getApplicationDetail");
        return students;
    }






    @RequestMapping(method = RequestMethod.POST, value="/getChildsPickupPlaySchoolDetail")
    public ChildsPickupPlaySchoolProjection getChildsPickupPlaySchoolDetail(@RequestParam (value ="pickupid") String pickupid) {
        ChildsPickupPlaySchoolProjection playschoolChildsPickupDetail = childsPickupPlaySchoolRepository.findOneByPickupid(pickupid);
        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getChildsPickupPlaySchoolDetail");
        return playschoolChildsPickupDetail;
    }


    @RequestMapping(method = RequestMethod.POST, value="/setPickUpDetails")
    public void setChildsPickupDetailsDetail(@RequestParam (value ="pickupdetailsattributes") String pickupdetailsattributes, @RequestParam (value ="pickupdetails") String pickupdetails) {


        try {
            JSONObject pickupdetailsattributesObj = new JSONObject(pickupdetailsattributes);
            JSONArray pickupdetailsArrayObj = new JSONArray(pickupdetails);

            String entrydate=pickupdetailsattributesObj.getString("entrydate");
            Date pickupdate=null;
            try {
                pickupdate=new SimpleDateFormat("dd/MM/yyyy").parse(entrydate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            String program=pickupdetailsattributesObj.getString("standardstudying");
            String section=pickupdetailsattributesObj.getString("section");
            String academicyear=pickupdetailsattributesObj.getString("academicyear");
            Integer instituteid=Integer.parseInt(pickupdetailsattributesObj.getString("instituteid"));

            String candidatename, registernumber, pickuppersonname, pickuppersoncontactno, pickuppersonrelationship, pickuptime, remarks;
            for (int i=0; i<pickupdetailsArrayObj.length(); i++ ){
                ChildsPickupPlaySchool childsPickupPlaySchool = new ChildsPickupPlaySchool();
                JSONObject objectInArray = pickupdetailsArrayObj.getJSONObject(i);
                candidatename = objectInArray.getString("candidatename");
                registernumber = objectInArray.getString("registernumber");
                JSONObject playschoolpersonalObj = new JSONObject(objectInArray.getString("play_school_student_personal_regno"));
                pickuppersonname = playschoolpersonalObj.getString("pickuppersonname");
                pickuppersoncontactno = playschoolpersonalObj.getString("pickuppersoncontactno");
                pickuppersonrelationship = playschoolpersonalObj.getString("pickuppersonrelationship");
                pickuptime = objectInArray.getString("pickuptime");
                remarks = objectInArray.getString("remarks");

                childsPickupPlaySchool.setAcademicyear(academicyear);
                childsPickupPlaySchool.setName(candidatename);
                childsPickupPlaySchool.setPickupday("");
                childsPickupPlaySchool.setPickupddate(pickupdate);
                childsPickupPlaySchool.setPickuppersonmobileno(pickuppersoncontactno);
                childsPickupPlaySchool.setPickuppersonname(pickuppersonname);
                childsPickupPlaySchool.setPickuppersonrelation(pickuppersonrelationship);
                childsPickupPlaySchool.setPickuptime(pickuptime);
                childsPickupPlaySchool.setProgram(program);
                childsPickupPlaySchool.setRegisternumber(registernumber);
                childsPickupPlaySchool.setRemarks(remarks);
                childsPickupPlaySchool.setSection(section);
                childsPickupPlaySchool.setInstituteid(instituteid);
                childsPickupPlaySchoolRepository.save(childsPickupPlaySchool);
                System.out.println("date:"+entrydate);

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
//        ChildsPickupPlaySchoolProjection playschoolChildsPickupDetail = childsPickupPlaySchoolRepository.findOneByPickupid(pickupid);
        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
//        System.out.println("Inside getChildsPickupPlaySchoolDetail");
//        return playschoolChildsPickupDetail;
    }

    // PARENT CHILD'S PICK UP ANDROID VIEW MODULE API
    @RequestMapping(method = RequestMethod.POST, value="/getStudentPickupPlaySchool")
    public ChildsPickupPlaySchoolProjection getStudentPickupPlaySchool(@RequestParam (value ="registernumber") String registernumber, @RequestParam (value ="hwdate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date hwdate) {


        PlaySchoolStudentBaseInformationProjection playSchoolStudentBaseInformationProjection = playSchoolStudentBaseInformationRepository.findOneByRegisternumber(registernumber);
        String academicyear=playSchoolStudentBaseInformationProjection.getAcademicyear();
        String program=playSchoolStudentBaseInformationProjection.getStandardstudying();
        String section=playSchoolStudentBaseInformationProjection.getSection();
        Integer instituteid =playSchoolStudentBaseInformationProjection.getInstituteid();

        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();
        String curDate= year + "-"+month+"-"+day+ " 00:00:00";
        //String curDate= "2017-12-12 00:00:00";
        Date date1;
        ChildsPickupPlaySchoolProjection playschoolPickupDetail = null;
        try {
            date1=new SimpleDateFormat("MM-dd-yyyy HH:mm:ss").parse(curDate);


            java.sql.Timestamp ts = java.sql.Timestamp.valueOf( curDate ) ;
            System.out.println("Inside getStudentPickupPlaySchoolDetail");
//            System.out.println(academicyear);
//            System.out.println(program);
//            System.out.println(section);
//            System.out.println(ts);
//            if(currentdatestatus){
            playschoolPickupDetail = childsPickupPlaySchoolRepository.findOneByRegisternumberAndPickupddate(registernumber,ts);
//            }else{
//                playschoolstudentHomeWorkDetail = studentHomeWorkPlaySchoolRepository.findAllByAcademicyearAndProgramAndSectionAndEntrydate(academicyear,program,section,hwdate);
//            }
//        playschoolstudentHomeWorkDetail = studentHomeWorkPlaySchoolRepository.findAllByAcademicyearAndProgramAndSectionAndEntrydate(academicyear,program,section,ts);

            System.out.println(playschoolPickupDetail);
        } catch (ParseException e) {
            e.printStackTrace();
        }
//        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
//        System.out.println("Inside getStudentHomeWorkPlaySchoolDetail");
        return playschoolPickupDetail;
    }


}
