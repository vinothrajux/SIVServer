package com.sivserver.example.foreignkey;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by GBCorp on 29/08/2017.
 */
@Entity
@Table(name = "For_User",catalog = "test")
public class For_User {
    @Id
    @Column(name="regno")
    private String regno;

    private String Name;
    private Long Fees;
    private String Department;

    public For_User() {
    }

    public For_User(String regno) {
        this.regno = regno;
    }

    public String getRegno() {
        return regno;
    }

    public For_User setRegno(String regno) {
        this.regno = regno;
        return this;
    }

    public String getName() {
        return Name;
    }

    public For_User setName(String name) {
        Name = name;
        return this;
    }

    public Long getFees() {
        return Fees;
    }

    public For_User setFees(Long fees) {
        Fees = fees;
        return this;
    }

    public String getDepartment() {
        return Department;
    }

    public For_User setDepartment(String department) {
        Department = department;
        return this;
    }
}
