package com.config.IMS;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateUtil {
	
	private static final EntityManagerFactory entityfactory;
	
	static {
		try {
		entityfactory=Persistence.createEntityManagerFactory("inventoryPU");
		}catch (Throwable e) {
			throw new ExceptionInInitializerError(e);
			
		}
	}
	public static EntityManagerFactory getEntityManagerFactory() {
		return entityfactory;
	}

}
