package com.spsmb;

import java.util.logging.Logger;

public interface CustomRepo {

    Logger log = Logger.getLogger(String.valueOf(Main.class));

    static void action() {
        log.info("TEST");
    }

}
