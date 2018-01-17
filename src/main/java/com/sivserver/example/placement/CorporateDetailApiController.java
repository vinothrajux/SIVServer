package com.sivserver.example.placement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 07/07/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/corporatedetail")

public class CorporateDetailApiController  {
    //@Autowired
    private CorporateDetailRepository corporateDetailRepository;

    @GetMapping(value="/all")

    public List<CorporateDetail> getCorporateDetail() {return corporateDetailRepository.findAll();}

    public CorporateDetailApiController(CorporateDetailRepository corporateDetailRepository)
    {
        this.corporateDetailRepository = corporateDetailRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void corphead(
            @RequestParam(value ="id", required=false) Integer id,
            @RequestParam(value ="corporateid", required=false) String corporateid,
            @RequestParam(value ="requiredBranchCode", required=false) String requiredBranchCode,
            @RequestParam (value="requiredStudentCategory", required=false) String requiredStudentCategory


    ) {
        CorporateDetail corpDet = new CorporateDetail();
        CorporateHeader corporateDetail_regno = new CorporateHeader(corporateid);
        corpDet.setId(id);
        corpDet.setCorporateid(corporateid);
        corpDet.setRequiredBranchCode(requiredBranchCode);
        corpDet.setRequiredStudentCategory(requiredStudentCategory);


        corporateDetailRepository.save(corpDet);



    }

}
