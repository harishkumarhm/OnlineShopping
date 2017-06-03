package com.shoppingcart.model;

import com.shoppingcart.account.Bidder;
import com.shoppingcart.model.Item;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.2.v20151217-rNA", date="2017-06-03T12:02:54")
@StaticMetamodel(Bid.class)
public class Bid_ { 

    public static volatile SingularAttribute<Bid, Item> item;
    public static volatile SingularAttribute<Bid, Bidder> bidder;
    public static volatile SingularAttribute<Bid, Date> bidDate;
    public static volatile SingularAttribute<Bid, Long> id;
    public static volatile SingularAttribute<Bid, BigDecimal> bidPrice;

}