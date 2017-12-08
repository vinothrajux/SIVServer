package com.sivserver.example.teachingstaff;

import com.sivserver.example.student.PlaySchoolStudentBaseInformation;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 07/11/2017.
 */
@RestController
@RequestMapping("/api/v1/childspickupplayschool")
public class ChildsPickupPlaySchoolApiController {

    private ChildsPickupPlaySchoolRepository childsPickupPlaySchoolRepository;

    @GetMapping(value="/all")

    public List<ChildsPickupPlaySchool> getChildsPickupPlaySchoolDetails() {return childsPickupPlaySchoolRepository.findAll();}

    public ChildsPickupPlaySchoolApiController(ChildsPickupPlaySchoolRepository childsPickupPlaySchoolRepository)
    {
        this.childsPickupPlaySchoolRepository = childsPickupPlaySchoolRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void childspickupplayschool(
            @RequestParam(value = "pickupid", required = false) String pickupid,
            @RequestParam(value = "pickupddate", required = false) Date pickupddate,
            @RequestParam(value = "pickupday", required = false) String pickupday,
            @RequestParam(value = "pickuptime", required = false) String pickuptime,
            @RequestParam(value = "registernumber", required = false) String registernumber,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "program", required = false) String program,
            @RequestParam(value = "section", required = false) String section,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "pickup_person_name", required = false) String pickup_person_name,
            @RequestParam(value = "pickup_person_relation", required = false) String pickup_person_relation,
            @RequestParam(value = "pickup_person_mobileno", required = false) String pickup_person_mobileno,
            @RequestParam(value = "remarks", required = false) String remarks,
            @RequestParam(value = "loginuser", required = false) String loginuser


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
        ps_childs_pickup.setPickup_person_name(pickup_person_name);
        ps_childs_pickup.setPickup_person_relation(pickup_person_relation);
        ps_childs_pickup.setPickup_person_mobileno(pickup_person_mobileno);
        ps_childs_pickup.setRemarks(remarks);
        ps_childs_pickup.setLoginuser(loginuser);


        childsPickupPlaySchoolRepository.save(ps_childs_pickup);


    }

    }
