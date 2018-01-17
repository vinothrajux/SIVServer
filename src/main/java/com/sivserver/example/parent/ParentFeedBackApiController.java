package com.sivserver.example.parent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 02-Aug-17.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/parentfeedback")

public class ParentFeedBackApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private ParentFeedBackRepository parentFeedBackRepository;

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
    public void parentFeedBack(
            @RequestParam(value ="currentdate", required=false) Date currentdate,
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam(value ="admissionno", required=false) String admissionno,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="batch", required=false) String batch,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="messageto", required=false) String messageto,
            @RequestParam (value="message", required=false) String message,
            @RequestParam (value="loginuser", required=false) String loginuser

    ) {
        ParentFeedBack parentFeedBk = new ParentFeedBack();
        parentFeedBk.setCurrentdate(currentdate);
        parentFeedBk.setRegno(regno);
        parentFeedBk.setAdmissionno(admissionno);
        parentFeedBk.setBranchCode(branchcode);
        parentFeedBk.setBatch(batch);
        parentFeedBk.setSemester(semester);
        parentFeedBk.setAcadyear(academicyear);
        parentFeedBk.setmessageto(messageto);
        parentFeedBk.setMessage(message);
        parentFeedBk.setLoginUser(loginuser);

        parentFeedBackRepository.save(parentFeedBk);



    }


}
