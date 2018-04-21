package com.sivserver.example.admission;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Seetha on 31-Mar-18.
 */
public interface ApplicationSaleSchoolRepository extends JpaRepository<ApplicationSaleSchool, String> {

    ApplicationSaleSchool findByApplno(String applno);
    ApplicationSaleSchoolProjection findOneByApplno(String applno);

}
