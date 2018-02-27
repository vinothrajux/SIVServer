package com.sivserver.example.user;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Seetha on 05-Feb-18.
 */
public interface FeedbackRepository extends JpaRepository<Feedback, String> {
    Iterable<Feedback> findByInstituteid(Integer instituteid);
}
