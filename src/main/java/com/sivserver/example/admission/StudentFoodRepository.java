package com.sivserver.example.admission;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 28/06/2017.
 */
public interface StudentFoodRepository extends CrudRepository<StudentFood, String> {
    StudentFood findByregno(String regno);
}
