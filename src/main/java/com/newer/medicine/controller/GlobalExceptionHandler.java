package com.newer.medicine.controller;


import com.newer.medicine.domain.ErrorInfo;
import com.newer.medicine.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一处理异常类
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    //当抛出HospitalException的异常时，由以下方法处理该异常
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ErrorInfo<String> handlerException(HttpServletRequest request, MyException e) {
        ErrorInfo<String> errorInfo = new ErrorInfo<>();
        errorInfo.setMessage(e.getMessage());
        errorInfo.setUrl(request.getRequestURI());
        errorInfo.setCode(ErrorInfo.ERROR + "");
        errorInfo.setData("未知错误");
        return errorInfo;
    }
}
