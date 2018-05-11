package com.bhavesh.dao;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;

import com.bhavesh.model.Cart;

public interface CartDao {

	public List<Cart> list(int user_id);
	public Cart getById(int id);
	public void Update(Cart Cart);
	public void delete(Cart cart);
	public int getTotalAmount(int id);
	
	@PreAuthorize("hasRole('USER')")
	public void addToCart(Cart cart);
	
}
