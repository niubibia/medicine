package com.newer.medicine.util;

/**
 * 封装layui的分页参数
 */

public class Page {
    private int page;
    private int limit;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getStart(){
        return (page-1)*limit;
    }
}
