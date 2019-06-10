package com.newer.medicine.domain;

import java.io.Serializable;

public class Authority implements Serializable {

    private static final long serialVersionUID = 5455949752640050517L;
    private Integer id;
    private AuthorityName name;

    public Authority() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AuthorityName getName() {
        return name;
    }

    public void setName(AuthorityName name) {
        this.name = name;
    }
}
