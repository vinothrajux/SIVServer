package com.sivserver.example.admission;

/**
 * Created by Seetha on 20-Jun-17.
 */
import org.springframework.data.repository.CrudRepository;

public interface AdmissionCounsellingRepository extends CrudRepository<AdmissionCounselling, String> {
    AdmissionCounselling findByapplno(String applno);
}