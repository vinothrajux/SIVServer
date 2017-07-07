
package com.sivserver.example.admission;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

    /**
     * Created by Seetha on 09-Jun-17.
     */

    @Entity
    @Table(name = "studentacademicinfo")
    public class StudentAcademicInfo {

        public String getRegno(){   return regno;        }
        public void setRegno(String regno) {this.regno = regno;        }

        public String getCommunity() {
            return community;
        }
        public void setCommunity(String community) {            this.community = community;        }

        public String getReligion() {
            return religion;
        }
        public void setReligion(String religion) {
            this.religion = religion;
        }

        public String getCaste() {            return caste;        }
        public void setCaste(String caste) {
            this.caste = caste;
        }

        public String getNational() {        return national;        }
        public void setNational(String national) {
            this.national = national;
        }

        public String getBloodGroup() {
            return bloodgroup;
        }
        public void setBloodGroup(String bloodgroup) {
            this.bloodgroup = bloodgroup;
        }

        public String getDurationFrom() {            return durationfrom;        }
        public void setDurationFrom(String durationfrom) {            this.durationfrom = durationfrom;        }

        public String getDurationTo() {
            return durationto;
        }
        public void setDurationTo(String durationto) {      this.durationto = durationto;        }

        public Date getAdmittedDate() {
            return admitteddate;
        }
        public void setAdmittedDate(Date admitteddate) {         this.admitteddate = admitteddate;        }

        public String getAacademicyear() {
            return academicyear;
        }
        public void setAacademicyear(String academicyear) {
            this.academicyear = academicyear;
        }

        public String getLoginUser() {
            return loginuser;
        }
        public void setLoginUser(String loginuser) {
            this.loginuser = loginuser;
        }


        @NotNull
        private String regno;

        @NotNull
        private String community;

        @NotNull
        private String religion;

        @NotNull
        private String caste;

        @NotNull
        private String national;

        @NotNull
        private String bloodgroup;

        @NotNull
        private String durationfrom;

        @NotNull
        private String durationto;

        @NotNull
        private Date admitteddate;

        @NotNull
        private String academicyear;

        @Id
        private String loginuser;


    }
