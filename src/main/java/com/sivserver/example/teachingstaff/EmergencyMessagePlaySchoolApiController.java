package com.sivserver.example.teachingstaff;

import com.sivserver.example.student.PlaySchoolStudentBaseInformation;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 07/11/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/emergencymessageplayschool")
public class EmergencyMessagePlaySchoolApiController {

    private EmergencyMessagePlaySchoolRepository emergencyMessagePlaySchoolRepository;

    @GetMapping(value="/all")

    public List<EmergencyMessagePlaySchool> getEmergencyMessagePlaySchoolDetails() { return emergencyMessagePlaySchoolRepository.findAll();}

    public EmergencyMessagePlaySchoolApiController(EmergencyMessagePlaySchoolRepository emergencyMessagePlaySchoolRepository)
    {
        this.emergencyMessagePlaySchoolRepository = emergencyMessagePlaySchoolRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void emergencymessageplayschool(
            @RequestParam(value = "emergencymessageid", required = false) String emergencymessageid,
            @RequestParam(value = "entrydate", required = false) Date entrydate,
            @RequestParam(value = "day", required = false) String day,
            @RequestParam(value = "time", required = false) String time,
            @RequestParam(value = "registernumber", required = false) String registernumber,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "program", required = false) String program,
            @RequestParam(value = "section", required = false) String section,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "message", required = false) String message,
            @RequestParam(value = "loginuser", required = false) String loginuser,
            @RequestParam(value = "instituteid", required = false) Integer instituteid


    )
    {
        EmergencyMessagePlaySchool ps_emergency_message = new EmergencyMessagePlaySchool();
        PlaySchoolStudentBaseInformation ps_student_base_info = new PlaySchoolStudentBaseInformation();

        ps_emergency_message.setEmergencymessageid(emergencymessageid);
        ps_emergency_message.setEntrydate(entrydate);
        ps_emergency_message.setDay(day);
        ps_emergency_message.setTime(time);
        ps_emergency_message.setRegisternumber(registernumber);
        ps_emergency_message.setName(name);
        ps_emergency_message.setProgram(program);
        ps_emergency_message.setSection(section);
        ps_emergency_message.setAcademicyear(academicyear);
        ps_emergency_message.setMessage(message);
        ps_emergency_message.setLoginuser(loginuser);
        ps_emergency_message.setInstituteid(instituteid);

        emergencyMessagePlaySchoolRepository.save(ps_emergency_message);

    }

    }


