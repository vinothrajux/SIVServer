package com.sivserver.example.transport;

import com.sivserver.example.admission.AdmissionCounselling;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 28/06/2017.
 */
public interface StudentTransportRepository extends CrudRepository<StudentTransport, String> {
    StudentTransport findByregno(String regno);
}
