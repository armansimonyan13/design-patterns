package com.designpatterns.strategy.player;

public class App {

    public static void main(String[] args) {
        File file = new File("mp3", "Encoded mp3 data");
        Decoder decoder;
        if ("mp3".equals(file.getType())) {
            decoder = new Mp3Decoder();
        } else if ("mp4".equals(file.getType())) {
            decoder = new Mp4Decoder();
        } else {
            throw new IllegalStateException("Decoder not found");
        }
        Player player = new Player();
        player.setDecoder(decoder);
        player.play(file);
    }
    
}