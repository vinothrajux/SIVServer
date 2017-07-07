package com.sivserver.example.hod;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 05/07/2017.
 */
public interface DiplomaBranchSem5BoardExamTimeTableDetailRepository extends CrudRepository<DiplomaBranchSem5BoardExamTimeTableDetail, String> {
    DiplomaBranchSem5BoardExamTimeTableDetail findByexamid(String examid);
}
