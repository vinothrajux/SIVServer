package com.sivserver.example.user;

import com.sivserver.example.institute.InstituteDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 17-Jun-17.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/createuser")
public class CreateUserApiController{



    //@Autowired
    private UserRepository userRepository;

    @GetMapping(value="/all")

    public List<User> getUserDetails() {return userRepository.findAll();}

    public CreateUserApiController(UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }



    @RequestMapping(method = RequestMethod.POST)
    public void createUser(
            @RequestParam(value ="instituteid", required=false) String instituteid,
            @RequestParam(value ="username", required=false) String username,
            @RequestParam (value="password", required=false) String password,
            @RequestParam (value="userRole", required=false) String userRole,
            @RequestParam (value="studentID", required=false) String studentID,
            @RequestParam (value="staffID", required=false) String staffID,
            @RequestParam (value="firstName", required=false) String firstName,
            @RequestParam (value="lastName", required=false) String lastName,
            @RequestParam (value="branchCode", required=false) String branchCode,
            @RequestParam (value="designation", required=false) String designation,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="academicYear", required=false) String academicYear
    ) {
        InstituteDetails instituteDetails = new InstituteDetails(instituteid);
        User user = new User();

        user.setInstituteid(instituteid);
        user.setUsername(username);
        user.setPassword(password);
        user.setUserRole(userRole);
        user.setStudentId(studentID);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setBranchCode(branchCode);
        user.setSemester(semester);
        user.setAcadamicYear(academicYear);
        user.setDesignation(designation);
        user.setStaffId(staffID);

        userRepository.save(user);
        System.out.println(
                        "username:"+username+
                        ", password:"+password+
                        ", userRole:"+userRole+
                        ", studentID:"+studentID+
                        ", staffID:"+staffID+
                        ", firstName:"+firstName+
                        ", lastName:"+lastName+
                        ", branchCode:"+branchCode+
                        ", designation:"+designation+
                        ", semester:"+semester+
                        ", academicYear:"+academicYear
        );
    }
}
