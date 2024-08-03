package com.Dao.IMS;

import com.entites.IMS.Product;

public class ProductDao extends AbstractDao<Product, Long> {
	   public ProductDao() {
	        super(Product.class);
	    }
}
