package com.sivserver.example.hod;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Seetha on 30-Jun-17.
 */
public interface StaffLeaveLetterEntryRepository extends CrudRepository<StaffLeaveLetterEntry, String> {
    StaffLeaveLetterEntry findBystaffid(String staffid);
}

