package com.sivserver.example.hod;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 05/07/2017.
 */
public interface DiplomaFirstSemBoardExamTimeTableDetailRepository extends CrudRepository<DiplomaFirstSemBoardExamTimeTableDetail, String> {
    DiplomaFirstSemBoardExamTimeTableDetail findByexamid(String examid);
}
