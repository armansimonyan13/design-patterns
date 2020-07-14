package com.designpatterns.strategy.player;

import com.designpatterns.strategy.util.Logger;

public class Mp3Decoder implements Decoder {

    @Override
    public Stream decode(File file) {
        Logger.log("Decode mp3 file into stream");
        return new Stream("Decoded mp3 data");
    }
    
}