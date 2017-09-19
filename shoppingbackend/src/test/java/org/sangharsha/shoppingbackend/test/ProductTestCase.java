package org.sangharsha.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.sangharsha.shoppingbackend.dao.ProductDAO;
import org.sangharsha.shoppingbackend.dto.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductTestCase {
	private static AnnotationConfigApplicationContext context;
	private static ProductDAO productDAO;
	private Product product;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("org.sangharsha.shoppingbackend");
		context.refresh();
		
		productDAO = (ProductDAO) context.getBean("productDAO");
	}
	
	/*@Test
	public void testForCRUDOpertion() {
		product = new Product();
		
		// Create a new Product
		product.setName("Oppo Selfie s53");
		product.setBrand("Oppo");
		product.setDescription("This is some description for oppo mobile phone!");
		product.setUnitPrice(25000);
		product.setActive(true);
		product.setCategoryId(3);
		product.setSupplierId(3);
		
		assertEquals("Something went wrong while inserting a new product!", true, productDAO.add(product));
		
		// reading and updating product
		product = productDAO.get(2);
		product.setName("Samsung Galaxy S7");
		assertEquals("Something went wrong while updating a new product!", true, productDAO.update(product));
		assertEquals("Something went wrong while deleting a new product!", true, productDAO.delete(product));
		
		//list
		assertEquals("Something went wrong while fetching the list of product!", 6, productDAO.list().size());
	}*/
	
	
	/*@Test
	public void testListActiveProducts() {
		assertEquals("Something went wrong while fetching the list of product!", 5, productDAO.listActiveProducts().size());
	}*/
	
	
	/*@Test
	public void testListActiveProductsByCategory() {
		assertEquals("Something went wrong while fetching the list of product!", 3, productDAO.listActiveProductsByCategory(3).size());
		assertEquals("Something went wrong while fetching the list of product!", 2, productDAO.listActiveProductsByCategory(1).size());
	}*/
	
	
	/*@Test
	public void testGetLastestActiveProduct() {
		assertEquals("Something went wrong while fetching the list of product!", 3, productDAO.listLastestActiveProducts(3).size());
	}*/
}
