package com.spsmb;

public class Main {
    //Je to p94ovina
    public static Logger logger = new ConsoleLogger();

    public static void main(String[] args) {
        logger.setLevel(LoggerLevel.ERROR);

        logger.warn("warn");
        logger.error("error");
    }
}
