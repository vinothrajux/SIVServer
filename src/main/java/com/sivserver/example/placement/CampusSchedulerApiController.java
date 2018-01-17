package com.sivserver.example.placement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 14/07/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/campusscheduler")

public class CampusSchedulerApiController  {
    @Autowired
    private CampusSchedulerRepository campusScheduleRepository;

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
    public void campScheduler(
            @RequestParam(value ="scheduleid", required=false) String scheduleid,
            @RequestParam(value ="scheduledate", required=false) Date scheduledate,
            @RequestParam (value="scheduleday", required=false) String scheduleday,
            @RequestParam (value="typeofevent", required=false) String typeofevent,
            @RequestParam (value="remarks", required=false) String remarks,
            @RequestParam (value="loginuser", required=false) String loginuser
    ) {
        CampusScheduler campScheduler = new CampusScheduler();
        campScheduler.setScheduleid(scheduleid);
        campScheduler.setScheduledate(scheduledate);
        campScheduler.setScheduleday(scheduleday);
        campScheduler.setTypeofevent(typeofevent);
        campScheduler.setRemarks(remarks);
        campScheduler.setLoginuser(loginuser);



        campusScheduleRepository.save(campScheduler);



    }

}
