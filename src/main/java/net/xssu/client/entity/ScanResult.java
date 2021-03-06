package net.xssu.client.entity;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class ScanResult implements Serializable{
    private Integer taskId;
    private String clientId;
    private String shard;
    private byte[] resultFileBytes; // JSON file

    public ScanResult() {}

    public ScanResult(Integer taskId, String clientId, String shard, File resultFile) {
        this.taskId = taskId;
        this.clientId = clientId;
        this.shard = shard;

        try {
            byte[] fileBytes = IOUtils.toByteArray(new FileInputStream(resultFile));
            this.resultFileBytes = fileBytes;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public byte[] getResultFileBytes() {
        return resultFileBytes;
    }

    public void setResultFileBytes(byte[] resultFileBytes) {
        this.resultFileBytes = resultFileBytes;
    }

    public String getShard() {
        return shard;
    }

    public void setShard(String shard) {
        this.shard = shard;
    }
}
