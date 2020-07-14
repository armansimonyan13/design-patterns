package com.designpatterns.strategy.player;

public class File {
    
    private String type;

    private String encodedData;

    public File(String type, String encodedData) {
        this.type = type;
        this.encodedData = encodedData;
    }

    public String getEncodedData() {
        return encodedData;
    }

    public String getType() {
        return type;
    }

}