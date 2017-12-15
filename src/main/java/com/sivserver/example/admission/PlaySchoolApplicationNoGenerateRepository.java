package com.sivserver.example.admission;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Seetha on 14-Dec-17.
 */
public interface PlaySchoolApplicationNoGenerateRepository extends JpaRepository<PlaySchoolApplicationNoGenerate,Integer> {
   // PlaySchoolApplicationNoGenerate findOneByIdno(Integer Idno);
    PlaySchoolApplicationNoGenerateProjection findOneByIdno(Integer Idno);
}
