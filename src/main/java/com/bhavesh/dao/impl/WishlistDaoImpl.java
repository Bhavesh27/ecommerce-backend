package com.bhavesh.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bhavesh.dao.WishlistDao;
import com.bhavesh.model.Wishlist;

@Repository(value="wishlistDao")
@Transactional
public class WishlistDaoImpl implements WishlistDao {

	@Autowired
	SessionFactory sessionFactory;
	
	
	public void addWishlist(Wishlist wishlist) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(wishlist);
		
	}

	
	public void updateWishlist(Wishlist wishlist) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(wishlist);
	}

	
	public boolean deleteWishlist(Wishlist wishlist) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(wishlist);
		return false;
	}

	/*@SuppressWarnings("unchecked")
	@Override
	public List<Wishlist> getWishlistItems(String username) {
		// TODO Auto-generated method stub
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Wishlist.class);
		criteria.add(Restrictions.like("username", username));
		return (List<Wishlist>) criteria.list();
	}*/

	
	public Wishlist getWishlist(int wishlist_id) {
		// TODO Auto-generated method stub
		return (Wishlist) sessionFactory.getCurrentSession().get(Wishlist.class, wishlist_id);
	}

	@SuppressWarnings("unchecked")
	public List<Wishlist> getWishlistItems(int user_id) {
		// TODO Auto-generated method stub
		return (List<Wishlist>) sessionFactory.getCurrentSession().createQuery("from Wishlist where user_id = " + user_id).list();
	}

}
