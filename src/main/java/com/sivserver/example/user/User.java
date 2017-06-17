package com.sivserver.example.user;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Seetha on 09-Jun-17.
 */

@Entity
@Table(name = "Firsttable")
public class User {

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;


    private String name;


    private String password;
}
