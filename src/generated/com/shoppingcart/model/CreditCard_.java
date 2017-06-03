package com.shoppingcart.model;

import com.shoppingcart.account.BillingInfo_;
import com.shoppingcart.model.CreditCardType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.2.v20151217-rNA", date="2017-06-03T12:02:54")
@StaticMetamodel(CreditCard.class)
public class CreditCard_ extends BillingInfo_ {

    public static volatile SingularAttribute<CreditCard, String> expirationYear;
    public static volatile SingularAttribute<CreditCard, String> nameOnCard;
    public static volatile SingularAttribute<CreditCard, String> securityCode;
    public static volatile SingularAttribute<CreditCard, Long> creditCardId;
    public static volatile SingularAttribute<CreditCard, String> expirationMonth;
    public static volatile SingularAttribute<CreditCard, CreditCardType> creditCardType;
    public static volatile SingularAttribute<CreditCard, String> accountNumber;

}