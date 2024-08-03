package com.Dao.IMS;

import com.entites.IMS.Order;

public class OrderDao extends AbstractDao<Order, Long> {
	
	public OrderDao() {
		super(Order.class);
	}
}
