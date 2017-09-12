package com.sivserver.example.admission;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 01/07/2017.
 */
public interface Diploma_First_Year_Bform_Detail_Repository extends JpaRepository<Diploma_First_Year_Bform_Detail, String> {
    Diploma_First_Year_Bform_Detail findByRegno(String regno);
}
