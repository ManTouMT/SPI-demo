package com.lxy.demo.define;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class LoggerService {
    private static final LoggerService LOGGER = new LoggerService();
    
    private final JavaLogService javaLogService;
    
    LoggerService() {
        ServiceLoader<JavaLogService> load = ServiceLoader.load(JavaLogService.class);
        List<JavaLogService> list = new ArrayList<>();
        load.forEach(list::add);
        javaLogService = list.isEmpty() ? null : list.get(0);
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
    
    public LoggerService getService() {
        return LOGGER;
    }
}
