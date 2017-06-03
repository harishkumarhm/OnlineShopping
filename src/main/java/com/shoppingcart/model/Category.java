package com.shoppingcart.model;

import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: Category
 *
 */
@Entity
@Table(name = "CATEGORIES")
@NamedQueries({
	@NamedQuery(name="Items.byCategory", query="select c.items from Category c where c.categoryId=:categoryId"),
	@NamedQuery(name="Categories.findAll", query="select c from Category c order by c.categoryId")
})
public class Category implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SequenceGenerator(name = "CATEGORY_SEQ_GEN", sequenceName = "CATEGORY_SEQ", initialValue = 1, allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CATEGORY_SEQ_GEN")
    @Column(name = "CATEGORY_ID", nullable = false)
    private Long categoryId;

    @Column(name = "CATEGORY_NAME")
    private String categoryName;

    @Column(name = "CREATE_DATE", insertable = false, updatable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date createDate;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "CATEGORIES_ITEMS", joinColumns = @JoinColumn(name = "CI_CATEGORY_ID", referencedColumnName = "CATEGORY_ID"), inverseJoinColumns = @JoinColumn(name = "CI_ITEM_ID", referencedColumnName = "ITEM_ID"))
    private Set<Item> items;

    @ManyToOne
    @JoinColumn(name = "PARENT_ID", referencedColumnName = "CATEGORY_ID")
    private Category parentCategory;

    /**
     * Sub-categories
     */
    @OneToMany(cascade = CascadeType.PERSIST)
    private Set<Category> subCategories = new HashSet<Category>();

    /**
     * Keywords associated with this category
     */
    @ElementCollection
    @CollectionTable(name ="keywords")
    private Set<String> keywords = new HashSet<String>();

    /**
     * Default constructor
     */
    public Category() {
        // constructor used for JPA
    }

    /**
     * Creates a new category with 
     * @param categoryName - category name
     * @param keywords - keywords associated with the category
     */
    public Category(String categoryName, String[] keywords) {
        this.categoryName = categoryName;
        Collections.addAll(this.keywords, keywords);

    }


    public Category(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() {
        return categoryId;
    }


    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    public Item addItem(Item item) {
        getItems().add(item);
        item.addCategory(this);
        return item;
    }

    public Item removeItem(Item item) {
        getItems().remove(item);
        item.setCategory(null);
        return item;
    }

    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public Set<Category> getSubCategories() {
        return subCategories;
    }

    public void setCategorySet(Set<Category> subCategories) {
        this.subCategories = subCategories;
    }

    public Category addCategory(Category category) {
        subCategories.add(category);
        category.setParentCategory(this);
        return category;
    }

    public Category removeCategory(Category category) {
        subCategories.remove(category);
        category.setParentCategory(null);
        return category;
    }

    @Override
    public String toString() {
        return categoryName;
    }
}
