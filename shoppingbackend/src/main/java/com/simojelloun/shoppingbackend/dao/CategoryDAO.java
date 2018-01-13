package com.simojelloun.shoppingbackend.dao;

import java.util.List;

import com.simojelloun.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();

	Category getCategoryById(int id);
	
}
