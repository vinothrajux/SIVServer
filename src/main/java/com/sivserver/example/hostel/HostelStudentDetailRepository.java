package com.sivserver.example.hostel;

import com.sivserver.example.library.LibraryBookEntryDetail;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 18/07/2017.
 */
public interface HostelStudentDetailRepository extends CrudRepository<HostelStudentDetail, String> {
    HostelStudentDetail findByregno(String regno);
}
