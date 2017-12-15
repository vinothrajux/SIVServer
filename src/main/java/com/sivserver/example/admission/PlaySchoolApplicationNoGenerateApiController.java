package com.sivserver.example.admission;

import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by Seetha on 14-Dec-17.
 */
@RestController
@RequestMapping("/api/v1/playschoolapplicaitonnogenerate")

public class PlaySchoolApplicationNoGenerateApiController {

    private PlaySchoolApplicationNoGenerateRepository playSchoolApplicationNoGenerateRepository;

    @GetMapping(value="/all")

    public List<PlaySchoolApplicationNoGenerate> getApplicaitonNoDetails() {return playSchoolApplicationNoGenerateRepository.findAll();}

    public PlaySchoolApplicationNoGenerateApiController(PlaySchoolApplicationNoGenerateRepository playSchoolApplicationNoGenerateRepository)
    {
        this.playSchoolApplicationNoGenerateRepository = playSchoolApplicationNoGenerateRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void firstAid(
            @RequestParam(value ="idno", required=false) Integer idno,
            @RequestParam(value ="enquiryno", required=false) Integer enquiryno

    ) {
        PlaySchoolApplicationNoGenerate lastapplno = new PlaySchoolApplicationNoGenerate();

        lastapplno.setIdno(idno);
        lastapplno.setEnquiryno(enquiryno);

        playSchoolApplicationNoGenerateRepository.save(lastapplno);


    }
    @RequestMapping(method = RequestMethod.POST, value="/getPlaySchoolApplcationNo")
    public PlaySchoolApplicationNoGenerateProjection getPlaySchoolApplcationNo(@RequestParam (value ="idno") Integer idno) {
        PlaySchoolApplicationNoGenerateProjection playschoolapplicationNo = playSchoolApplicationNoGenerateRepository.findOneByIdno(idno);

        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getPlaySchoolApplcationNo");
        return playschoolapplicationNo;
    }


}
