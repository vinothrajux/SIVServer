package com.sivserver.example.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by GBCorp on 02/11/2017.
 */
@RestController
@RequestMapping("/api/v1/playschooltransportfeessetting")
public class PlaySchoolTransportFeesSettingApiController {

    @Autowired
    private PlaySchoolTransportFeesSettingRepository playSchoolTransportFeesSettingRepository;

    @RequestMapping(method = RequestMethod.POST)

    public void playschoolTransportFeesSetting(
            @RequestParam(value = "fees_setting_date", required = false) Date fees_setting_date,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "stage", required = false) String stage,
            @RequestParam(value = "transport_initial_fees", required = false) Long transport_initial_fees,
            @RequestParam(value = "loginuser", required = false) String loginuser
    )
    {
        PlaySchoolTransportFeesSetting ps_transport_fees_set = new PlaySchoolTransportFeesSetting();
        Management_Transport_Fees_Compound_Key key = new Management_Transport_Fees_Compound_Key(academicyear,stage);

        ps_transport_fees_set.setFees_setting_date(fees_setting_date);
        ps_transport_fees_set.setManagement_Transport_Fees_Compound_Key(key);
        ps_transport_fees_set.setTransport_initial_fees(transport_initial_fees);
        ps_transport_fees_set.setLoginuser(loginuser);

        playSchoolTransportFeesSettingRepository.save(ps_transport_fees_set);
    }

    }
