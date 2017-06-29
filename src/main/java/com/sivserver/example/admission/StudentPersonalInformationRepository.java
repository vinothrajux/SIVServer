package com.sivserver.example.admission;

/**
 * Created by Seetha on 28-Jun-17.
 */
import org.springframework.data.repository.CrudRepository;

public interface StudentPersonalInformationRepository extends CrudRepository<StudentPersonalInformation, String> {
    StudentPersonalInformation findByRegno(String regno);
}

