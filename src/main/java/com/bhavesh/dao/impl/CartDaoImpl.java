package com.bhavesh.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bhavesh.dao.CartDao;
import com.bhavesh.model.Cart;

@Repository(value="cartDao")
@Transactional
public class CartDaoImpl implements CartDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public Cart getById(int id) {
		// TODO Auto-generated method stub
		return (Cart) sessionFactory.getCurrentSession().get(Cart.class, id);
	}

	
	public void Update(Cart cart) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(cart);
	}

	
	public void delete(Cart cart) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(cart);
	}

	public int getTotalAmount(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void addToCart(Cart cart) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(cart);
	}

	@SuppressWarnings("unchecked")
	public List<Cart> list(int user_id) {
		// TODO Auto-generated method stub
		return (List<Cart>) sessionFactory.getCurrentSession().createQuery("from Cart where user_id = " + user_id).list();
	}

	/*@SuppressWarnings("unchecked")
	@Override
	public List<Cart> list(String username) {
		// TODO Auto-generated method stub
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Cart.class);
		criteria.add(Restrictions.like("username", username));
		return (List<Cart>) criteria.list();
	}*/

}
