package hello.upload.domain;

import lombok.Data;

@Data
public class UploadFIle {

    private String uploadFileName;
    private String storeFileName;

    public UploadFIle(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}