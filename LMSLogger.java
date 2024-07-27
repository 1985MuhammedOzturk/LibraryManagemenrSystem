/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logger;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author moztu
 */
public class LMSLogger {
    private static LMSLogger instance;

    private LMSLogger() {
        // Initialize your logger here
    }

    public static LMSLogger getInstance() {
        if (instance == null) {
            instance = new LMSLogger();
        }
        return instance;
    }

    public void log(LogLevel level, String message) {
        // Handle logging based on log level
        switch (level) {
            case INFO:
                System.out.println("INFO: " + message);
                break;
            case WARNING:
                System.out.println("WARNING: " + message);
                break;
            case ERROR:
                System.err.println("ERROR: " + message);
                break;
        }
    }

    public void log(LogLevel level, String message, Throwable throwable) {
        log(level, message);
        throwable.printStackTrace();
    }
}