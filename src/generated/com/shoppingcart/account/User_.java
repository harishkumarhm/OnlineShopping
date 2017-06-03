package com.shoppingcart.account;

import com.shoppingcart.account.Address;
import com.shoppingcart.account.Group;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.2.v20151217-rNA", date="2017-06-03T12:02:54")
@StaticMetamodel(User.class)
public abstract class User_ { 

    public static volatile SingularAttribute<User, String> lastName;
    public static volatile SingularAttribute<User, Address> address;
    public static volatile SingularAttribute<User, Date> created;
    public static volatile SetAttribute<User, Group> groups;
    public static volatile SingularAttribute<User, Long> userId;
    public static volatile SingularAttribute<User, Date> birthDate;
    public static volatile SingularAttribute<User, byte[]> picture;
    public static volatile SingularAttribute<User, String> firstName;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, Boolean> guest;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, Boolean> accountVerified;
    public static volatile SingularAttribute<User, String> username;

}