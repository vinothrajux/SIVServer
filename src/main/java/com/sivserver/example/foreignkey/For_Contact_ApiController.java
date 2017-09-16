package com.sivserver.example.foreignkey;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by GBCorp on 29/08/2017.
 */
@RestController
@RequestMapping("/api/v1/forusercontact")

public class For_Contact_ApiController {

    private For_Contact_Repository forContactRepository;

    @GetMapping(value="/all")
    public List<For_Contact> getForContact() {return forContactRepository.findAll();}

//    public For_Contact_ApiController(For_Contact_Repository forContactRepository)
//    {
//        this.forContactRepository=forContactRepository;
//    }

    @RequestMapping (method = RequestMethod.POST)
    public void forusercont(
            @RequestParam(value = "regno",required = true) String regno,
            @RequestParam(value ="Phoneno",required=true)  String Phoneno
    ){

        For_Contact user_cont = new For_Contact();
        For_User users = new For_User(regno);
        user_cont.setRegno(regno)
                .setPhoneno(Phoneno)
                .setUsers(users);
        forContactRepository.save(user_cont);


    }


}

