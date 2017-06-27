package com.sivserver.example.admission;

/**
 * Created by Seetha on 20-Jun-17.
 */
import org.springframework.data.repository.CrudRepository;

public interface CertificateSubmissionRepository extends CrudRepository<CertificateSubmission, String> {
    CertificateSubmission findByadmissionno(String admissionno);
}