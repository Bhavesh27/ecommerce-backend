package com.bhavesh.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bhavesh.dao.OrderDao;
import com.bhavesh.model.CustomerOrder;

@Repository(value="orderDao")
@Transactional
public class OrderDaoImpl implements OrderDao{
	
	@Autowired
	SessionFactory sessionFactory;

	
	public void addOrder(CustomerOrder order) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(order);
	}

	
	public CustomerOrder getOrder(int orderId) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(CustomerOrder.class,orderId);
	}

	
	public void updateOrder(CustomerOrder custOrder) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(custOrder);
	}

	
	public boolean deleteOrder(CustomerOrder custOrder) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(custOrder);
		return false;
	}

}
