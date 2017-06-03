package com.shoppingcart.account;

import com.shoppingcart.account.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.2.v20151217-rNA", date="2017-06-03T12:02:54")
@StaticMetamodel(Group.class)
public class Group_ { 

    public static volatile SingularAttribute<Group, String> groupId;
    public static volatile SingularAttribute<Group, Long> userId;
    public static volatile SingularAttribute<Group, User> user;
    public static volatile SingularAttribute<Group, String> username;

}