package com.sivserver.example.management;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 02/11/2017.
 */
public interface PlaySchoolSchoolFeesSettingRepository extends JpaRepository<PlaySchoolSchoolFeesSetting, Management_Playschool_Fees_Compound_Key> {
//PlaySchoolSchoolFeesSetting findByManagement_Playschool_Fees_Compound_Key(Management_Playschool_Fees_Compound_Key management_playschool_fees_compound_key);
}
