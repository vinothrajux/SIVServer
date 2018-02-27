package com.sivserver.example.teachingstaff;

import com.sivserver.example.student.PlaySchoolStudentBaseInformation;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 08/11/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/studentsmonthlyprogressplayschool")
public class StudentsMonthlyProgressPlaySchoolApiController {

    private StudentsMonthlyProgressPlaySchoolRepository studentsMonthlyProgressPlaySchoolRepository;

    @GetMapping(value="/all")

    public List<StudentsMonthlyProgressPlaySchool> getStudentsMonthlyProgressDetails() {return studentsMonthlyProgressPlaySchoolRepository.findAll();}

    public StudentsMonthlyProgressPlaySchoolApiController(StudentsMonthlyProgressPlaySchoolRepository studentsMonthlyProgressPlaySchoolRepository)
    {
        this.studentsMonthlyProgressPlaySchoolRepository = studentsMonthlyProgressPlaySchoolRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void studentMonthlyProgressPlaySchool(
            @RequestParam(value ="registernumber", required=false) String registernumber,
            @RequestParam(value ="assessmentfor", required=false) String assessmentfor,
            @RequestParam (value="instituteid", required=false) Integer instituteid,
            @RequestParam (value="entrydate", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date entrydate,
            @RequestParam (value="name", required=false) String name,
            @RequestParam (value="program", required=false) String program,
            @RequestParam (value="section", required=false) String section,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="grossmotorskills", required=false) Integer grossmotorskills,
            @RequestParam (value="finemotorskills", required=false) Integer finemotorskills,
            @RequestParam (value="conceptknowledge", required=false) Integer conceptknowledge,
            @RequestParam (value="activityparticipation", required=false) Integer activityparticipation,
            @RequestParam (value="socialbehavior", required=false) Integer socialbehavior,
            @RequestParam (value="diningetiquettes", required=false) Integer diningetiquettes,
            @RequestParam (value="languageskills", required=false) Integer languageskills,
            @RequestParam (value="listeningskills", required=false) Integer listeningskills,
            @RequestParam (value="noofworkingdays", required=false) Integer noofworkingdays,
            @RequestParam (value="noofdaysattended", required=false) Integer noofdaysattended,
            @RequestParam (value="fluency", required=false) Integer fluency,
            @RequestParam (value="accuracy", required=false) Integer accuracy,
            @RequestParam (value="clarity", required=false) Integer clarity,
            @RequestParam (value="legibility", required=false) Integer legibility,
            @RequestParam (value="neatness", required=false) Integer neatness,
            @RequestParam (value="games", required=false) Integer games,
            @RequestParam (value="artsandcrafts", required=false) Integer artsandcrafts,
            @RequestParam (value="obedience", required=false) Integer obedience,
            @RequestParam (value="responsibility", required=false) Integer responsibility,
            @RequestParam (value="punctuality", required=false) Integer punctuality,
            @RequestParam (value="regularity", required=false) Integer regularity,
            @RequestParam (value="homework", required=false) Integer homework,
            @RequestParam (value="handwriting", required=false) Integer handwriting,
            @RequestParam (value="personalhygiene", required=false) Integer personalhygiene,
            @RequestParam (value="sharing", required=false) Integer sharing,
            @RequestParam (value="uniform", required=false) Integer uniform,
            @RequestParam (value="nails", required=false) Integer nails,
            @RequestParam (value="hair", required=false) Integer hair,
            @RequestParam (value="cleanliness", required=false) Integer cleanliness,
            @RequestParam (value="height", required=false) float height,
            @RequestParam (value="weight", required=false) float weight,
            @RequestParam (value="loginuser", required=false) String loginuser


    ) {
        StudentsMonthlyProgressPlaySchool ps_Students_Monthly_progress = new StudentsMonthlyProgressPlaySchool();
        Student_Assessment_Play_School_Compound_Key key = new Student_Assessment_Play_School_Compound_Key(registernumber,assessmentfor,instituteid);


        ps_Students_Monthly_progress.setStudent_assessment_play_school_compound_key(key);
        ps_Students_Monthly_progress.setEntrydate(entrydate);
        ps_Students_Monthly_progress.setName(name);
        ps_Students_Monthly_progress.setProgram(program);
        ps_Students_Monthly_progress.setSection(section);
        ps_Students_Monthly_progress.setAcademicyear(academicyear);
        ps_Students_Monthly_progress.setGrossmotorskills(grossmotorskills);
        ps_Students_Monthly_progress.setFinemotorskills(finemotorskills);
        ps_Students_Monthly_progress.setConceptknowledge(conceptknowledge);
        ps_Students_Monthly_progress.setActivityparticipation(activityparticipation);
        ps_Students_Monthly_progress.setSocialbehavior(socialbehavior);
        ps_Students_Monthly_progress.setDiningetiquettes(diningetiquettes);
        ps_Students_Monthly_progress.setLanguageskills(languageskills);
        ps_Students_Monthly_progress.setListeningskills(listeningskills);
        ps_Students_Monthly_progress.setNoofworkingdays(noofworkingdays);
        ps_Students_Monthly_progress.setNoofdaysattended(noofdaysattended);
        ps_Students_Monthly_progress.setFluency(fluency);
        ps_Students_Monthly_progress.setAccuracy(accuracy);
        ps_Students_Monthly_progress.setClarity(clarity);
        ps_Students_Monthly_progress.setLegibility(legibility);
        ps_Students_Monthly_progress.setNeatness(neatness);
        ps_Students_Monthly_progress.setGames(games);
        ps_Students_Monthly_progress.setArtsandcrafts(artsandcrafts);
        ps_Students_Monthly_progress.setObedience(obedience);
        ps_Students_Monthly_progress.setResponsibility(responsibility);
        ps_Students_Monthly_progress.setPunctuality(punctuality);
        ps_Students_Monthly_progress.setRegularity(regularity);
        ps_Students_Monthly_progress.setHomework(homework);
        ps_Students_Monthly_progress.setHandwriting(handwriting);
        ps_Students_Monthly_progress.setPersonalhygiene(personalhygiene);
        ps_Students_Monthly_progress.setSharing(sharing);
        ps_Students_Monthly_progress.setUniform(uniform);
        ps_Students_Monthly_progress.setNails(nails);
        ps_Students_Monthly_progress.setHair(hair);
        ps_Students_Monthly_progress.setCleanliness(cleanliness);
        ps_Students_Monthly_progress.setHeight(height);
        ps_Students_Monthly_progress.setWeight(weight);
        ps_Students_Monthly_progress.setLoginuser(loginuser);

        studentsMonthlyProgressPlaySchoolRepository.save(ps_Students_Monthly_progress);

    }

//    @RequestMapping(method = RequestMethod.POST, value="/getStudentMonthlyProgressPlaySchoolDetail")
//    public StudentsMonthlyProgressPlaySchoolProjection getStudentMonthlyProgressPlaySchoolDetail(@RequestParam (value ="remarkid") String remarkid) {
//        StudentsMonthlyProgressPlaySchoolProjection playschoolstudentMonthlyProgressDetail = studentsMonthlyProgressPlaySchoolRepository.findOneByRemarkid(remarkid);
//        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
//        System.out.println("Inside getStudentMonthlyProgressPlaySchoolDetail");
//        return playschoolstudentMonthlyProgressDetail;
//    }

}
