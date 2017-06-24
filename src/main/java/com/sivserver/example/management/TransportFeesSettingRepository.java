package com.sivserver.example.management;

/**
 * Created by Seetha on 20-Jun-17.
 */
import com.sivserver.example.management.CollegeFeesSetting;
import org.springframework.data.repository.CrudRepository;

public interface TransportFeesSettingRepository extends CrudRepository<TransportFeesSetting, String> {
    TransportFeesSetting findByacademicyear(String academicyear);
    TestProjection findOneByacademicyear(String academicyear);
}