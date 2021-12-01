package com.spsmb;

public interface Logger {
    void warn(String message);

    void info(String message);

    void error(String message);

    void setLevel(LoggerLevel error);
}
