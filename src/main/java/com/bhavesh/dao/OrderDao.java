package com.bhavesh.dao;

import com.bhavesh.model.CustomerOrder;

public interface OrderDao {

	public void addOrder(CustomerOrder order);
	public CustomerOrder getOrder(int orderId);
	public void updateOrder(CustomerOrder custOrder);
	public boolean deleteOrder(CustomerOrder custOrder);
	
}
