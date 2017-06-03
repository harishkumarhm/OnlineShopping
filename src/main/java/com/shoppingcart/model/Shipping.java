package com.shoppingcart.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Shipping
 *
 */
@Entity

public class Shipping implements Serializable {

	 /**
     * Shipping cost
     */
    private BigDecimal cost;

    /**
     * Shipping id
     */
    private Long shippingId;

    /**
     * Returns the shipping Id
     * @return shipping id
     */
    @Id
    @GeneratedValue
    public Long getShippingId() {
        return shippingId;
    }

    /**
     * Sets the shipping id
     * @param shippingId - shipping id
     */
    public void setShippingId(Long shippingId) {
        this.shippingId = shippingId;
    }

    /**
     * Cost of the shipping
     * @param cost - cost
     */
    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    /**
     * Returns the cost of the shipping
     * @return shipping cost
     */
    public BigDecimal getCost() {
        return cost;
    }


}
