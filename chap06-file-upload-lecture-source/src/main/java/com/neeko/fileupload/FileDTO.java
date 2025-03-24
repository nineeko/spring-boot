package com.neeko.fileupload;

/* 업로드 된 파일과 관련한 정보를 모아서 관리하는 DTO 클래스 */
public class FileDTO {
    private String originFileName;
    private String savedFileName;
    private String filePath;
    private String fileDescription;

    public FileDTO(String originFileName, String savedFileName, String filePath, String fileDescription) {
        this.originFileName = originFileName;
        this.savedFileName = savedFileName;
        this.filePath = filePath;
        this.fileDescription = fileDescription;
    }

    public String getOriginFileName() {
        return originFileName;
    }

    public void setOriginFileName(String originFileName) {
        this.originFileName = originFileName;
    }

    public String getSavedFileName() {
        return savedFileName;
    }

    public void setSavedFileName(String savedFileName) {
        this.savedFileName = savedFileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileDescription() {
        return fileDescription;
    }

    public void setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
    }
}