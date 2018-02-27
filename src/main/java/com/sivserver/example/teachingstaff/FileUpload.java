package com.sivserver.example.teachingstaff;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * Created by Seetha on 12-Feb-18.
 */
public class FileUpload {
    private CommonsMultipartFile[] files;

    public CommonsMultipartFile[] getFiles() {
        return files;
    }

    public void setFiles (CommonsMultipartFile[] files) {
        this.files = files;
    }

}
