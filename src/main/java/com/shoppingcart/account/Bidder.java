package com.shoppingcart.account;


import com.shoppingcart.account.User;
import com.shoppingcart.model.Order;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Bidder
 *
 */
@Entity
@Table(name="BIDDERS")
@DiscriminatorValue(value="B")
@PrimaryKeyJoinColumn(name="USER_ID")
public class Bidder extends User implements Serializable {

	
	 /**
     * Billing information
     */
    @OneToMany(cascade = CascadeType.ALL)
    private Set<BillingInfo> billingInfo = new HashSet<BillingInfo>();

    /**
     * Orders
     */
    @OneToMany
    private Set<Order> orders;

    /**
     * Creates a bidder
     */
    public Bidder() {
        // Constructs a new bidder
    }

    /**
     * Creates a new bidder with the initial credit rating provided
     * @param username - username
     * @param password - password
     * @param firstName - first name
     * @param lastName - last name
     * @param billingInfo - billing information
     * @param address - address
     * @param dateCreated - date on which the account was verified
     * @param accountVerified - true if the account has been verified
     */
    public Bidder(String username, String password, String firstName, String lastName,
                  Address address, Date dateCreated, boolean accountVerified) {
        super(firstName,lastName,username, password,address,dateCreated,accountVerified);
    }

    /**
     * Sets the billing info
     * @param billingInfo - billing info
     */
    public void setBillingInfo(Set<BillingInfo> billingInfo) {
        this.billingInfo = billingInfo;
    }


    /**
     * Returns the billing info
     * @return billing info
     */
    public Set<BillingInfo> getBillingInfo() {
        return billingInfo;
    }

    /**
     * Sets the list of order
     * @param orders - orders
     */
    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    /**
     * Adds an order
     * @param order - order
     */
    public void addOrder(Order order) {
        orders.add(order);
    }

    /**
     * Returns the orders
     * @return orders
     */
    public Set<Order> getOrders() {
        return orders;
    }

}
