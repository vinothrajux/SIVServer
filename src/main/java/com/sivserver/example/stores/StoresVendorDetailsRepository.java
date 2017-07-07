package com.sivserver.example.stores;

import com.sivserver.example.student.StudentBaseInformation;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 05/07/2017.
 */
public interface StoresVendorDetailsRepository extends CrudRepository<StoresVendorDetails, String> {
    StoresVendorDetails findByvendorId(String findByvendorId);
}
