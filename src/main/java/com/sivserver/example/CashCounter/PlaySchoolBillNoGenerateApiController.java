package com.sivserver.example.CashCounter;

import com.sivserver.example.admission.PlaySchoolToddlerAdmissionNoProjection;
import com.sivserver.example.student.PlaySchoolStudentPersonalInformation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Seetha on 15-Dec-17.
 */
@RestController
@RequestMapping("/api/v1/playschoolbillnogenerate")

public class PlaySchoolBillNoGenerateApiController {

    private PlaySchoolBillNoGenerateRepository playSchoolBillNoGenerateRepository;

    @GetMapping(value = "/all")

    public List<PlaySchoolBillNoGenerate> getPlaySchoolBillNoDetails() {return playSchoolBillNoGenerateRepository.findAll();}

    public PlaySchoolBillNoGenerateApiController(PlaySchoolBillNoGenerateRepository playSchoolBillNoGenerateRepository)
    {
        this.playSchoolBillNoGenerateRepository = playSchoolBillNoGenerateRepository;
    }
    @RequestMapping(method = RequestMethod.POST)

    public void playschoolbillnogenerate(
            @RequestParam(value = "idno", required = false) Integer idno,
            @RequestParam(value = "lastbillno", required = false) Long lastbillno
    ) {
        PlaySchoolBillNoGenerate playschoolbillno = new PlaySchoolBillNoGenerate();

        playschoolbillno.setIdno(idno);
        playschoolbillno.setLastBillno(lastbillno);

        playSchoolBillNoGenerateRepository.save(playschoolbillno);

    }

    @RequestMapping(method = RequestMethod.POST, value="/getPlaySchoolBillNo")
    public PlaySchoolBillNoGenerateProjection getPlaySchoolBillNo(@RequestParam (value ="idno") Integer idno) {
        PlaySchoolBillNoGenerateProjection playschoolBillNo = playSchoolBillNoGenerateRepository.findOneByIdno(idno);

        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getPlaySchoolBillNo");
        return playschoolBillNo;
    }






}
