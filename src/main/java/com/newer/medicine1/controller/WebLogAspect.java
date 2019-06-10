package com.newer.medicine1.controller;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * web层日志切面类
 */
@Aspect
@Component //组件 用于对象注入到spring容器中
@Order(5)
public class WebLogAspect {

    private Logger logger = Logger.getLogger(getClass());

    private ThreadLocal<Long> startTime = new ThreadLocal();


    //定义切入点
    @Pointcut("execution(public * com.*.*.controller.*.*(..))")
    public void webLog(){
    }

    @Before(value = "webLog()")
    public void doBefore(JoinPoint point){
        logger.info("WebLogAspect.doBefore................");
        startTime.set(System.currentTimeMillis());
        //获取请求对象
        ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
       HttpServletRequest request = attributes.getRequest();
       logger.info("IP : "+request.getRemoteAddr());
       logger.info("URL:" + request.getRequestURL().toString());
       logger.info("HTTP_METHOD:" +request.getMethod());
       logger.info("CLASS_NAME : " + point.getSignature().getDeclaringTypeName()+"."+point.getSignature().getName());
       logger.info("ARGS : " + Arrays.toString(point.getArgs()));
    }

    @AfterReturning(value = "webLog()",returning = "ret")
    public void doAferReturing(Object ret){
        logger.info("WebLogAspect.doAfterReuring.............");
        logger.info("Resp: " + ret);
        logger.info("Spend Time : " + (System.currentTimeMillis()-startTime.get()));
    }

}
