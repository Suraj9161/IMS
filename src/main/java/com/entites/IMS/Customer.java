package com.entites.IMS;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String contactInfo;
	    
	    @OneToMany(mappedBy = "customer")
	    private List<Order> orders;

	    
	    
	    
	    
	    
	

		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Customer(String name, String contactInfo, List<Order> orders) {
			super();
			this.name = name;
			this.contactInfo = contactInfo;
			this.orders = orders;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getContactInfo() {
			return contactInfo;
		}

		public void setContactInfo(String contactInfo) {
			this.contactInfo = contactInfo;
		}

		public List<Order> getOrders() {
			return orders;
		}

		public void setOrders(List<Order> orders) {
			this.orders = orders;
		}
		
		@Override
		public String toString() {
			return "Customer [id=" + id + ", name=" + name + ", contactInfo=" + contactInfo + ", orders=" + orders
					+ "]";
		}
	    
	    
}
