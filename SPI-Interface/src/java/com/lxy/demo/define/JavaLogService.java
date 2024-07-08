package com.lxy.demo.define;

/**
 * 作为调用方提供的接口定义
 **/
public interface JavaLogService {
    
    void infoLog(String message);
    
    void warnLog(String message);
    
    void errorLog(String message);
}