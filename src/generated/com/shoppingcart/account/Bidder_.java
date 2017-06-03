package com.shoppingcart.account;

import com.shoppingcart.account.BillingInfo;
import com.shoppingcart.model.Order;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.2.v20151217-rNA", date="2017-06-03T12:02:54")
@StaticMetamodel(Bidder.class)
public class Bidder_ extends User_ {

    public static volatile SetAttribute<Bidder, BillingInfo> billingInfo;
    public static volatile SetAttribute<Bidder, Order> orders;

}