package com.lxy.demo.define;

public class InterfaceMain {
    public static void main(String[] args) {
        LoggerService loggerService = LoggerService.getService();
        loggerService.warnLog("123");
    }
}
