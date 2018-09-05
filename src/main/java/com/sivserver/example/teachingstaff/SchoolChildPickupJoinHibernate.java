package com.sivserver.example.teachingstaff;

import com.sivserver.example.student.PlaySchoolStudentBaseInformation;
import com.sivserver.example.student.SchoolStudentBaseInformation;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.Date;
import java.util.List;

/**
 * Created by Seetha on 03-Sep-18.
 */
public class SchoolChildPickupJoinHibernate {

    public static List<SchoolStudentBaseInformation> jointable(String standardstudying, String section, String academicyear, Date entrydate, Integer instituteid){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Criteria criteria = session.createCriteria(SchoolStudentBaseInformation.class);
        criteria.createCriteria("studentAttendanceDetailPlaySchoolRegno").add(Restrictions.eq("entrydate",entrydate));
        criteria.add(Restrictions.eq("standardstudying",standardstudying));
        criteria.add(Restrictions.eq("section",section));
        criteria.add(Restrictions.eq("academicyear",academicyear));
        criteria.add(Restrictions.eq("instituteid",instituteid));

        List<SchoolStudentBaseInformation> students = criteria.list();

        session.getTransaction().commit();
//        session.close();
        return students;
    }

}
