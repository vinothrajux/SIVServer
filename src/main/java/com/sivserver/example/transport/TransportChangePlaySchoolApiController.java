package com.sivserver.example.transport;

import com.sivserver.example.student.PlaySchoolStudentBaseInformation;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 07/11/2017.
 */
@RestController
@RequestMapping("/api/v1/transportchangeplayschool")

public class TransportChangePlaySchoolApiController {

    private TransportChangePlaySchoolRepository transportChangePlaySchoolRepository;

    @GetMapping(value="/all")

    public List<TransportChangePlaySchool> getTransportChangePlaySchoolDetails() {return transportChangePlaySchoolRepository.findAll();}

    public TransportChangePlaySchoolApiController(TransportChangePlaySchoolRepository transportChangePlaySchoolRepository)
    {
        this.transportChangePlaySchoolRepository = transportChangePlaySchoolRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void transportchangeplayschool(
            @RequestParam(value = "transportchangeid", required = false) String transportchangeid,
            @RequestParam(value = "entrydate", required = false) Date entrydate,
            @RequestParam(value = "registernumber", required = false) String registernumber,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "program", required = false) String program,
            @RequestParam(value = "section", required = false) String section,
            @RequestParam(value = "transport_required", required = false) String transport_required,
            @RequestParam(value = "stage", required = false) String stage,
            @RequestParam(value = "transport_init_fees", required = false) Long transport_init_fees,
            @RequestParam(value = "transport_term1_fees", required = false) Long transport_term1_fees,
            @RequestParam(value = "transport_term2_fees", required = false) Long transport_term2_fees,
            @RequestParam(value = "transport_total_fees", required = false) Long transport_total_fees,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "remarks", required = false) String remarks,
            @RequestParam(value = "loginuser", required = false) String loginuser


    )
    {
        TransportChangePlaySchool ps_transport_change = new TransportChangePlaySchool();
        PlaySchoolStudentBaseInformation ps_student_base_info = new PlaySchoolStudentBaseInformation();

        ps_transport_change.setTransportchangeid(transportchangeid);
        ps_transport_change.setEntrydate(entrydate);
        ps_transport_change.setRegisternumber(registernumber);
        ps_transport_change.setName(name);
        ps_transport_change.setProgram(program);
        ps_transport_change.setSection(section);
        ps_transport_change.setTransport_required(transport_required);
        ps_transport_change.setStage(stage);
        ps_transport_change.setTransport_init_fees(transport_init_fees);
        ps_transport_change.setTransport_term1_fees(transport_term1_fees);
        ps_transport_change.setTransport_term2_fees(transport_term2_fees);
        ps_transport_change.setTransport_total_fees(transport_total_fees);
        ps_transport_change.setAcademicyear(academicyear);
        ps_transport_change.setRemarks(remarks);
        ps_transport_change.setLoginuser(loginuser);

        transportChangePlaySchoolRepository.save(ps_transport_change);
    }

    }

