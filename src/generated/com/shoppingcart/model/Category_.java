package com.shoppingcart.model;

import com.shoppingcart.model.Category;
import com.shoppingcart.model.Item;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.2.v20151217-rNA", date="2017-06-03T12:02:54")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SetAttribute<Category, String> keywords;
    public static volatile SingularAttribute<Category, Category> parentCategory;
    public static volatile SingularAttribute<Category, String> categoryName;
    public static volatile SetAttribute<Category, Item> items;
    public static volatile SingularAttribute<Category, Long> categoryId;
    public static volatile SetAttribute<Category, Category> subCategories;
    public static volatile SingularAttribute<Category, Date> createDate;

}