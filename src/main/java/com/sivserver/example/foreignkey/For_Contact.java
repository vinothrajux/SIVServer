package com.sivserver.example.foreignkey;

import javax.persistence.*;

/**
 * Created by GBCorp on 29/08/2017.
 */
@Entity
@Table(name = "For_Contact",catalog = "test")

public class For_Contact {

    @Id
    @Column(name = "regno")
    private String regno;
    private String Phoneno;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cont_regno",nullable=false,referencedColumnName = "regno")
    private For_User users;

    public For_Contact() {
    }

    public String getRegno() {
        return regno;
    }

    public For_Contact setRegno(String regno) {
        this.regno = regno;
        return this;
    }

    public String getPhoneno() {
        return Phoneno;
    }

    public For_Contact setPhoneno(String phoneno) {
        Phoneno = phoneno;
        return this;

    }

    public For_User getUsers() {
        return users;
    }

    public For_Contact setUsers(For_User users) {
        this.users = users;
        return this;
    }
}
