package com.lxy.demo.define;

public class InterfaceMain {
    // 主要目的是提供一个入口供打包
    public static void main(String[] args) {
        LoggerService loggerService = LoggerService.getService();
        loggerService.warnLog("123");
    }
}
