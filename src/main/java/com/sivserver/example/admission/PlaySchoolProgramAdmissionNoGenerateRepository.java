package com.sivserver.example.admission;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Seetha on 15-Dec-17.
 */
public interface PlaySchoolProgramAdmissionNoGenerateRepository extends JpaRepository<PlaySchoolProgramAdmissionNoGenerate, Integer> {

    PlaySchoolProgramAdmissionNoGenerate findByIdno(Integer idno);
    PlaySchoolToddlerAdmissionNoProjection findOneByIdno(Integer idno);
}
