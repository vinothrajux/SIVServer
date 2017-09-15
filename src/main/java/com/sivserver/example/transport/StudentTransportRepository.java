package com.sivserver.example.transport;

import com.sivserver.example.admission.AdmissionCounselling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 28/06/2017.
 */
public interface StudentTransportRepository extends JpaRepository<StudentTransport, String> {
    StudentTransport findByRegno(String regno);
}
