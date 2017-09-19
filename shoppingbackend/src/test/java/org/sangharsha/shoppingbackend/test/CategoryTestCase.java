package org.sangharsha.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.sangharsha.shoppingbackend.dao.CategoryDAO;
import org.sangharsha.shoppingbackend.dto.Category;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private Category category;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("org.sangharsha.shoppingbackend");
		context.refresh();
		
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		
	}
	
	/*@Test
	public void testAddCategory() {
		category = new Category();
		category.setName("Television");
		category.setDescription("This is some Description for Television.");
		category.setImageUrl("CAT_3.png");
		
		assertEquals("Successfully added a category inside the table!" , true, categoryDAO.add(category));
	}*/
	
	
	/*@Test
	public void testGetCategory() {
		category = categoryDAO.get(1);
		assertEquals("Successfully fetch a single category from the table!" , "Television", category.getName());
	}*/
	
	
	/*@Test
	public void testUpdateCategory() {
		category = categoryDAO.get(1);
		category.setName("TV");
		assertEquals("Successfully updated a category in the table!", true, categoryDAO.update(category));
	}*/
	
	
	/*@Test
	public void testDeleteCategory() {
		category = categoryDAO.get(1);
		assertEquals("Successfully updated a category in the table!", true, categoryDAO.delete(category));
	}*/
	
	
	/*@Test
	public void testDeleteCategory() {
		assertEquals("Successfully fetch the list of categories in the table!", 3, categoryDAO.list().size());
	}*/
	
	/*@Test
	public void testForCRUDOpertion() {
		
		//Add operation
		category = new Category();
		category.setName("Laptop");
		category.setDescription("This is some Description for Laptop.");
		category.setImageUrl("CAT_1.png");
		
		assertEquals("Successfully added a category inside the table!" , true, categoryDAO.add(category));
		
		category = new Category();
		category.setName("Television");
		category.setDescription("This is some Description for Television.");
		category.setImageUrl("CAT_2.png");
		
		assertEquals("Successfully added a category inside the table!" , true, categoryDAO.add(category));
		
		// Update Operation
		category = categoryDAO.get(2);
		category.setName("TV");
		assertEquals("Successfully updated a category in the table!", true, categoryDAO.update(category));
		
		// delete operation
		category = categoryDAO.get(1);
		assertEquals("Successfully updated a category in the table!", true, categoryDAO.delete(category));
		
		// Get all operation
		assertEquals("Successfully fetch the list of categories in the table!", 4, categoryDAO.list().size());
	}*/
}
