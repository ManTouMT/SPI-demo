package com.lxy.demo.impl;

import com.lxy.demo.define.JavaLogService;

public class SL4JService implements JavaLogService {
    @Override
    public void infoLog(String message) {
        System.out.println("SL4J service infoLog: " + message);
    }

    @Override
    public void warnLog(String message) {
        System.out.println("SL4J service warnLog: " + message);
    }

    @Override
    public void errorLog(String message) {
        System.out.println("SL4J service errorLog: " + message);
    }
}
