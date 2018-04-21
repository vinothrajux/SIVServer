package com.sivserver.example.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Seetha on 30-Mar-18.
 */
@Entity
@Table(name = "menulist")
public class MenuList {

    @Id
    MenuListCompoundKey menulistcompoundkey;

    private String menulistweb;

    private String menulistapp;

    public MenuList() {
    }


    public MenuListCompoundKey getMenulistcompoundkey() {
        return menulistcompoundkey;
    }

    public void setMenulistcompoundkey(MenuListCompoundKey menulistcompoundkey) {
        this.menulistcompoundkey = menulistcompoundkey;
    }

    public String getMenulistweb() {
        return menulistweb;
    }

    public void setMenulistweb(String menulistweb) {
        this.menulistweb = menulistweb;
    }

    public String getMenulistapp() {
        return menulistapp;
    }

    public void setMenulistapp(String menulistapp) {
        this.menulistapp = menulistapp;
    }
}
