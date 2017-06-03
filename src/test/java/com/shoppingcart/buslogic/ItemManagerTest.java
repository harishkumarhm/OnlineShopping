package com.shoppingcart.buslogic;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;










import com.shoppingcart.model.Item;

@RunWith(Arquillian.class)
public class ItemManagerTest {

	@Deployment
	public static Archive<?> createDeployment() {		
	WebArchive jar = ShrinkWrap
			.create(WebArchive.class, "test.war")
				.addPackages(true, "com.shoppingcart.account")				
				.addPackages(true, "com.shoppingcart.buslogic")
				.addPackages(true, "com.shoppingcart.model")
				
				.addAsResource("META-INF/test-persistence.xml",
					"META-INF/persistence.xml")
		.addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
		System.out.println(jar.toString(true));
		return jar;

}
	
	
	/*@Deployment
	public static Archive<?> createDeployment() {
		WebArchive jar = ShrinkWrap
				.create(WebArchive.class,"test.war")
				.addPackages(true, Item.class.getPackage())
				.addPackages(true, "com.shoppingcart.account")
				.addPackages(true, "com.shoppingcart.buslogic")
				.addPackages(true, "com.shoppingcart.model")
				.deleteClass(ItemManagerImpl2.class)
				.addAsResource("META-INF/test-persistence.xml",
						"META-INF/persistence.xml")
			.addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
	System.out.println(jar.toString(true));
		return jar;

	}*/

	@Inject
	ItemManager im;
	
	Item item;
//	
	@Inject
	UserTransaction utx;
	
	@Before
	public void setUp()
	{
		
		item = new Item();
		item.setItemId(1L);
		item.setBidEndDate(new Date());
		item.setBidStartDate(new Date());
		item.setInitialPrice(new BigDecimal(120));
		item.setItemName("test H2");
		item.setSeller(null);
		
		
	}

	@Test
	public void testFidItemById() {
		Item item = im.fidItemById("1");
		System.out.println("Item: " + item.getItemName());
	}

	@Test
	public void testGetAllItems() throws SecurityException, IllegalStateException, NotSupportedException, SystemException, RollbackException, HeuristicMixedException, HeuristicRollbackException {
		//utx.begin();
		im.Save(item);	
		//utx.commit();
		List<Item> items = im.getItemsByCategory();
		assertNotNull(items);
		System.out.println("Item: " + items.get(0).getItemName());
	}

	@Test
	public void testGetItemsByCategory() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllCategory() {
		// List<Category> categories = im.getAllCategory();
		// System.out.println(categories.get(0));
	}

	@Test
	public void testSave() {
		/*im.Save(item);
		List<Item> items = im.getItemsByCategory("1");
		assertNotNull(items);
		System.out.println("Item: " + items.get(0).getItemName());*/
	}

}
