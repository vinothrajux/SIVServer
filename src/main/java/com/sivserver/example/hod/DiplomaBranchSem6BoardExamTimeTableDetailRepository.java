package com.sivserver.example.hod;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 05/07/2017.
 */
public interface DiplomaBranchSem6BoardExamTimeTableDetailRepository extends CrudRepository<DiplomaBranchSem6BoardExamTimeTableDetail, String> {
    DiplomaBranchSem6BoardExamTimeTableDetail findByexamid(String examid);
}
