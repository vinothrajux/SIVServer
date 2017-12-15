package com.sivserver.example.CashCounter;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Seetha on 15-Dec-17.
 */
public interface PlaySchoolBillNoGenerateRepository extends JpaRepository<PlaySchoolBillNoGenerate, Integer>{
    PlaySchoolBillNoGenerate findByIdno(Integer idno);
    PlaySchoolBillNoGenerateProjection findOneByIdno(Integer idno);
}
