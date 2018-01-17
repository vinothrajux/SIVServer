package com.sivserver.example.admission;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 15-Dec-17.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/playschoolprogramadmissionnogenerate")

public class PlaySchoolProgramAdmissionNoGenerateApiController {

    private PlaySchoolProgramAdmissionNoGenerateRepository playSchoolApplicationNoGenerateRepository;

    @GetMapping(value="/all")

    public List<PlaySchoolProgramAdmissionNoGenerate> getAdmissionNoDetails() {return playSchoolApplicationNoGenerateRepository.findAll();}

    public PlaySchoolProgramAdmissionNoGenerateApiController(PlaySchoolProgramAdmissionNoGenerateRepository playSchoolApplicationNoGenerateRepository)
    {
        this.playSchoolApplicationNoGenerateRepository = playSchoolApplicationNoGenerateRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void firstAid(
            @RequestParam(value ="idno", required=false) Integer idno,
            @RequestParam(value ="todprgno", required=false) Long todprgno,
            @RequestParam(value ="prekgprgno", required=false) Long prekgprgno,
            @RequestParam(value ="kgoneprgno", required=false) Long kgoneprgno,
            @RequestParam(value ="kgtwoprgno", required=false) Long kgtwoprgno,
            @RequestParam(value ="waitlistno", required=false) Long waitlistno

    ) {
        PlaySchoolProgramAdmissionNoGenerate lastadmissionno = new PlaySchoolProgramAdmissionNoGenerate();

        lastadmissionno.setIdno(idno);
        lastadmissionno.setTodprgno(todprgno);
        lastadmissionno.setPrekgprgno(prekgprgno);
        lastadmissionno.setKgoneprgno(kgoneprgno);
        lastadmissionno.setKgtwoprgno(kgtwoprgno);
        lastadmissionno.setWaitlistno(waitlistno);


        playSchoolApplicationNoGenerateRepository.save(lastadmissionno);


    }

    @RequestMapping(method = RequestMethod.POST, value="/getPlaySchoolToddlerAdmissionNo")
    public PlaySchoolToddlerAdmissionNoProjection getPlaySchoolToddlerAdmissionNo(@RequestParam (value ="idno") Integer idno) {
        PlaySchoolToddlerAdmissionNoProjection playschoolToddlerAdmissionNo = playSchoolApplicationNoGenerateRepository.findOneByIdno(idno);

        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getPlaySchoolToddlerAdmissionNo");
        return playschoolToddlerAdmissionNo;
    }


}


