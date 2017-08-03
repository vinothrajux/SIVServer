package com.sivserver.example.parent;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Seetha on 02-Aug-17.
 */
public interface ParentFeedBackRepository extends CrudRepository<ParentFeedBack, String> {
    ParentFeedBack findByregno(String regno);
}
