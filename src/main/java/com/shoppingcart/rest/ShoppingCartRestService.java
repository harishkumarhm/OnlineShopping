package com.shoppingcart.rest;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.shoppingcart.buslogic.ItemManager;
import com.shoppingcart.buslogic.ItemManagerImpl;
import com.shoppingcart.model.Item;

@Path("/ItemService")
public class ShoppingCartRestService {
	
	@EJB
	ItemManager item;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/test")
	public String test()
	{
		return "hi";
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/itemName")
	public String itemName()
	{
		
		return item.getItemName();
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/item")
	public Item item()
	{
		
		return (Item) item.fidItemById(1L);
	}

}
