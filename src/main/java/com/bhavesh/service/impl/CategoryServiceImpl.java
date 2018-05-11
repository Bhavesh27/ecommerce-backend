package com.bhavesh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bhavesh.dao.CategoryDao;
import com.bhavesh.model.Category;
import com.bhavesh.service.CategoryService;

@Service (value="categoryService")
@Transactional
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryDao categoryDao;

	
	public void addCategory(Category category) {
		// TODO Auto-generated method stub
		categoryDao.addCategory(category);
	}

	
	public void updateCategory(Category category) {
		// TODO Auto-generated method stub
		categoryDao.updateCategory(category);
	}

	
	public void deleteCategory(Category category) {
		// TODO Auto-generated method stub
		categoryDao.deleteCategory(category);
	}

	
	public List<Category> getAllCategorys() {
		// TODO Auto-generated method stub
		return categoryDao.getAllCategorys();
	}

	
	public Category getCategoryById(int category_id) {
		// TODO Auto-generated method stub
		return categoryDao.getCategoryById(category_id);
	}

}
