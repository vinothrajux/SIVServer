package com.sivserver.example.institute;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by GBCorp on 10/10/2017.
 */
@Embeddable
public class InstituteBusRouteCompoundKey implements Serializable {

    private String route;

    private String stage;

    public InstituteBusRouteCompoundKey() {
    }

    public InstituteBusRouteCompoundKey(String route, String stage) {
        this.route = route;
        this.stage = stage;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }
}
