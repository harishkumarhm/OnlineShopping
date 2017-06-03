package com.shoppingcart.buslogic;

import java.util.List;

import javax.ejb.Local;



import com.shoppingcart.model.Category;
import com.shoppingcart.model.Item;

@Local
public interface ItemManager {
	public Item fidItemById(Long Id);
	
	public List<Item> getItemsByCategory();
	public List<Category> getAllCategory();
	public void Save(Item item);
	public String getItemName();

}
