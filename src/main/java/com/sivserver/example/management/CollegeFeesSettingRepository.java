package com.sivserver.example.management;

/**
 * Created by Seetha on 20-Jun-17.
 */
import com.sivserver.example.management.CollegeFeesSetting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CollegeFeesSettingRepository extends JpaRepository<CollegeFeesSetting, Management_College_Fees_Compound_Key> {
 //   CollegeFeesSetting findByManagementcollegefeescompoundkey(Management_College_Fees_Compound_Key management_college_fees_compound_key);
}