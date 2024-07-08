package com.lxy.demo.client;

import com.lxy.demo.define.LoggerService;
import com.lxy.demo.impl.SL4JService;

public class Main {
    public static void main(String[] args) {
        LoggerService service = LoggerService.getService();
        service.warnLog("123");
        SL4JService service2 = new SL4JService();
        service2.warnLog("456");
    }
}