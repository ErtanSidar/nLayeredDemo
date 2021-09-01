package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.concretes.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {
	
	public static void main(String[] args) {
		ProductService productService = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
		Product product = new Product(2,2," Laptop",5000.0,10);
		productService.add(product);
	}

}
