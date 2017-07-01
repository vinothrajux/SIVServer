package com.sivserver.example.admission;

import org.springframework.data.repository.CrudRepository;

import java.util.Date;

/**
 * Created by GBCorp on 01/07/2017.
 */
public interface StudentDiscontinuedTransferCertificateRepository extends CrudRepository<StudentDiscontinuedTransferCertificate, String> {
    StudentDiscontinuedTransferCertificate findByregno(String regno);
}
