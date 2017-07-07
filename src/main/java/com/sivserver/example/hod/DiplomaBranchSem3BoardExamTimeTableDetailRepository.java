package com.sivserver.example.hod;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 04/07/2017.
 */
public interface DiplomaBranchSem3BoardExamTimeTableDetailRepository extends CrudRepository<DiplomaBranchSem3BoardExamTimeTableDetail, String> {
    DiplomaBranchSem3BoardExamTimeTableDetail findByexamid(String examid);
}
