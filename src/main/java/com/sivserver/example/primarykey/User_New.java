package com.sivserver.example.primarykey;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by GBCorp on 22/08/2017.
 */
@Entity
@Table(name="Users_New",catalog = "test")
public class User_New {
    @Id
    @NotNull
    @Column(name = "regno")
    private String regno;
    private String name;
    private Long Fees;
    private String Department;

    public User_New()
   {}

   public User_New(String regno)
    {
        this.regno = regno;
    }

//    @OneToMany
//    @JoinColumn(name = "regno", referencedColumnName = "regno")
//    private List<Users_Log> userLogs;
//
//    public List<Users_Log> getUserLogs() {
//        return userLogs;
//    }
//
//    public void setUserLogs(List<Users_Log> userLogs) {
//        this.userLogs = userLogs;
//    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getFees() {
        return Fees;
    }

    public void setFees(Long Fees) {
        this.Fees = Fees;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }


}
