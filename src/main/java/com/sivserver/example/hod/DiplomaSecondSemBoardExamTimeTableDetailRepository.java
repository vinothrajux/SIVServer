package com.sivserver.example.hod;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 05/07/2017.
 */
public interface DiplomaSecondSemBoardExamTimeTableDetailRepository extends JpaRepository<DiplomaSecondSemBoardExamTimeTableDetail, String> {
    DiplomaSecondSemBoardExamTimeTableDetail findByRegno(String regno);
}
