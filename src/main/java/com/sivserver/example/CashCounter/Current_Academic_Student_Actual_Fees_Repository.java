package com.sivserver.example.CashCounter;

import com.sivserver.example.admission.Diploma_First_Year_Bform_Detail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 10/09/2017.
 */
public interface Current_Academic_Student_Actual_Fees_Repository extends JpaRepository<Current_Academic_Student_Actual_Fees, String> {
    Current_Academic_Student_Actual_Fees findByRegno(String regno);
}
