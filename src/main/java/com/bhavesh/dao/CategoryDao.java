package com.bhavesh.dao;

import java.util.List;

import com.bhavesh.model.Category;

public interface CategoryDao {
	
	public void addCategory(Category category);
	public void updateCategory(Category category);
	public void deleteCategory(Category category);
	public List<Category> getAllCategorys();
	public Category getCategoryById(int category_id);
	public Category getCategoryByName(String category_name);

}
