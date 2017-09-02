package com.sivserver.example.primarykey;

import org.hibernate.annotations.CascadeType;

import javax.persistence.*;


import javax.validation.constraints.NotNull;

/**
 * Created by GBCorp on 22/08/2017.
 */
@Entity
@Table(name="Users_New_Contact",catalog = "test")

public class User_New_Contact {
    @Id
    @Column(name="regno")
    private Integer regno;
    private String Phoneno;

    @OneToOne
    @JoinColumn(name="cont_regno",nullable = false,referencedColumnName = "regno" )
    private User_New users;


    public User_New_Contact()
    {

    }

    public User_New getUsers() {
        return users;
    }

    public User_New_Contact setUsers(User_New users) {
        this.users = users;
        return this;
    }

    public Integer getRegno() {
        return regno;
    }

    public User_New_Contact setRegno(Integer regno) {
        this.regno = regno;
        return this;
    }


    public String getPhoneno() {
        return Phoneno;
    }

    public User_New_Contact setPhoneno(String Phoneno) {
        this.Phoneno = Phoneno;
        return this;
    }
}
