package com.readlearncode;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class LogEvent {

    enum LEVEL {SEVERE, ERROR, WARN}

    private LEVEL level;
    private String message;

    public LogEvent(LEVEL level, String message) {
        this.level = level;
        this.message = message;
    }

    public LEVEL getLevel() {
        return level;
    }

    public void setLevel(LEVEL level) {
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}