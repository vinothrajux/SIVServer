package com.sivserver.example.management;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 02/11/2017.
 */
public interface PlaySchoolTransportFeesSettingRepository extends JpaRepository<PlaySchoolTransportFeesSetting, Management_Transport_Fees_Compound_Key> {
//PlaySchoolTransportFeesSetting findByManagement_Transport_Fees_Compound_Key(Management_Transport_Fees_Compound_Key management_transport_fees_compound_key);
}
