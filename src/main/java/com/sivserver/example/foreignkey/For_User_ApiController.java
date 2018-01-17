package com.sivserver.example.foreignkey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 29/08/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/foruser")

public class For_User_ApiController {

    @Autowired
    private For_User_Repository forUserRepository;

    @RequestMapping(method = RequestMethod.POST)

    public void fornewuser(
            @RequestParam(value = "regno", required = true) String regno,
            @RequestParam(value = "name", required = true) String name,
            @RequestParam(value = "Fees", required = true) Long Fees,
            @RequestParam(value = "Department", required = true) String Department
    ){

    For_User newuser1 = new For_User();
        newuser1.setRegno(regno);
        newuser1.setName(name);
        newuser1.setFees(Fees);
        newuser1.setDepartment(Department);

        forUserRepository.save(newuser1);

}
}
