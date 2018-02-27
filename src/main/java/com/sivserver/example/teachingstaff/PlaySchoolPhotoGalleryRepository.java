package com.sivserver.example.teachingstaff;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Seetha on 16-Dec-17.
 */
public interface PlaySchoolPhotoGalleryRepository extends JpaRepository<PlaySchoolPhotoGallery, String> {
    Iterable<PlaySchoolPhotoGallery> findByRegisternumberAndInstituteid(String registernumber, Integer instituteid);
}
