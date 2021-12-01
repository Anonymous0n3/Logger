package com.spsmb;


public class ConsoleLogger implements Logger {

    private LoggerLevel levelNum;

    @Override
    public void warn(String message) {
        if(levelNum == LoggerLevel.WARN) {
            System.out.println(message);
        }
    }

    @Override
    public void info(String message) {
        if(levelNum == LoggerLevel.INFO) {
            System.out.println(message);
        }
    }

    @Override
    public void error(String message) {
        if(levelNum == LoggerLevel.ERROR) {
            System.out.println(message);
        }
    }

    @Override
    public void setLevel(LoggerLevel levelNum) {
        this.levelNum = levelNum;
    }

}
