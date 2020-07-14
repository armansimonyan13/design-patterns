package com.designpatterns.strategy.player;

import com.designpatterns.strategy.util.Logger;

public class Player {

    private Decoder decoder;

    public void play(File file) {
        Logger.log("Playing the stream");
        String data = decoder.decode(file).read();
        Logger.log(data);
    }

    public void setDecoder(Decoder decoder) {
        this.decoder = decoder;
    }
    
}