package com.sivserver.example.steno;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 07/11/2017.
 */
public interface EventsCircularsPlaySchoolRepository extends JpaRepository<EventsCircularsPlaySchool,String> {
    EventsCircularsPlaySchool findByEventid(String eventid);
    EventsCircularsPlaySchoolProjection findOneByEventid(String eventid);

}
