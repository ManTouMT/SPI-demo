package com.lxy.demo.impl;

import com.lxy.demo.define.LoggerService;

public class Sl4jServiceMain {
    public static void main(String[] args) {
        // 入口
        SL4JService sl4JService = new SL4JService();
        sl4JService.warnLog("warn logback");
        LoggerService service = LoggerService.getService();
        service.warnLog("123");
    }
}
    