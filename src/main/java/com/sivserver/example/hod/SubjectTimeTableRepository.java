package com.sivserver.example.hod;

import com.sivserver.example.parent.StudentLeaveLetter;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 29/06/2017.
 */
public interface SubjectTimeTableRepository extends CrudRepository<SubjectTimeTable, String> {
    SubjectTimeTable findBybranchcode(String branchcode);

}
