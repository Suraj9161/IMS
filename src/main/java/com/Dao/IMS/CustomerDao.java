package com.Dao.IMS;

import com.entites.IMS.Customer;
import com.entites.IMS.Product;

public  class CustomerDao extends AbstractDao<Customer, Long> {
	
	public CustomerDao() {
		super(Customer.class);
	}
}
