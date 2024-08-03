package org.Project.IMS;

import java.util.Date;
import java.util.List;

import com.Dao.IMS.CategoryDao;
import com.Dao.IMS.CustomerDao;
import com.Dao.IMS.OrderDao;
import com.Dao.IMS.ProductDao;
import com.entites.IMS.Category;
import com.entites.IMS.Customer;
import com.entites.IMS.Order;
import com.entites.IMS.Product;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Inventory Management System");
		CategoryDao categoryDao = new CategoryDao();
		ProductDao productDao = new ProductDao();
		CustomerDao customerDao=new CustomerDao();
		OrderDao orderDao=new OrderDao();		

		// Sample data
		Category category = new Category();
		category.setName("Electronics");
		category.setDescription("Electronic items");
		categoryDao.save(category);

		Product product = new Product();
		product.setName("Laptop");
		product.setPrice(1000);
		product.setQuantity(10);
		product.setCategory(category);
		productDao.save(product);
		
		Customer customer=new Customer();
		customer.setName("Suraj");
		customer.setContactInfo("9161974218");
		customerDao.save(customer);
		
		
		Order order=new Order();
		order.setorderdate(new Date());
		order.setCustomer(customer);
		orderDao.save(order);
		
		// fetch and display data
		 List<Order> orders = orderDao.findAll();
	        for (Order o : orders) {
	            System.out.println("Order ID: " + o.getId() + ", Order Date: " + o.getorderdate() + ", Customer: " + o.getCustomer().getName());
	        }
		
		

		// Fetch and display data
		List<Product> products = productDao.findAll();
		for (Product p : products) {
			System.out.println(p.getName() + " - " + p.getCategory().getName());
		}
	}
}
