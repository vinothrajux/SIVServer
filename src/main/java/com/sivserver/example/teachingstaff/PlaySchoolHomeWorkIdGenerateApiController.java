package com.sivserver.example.teachingstaff;

import com.sivserver.example.admission.PlaySchoolApplicationNoGenerate;
import com.sivserver.example.admission.PlaySchoolApplicationNoGenerateProjection;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by GB Corp on 12/23/2017.
 */
@RestController
@RequestMapping("/api/v1/playschoolhomeworkidgenerate")

public class PlaySchoolHomeWorkIdGenerateApiController {

    private PlaySchoolHomeWorkIdGenerateRepository playSchoolHomeWorkIdGenerateRepository;

    @GetMapping(value="/all")

    public List<PlaySchoolHomeWorkIdGenerate> getPlaySchoolHomeWorkIdGenerateDetails() {return playSchoolHomeWorkIdGenerateRepository.findAll();}

    public PlaySchoolHomeWorkIdGenerateApiController(PlaySchoolHomeWorkIdGenerateRepository playSchoolHomeWorkIdGenerateRepository)
    {
        this.playSchoolHomeWorkIdGenerateRepository = playSchoolHomeWorkIdGenerateRepository;

    }

    @RequestMapping(method = RequestMethod.POST)

    public void playschoolhomeworkidgenerate(
            @RequestParam(value ="idno", required=false) Integer idno,
            @RequestParam(value ="homeworkid", required=false) Integer homeworkid

    ) {
        PlaySchoolHomeWorkIdGenerate lasthomeworkid = new PlaySchoolHomeWorkIdGenerate();

        lasthomeworkid.setIdno(idno);
        lasthomeworkid.setHomeworkid(homeworkid);

        playSchoolHomeWorkIdGenerateRepository.save(lasthomeworkid);


    }
    @RequestMapping(method = RequestMethod.POST, value="/getPlaySchoolHomeWorkIdNo")
    public PlaySchoolHomeWorkIdGenerateProjection getPlaySchoolHomeWorkId(@RequestParam (value ="idno") Integer idno) {
        PlaySchoolHomeWorkIdGenerateProjection playschoolhomeworkid = playSchoolHomeWorkIdGenerateRepository.findOneByIdno(idno);

        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getPlaySchoolHomeWorkIdNo");
        return playschoolhomeworkid;
    }

}
