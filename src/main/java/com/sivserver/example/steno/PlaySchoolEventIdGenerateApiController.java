package com.sivserver.example.steno;

import com.sivserver.example.teachingstaff.PlaySchoolHomeWorkIdGenerate;
import com.sivserver.example.teachingstaff.PlaySchoolHomeWorkIdGenerateProjection;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 03-Jan-18.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/playschooleventidgenerate")

public class PlaySchoolEventIdGenerateApiController {

    private PlaySchoolEventIdGenerateRepository playSchoolEventIdGenerateRepository;

    @GetMapping(value="/all")

    public List<PlaySchoolEventIdGenerate> getPlaySchoolEventIdGenerateDetails() {return playSchoolEventIdGenerateRepository.findAll();}

    public PlaySchoolEventIdGenerateApiController(PlaySchoolEventIdGenerateRepository playSchoolEventIdGenerateRepository)
    {
        this.playSchoolEventIdGenerateRepository = playSchoolEventIdGenerateRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void playschoolhomeworkidgenerate(
            @RequestParam(value ="id", required=false) Integer id,
            @RequestParam(value ="evecirid", required=false) Integer evecirid

    ) {
        PlaySchoolEventIdGenerate lasteventid = new PlaySchoolEventIdGenerate();

        lasteventid.setId(id);
        lasteventid.setEvecirid(evecirid);

        playSchoolEventIdGenerateRepository.save(lasteventid);


    }
    @RequestMapping(method = RequestMethod.POST, value="/getPlaySchoolEventIdNo")
    public PlaySchoolEventIdGenerateProjection getPlaySchoolEventId(@RequestParam (value ="id") Integer id) {
        PlaySchoolEventIdGenerateProjection playschooleventid = playSchoolEventIdGenerateRepository.findOneById(id);

        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
//        System.out.println("Inside getPlaySchoolEventIdNo");
        return playschooleventid;
    }


}
