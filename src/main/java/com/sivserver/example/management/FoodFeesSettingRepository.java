package com.sivserver.example.management;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 14/09/2017.
 */
public interface FoodFeesSettingRepository extends JpaRepository<FoodFeesSetting, String> {
    FoodFeesSetting findByAcademicyear(String academicyear);
}
