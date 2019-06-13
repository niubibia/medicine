package com.newer.medicine.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author wzl
 */

public class LoadImage implements Serializable {


    private static final long serialVersionUID = 1790240434312573576L;

    private BigDecimal price;

    public LoadImage() {
    }

    public BigDecimal getPrice() {

        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
