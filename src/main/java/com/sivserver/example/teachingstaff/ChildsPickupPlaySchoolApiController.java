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
            @RequestParam(value = "pickuppersonname", required = false) String pickuppersonname,
            @RequestParam(value = "pickuppersonrelation", required = false) String pickuppersonrelation,
            @RequestParam(value = "pickuppersonmobileno", required = false) String pickuppersonmobileno,
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
        ps_childs_pickup.setPickuppersonname(pickuppersonname);
        ps_childs_pickup.setPickuppersonrelation(pickuppersonrelation);
        ps_childs_pickup.setPickuppersonmobileno(pickuppersonmobileno);
        ps_childs_pickup.setRemarks(remarks);
        ps_childs_pickup.setLoginuser(loginuser);


        childsPickupPlaySchoolRepository.save(ps_childs_pickup);


    }

    @RequestMapping(method = RequestMethod.POST, value="/getChildsPickupPlaySchoolDetail")
    public ChildsPickupPlaySchoolProjection getChildsPickupPlaySchoolDetail(@RequestParam (value ="pickupid") String pickupid) {
        ChildsPickupPlaySchoolProjection playschoolChildsPickupDetail = childsPickupPlaySchoolRepository.findOneByPickupid(pickupid);
        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getChildsPickupPlaySchoolDetail");
        return playschoolChildsPickupDetail;
    }


}
