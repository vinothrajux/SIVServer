package com.sivserver.example.admission;

/**
 * Created by Seetha on 20-Jun-17.
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CertificateSubmissionRepository extends JpaRepository<CertificateSubmission, String> {
    CertificateSubmission findByRegno(String regno);
    CertificateSubmission findOneByRegno(String regno);
}