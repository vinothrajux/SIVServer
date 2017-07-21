package com.sivserver.example.Superintendent;

import org.springframework.data.repository.CrudRepository;

import java.util.Date;

/**
 * Created by GBCorp on 07/07/2017.
 */
public interface Ex2HeaderRepository extends CrudRepository<Ex2Header, String> {
    Ex2Header findByquestioncode(String questioncode);
}
