package com.sivserver.example.admission;

/**
 * Created by Seetha on 20-Jun-17.
 */
import org.springframework.data.repository.CrudRepository;

public interface StudentHostelRepository extends CrudRepository<StudentHostel, String> {
    StudentHostel findByregno(String regno);
}


