package com.lxy.demo.define;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class LoggerService {
    
    private static final LoggerService LOGGER = new LoggerService();
    
    private final JavaLogService javaLogService;
    
    private LoggerService() {
        // 核心
        ServiceLoader<JavaLogService> load = ServiceLoader.load(JavaLogService.class);
        List<JavaLogService> serviceList = new ArrayList<>();
        load.forEach(serviceList::add);
        // 一个都没找到
        if(serviceList.isEmpty()) {
            throw new RuntimeException("No JavaLogService found");
        }
        // 自己定义实现方式，我这里就默认去找第一个
        javaLogService = serviceList.get(0);
    }
    
    public void infoLog(String msg) {
        if(javaLogService != null) {
            javaLogService.infoLog(msg);
        } else {
            throw new RuntimeException("infoLog:JavaLogService is null!");
        }
    }
    
    public void warnLog(String msg) {
        if(javaLogService != null) {
            javaLogService.warnLog(msg);
        }else {
            throw new RuntimeException("warnLog:JavaLogService is null!");
        }
    }
    
    public void errorLog(String msg) {
        if(javaLogService != null) {
            javaLogService.errorLog(msg);
        }else {
            throw new RuntimeException("errorLog:JavaLogService is null!");
        }
    }
    
    public static LoggerService getService() {
        return LOGGER;
    }
}
