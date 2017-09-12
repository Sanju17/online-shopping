package org.sangharsha.shoppingbackend.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.sangharsha.shoppingbackend.dao.CategoryDAO;
import org.sangharsha.shoppingbackend.dto.Category;
import org.springframework.stereotype.Repository;

@Repository(value="categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();
		// adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some Description for Televison.");
		category.setImageUrl("CAT_1.png");

		categories.add(category);

		// second category
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some Description for Mobile.");
		category.setImageUrl("CAT_2.png");

		categories.add(category);

		// second category
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some Description for Laptop.");
		category.setImageUrl("CAT_3.png");

		categories.add(category);
	}

	@Override
	public List<Category> list() {

		return categories;
	}

	@Override
	public Category get(int id) {
		for(Category category: categories) {
			if(category.getId() == id) return category;
		}
		return null;
	}

}
