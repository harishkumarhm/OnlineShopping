package com.shoppingcart.buslogic;

import java.util.List;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.shoppingcart.model.Category;
import com.shoppingcart.model.Item;

@Stateless
public class ItemManagerImpl implements ItemManager {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Item fidItemById(Long Id) {
		// TODO Auto-generated method stub
		return (Item)entityManager.find(Item.class, Id);
	}

	@Override
//	@GET
//	@Produces("application/xml")
	public List<Item> getItemsByCategory() {
		TypedQuery<Item> items = entityManager.createNamedQuery("Items.findAll", Item.class);
		return items.getResultList();
	}
	
	public String getItemName()
	{
		TypedQuery<Item> items = entityManager.createNamedQuery("Items.findAll", Item.class);
		return items.getResultList().get(0).getItemName().toString();
	}
	
	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		TypedQuery<Category> query = entityManager.createNamedQuery("Categories.findAll", Category.class);
		return query.getResultList();
				
	}
	@Override
	public void Save(Item item) {
		// TODO Auto-generated method stub
		entityManager.merge(item);
		
	}
	
	


}
