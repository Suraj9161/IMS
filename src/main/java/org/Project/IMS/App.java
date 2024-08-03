package org.Project.IMS;

import java.util.List;

import com.Dao.IMS.CategoryDao;
import com.Dao.IMS.ProductDao;
import com.entites.IMS.Category;
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

		// Fetch and display data
		List<Product> products = productDao.findAll();
		for (Product p : products) {
			System.out.println(p.getName() + " - " + p.getCategory().getName());
		}
	}
}
