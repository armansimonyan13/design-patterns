package com.designpatterns.visitor.farm.util;

public class Logger {

    private Logger() {}

    @SuppressWarnings("all")
    public static void log(String message) {
        System.out.println(message);
    }
    
}