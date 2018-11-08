package com.sivserver.example.teachingstaff;

import com.sivserver.example.student.PlaySchoolStudentBaseInformation;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.Date;
import java.util.List;

/**
 * Created by Seetha on 31-Oct-18.
 */
public class StudentAttendanceJoinHibernate {

        public static List<PlaySchoolStudentBaseInformation> jointable(String standardstudying, String section, String academicyear, Date entrydate, Integer instituteid){
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();

            Criteria criteria = session.createCriteria(PlaySchoolStudentBaseInformation.class);
            criteria.createCriteria("studentAttendanceDetailPlaySchoolRegno").add(Restrictions.eq("entrydate",entrydate));
            criteria.add(Restrictions.eq("standardstudying",standardstudying));
            criteria.add(Restrictions.eq("section",section));
            criteria.add(Restrictions.eq("academicyear",academicyear));
            criteria.add(Restrictions.eq("instituteid",instituteid));

            List<PlaySchoolStudentBaseInformation> students = criteria.list();

            session.getTransaction().commit();
//        session.close();
            return students;
        }
    }

