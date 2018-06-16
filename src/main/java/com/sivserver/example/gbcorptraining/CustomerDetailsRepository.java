package com.sivserver.example.gbcorptraining;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Seetha on 06-Jun-18.
 */
public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, Integer> {
    CustomerDetails findByInstituteid(Integer Instituteid);
    CustomerDetailsProjection findOneByInstituteid(Integer Instituteid);
}
