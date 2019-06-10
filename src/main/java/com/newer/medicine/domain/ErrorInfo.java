package com.newer.medicine.domain;

/**
 * 错误消息封装对象
 * @param <E>
 */
public class ErrorInfo<E> {

    public static final int OK=0;

    public static  final int ERROR=100;

    private String code;
    private String url;
    private E data;
    private String message;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
