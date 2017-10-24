package com.sivserver.example.institute;

import com.sivserver.example.admission.FirstAidEntry;
import com.sivserver.example.user.User;

import javax.persistence.*;
import java.util.List;

/**
 * Created by GBCorp on 10/10/2017.
 */
@Entity
@Table(name="institutedetails")
public class InstituteDetails {

    @Id
    @Column(name="instituteid",nullable=false)
    private String instituteid;

    private String institutecode;

    private String institutename;

    private String institutetype;

    private String instituteaddress1;

    private String instituteaddress2;

    private String institutearea;

    private String institutepincode;

    private String institutestate;

    private String institutecontactno1;

    private String institutecontactno2;

    private String instituteemail1;

    private String instituteemail2;

    private String instituteweb;

    private Byte institutelogo;

    private Byte instituteimage;

    @OneToMany
    @JoinColumn(name="instituteid",referencedColumnName = "instituteid")
    private List<InstituteCourseDetails> instituteCourseDetailsinstituteid;

    @OneToMany
    @JoinColumn(name="instituteid",referencedColumnName = "instituteid")
    private List<InstituteBatchDetails> instituteBatchDetailsinstituteid;

    @OneToMany
    @JoinColumn(name="instituteid",referencedColumnName = "instituteid")
    private List<InstituteTestDetails> instituteTestDetailsinstituteid;

    @OneToMany
    @JoinColumn(name="instituteid",referencedColumnName = "instituteid")
    private List<InstituteExamDetails> instituteExamDetailsinstituteid;

    @OneToMany
    @JoinColumn(name="instituteid",referencedColumnName = "instituteid")
    private List<InstituteBusNoDetails> instituteBusNoDetailsinstituteid;

    @OneToMany
    @JoinColumn(name="instituteid",referencedColumnName = "instituteid")
    private List<InstituteBusRouteDetails> instituteBusRouteDetailsinstituteid;

    @OneToMany
    @JoinColumn(name="instituteid",referencedColumnName = "instituteid")
    private List<User> userInstituteid;

    public InstituteDetails() {
    }

    public InstituteDetails(String instituteid) {
        this.instituteid = instituteid;
    }

    public String getInstituteid() {
        return instituteid;
    }

    public void setInstituteid(String instituteid) {
        this.instituteid = instituteid;
    }

    public String getInstitutecode() {
        return institutecode;
    }

    public void setInstitutecode(String institutecode) {
        this.institutecode = institutecode;
    }

    public String getInstitutename() {
        return institutename;
    }

    public void setInstitutename(String institutename) {
        this.institutename = institutename;
    }

    public String getInstitutetype() {
        return institutetype;
    }

    public void setInstitutetype(String institutetype) {
        this.institutetype = institutetype;
    }

    public String getInstituteaddress1() {
        return instituteaddress1;
    }

    public void setInstituteaddress1(String instituteaddress1) {
        this.instituteaddress1 = instituteaddress1;
    }

    public String getInstituteaddress2() {
        return instituteaddress2;
    }

    public void setInstituteaddress2(String instituteaddress2) {
        this.instituteaddress2 = instituteaddress2;
    }

    public String getInstitutearea() {
        return institutearea;
    }

    public void setInstitutearea(String institutearea) {
        this.institutearea = institutearea;
    }

    public String getInstitutepincode() {
        return institutepincode;
    }

    public void setInstitutepincode(String institutepincode) {
        this.institutepincode = institutepincode;
    }

    public String getInstitutestate() {
        return institutestate;
    }

    public void setInstitutestate(String institutestate) {
        this.institutestate = institutestate;
    }

    public String getInstitutecontactno1() {
        return institutecontactno1;
    }

    public void setInstitutecontactno1(String institutecontactno1) {
        this.institutecontactno1 = institutecontactno1;
    }

    public String getInstitutecontactno2() {
        return institutecontactno2;
    }

    public void setInstitutecontactno2(String institutecontactno2) {
        this.institutecontactno2 = institutecontactno2;
    }

    public String getInstituteemail1() {
        return instituteemail1;
    }

    public void setInstituteemail1(String instituteemail1) {
        this.instituteemail1 = instituteemail1;
    }

    public String getInstituteemail2() {
        return instituteemail2;
    }

    public void setInstituteemail2(String instituteemail2) {
        this.instituteemail2 = instituteemail2;
    }

    public String getInstituteweb() {
        return instituteweb;
    }

    public void setInstituteweb(String instituteweb) {
        this.instituteweb = instituteweb;
    }

    public Byte getInstitutelogo() {
        return institutelogo;
    }

    public void setInstitutelogo(Byte institutelogo) {
        this.institutelogo = institutelogo;
    }

    public Byte getInstituteimage() {
        return instituteimage;
    }

    public void setInstituteimage(Byte instituteimage) {
        this.instituteimage = instituteimage;
    }

    public List<InstituteCourseDetails> getInstituteCourseDetailsinstituteid() {
        return instituteCourseDetailsinstituteid;
    }

    public void setInstituteCourseDetailsinstituteid(List<InstituteCourseDetails> instituteCourseDetailsinstituteid) {
        this.instituteCourseDetailsinstituteid = instituteCourseDetailsinstituteid;
    }

    public List<InstituteBatchDetails> getInstituteBatchDetailsinstituteid() {
        return instituteBatchDetailsinstituteid;
    }

    public void setInstituteBatchDetailsinstituteid(List<InstituteBatchDetails> instituteBatchDetailsinstituteid) {
        this.instituteBatchDetailsinstituteid = instituteBatchDetailsinstituteid;
    }

    public List<InstituteTestDetails> getInstituteTestDetailsinstituteid() {
        return instituteTestDetailsinstituteid;
    }

    public void setInstituteTestDetailsinstituteid(List<InstituteTestDetails> instituteTestDetailsinstituteid) {
        this.instituteTestDetailsinstituteid = instituteTestDetailsinstituteid;
    }

    public List<InstituteExamDetails> getInstituteExamDetailsinstituteid() {
        return instituteExamDetailsinstituteid;
    }

    public void setInstituteExamDetailsinstituteid(List<InstituteExamDetails> instituteExamDetailsinstituteid) {
        this.instituteExamDetailsinstituteid = instituteExamDetailsinstituteid;
    }

    public List<InstituteBusNoDetails> getInstituteBusNoDetailsinstituteid() {
        return instituteBusNoDetailsinstituteid;
    }

    public void setInstituteBusNoDetailsinstituteid(List<InstituteBusNoDetails> instituteBusNoDetailsinstituteid) {
        this.instituteBusNoDetailsinstituteid = instituteBusNoDetailsinstituteid;
    }

    public List<InstituteBusRouteDetails> getInstituteBusRouteDetailsinstituteid() {
        return instituteBusRouteDetailsinstituteid;
    }

    public void setInstituteBusRouteDetailsinstituteid(List<InstituteBusRouteDetails> instituteBusRouteDetailsinstituteid) {
        this.instituteBusRouteDetailsinstituteid = instituteBusRouteDetailsinstituteid;
    }

    public List<User> getUserInstituteid() {
        return userInstituteid;
    }

    public void setUserInstituteid(List<User> userInstituteid) {
        this.userInstituteid = userInstituteid;
    }
}
