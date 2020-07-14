package com.designpatterns.strategy.player;

public class Stream {

    private String data;

    public Stream(String data) {
        this.data = data;
    }

    public String read() {
        return data;
    }
    
}