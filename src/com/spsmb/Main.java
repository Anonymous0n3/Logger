package com.spsmb;

public class Main {

    public static Logger logger = new ConsoleLogger();

    public static void main(String[] args) {
        logger.setLevel(LoggerLevel.ERROR);
        logger.warn("toto je warn");
        logger.info("toto je info");
        logger.error("toto je error");
    }

}
