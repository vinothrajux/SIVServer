package com.sivserver.example.library;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 18/07/2017.
 */
public interface LibraryBookEntryDetailRepository extends JpaRepository<LibraryBookEntryDetail, Integer> {
    LibraryBookEntryDetail findBySlno(Integer slno);
}
