package com.entites.IMS;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Supplier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "supp_name")
	private String name;
	private String contactinfo;
	
	@ManyToMany(mappedBy = "suppliers")
	private List<Product> products;

	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Supplier(String name, String contactinfo, List<Product> products) {
		super();
		this.name = name;
		this.contactinfo = contactinfo;
		this.products = products;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactinfo() {
		return contactinfo;
	}

	public void setContactinfo(String contactinfo) {
		this.contactinfo = contactinfo;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Supplier [id=" + id + ", name=" + name + ", contactinfo=" + contactinfo + ", products=" + products
				+ "]";
	}
	
}
