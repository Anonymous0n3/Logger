package com.spsmb;

import java.util.logging.Logger;

public interface CustomRepo {

    Logger log = LogFactory.getLogger(SomIface.class);

    default void action() {
        log.info("TEST");
    }

}
