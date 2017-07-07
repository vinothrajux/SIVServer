package com.sivserver.example.hod;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 04/07/2017.
 */
public interface DiplomaBranchBoardExamTimeTableHeaderRepository extends CrudRepository<DiplomaBranchBoardExamTimeTableHeader, String> {
    DiplomaBranchBoardExamTimeTableHeader findByexamid(String examid);
}
