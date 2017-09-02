
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

        public StudentAcademicInfo() {
        }

        public String getRegno(){   return regno;        }
        public StudentAcademicInfo setRegno(String regno) {
            this.regno = regno;
            return this;
        }

        public String getCommunity() {
            return community;
        }
        public StudentAcademicInfo setCommunity(String community) {
            this.community = community;
            return this;
        }

        public String getReligion() {
            return religion;
        }
        public StudentAcademicInfo setReligion(String religion) {
            this.religion = religion;
            return this;
        }

        public String getCaste() {            return caste;        }
        public StudentAcademicInfo setCaste(String caste) {
            this.caste = caste;
            return this;
        }

        public String getNational() {        return national;        }
        public StudentAcademicInfo setNational(String national) {
            this.national = national;
            return this;
        }

        public String getBloodgroup() {
            return bloodgroup;
        }
        public StudentAcademicInfo setBloodgroup(String bloodgroup) {
            this.bloodgroup = bloodgroup;
            return this;
        }

        public String getDurationfrom() {return durationfrom;}
        public StudentAcademicInfo setDurationfrom(String durationfrom) {
            this.durationfrom = durationfrom;
            return this;
        }

        public String getDurationto() {
            return durationto;
        }
        public StudentAcademicInfo setDurationto(String durationto) {
            this.durationto = durationto;
            return this;
        }

        public Date getAdmitteddate() {
            return admitteddate;
        }
        public StudentAcademicInfo setAdmitteddate(Date admitteddate) {
            this.admitteddate = admitteddate;
            return this;
        }

        public String getAcademicyear() {
            return academicyear;
        }
        public StudentAcademicInfo setAcademicyear(String academicyear) {
            this.academicyear = academicyear;
            return this;
        }

        public String getLoginuser() {
            return loginuser;
        }
        public StudentAcademicInfo setLoginuser(String loginuser) {
            this.loginuser = loginuser;
            return this;
        }

        public StudentPersonalInformation getStudent_personal_regno() {
            return student_personal_regno;
        }

        public StudentAcademicInfo setStudent_personal_regno(StudentPersonalInformation student_personal_regno) {
            this.student_personal_regno = student_personal_regno;
            return this;
        }

        @Id
        @Column(name="regno")
        private String regno;


        private String community;


        private String religion;


        private String caste;


        private String national;


        private String bloodgroup;


        private String durationfrom;


        private String durationto;


        private Date admitteddate;


        private String academicyear;


        private String loginuser;

        @OneToOne
        @JoinColumn(name="student_academic_regno",nullable=false,referencedColumnName = "regno")
        private StudentPersonalInformation student_personal_regno;



    }
