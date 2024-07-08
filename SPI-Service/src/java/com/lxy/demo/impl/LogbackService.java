package com.lxy.demo.impl;

import com.lxy.demo.define.JavaLogService;

public class LogbackService implements JavaLogService {
    // 必须提供一个无参构造方法
    LogbackService(){
        
    }
    @Override
    public void infoLog(String message) {
        System.out.println("logback service infoLog: " + message);
    }

    @Override
    public void warnLog(String message) {
        System.out.println("logback service warnLog: " + message);
    }

    @Override
    public void errorLog(String message) {
        System.out.println("logback service errorLog: " + message);
    }
}
