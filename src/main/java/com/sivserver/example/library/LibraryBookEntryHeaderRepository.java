package com.sivserver.example.library;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 17/07/2017.
 */
public interface LibraryBookEntryHeaderRepository extends CrudRepository<LibraryBookEntryHeader, String> {
    LibraryBookEntryHeader findBybookid(String bookid);
}
