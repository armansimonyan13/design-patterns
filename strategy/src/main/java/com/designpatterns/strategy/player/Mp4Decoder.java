package com.designpatterns.strategy.player;

import com.designpatterns.strategy.util.Logger;

public class Mp4Decoder implements Decoder {

    @Override
    public Stream decode(File file) {
        Logger.log("Decode mp4 file into stream");
        return new Stream("Decoded mp4 data");
    }
    
}