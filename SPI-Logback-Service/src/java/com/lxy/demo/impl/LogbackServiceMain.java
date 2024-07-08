package com.lxy.demo.impl;

import com.lxy.demo.define.LoggerService;

public class LogbackServiceMain {
    public static void main(String[] args) {
        // 入口
        LogbackService logbackService = new LogbackService();
        logbackService.warnLog("warn logback");
        LoggerService service = LoggerService.getService();
        service.warnLog("123");
    }
}
    