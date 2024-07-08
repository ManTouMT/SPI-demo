package com.lxy.demo.impl;

public class ServiceMain {
    public static void main(String[] args) {
        // 入口
        LogbackService logbackService = new LogbackService();
        logbackService.warnLog("warn logback");
    }
}
    