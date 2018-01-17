package com.sivserver.example.sports;

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
@RequestMapping("/api/v1/tournamentdetail")

public class TournamentDataApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private TournamentDataRepository tournamentDataRepository;


    @RequestMapping(method = RequestMethod.POST)
    public void tournamentdata(
            @RequestParam(value ="tournamentid", required=false) String tournamentid,
            @RequestParam(value ="tournamentdate", required=false) Date tournamentdate,
            @RequestParam (value="tournamentday", required=false) String tournamentday,
            @RequestParam (value="sportstype", required=false) String sportstype,
            @RequestParam (value="sportscode", required=false) String sportscode,
            @RequestParam (value="tournamentname", required=false) String tournamentname,
            @RequestParam (value="tournamentlevel", required=false) String tournamentlevel,
            @RequestParam (value="tournamentlocation", required=false) String tournamentlocation,
            @RequestParam (value="locationaddress1", required=false) String locationaddress1,
            @RequestParam (value="locationaddress2", required=false) String locationaddress2,
            @RequestParam (value="locationarea", required=false) String locationarea,
            @RequestParam (value="locationpincode", required=false) String locationpincode,
            @RequestParam (value="locationstate", required=false) String locationstate,
            @RequestParam (value="physicaldirectormobileno", required=false) String physicaldirectormobileno,
            @RequestParam (value="physicaldirectoraltmobno", required=false) String physicaldirectoraltmobileno,
            @RequestParam (value="physicaldirectoremail", required=false) String physicaldirectoremail,
            @RequestParam (value="physicaldirectoraltemail", required=false) String physicaldirectoraltemail,
            @RequestParam (value="tournamentstartdate", required=false) Date tournamentstartdate,
            @RequestParam (value="tournamentenddate", required=false) Date tournamentenddate,
            @RequestParam (value="tournamentnoofdays", required=false) Integer tournamentnoofdays,
            @RequestParam (value="loginuser", required=false) String loginuser



    ) {
        TournamentData tourData = new TournamentData();
        tourData.setTournamentid (tournamentid);
        tourData.setTournamentdate(tournamentdate);
        tourData.setTournamentday(tournamentday);
        tourData.setSportstype(sportstype);
        tourData.setSportscode(sportscode);
        tourData.setTournamentname(tournamentname);
        tourData.setTournamentlevel(tournamentlevel);
        tourData.setTournamentlocation(tournamentlocation);
        tourData.setLocationaddress1(locationaddress1);
        tourData.setLocationaddress2(locationaddress2);
        tourData.setLocationarea(locationarea);
        tourData.setLocationpincode(locationpincode);
        tourData.setLocationstate(locationstate);
        tourData.setPhysicaldirectormobileno(physicaldirectormobileno);
        tourData.setPhysicaldirectoraltmobileno(physicaldirectoraltmobileno);
        tourData.setPhysicaldirectoremail(physicaldirectoremail);
        tourData.setPhysicaldirectoraltemail(physicaldirectoraltemail);
        tourData.setTournamentstartdate(tournamentstartdate);
        tourData.setTournamentenddate(tournamentenddate);
        tourData.setTournamentnoofdays(tournamentnoofdays);
        tourData.setLoginuser(loginuser);

        tournamentDataRepository.save(tourData);



    }


}
