package com.sivserver.example.admission;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 25/10/2017.
 */
public interface ApplicationSalePlaySchoolRepository extends JpaRepository<ApplicationSalePlaySchool, String> {
ApplicationSalePlaySchool findByApplno(String applno);
ApplicationSalePlaySchoolProjection findOneByApplno(String applno);
}
