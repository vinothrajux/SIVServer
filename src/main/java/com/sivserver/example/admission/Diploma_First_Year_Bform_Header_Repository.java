package com.sivserver.example.admission;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 01/07/2017.
 */
public interface Diploma_First_Year_Bform_Header_Repository extends JpaRepository<Diploma_First_Year_Bform_Header, String> {
    Diploma_First_Year_Bform_Header findByApplno(String applno);
}
