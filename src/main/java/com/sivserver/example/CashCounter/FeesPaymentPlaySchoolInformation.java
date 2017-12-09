package com.sivserver.example.CashCounter;

import com.sivserver.example.student.PlaySchoolStudentBaseInformationProjection;

/**
 * Created by Seetha on 09-Dec-17.
 */
public class FeesPaymentPlaySchoolInformation {

    private FeesPaymentPlaySchoolProjection feesPaymentInfo;
    private PlaySchoolStudentBaseInformationProjection studentBaseInfo;

    public FeesPaymentPlaySchoolProjection getFeesPaymentInfo() {
        return feesPaymentInfo;
    }

    public void setFeesPaymentInfo(FeesPaymentPlaySchoolProjection feesPaymentInfo) {
        this.feesPaymentInfo = feesPaymentInfo;
    }

    public PlaySchoolStudentBaseInformationProjection getStudentBaseInfo() {
        return studentBaseInfo;
    }

    public void setStudentBaseInfo(PlaySchoolStudentBaseInformationProjection studentBaseInfo) {
        this.studentBaseInfo = studentBaseInfo;
    }
}
