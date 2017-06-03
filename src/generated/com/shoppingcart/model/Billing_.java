package com.shoppingcart.model;

import com.shoppingcart.account.Address;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.2.v20151217-rNA", date="2017-06-03T12:02:54")
@StaticMetamodel(Billing.class)
public class Billing_ { 

    public static volatile SingularAttribute<Billing, String> expiryDate;
    public static volatile SingularAttribute<Billing, Address> address;
    public static volatile SingularAttribute<Billing, String> secretCode;
    public static volatile SingularAttribute<Billing, String> accountNumber;
    public static volatile SingularAttribute<Billing, Long> userId;

}