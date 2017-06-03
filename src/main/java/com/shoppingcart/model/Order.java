package com.shoppingcart.model;

import java.io.Serializable;

import javax.persistence.*;

import com.shoppingcart.account.Bidder;


/**
 * Entity implementation class for Entity: Order
 *
 */
@Entity
@Table(name="orders")
public class Order implements Serializable {
	 /**
     * Order id
     */
    @Id @GeneratedValue
    private Long orderId;

    /**
     * Person that bid
     */
    @ManyToOne @JoinColumn
    private Bidder bidder;

    /**
     * Item on that was bid on
     */
    @ManyToOne @JoinColumn
    private Item item;

    /**
     * Shipping address
     */
    @ManyToOne @JoinColumn
    private Shipping shipping;

    /**
     * Billing address
     */
    @ManyToOne @JoinColumn
    private Billing billing;

    /**
     * Credit card
     */
    @ManyToOne @JoinColumn
    private CreditCard creditCard;

    /**
     * Order status
     */
    @Enumerated
    private OrderStatus orderStatus;

    /**
     * Default constructor for JPA
     */
    public Order() {
        // Default constructor
    }

    /**
     * Creates a new order
     * @param item  - item in the order
     * @param bidder - bidder
     * @param creditCard - credit card
     */
    public Order(Item item, Bidder bidder, CreditCard creditCard) {
        this.item = item;
        this.bidder = bidder;
        this.creditCard = creditCard;
    }

    /**
     * Sets the orderId
     * @param orderId - order ID
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * Returns the order id
     * @return order id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * Returns the bidder
     * @return bidder
     */
    public Bidder getBidder() {
        return bidder;
    }

    /**
     * Sets the bidder
     * @param bidder - bidder
     */
    public void setBidder(Bidder bidder) {
        this.bidder = bidder;
    }

    /**
     * Returns the billing information
     * @return billing information
     */
    public Billing getBilling() {
        return billing;
    }

    /**
     * Sets the billing information
     * @param billing - billing information
     */
    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    /**
     * Returns the item
     * @return item
     */
    public Item getItem() {
        return item;
    }

    /**
     * Sets the item
     * @param item - item
     */
    public void setItem(Item item) {
        this.item = item;
    }

    /**
     * Return the shipping information
     * @return shipping
     */
    public Shipping getShipping() {
        return shipping;
    }

    /**
     * Sets the credit card
     * @param creditCard - credit card
     */
    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    /**
     * Returns the credit card
     * @return credit card
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the shipping information
     * @param shipping - shipping information
     */
    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    /**
     * Sets the order status
     * @param orderStatus - order status
     */
    public void setStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * Returns the order status
     * @return order status
     */
    
    public OrderStatus getStatus() {
        return orderStatus;
    }

   
}
