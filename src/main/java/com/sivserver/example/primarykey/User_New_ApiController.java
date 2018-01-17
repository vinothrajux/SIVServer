package com.sivserver.example.primarykey;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Date;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 22/08/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/primarykeyuser")

public class User_New_ApiController  {

       @Autowired
        private Users_New_Repository user_newRepository;

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
        public void newuser(
                @RequestParam(value ="regno", required=false) Integer regno,
                @RequestParam(value ="name", required=false) String name,
                @RequestParam(value ="Fees", required=false) Long Fees,
                @RequestParam(value ="Department", required=false) String Department

        ) {
            User_New newuser1 = new User_New();
            newuser1.setRegno(regno);
            newuser1.setName(name);
            newuser1.setFees(Fees);
            newuser1.setDepartment(Department);

            user_newRepository.save(newuser1);



        }


    }
