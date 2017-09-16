package com.sivserver.example.library;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 17/07/2017.
 */
public interface LibraryMemberDetailRepository extends JpaRepository<LibraryMemberDetail, String> {
    LibraryMemberDetail findByregno(String regno);
}
