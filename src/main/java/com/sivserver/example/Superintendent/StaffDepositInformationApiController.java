package com.sivserver.example.Superintendent;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 29/09/2017.
 */
@RestController
@RequestMapping("/api/v1/staffdepositinformation")

public class StaffDepositInformationApiController {

    private StaffDepositInformationRepository staffDepositInformationRepository;

    public List<StaffDepositInformation> getStaffDepositInformationDetail() {return staffDepositInformationRepository.findAll();}

    public StaffDepositInformationApiController(StaffDepositInformationRepository staffDepositInformationRepository)
    {
        this.staffDepositInformationRepository =staffDepositInformationRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void staffbaseinformation(
            @RequestParam(value ="staffid", required=false) String staffid,
            @RequestParam(value ="typeofdeposit", required=false) String typeofdeposit,
            @RequestParam (value="originaldegreecertificate", required=false) Boolean originaldegreecertificate,
            @RequestParam (value="degreecertificateslno", required=false) String degreecertificateslno,
            @RequestParam (value="originaltransfercertificate", required=false) Boolean originaltransfercertificate,
            @RequestParam (value="transfercertificateslno", required=false) String transfercertificateslno,
            @RequestParam (value="originalmarksheet", required=false) Boolean originalmarksheet,
            @RequestParam (value="marksheetslno", required=false) String marksheetslno,
            @RequestParam (value="othercertificate", required=false) Boolean othercertificate,
            @RequestParam (value="othercertificateslno", required=false) String othercertificateslno,
            @RequestParam (value="salarydeposited", required=false) Long salarydeposited,
            @RequestParam (value="loginuser", required=false) String loginuser
    )
    {
        StaffDepositInformation staffDepositInformation = new StaffDepositInformation();
        StaffPersonalInformation staff_personal_staffid = new StaffPersonalInformation(staffid);

        staffDepositInformation.setStaffid(staffid)
                                .setTypeofdeposit(typeofdeposit)
                                .setOriginaldegreecertificate(originaldegreecertificate)
                                .setDegreecertificateslno(degreecertificateslno)
                                .setOriginaltransfercertificate(originaltransfercertificate)
                                .setTransfercertificateslno(transfercertificateslno)
                                .setOriginalmarksheet(originalmarksheet)
                                .setMarksheetslno(marksheetslno)
                                .setOthercertificate(othercertificate)
                                .setOthercertificateslno(othercertificateslno)
                                .setSalarydeposited(salarydeposited)
                                .setLoginuser(loginuser)
                                .setStaff_personal_staffid(staff_personal_staffid);

        staffDepositInformationRepository.save(staffDepositInformation);

    }

}
