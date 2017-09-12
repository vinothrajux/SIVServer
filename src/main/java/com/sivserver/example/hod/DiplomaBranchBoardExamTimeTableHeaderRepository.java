package com.sivserver.example.hod;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 04/07/2017.
 */
public interface DiplomaBranchBoardExamTimeTableHeaderRepository extends JpaRepository<DiplomaBranchBoardExamTimeTableHeader, String> {
 //   DiplomaBranchBoardExamTimeTableHeader findByexamid(String examid);
}
