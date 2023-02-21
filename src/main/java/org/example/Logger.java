package org.example;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Logger {

    protected int num = 1;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }

    public void log(String msg) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("[" + sdf.format(timestamp) + " " + num++ + "] " + msg);
    }

}

