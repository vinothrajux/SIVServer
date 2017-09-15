package com.sivserver.example.sports;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Created by GBCorp on 14/07/2017.
 */
@RestController
@RequestMapping("/api/v1/atheletedetail")

public class AtheleteDetailApiController  {
    //@Autowired
    private AtheleteDetailRepository atheleteDetailRepository;

    @GetMapping(value="/all")

    public List<AtheleteDetail> getAtheleteDetail() {return atheleteDetailRepository.findAll(); }

    public AtheleteDetailApiController(AtheleteDetailRepository atheleteDetailRepository)
    {
        this.atheleteDetailRepository = atheleteDetailRepository;
    }



    @RequestMapping(method = RequestMethod.POST)
    public void atheletedet(
            @RequestParam(value ="id", required=false) Integer id,
            @RequestParam(value ="atheleteid", required=false) String atheleteid,
            @RequestParam(value ="typeofsports", required=false) String typeofsports,
            @RequestParam (value="sportscode", required=false) String sportscode,
            @RequestParam (value="areainsports", required=false) String areainsports,
            @RequestParam (value="performancelevel", required=false) String performancelevel,
            @RequestParam (value="house", required=false) String house

    ) {
        AtheleteDetail athleteDet = new AtheleteDetail();
        AtheleteHeader atheleteHeader = new AtheleteHeader(atheleteid);
        athleteDet.setAtheleteid (atheleteid);
        athleteDet.setTypeofsports(typeofsports);
        athleteDet.setSportscode(sportscode);
        athleteDet.setAreainsports(areainsports);
        athleteDet.setPerformancelevel(performancelevel);
        athleteDet.setHouse(house);

        atheleteDetailRepository.save(athleteDet);



    }


}
