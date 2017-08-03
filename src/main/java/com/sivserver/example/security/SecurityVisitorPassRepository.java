package com.sivserver.example.security;

import com.sivserver.example.parent.ParentFeedBack;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Seetha on 02-Aug-17.
 */
public interface SecurityVisitorPassRepository extends CrudRepository<SecurityVisitorPass, String> {
    SecurityVisitorPass findByStaffid(String staffid);
}
