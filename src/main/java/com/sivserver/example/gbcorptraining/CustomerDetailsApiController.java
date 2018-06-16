package com.sivserver.example.gbcorptraining;

import com.sivserver.example.institute.InstituteDetails;
import com.sivserver.example.teachingstaff.StudentHomeWorkPlaySchoolProjection;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 06-Jun-18.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/customerdetails")

public class CustomerDetailsApiController {

    private CustomerDetailsRepository  customerdetailsrepository;

    @GetMapping(value="/all")
    public List<CustomerDetails> getCustomerDetails() { return customerdetailsrepository.findAll();}

    public CustomerDetailsApiController(CustomerDetailsRepository customerdetailsrepository)
    {
        this.customerdetailsrepository = customerdetailsrepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void customerdetails(
            @RequestParam(value ="instituteid", required=false) Integer instituteid,
            @RequestParam(value ="institutetype", required=false) String institutetype,
            @RequestParam(value ="institutename", required=false) String institutename,
            @RequestParam(value ="noofstudents", required=false) Integer noofstudents,
            @RequestParam(value ="priceperstudent", required=false) Float priceperstudent,
            @RequestParam(value ="totalamount", required=false) Float totalamount,
            @RequestParam(value ="paymentmethod", required=false) String paymentmethod,
            @RequestParam(value ="amountpaid", required=false) Float amountpaid,
            @RequestParam(value ="balance", required=false) Float balance,
            @RequestParam(value ="duedate", required=false) Date duedate,
            @RequestParam(value ="username", required=false) String username
    )
    {
        InstituteDetails instituteDetails = new InstituteDetails(instituteid);
        CustomerDetails custdet=new CustomerDetails();
        custdet.setInstituteid(instituteid)
                .setInstitutetype(institutetype)
                .setInstitutename(institutename)
                .setNoofstudents(noofstudents)
                .setPriceperstudent(priceperstudent)
                .setTotalamount(totalamount)
                .setPaymentmethod(paymentmethod)
                .setAmountpaid(amountpaid)
                .setBalance(balance)
                .setDuedate(duedate)
                .setUsername(username);

        customerdetailsrepository.save(custdet);

    }
    @RequestMapping(method = RequestMethod.POST, value="/getCustomerDetails")
    public CustomerDetailsProjection getCustomerDetails(@RequestParam (value ="instituteid") Integer instituteid) {
        CustomerDetailsProjection customerdetails = customerdetailsrepository.findOneByInstituteid(instituteid);
        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getCustomerDetails");
        return customerdetails;
    }

}



