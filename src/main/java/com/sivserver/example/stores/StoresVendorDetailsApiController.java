package com.sivserver.example.stores;

import com.sivserver.example.student.StudentBaseInformation;
import com.sivserver.example.student.StudentBaseInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 05/07/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/storesvendordetails")

public class StoresVendorDetailsApiController {
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
        storevendet.setContactPersonMobNo(contactPersonMobNo);
        storevendet.setContactPersonAlternateMobNo(contactPersonAlternateMobNo);
        storevendet.setVendorAddress1(vendorAddress1);
        storevendet.setVendorAddress2(vendorAddress2);
        storevendet.setVendorArea(vendorArea);
        storevendet.setVendorPin(vendorPin);
        storevendet.setVendorEmail(vendorEmail);
        storevendet.setVendorAlternateEmail(vendorAlternateEmail);
        storevendet.setVendorPanNo(vendorPanNo);
        storevendet.setVendorGSTNo(vendorGSTNo);
        storevendet.setVendorDeleted(vendorDeleted);
        storevendet.setLoginuser(loginuser);

        storesVendorDetailsRepository.save(storevendet);


    }

}
