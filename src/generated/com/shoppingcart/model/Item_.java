package com.shoppingcart.model;

import com.shoppingcart.account.Seller;
import com.shoppingcart.model.Bid;
import com.shoppingcart.model.Category;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.2.v20151217-rNA", date="2017-06-03T12:02:54")
@StaticMetamodel(Item.class)
public class Item_ { 

    public static volatile SingularAttribute<Item, Seller> seller;
    public static volatile SingularAttribute<Item, Long> itemId;
    public static volatile SingularAttribute<Item, String> itemName;
    public static volatile SingularAttribute<Item, Date> createdDate;
    public static volatile SingularAttribute<Item, Date> bidEndDate;
    public static volatile SingularAttribute<Item, BigDecimal> initialPrice;
    public static volatile ListAttribute<Item, Bid> bids;
    public static volatile SingularAttribute<Item, Date> bidStartDate;
    public static volatile SetAttribute<Item, Category> category;

}