package com.sivserver.example.stores;

import com.sivserver.example.student.StudentBaseInformation;
import com.sivserver.example.student.StudentBaseInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by GBCorp on 05/07/2017.
 */
@RestController
@RequestMapping("/api/v1/storesvendordetails")

public class StoresVendorDetailsApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private StoresVendorDetailsRepository storesVendorDetailsRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void storesVendorDet(
            @RequestParam(value = "vendorId", required = false) String vendorId,
            @RequestParam(value = "vendorName", required = false) String vendorName,
            @RequestParam(value = "contactPersonName", required = false) String contactPersonName,
            @RequestParam(value = "contactPersonMobNo", required = false) String contactPersonMobNo,
            @RequestParam(value = "contactPersonAlternateMobNo", required = false) String contactPersonAlternateMobNo,
            @RequestParam(value = "vendorAddress1", required = false) String vendorAddress1,
            @RequestParam(value = "vendorAddress2", required = false) String vendorAddress2,
            @RequestParam(value = "vendorArea", required = false) String vendorArea,
            @RequestParam(value = "vendorPin", required = false) String vendorPin,
            @RequestParam(value = "vendorEmail", required = false) String vendorEmail,
            @RequestParam(value = "vendorAlternateEmail", required = false) String vendorAlternateEmail,
            @RequestParam(value = "vendorPanNo", required = false) String vendorPanNo,
            @RequestParam(value = "vendorGSTNo", required = false) String vendorGSTNo,
            @RequestParam(value = "vendorDeleted", required = false) Boolean vendorDeleted,
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        StoresVendorDetails storevendet = new StoresVendorDetails();
        storevendet.setVendorId(vendorId);
        storevendet.setVendorName(vendorName);
        storevendet.setContactPersonName(contactPersonName);
        storevendet.setContactPersonMobileNo(contactPersonMobNo);
        storevendet.setContactPersonAlternteMobileNo(contactPersonAlternateMobNo);
        storevendet.setVendorAddress1(vendorAddress1);
        storevendet.setVendorAddress2(vendorAddress2);
        storevendet.setVendorArea(vendorArea);
        storevendet.setVendorPin(vendorPin);
        storevendet.setVendorEmail(vendorEmail);
        storevendet.setVendorAlternateEmail(vendorAlternateEmail);
        storevendet.setVendorPANNo(vendorPanNo);
        storevendet.setVendorGSTNo(vendorGSTNo);
        storevendet.setVendorStatus(vendorDeleted);
        storevendet.setLoginUser(loginuser);

        storesVendorDetailsRepository.save(storevendet);


    }

}
