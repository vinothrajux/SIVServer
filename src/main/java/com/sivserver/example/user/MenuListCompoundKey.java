package com.sivserver.example.user;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Seetha on 30-Mar-18.
 */
@Embeddable
public class MenuListCompoundKey implements Serializable {

    private String institutetype;

    private String userrole;

    public MenuListCompoundKey(String institutetype, String userrole) {
        this.institutetype = institutetype;
        this.userrole = userrole;
    }

    public MenuListCompoundKey() {
    }

    public String getInstitutetype() {
        return institutetype;
    }

    public void setInstitutetype(String institutetype) {
        this.institutetype = institutetype;
    }

    public String getUserrole() {
        return userrole;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole;
    }
}
