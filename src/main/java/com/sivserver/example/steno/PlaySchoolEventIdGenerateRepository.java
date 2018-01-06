package com.sivserver.example.steno;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Seetha on 03-Jan-18.
 */
public interface PlaySchoolEventIdGenerateRepository extends JpaRepository<PlaySchoolEventIdGenerate, Integer> {

    PlaySchoolEventIdGenerate findById(Integer id);
    PlaySchoolEventIdGenerateProjection findOneById(Integer id);
}
