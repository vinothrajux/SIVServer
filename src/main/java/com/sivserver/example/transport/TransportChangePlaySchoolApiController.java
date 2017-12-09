package com.sivserver.example.transport;

import com.sivserver.example.admission.ApplicationSalePlaySchoolProjection;
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
            @RequestParam(value = "transportrequired", required = false) String transportrequired,
            @RequestParam(value = "stage", required = false) String stage,
            @RequestParam(value = "transportinitfees", required = false) Long transportinitfees,
            @RequestParam(value = "transportterm1fees", required = false) Long transportterm1fees,
            @RequestParam(value = "transportterm2fees", required = false) Long transportterm2fees,
            @RequestParam(value = "transporttotalfees", required = false) Long transporttotalfees,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "remarks", required = false) String remarks,
            @RequestParam(value = "loginuser", required = false) String loginuser


    )
    {
        TransportChangePlaySchool ps_transport_change = new TransportChangePlaySchool();
        PlaySchoolStudentBaseInformation ps_student_base_info = new PlaySchoolStudentBaseInformation(registernumber);

        ps_transport_change.setTransportchangeid(transportchangeid);
        ps_transport_change.setEntrydate(entrydate);
        ps_transport_change.setRegisternumber(registernumber);
        ps_transport_change.setName(name);
        ps_transport_change.setProgram(program);
        ps_transport_change.setSection(section);
        ps_transport_change.setTransportrequired(transportrequired);
        ps_transport_change.setStage(stage);
        ps_transport_change.setTransportinitfees(transportinitfees);
        ps_transport_change.setTransportterm1fees(transportterm1fees);
        ps_transport_change.setTransportterm2fees(transportterm2fees);
        ps_transport_change.setTransporttotalfees(transporttotalfees);
        ps_transport_change.setAcademicyear(academicyear);
        ps_transport_change.setRemarks(remarks);
        ps_transport_change.setLoginuser(loginuser);

        transportChangePlaySchoolRepository.save(ps_transport_change);
    }

    @RequestMapping(method = RequestMethod.POST, value="/getPlaySchoolTransportChangeDetail")
    public TransportChangePlaySchoolProjection getPlaySchoolTransportChangeDetail(@RequestParam (value ="transportchangeid") String transportchangeid) {
        TransportChangePlaySchoolProjection playschooltransportchangeDetail = transportChangePlaySchoolRepository.findOneByTransportchangeid(transportchangeid);
        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getPlaySchoolTransportChangeDetail");
        return playschooltransportchangeDetail;
    }


}

