package com.newer.medicine.exception;

/**
 * 自定义异常类
 */
public class MyException extends Exception{
    private static final long serialVersionUID = 3376728627579502837L;

    public MyException(String message) {
        super(message);
    }
}
