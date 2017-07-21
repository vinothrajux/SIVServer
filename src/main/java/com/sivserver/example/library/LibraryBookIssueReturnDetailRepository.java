package com.sivserver.example.library;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 18/07/2017.
 */
public interface LibraryBookIssueReturnDetailRepository extends CrudRepository<LibraryBookIssueReturnDetail, String> {
    LibraryBookEntryHeader findBymemberid(String memberid);
}
