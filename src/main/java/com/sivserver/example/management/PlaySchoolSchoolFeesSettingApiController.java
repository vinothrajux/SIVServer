package com.sivserver.example.management;

import com.sivserver.example.CashCounter.PlaySchoolFeesEntryBaseProjection;
import com.sivserver.example.student.PlaySchoolStudentBaseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 02/11/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/playschoolschoolfeessetting")
public class PlaySchoolSchoolFeesSettingApiController {

    @Autowired
    private PlaySchoolSchoolFeesSettingRepository  playSchoolSchoolFeesSettingRepository;

    @RequestMapping(method = RequestMethod.POST)

    public void playschoolFeesSetting(

            @RequestParam(value = "feessettingdate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date feessettingdate,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "program", required = false) String program,
            @RequestParam(value = "instituteid", required = false) Integer instituteid,
            @RequestParam(value = "registrationfees", required = false) Double registrationfees,
            @RequestParam(value = "materialkitfees", required = false) Double materialkitfees,
            @RequestParam(value = "activityfees", required = false) Double activityfees,
            @RequestParam(value = "tuitionfees", required = false) Double tuitionfees,
            @RequestParam(value = "totalfees", required = false) Double totalfees,
            @RequestParam(value = "installment1fees", required = false) Double installment1fees,
            @RequestParam(value = "installment2fees", required = false) Double installment2fees,
            @RequestParam(value = "installment3fees", required = false) Double installment3fees,
            @RequestParam(value = "otherfees", required = false) Double otherfees,
            @RequestParam(value = "installment1duedate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date installment1duedate,
            @RequestParam(value = "installment2duedate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date installment2duedate,
            @RequestParam(value = "installment3duedate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date installment3duedate,
            @RequestParam(value = "otherfeesduedate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date otherfeesduedate,
            @RequestParam(value = "loginuser", required = false) String loginuser
    )
    {
        PlaySchoolSchoolFeesSetting ps_School_Fees_Set = new PlaySchoolSchoolFeesSetting();
        Management_Playschool_Fees_Compound_Key key = new Management_Playschool_Fees_Compound_Key(program, academicyear,instituteid);

        ps_School_Fees_Set.setFeessettingdate(feessettingdate);
        ps_School_Fees_Set.setManagementplayschoolfeescompoundkey(key);
        ps_School_Fees_Set.setRegistrationfees(registrationfees);
        ps_School_Fees_Set.setMaterialkitfees(materialkitfees);
        ps_School_Fees_Set.setActivityfees(activityfees);
        ps_School_Fees_Set.setTuitionfees(tuitionfees);
        ps_School_Fees_Set.setTotalfees(totalfees);
        ps_School_Fees_Set.setInstallment1fees(installment1fees);
        ps_School_Fees_Set.setInstallment2fees(installment2fees);
        ps_School_Fees_Set.setInstallment3fees(installment3fees);
        ps_School_Fees_Set.setOtherfees(otherfees);
        ps_School_Fees_Set.setInstallment1duedate(installment1duedate);
        ps_School_Fees_Set.setInstallment2duedate(installment2duedate);
        ps_School_Fees_Set.setInstallment3duedate(installment3duedate);
        ps_School_Fees_Set.setOtherfeesduedate(otherfeesduedate);
        ps_School_Fees_Set.setLoginuser(loginuser);

        playSchoolSchoolFeesSettingRepository.save(ps_School_Fees_Set);


    }

    @RequestMapping(method = RequestMethod.POST, value="/getPlaySchoolFeesDetail")
//    public PlaySchoolSchoolFeesSettingProjection getPlaySchoolFeesDetail(@RequestParam (value ="managementplayschoolfeescompoundkey", required = false) Management_Playschool_Fees_Compound_Key mgmtpsfeescompkey) {
    public PlaySchoolSchoolFeesSettingProjection getPlaySchoolFeesDetail(@RequestParam (value ="program", required = false) String program,@RequestParam (value ="academicyear", required = false) String academicyear,@RequestParam (value ="instituteid", required = false) Integer instituteid)  {
        Management_Playschool_Fees_Compound_Key mgmtpsfeescompkey = new Management_Playschool_Fees_Compound_Key(program,academicyear,instituteid);
        PlaySchoolSchoolFeesSettingProjection playschoolfeesDetail = playSchoolSchoolFeesSettingRepository.findOneByManagementplayschoolfeescompoundkey(mgmtpsfeescompkey);
        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getPlaySchoolFeesDetail");
        return playschoolfeesDetail;
    }


//    @RequestMapping(method = RequestMethod.POST, value="/getPlaySchoolFeesDetail")
//    public PlaySchoolSchoolFeesSettingProjection getPlaySchoolFeesDetail(
//            @RequestParam(value ="program", required=false) String program,
//            @RequestParam (value="academicyear", required=false) String academicyear
//    ){
////        Iterable<StudentBaseInformation> studentList = studentbaseinformationRepository.findByAcademicyearAndBranchcode(academicyear, branchcode);
//        PlaySchoolSchoolFeesSettingProjection playschoolfeesDetail = playSchoolFeesEntryBaseRepository.findOneByProgramAndAcademicyear(program, academicyear );
//
//        System.out.println("Inside getPlaySchoolFeesDetail");
//        return playschoolfeesDetail;
//    }

}
