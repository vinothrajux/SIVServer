package com.sivserver.example.hostel;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 19/07/2017.
 */
public interface HostelStudentVisitorDetailRepository extends CrudRepository<HostelStudentVisitorDetail, String> {
    HostelStudentVisitorDetail findByRegno(String regno);
}
