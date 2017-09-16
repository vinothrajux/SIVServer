package com.sivserver.example.primarykey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by GBCorp on 22/08/2017.
 */
@RestController
@RequestMapping("/api/v1/primaryusercontact")

public class User_New_Contact_ApiController {

    private User_New_Contact_Repository user_new_Contact_Repository;

    @GetMapping(value="/all")
    public List<User_New_Contact> getUsersNewContact(){
        return user_new_Contact_Repository.findAll();
    }

    public User_New_Contact_ApiController(User_New_Contact_Repository user_new_Contact_Repository)
    {
        this.user_new_Contact_Repository = user_new_Contact_Repository;
    }
//    @Autowired
//    private ApplicationSaleRepository applicationSaleRepository;
//
//
//    @RequestMapping(method = RequestMethod.GET, value="/getApplcationDetail")
//    public ApplicationSaleDetailProjection getApplcationDetail(@RequestParam (value ="applno") String applicationNumber) {
//        ApplicationSaleDetailProjection applicationDetail = applicationSaleRepository.findOneByApplno(applicationNumber);
//        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
//
//        return applicationDetail;
//
//    }


    @RequestMapping(method = RequestMethod.POST)
    public void newusercont(
            @RequestParam(value ="regno", required=false) Integer regno,
            @RequestParam(value ="Phoneno", required=false) String Phoneno
           // @RequestParam(value ="users", required=false) User_New users



    ) {

        User_New_Contact newusercont = new User_New_Contact();
        User_New users = new User_New(regno);
        newusercont.setRegno(regno)
                    .setPhoneno(Phoneno)
                    .setUsers(users);

        user_new_Contact_Repository.save(newusercont);



    }


}
