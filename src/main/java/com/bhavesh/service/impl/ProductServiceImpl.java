package com.bhavesh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bhavesh.dao.ProductDao;
import com.bhavesh.model.Product;
import com.bhavesh.service.ProductService;

@Service (value="productService")
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;
	
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.addProduct(product);
	}

	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.updateProduct(product);
	}

	public void deleteProduct(Product product) {
		// TODO Auto-generated method stub
		 productDao.deleteProduct(product);
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAllProducts();
	}

	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return productDao.getProductById(id);
	}

	
	public List<Product> getProductByCategory(int categoryId) {
		// TODO Auto-generated method stub
		return productDao.getProductByCategory(categoryId);
	}

	
	public Product getProductByName(String productName) {
		// TODO Auto-generated method stub
		return productDao.getProductByName(productName);
	}

	
	public List<String> getProductListByName(String productName) {
		// TODO Auto-generated method stub
		return productDao.getProductListByName(productName);
	}

}
