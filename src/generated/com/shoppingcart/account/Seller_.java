package com.shoppingcart.account;

import com.shoppingcart.model.Item;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.2.v20151217-rNA", date="2017-06-03T12:02:54")
@StaticMetamodel(Seller.class)
public class Seller_ extends User_ {

    public static volatile SingularAttribute<Seller, BigDecimal> commissionRate;
    public static volatile SingularAttribute<Seller, Long> maxItemsAllowed;
    public static volatile SetAttribute<Seller, Item> items;

}