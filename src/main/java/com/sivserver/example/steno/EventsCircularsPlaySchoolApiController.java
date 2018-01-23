package com.sivserver.example.steno;

import com.sivserver.example.admission.ApplicationSaleProjection;
import com.sivserver.example.student.PlaySchoolStudentBaseInformationProjection;
import com.sivserver.example.student.PlaySchoolStudentBaseInformationRepository;
import com.sivserver.example.teachingstaff.PlaySchoolHomeWorkIdGenerate;
import com.sivserver.example.teachingstaff.StudentHomeWorkPlaySchoolProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.xml.soap.Text;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 07/11/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/eventscircularsplayschool")
public class EventsCircularsPlaySchoolApiController {

    private EventsCircularsPlaySchoolRepository  eventsCircularsPlaySchoolRepository;

    @Autowired
    private PlaySchoolEventIdGenerateRepository playSchoolEventIdGenerateRepository;

    @Autowired
    private PlaySchoolStudentBaseInformationRepository playSchoolStudentBaseInformationRepository;

    @GetMapping(value="/all")

    public List<EventsCircularsPlaySchool> getEventsCircularsPlaySchoolDetails() {return eventsCircularsPlaySchoolRepository.findAll();}

    public EventsCircularsPlaySchoolApiController(EventsCircularsPlaySchoolRepository  eventsCircularsPlaySchoolRepository)
    {
        this.eventsCircularsPlaySchoolRepository = eventsCircularsPlaySchoolRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void eventscircularsplayschool(
            @RequestParam(value = "eventid", required = false) String eventid,
            @RequestParam(value = "entrydate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date entrydate,
            @RequestParam(value = "eventdate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date eventdate,
            @RequestParam(value = "eventday", required = false) String eventday,
            @RequestParam(value = "program", required = false) String program,
            @RequestParam(value = "section", required = false) String section,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "eventtitle", required = false) String eventtitle,
            @RequestParam(value = "message", required = false) String message,
            @RequestParam(value = "loginuser", required = false) String loginuser,
            @RequestParam(value = "instituteid", required = false) Integer instituteid,
            @RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "evecirid", required = false) Integer evecirid


    )
    {
        EventsCircularsPlaySchool ps_events_circulars = new EventsCircularsPlaySchool();
        PlaySchoolEventIdGenerate pseventidgen = new PlaySchoolEventIdGenerate();

        ps_events_circulars.setEventid(eventid);
        ps_events_circulars.setEntrydate(entrydate);
        ps_events_circulars.setEventdate(eventdate);
        ps_events_circulars.setEventday(eventday);
        ps_events_circulars.setProgram(program);
        ps_events_circulars.setSection(section);
        ps_events_circulars.setAcademicyear(academicyear);
        ps_events_circulars.setEventtitle(eventtitle);
        ps_events_circulars.setMessage(message);
        ps_events_circulars.setLoginuser(loginuser);
        ps_events_circulars.setInstituteid(instituteid);


        eventsCircularsPlaySchoolRepository.save(ps_events_circulars);

        pseventidgen.setId(id);
        pseventidgen.setEvecirid(evecirid);

        playSchoolEventIdGenerateRepository.save(pseventidgen);
    }

    @RequestMapping(method = RequestMethod.POST, value="/getEventsCircularsPlaySchoolDetail")
    public EventsCircularsPlaySchoolProjection getEventsCiruclarsPlaySchoolDetail(@RequestParam (value ="eventid") String eventid) {
        EventsCircularsPlaySchoolProjection eventscircularsPlaySchoolDetail = eventsCircularsPlaySchoolRepository.findOneByEventid(eventid);
        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getEventsCircularsPlaySchoolDetail");
        return eventscircularsPlaySchoolDetail;
    }


    @RequestMapping(method = RequestMethod.POST, value="/getStudentEventCircularListPlaySchool")
    public Iterable<EventsCircularsPlaySchoolProjection> getStudentEventCircularListPlaySchool(@RequestParam (value ="registernumber") String registernumber, @RequestParam (value ="hwdate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date hwdate) {


        PlaySchoolStudentBaseInformationProjection playSchoolStudentBaseInformationProjection = playSchoolStudentBaseInformationRepository.findOneByRegisternumber(registernumber);
        String academicyear=playSchoolStudentBaseInformationProjection.getAcademicyear();
        String program=playSchoolStudentBaseInformationProjection.getStandardstudying();
        String section=playSchoolStudentBaseInformationProjection.getSection();
        String alternateProgram ="ALL";
        String alternateSection ="ALL";
        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();
        String curDate= year + "-"+month+"-"+day+ " 00:00:00";
        //String curDate= "2017-12-12 00:00:00";
        Date date1;
        Iterable<EventsCircularsPlaySchoolProjection> playschoolstudentEventCircularDetail = null;
        try {
            date1=new SimpleDateFormat("MM-dd-yyyy HH:mm:ss").parse(curDate);


            java.sql.Timestamp ts = java.sql.Timestamp.valueOf( curDate ) ;
            System.out.println("Inside getStudentHomeWorkPlaySchoolDetail");
            System.out.println(academicyear);
            System.out.println(program);
            System.out.println(section);
            System.out.println(ts);

            playschoolstudentEventCircularDetail = eventsCircularsPlaySchoolRepository.findAllByAcademicyearAndProgramOrProgramAndSectionOrSectionAndEntrydateAfter(academicyear,program,alternateProgram,section,alternateSection,ts);
//        playschoolstudentHomeWorkDetail = studentHomeWorkPlaySchoolRepository.findAllByAcademicyearAndProgramAndSectionAndEntrydate(academicyear,program,section,ts);

            System.out.println(playschoolstudentEventCircularDetail);
        } catch (ParseException e) {
            e.printStackTrace();
        }
//        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
//        System.out.println("Inside getStudentHomeWorkPlaySchoolDetail");
        return playschoolstudentEventCircularDetail;
    }


}
