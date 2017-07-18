package com.sivserver.example.library;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 17/07/2017.
 */
public interface LibraryMemberDetailRepository extends CrudRepository<LibraryMemberDetail, String> {
    LibraryMemberDetail findByregno(String regno);
}
