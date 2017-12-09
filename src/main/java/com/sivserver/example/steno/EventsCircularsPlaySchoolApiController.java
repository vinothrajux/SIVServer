package com.sivserver.example.steno;

import com.sivserver.example.admission.ApplicationSaleProjection;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 07/11/2017.
 */
@RestController
@RequestMapping("/api/v1/eventscircularsplayschool")
public class EventsCircularsPlaySchoolApiController {

    private EventsCircularsPlaySchoolRepository  eventsCircularsPlaySchoolRepository;

    @GetMapping(value="/all")

    public List<EventsCircularsPlaySchool> getEventsCircularsPlaySchoolDetails() {return eventsCircularsPlaySchoolRepository.findAll();}

    public EventsCircularsPlaySchoolApiController(EventsCircularsPlaySchoolRepository  eventsCircularsPlaySchoolRepository)
    {
        this.eventsCircularsPlaySchoolRepository = eventsCircularsPlaySchoolRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void eventscircularsplayschool(
            @RequestParam(value = "eventid", required = false) String eventid,
            @RequestParam(value = "entrydate", required = false) Date entrydate,
            @RequestParam(value = "eventdate", required = false) Date eventdate,
            @RequestParam(value = "eventday", required = false) String eventday,
            @RequestParam(value = "program", required = false) String program,
            @RequestParam(value = "section", required = false) String section,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "message", required = false) String message,
            @RequestParam(value = "loginuser", required = false) String loginuser


    )
    {
        EventsCircularsPlaySchool ps_events_circulars = new EventsCircularsPlaySchool();

        ps_events_circulars.setEventid(eventid);
        ps_events_circulars.setEntrydate(entrydate);
        ps_events_circulars.setEventdate(eventdate);
        ps_events_circulars.setEventday(eventday);
        ps_events_circulars.setProgram(program);
        ps_events_circulars.setSection(section);
        ps_events_circulars.setAcademicyear(academicyear);
        ps_events_circulars.setMessage(message);
        ps_events_circulars.setLoginuser(loginuser);

        eventsCircularsPlaySchoolRepository.save(ps_events_circulars);
    }

    @RequestMapping(method = RequestMethod.POST, value="/getEventsCircularsPlaySchoolDetail")
    public EventsCircularsPlaySchoolProjection getEventsCiruclarsPlaySchoolDetail(@RequestParam (value ="eventid") String eventid) {
        EventsCircularsPlaySchoolProjection eventscircularsPlaySchoolDetail = eventsCircularsPlaySchoolRepository.findOneByEventid(eventid);
        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getEventsCircularsPlaySchoolDetail");
        return eventscircularsPlaySchoolDetail;
    }

}
