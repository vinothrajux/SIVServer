package com.sivserver.example.admission;

/**
 * Created by Seetha on 20-Jun-17.
 */
import org.springframework.data.repository.CrudRepository;

public interface ApplicationSaleRepository extends CrudRepository<ApplicationSale, String> {
    ApplicationSale findByApplno(String applno);
    ApplicationSaleProjection findOneByApplno(String applno);
}