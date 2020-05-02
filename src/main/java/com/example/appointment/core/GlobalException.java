package com.example.appointment.core;

/**
 * @author wangkun
 * @description 全局异常变量
 * @date 2020/5/1
 */
public class GlobalException extends RuntimeException{
    public GlobalException(String msg){
        super(msg);
    }
}
