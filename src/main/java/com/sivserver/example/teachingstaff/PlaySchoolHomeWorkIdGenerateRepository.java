package com.sivserver.example.teachingstaff;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GB Corp on 12/23/2017.
 */
public interface PlaySchoolHomeWorkIdGenerateRepository extends JpaRepository<PlaySchoolHomeWorkIdGenerate, Integer> {

    PlaySchoolHomeWorkIdGenerate findByIdno(Integer idno);
    PlaySchoolHomeWorkIdGenerateProjection findOneByIdno(Integer idno);
}
