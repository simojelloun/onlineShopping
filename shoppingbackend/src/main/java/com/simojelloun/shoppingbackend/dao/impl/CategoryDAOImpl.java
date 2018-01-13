package com.simojelloun.shoppingbackend.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.simojelloun.shoppingbackend.dao.CategoryDAO;
import com.simojelloun.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categoriesList = new ArrayList<Category>();
	
	static {
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Television");
		category1.setDescription("Description of television");
		category1.setImageUrl("CAT_1.png");
		categoriesList.add(category1);
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Mobile");
		category2.setDescription("Description of mobile");
		category2.setImageUrl("CAT_2.png");
		categoriesList.add(category2);
		
		Category category3 = new Category();
		category3.setId(3);
		category3.setName("Laptop");
		category3.setDescription("Description of laptop");
		category3.setImageUrl("CAT_3.png");
		categoriesList.add(category3);
	}
	
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categoriesList;
	}

	public Category getCategoryById(int id) {
		for (Category category : categoriesList) {
			if(category.getId() == id) {
				return category;
			}
		}
		return null;
	}

}
