package com.sivserver.example.Superintendent;

import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 07/11/2017.
 */
@RestController
@RequestMapping("/api/v1/staffpersonalinformationplayschool")
public class StaffPersonalInformationPlaySchoolApiController {

    private StaffPersonalInformationPlaySchoolRepository staffPersonalInformationPlaySchoolRepository;

    @GetMapping(value="/all")

    public List<StaffPersonalInformationPlaySchool> getStaffPersonalInformationPlaySchool() {return staffPersonalInformationPlaySchoolRepository.findAll();}

    public StaffPersonalInformationPlaySchoolApiController(StaffPersonalInformationPlaySchoolRepository staffPersonalInformationPlaySchoolRepository)
    {
        this.staffPersonalInformationPlaySchoolRepository = staffPersonalInformationPlaySchoolRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void staffpersonalinformationplayschool(
            @RequestParam(value ="date_of_join", required=false) Date date_of_join,
            @RequestParam(value ="staffid", required=false) String staffid,
            @RequestParam(value ="staffname", required=false) String staffname,
            @RequestParam (value="designation", required=false) String designation,
            @RequestParam (value="dateofbirth", required=false) Date dateofbirth,
            @RequestParam (value="age", required=false) Integer age,
            @RequestParam (value="bloodgroup", required=false) String bloodgroup,
            @RequestParam (value="maritalstatus", required=false) String maritalstatus,
            @RequestParam (value="fathersname", required=false) String fathersname,
            @RequestParam (value="mothersname", required=false) String mothersname,
            @RequestParam (value="spousename", required=false) String spousename,
            @RequestParam (value="addressline1", required=false) String addressline1,
            @RequestParam (value="addressline2", required=false) String addressline2,
            @RequestParam (value="area", required=false) String area,
            @RequestParam (value="pin", required=false) String pin,
            @RequestParam (value="mobilenumber", required=false) String mobilenumber,
            @RequestParam (value="alternativemobilenumber", required=false) String alternativemobilenumber,
            @RequestParam (value="emailid", required=false) String emailid,
            @RequestParam (value="qualification", required=false) String qualification,
            @RequestParam (value="course", required=false) String course,
            @RequestParam (value="university", required=false) String university,
            @RequestParam (value="percentage", required=false) Long percentage,
            @RequestParam (value="month_year_of_pass", required=false) String month_year_of_pass,
            @RequestParam (value="experience", required=false) String experience,
            @RequestParam (value="no_of_years", required=false) Integer no_of_years,
            @RequestParam (value="loginuser", required=false) String loginuser
    )
    {
        StaffPersonalInformationPlaySchool ps_staff_personal_info = new StaffPersonalInformationPlaySchool();

        ps_staff_personal_info.setDate_of_join(date_of_join);
        ps_staff_personal_info.setStaffid(staffid);
        ps_staff_personal_info.setStaffname(staffname);
        ps_staff_personal_info.setDesignation(designation);
        ps_staff_personal_info.setDateofbirth(dateofbirth);
        ps_staff_personal_info.setAge(age);
        ps_staff_personal_info.setBloodgroup(bloodgroup);
        ps_staff_personal_info.setMaritalstatus(maritalstatus);
        ps_staff_personal_info.setFathersname(fathersname);
        ps_staff_personal_info.setMothersname(mothersname);
        ps_staff_personal_info.setSpousename(spousename);
        ps_staff_personal_info.setAddressline1(addressline1);
        ps_staff_personal_info.setAddressline2(addressline2);
        ps_staff_personal_info.setArea(area);
        ps_staff_personal_info.setPin(pin);
        ps_staff_personal_info.setMobilenumber(mobilenumber);
        ps_staff_personal_info.setAlternativemobilenumber(alternativemobilenumber);
        ps_staff_personal_info.setEmailid(emailid);
        ps_staff_personal_info.setQualification(qualification);
        ps_staff_personal_info.setCourse(course);
        ps_staff_personal_info.setUniversity(university);
        ps_staff_personal_info.setPercentage(percentage);
        ps_staff_personal_info.setMonth_year_of_pass(month_year_of_pass);
        ps_staff_personal_info.setExperience(experience);
        ps_staff_personal_info.setNo_of_years(no_of_years);
        ps_staff_personal_info.setLogiuser(loginuser);

        staffPersonalInformationPlaySchoolRepository.save(ps_staff_personal_info);


    }

    }

