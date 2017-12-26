package com.sivserver.example.admission;

import com.sivserver.example.management.PlaySchoolSchoolFeesSetting;

/**
 * Created by Seetha on 25-Dec-17.
 */
public class ApplicationFeesInformation {

    private ApplicationSalePlaySchool applicationSalePlaySchool;
    private PlaySchoolSchoolFeesSetting playSchoolSchoolFeesSetting;

    public ApplicationSalePlaySchool getApplicationSalePlaySchool() {
        return applicationSalePlaySchool;
    }

    public void setApplicationSalePlaySchool(ApplicationSalePlaySchool applicationSalePlaySchool) {
        this.applicationSalePlaySchool = applicationSalePlaySchool;
    }

    public PlaySchoolSchoolFeesSetting getPlaySchoolSchoolFeesSetting() {
        return playSchoolSchoolFeesSetting;
    }

    public void setPlaySchoolSchoolFeesSetting(PlaySchoolSchoolFeesSetting playSchoolSchoolFeesSetting) {
        this.playSchoolSchoolFeesSetting = playSchoolSchoolFeesSetting;
    }
}
