package com.sivserver.example.teachingstaff;

import com.sivserver.example.student.PlaySchoolStudentBaseInformation;
import com.sivserver.example.student.PlaySchoolStudentPersonalInformation;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Seetha on 04-Jan-18.
 */
public class ChildPickUpJoinHibernate {
    public static List<Object> jointable(){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        PlaySchoolStudentBaseInformation playSchoolStudentBaseInformation = new PlaySchoolStudentBaseInformation();
        PlaySchoolStudentPersonalInformation playSchoolStudentPersonalInformation = new PlaySchoolStudentPersonalInformation();

        //Query query = session.createQuery("from PlaySchoolStudentBaseInformation");
        Criteria criteria = session.createCriteria(PlaySchoolStudentBaseInformation.class);
//        criteria.add(Restrictions.eq("registernumber","17TOD18"));
//        criteria.add(Restrictions.eq("play_school_student_personal_regno.pickuppersonname","MOHANA"));
        criteria.createCriteria("play_school_student_personal_regno").add(Restrictions.eq("pickuppersonname","MOHANA"));
//  criteria.createAlias("comments", "comment").add(Restrictions.in("comment.reason", reasons));
//  criteria.createAlias("comments", "comment").add(Restrictions.in("comment.reason", reasons));
        List<PlaySchoolStudentBaseInformation> students = criteria.list();



        //PlaySchoolStudentBaseInformation a = (PlaySchoolStudentBaseInformation) query.list();
        session.getTransaction().commit();
        session.close();
        System.out.println("Size:"+students.size());
        System.out.println("Data:"+students);
        List<Object> list = new ArrayList<Object>();
        for(PlaySchoolStudentBaseInformation student : students){

            playSchoolStudentBaseInformation.setCandidatename(student.getCandidatename());
            playSchoolStudentBaseInformation.setRegisternumber(student.getRegisternumber());

//            playSchoolStudentBaseInformation.setPlay_school_student_personal_regno(student.getPlay_school_student_personal_regno());
//            List<StudentAttendanceDetailPlaySchool> list2=null;
//
//            List<StudentAttendanceDetailPlaySchool> obj = student.getStudentAttendanceDetailPlaySchoolRegno();
//            for (StudentAttendanceDetailPlaySchool a : obj){
//                list2.add(a);
//            }
////            list2.add(obj);
//            //list2.add(student.getStudentAttendanceDetailPlaySchoolRegno());
//
////            for(StudentAttendanceDetailPlaySchool studentattendance : list2) {
////
////            }+
//            playSchoolStudentBaseInformation.setStudentAttendanceDetailPlaySchoolRegno(list2);

            list.add(playSchoolStudentBaseInformation);



            System.out.println("Student:"+student.getRegisternumber());
            playSchoolStudentPersonalInformation = student.getPlay_school_student_personal_regno();
            System.out.println("PickupPerson:"+playSchoolStudentPersonalInformation.getPickuppersonname());
            //playSchoolStudentPersonalInformation.getPickuppersonname();
        }
//        System.out.println("Data:"+a.getRegisternumber());
        return list;
    }
}
