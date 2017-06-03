package com.shoppingcart.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

import com.shoppingcart.account.Bidder;

/**
 * Entity implementation class for Entity: Bid
 *
 */
@Entity
public class Bid implements Serializable {

	  /**
     * Unique identifier
     */
    @Id @GeneratedValue
    private Long id;
    
    /**
     * Date of the bid
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date bidDate;

    /**
     * Bid price
     */
    private BigDecimal bidPrice;

    /**
     * Item for this bid
     */
    @ManyToOne
    private Item item;

    /**
     * Bidder
     */
    @ManyToOne
    private Bidder bidder;

    /**
     * Default constructor
     */
    public Bid() {
        // No content
    }

    /**
     * Constructs a new bid given the bidder/item/price
     * @param bidder - person doing the bidding
     * @param item - item being bid on
     * @param bidPrice - price
     */
    public Bid(Bidder bidder, Item item, BigDecimal bidPrice) {
        this.item = item;
        this.bidder = bidder;
        this.bidPrice = bidPrice;
    }

    /**
     * Returns the bid id
     * @return bid id
     */
    public Long getBidId() {
        return id;
    }

    /**
     * Returns the bid date
     * @return bid date
     */
    public Date getBidDate() {
        return bidDate;
    }

    /**
     * Sets the bid date
     * @param bidDate - bid date
     */
    public void setBidDate(Date bidDate) {
        this.bidDate = bidDate;
    }

    /**
     * Sets the bid id
     * @param bidId - bid id
     */
    public void setBidId(Long bidId) {
        this.id = bidId;
    }

    /**
     * Returns the bid price
     * @return bid price
     */
    public BigDecimal getBidPrice() {
        return bidPrice;
    }

    /**
     * Sets the bid price
     * @param bidPrice - bid price
     */
    public void setBidPrice(BigDecimal bidPrice) {
        this.bidPrice = bidPrice;
    }

    /**
     * Returns the item
     * @return item
     */
    public Item getItem() {
        return item;
    }

    /**
     * Sets the item being bid on
     * @param item - item
     */
    public void setItem(Item item) {
        this.item = item;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
   
}
