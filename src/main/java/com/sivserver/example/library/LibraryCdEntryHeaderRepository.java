package com.sivserver.example.library;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 18/07/2017.
 */
public interface LibraryCdEntryHeaderRepository extends CrudRepository<LibraryCdEntryHeader, String> {
    LibraryCdEntryHeader findBycdid(String cdid);
}
