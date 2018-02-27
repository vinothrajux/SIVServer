package com.sivserver.example.institute;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by GBCorp on 10/10/2017.
 */
@Entity
@Table(name="institutebusroutedetails")
public class InstituteBusRouteDetails {

    private Integer instituteid;

    @Id
    InstituteBusRouteCompoundKey instituteBusRouteCompoundKeyId;

    public InstituteBusRouteDetails() {
    }

    public Integer getInstituteid() {
        return instituteid;
    }

    public void setInstituteid(Integer instituteid) {
        this.instituteid = instituteid;
    }

    public InstituteBusRouteCompoundKey getInstituteBusRouteCompoundKeyId() {
        return instituteBusRouteCompoundKeyId;
    }

    public void setInstituteBusRouteCompoundKeyId(InstituteBusRouteCompoundKey instituteBusRouteCompoundKeyId) {
        this.instituteBusRouteCompoundKeyId = instituteBusRouteCompoundKeyId;
    }
}
