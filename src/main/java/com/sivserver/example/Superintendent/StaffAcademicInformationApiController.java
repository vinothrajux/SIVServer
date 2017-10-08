package com.sivserver.example.Superintendent;

import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 28/09/2017.
 */
@RestController
@RequestMapping("/api/v1/staffacademicinformation")

public class StaffAcademicInformationApiController {

    private StaffAcademicInformationRepository staffAcademicInformationRepository;

    @GetMapping(value="/all")

    public List<StaffAcademicInformation> getStaffAcademicInformation() {return staffAcademicInformationRepository.findAll();}

    public StaffAcademicInformationApiController(StaffAcademicInformationRepository staffAcademicInformationRepository)
    {
        this.staffAcademicInformationRepository = staffAcademicInformationRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void staffacademicinformation(
            @RequestParam(value ="staffid", required=false) String staffid,
            @RequestParam(value ="qualifiication", required=false) String qualifiication,
            @RequestParam (value="degree", required=false) String degree,
            @RequestParam (value="course", required=false) String course,
            @RequestParam (value="board", required=false) String board,
            @RequestParam (value="percentage", required=false) Long percentage,
            @RequestParam (value="monthandyearofpass", required=false) String monthandyearofpass,
            @RequestParam (value="organisationname", required=false) String organisationname,
            @RequestParam (value="experiencedesignation", required=false) String experiencedesignation,
            @RequestParam (value="experiencenoofyears", required=false) Integer experiencenoofyears,
            @RequestParam (value="awardwinner", required=false) Boolean awardwinner,
            @RequestParam (value="training", required=false) Boolean training,
            @RequestParam (value="seminars", required=false) Boolean seminars,
            @RequestParam (value="paperpresentation", required=false) Boolean paperpresentation,
            @RequestParam (value="nss", required=false) Boolean nss,
            @RequestParam (value="ncc", required=false) Boolean ncc,
            @RequestParam (value="loginuser", required=false) String loginuser

    )
    {
        StaffAcademicInformation staffAcademicInformation = new StaffAcademicInformation();
        StaffPersonalInformation staff_personal_staffid = new StaffPersonalInformation(staffid);
        staffAcademicInformation.setStaffid(staffid)
                                .setQualifiication(qualifiication)
                                .setDegree(degree)
                                .setCourse(course)
                                .setBoard(board)
                                .setPercentage(percentage)
                                .setMonthandyearofpass(monthandyearofpass)
                                .setOrganisationname(organisationname)
                                .setExperiencedesignation(experiencedesignation)
                                .setExperiencenoofyears(experiencenoofyears)
                                .setAwardwinner(awardwinner)
                                .setTraining(training)
                                .setSeminars(seminars)
                                .setPaperpresentation(paperpresentation)
                                .setNss(nss)
                                .setNcc(ncc)
                                .setLoginuser(loginuser)
                                .setStaff_personal_staffid(staff_personal_staffid);

        staffAcademicInformationRepository.save(staffAcademicInformation);



    }

}
