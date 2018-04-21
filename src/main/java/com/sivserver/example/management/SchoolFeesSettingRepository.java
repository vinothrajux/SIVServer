package com.sivserver.example.management;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Seetha on 31-Mar-18.
 */
public interface SchoolFeesSettingRepository extends JpaRepository<SchoolFeesSetting, Management_School_Fees_Compound_Key> {

    SchoolFeesSetting findByManagementschoolfeescompoundkey(Management_School_Fees_Compound_Key managementplayschoolfeescompoundkey);
    SchoolFeesSettingProjection findOneByManagementschoolfeescompoundkey(Management_School_Fees_Compound_Key managementplayschoolfeescompoundkey);

}
