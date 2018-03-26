package com.sivserver.example.institute;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.*;
import org.apache.commons.io.FilenameUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 10/10/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/institutedetails")
public class InstituteDetailsApiController {

    private InstituteDetailsRepository instituteDetailsRepository;

    @GetMapping(value = "/all")

    public List<InstituteDetails> getInstituteDetails() {return instituteDetailsRepository.findAll(); }

    public InstituteDetailsApiController(InstituteDetailsRepository instituteDetailsRepository)
    {
        this.instituteDetailsRepository = instituteDetailsRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void institutedetailsdet(

//            @RequestParam(value ="instituteid", required=false) Integer instituteid,
            @RequestParam(value ="institutecode", required=false) String institutecode,
            @RequestParam(value ="institutename", required=false) String institutename,
            @RequestParam(value ="institutetype", required=false) String institutetype,
            @RequestParam(value ="instituteaddress1", required=false) String instituteaddress1,
            @RequestParam(value ="instituteaddress2", required=false) String instituteaddress2,
            @RequestParam(value ="institutearea", required=false) String institutearea,
            @RequestParam(value ="institutepincode", required=false) String institutepincode,
            @RequestParam(value ="institutestate", required=false) String institutestate,
            @RequestParam(value ="institutecontactno1", required=false) String institutecontactno1,
            @RequestParam(value ="institutecontactno2", required=false) String institutecontactno2,
            @RequestParam(value ="instituteemail1", required=false) String instituteemail1,
            @RequestParam(value ="instituteemail2", required=false) String instituteemail2,
            @RequestParam(value ="instituteweb", required=false) String instituteweb,
            @RequestParam("institutelogo") MultipartFile institutelogo

    ) {
        InstituteDetails insDetails = new InstituteDetails();

//        insDetails.setInstituteid(instituteid);
        insDetails.setInstitutecode(institutecode);
        insDetails.setInstitutename(institutename);
        insDetails.setInstitutetype(institutetype);
        insDetails.setInstituteaddress1(instituteaddress1);
        insDetails.setInstituteaddress2(instituteaddress2);
        insDetails.setInstitutearea(institutearea);
        insDetails.setInstitutepincode(institutepincode);
        insDetails.setInstitutestate(institutestate);
        insDetails.setInstitutecontactno1(institutecontactno1);
        insDetails.setInstitutecontactno2(institutecontactno2);
        insDetails.setInstituteemail1(instituteemail1);
        insDetails.setInstituteemail2(instituteemail2);
        insDetails.setInstituteweb(instituteweb);

        InstituteDetails savedInstituteDetails = instituteDetailsRepository.saveAndFlush(insDetails);
        Integer instituteid = savedInstituteDetails.getInstituteid();
        System.out.println(savedInstituteDetails.getInstituteid());


        String serverfilepath = "images/institute/"+instituteid+"."+ FilenameUtils.getExtension(institutelogo.getOriginalFilename());
        String imagePath = "http://siv.gbcorp.in/"+serverfilepath;
        System.out.println(new ProfileCredentialsProvider().getCredentials().getAWSAccessKeyId());
        AmazonS3 s3client = new AmazonS3Client(new ProfileCredentialsProvider());
        try{
            InputStream is = institutelogo.getInputStream();
            s3client.putObject(new PutObjectRequest("siv.gbcorp.in",serverfilepath,is,new ObjectMetadata()).withCannedAcl(CannedAccessControlList.PublicRead));
            S3Object s3object = s3client.getObject(new GetObjectRequest("siv.gbcorp.in", serverfilepath));
            System.out.println(s3object.getObjectContent().getHttpRequest().getURI().toString());
            insDetails.setInstituteid(instituteid);
            insDetails.setInstitutelogo(imagePath);
            instituteDetailsRepository.save(insDetails);
        }
        catch (IOException e){

            e.printStackTrace();
        }
    }


    }
