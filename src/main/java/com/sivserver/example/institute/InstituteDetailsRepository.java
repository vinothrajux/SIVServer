package com.sivserver.example.institute;

import com.sivserver.example.library.LibraryBookEntryDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 10/10/2017.
 */
public interface InstituteDetailsRepository extends JpaRepository<InstituteDetails, String> {

    InstituteDetails findByInstituteid(String instituteid);
}
