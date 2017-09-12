package org.sangharsha.shoppingbackend.dao;

import java.util.List;

import org.sangharsha.shoppingbackend.dto.Category;

public interface CategoryDAO {
	List<Category> list();

	Category get(int id);
}
