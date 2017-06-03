package com.shoppingcart.model;

import com.shoppingcart.account.Bidder;
import com.shoppingcart.model.Billing;
import com.shoppingcart.model.CreditCard;
import com.shoppingcart.model.Item;
import com.shoppingcart.model.OrderStatus;
import com.shoppingcart.model.Shipping;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.2.v20151217-rNA", date="2017-06-03T12:02:54")
@StaticMetamodel(Order.class)
public class Order_ { 

    public static volatile SingularAttribute<Order, Item> item;
    public static volatile SingularAttribute<Order, Shipping> shipping;
    public static volatile SingularAttribute<Order, Long> orderId;
    public static volatile SingularAttribute<Order, Bidder> bidder;
    public static volatile SingularAttribute<Order, OrderStatus> orderStatus;
    public static volatile SingularAttribute<Order, CreditCard> creditCard;
    public static volatile SingularAttribute<Order, Billing> billing;

}