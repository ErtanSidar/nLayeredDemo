package nLayeredDemo.business.concretes;

import java.util.List;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.abstracts.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{
	
	private ProductDao productDao;
	private LoggerService loggerService;
	
	
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		this.productDao=productDao;
		this.loggerService=loggerService;
	}

	@Override
	public void add(Product product) {
		if(product.getCategoryId()==1) {
			System.out.println("It does not accepted product in this category");
			return;
		}
		this.loggerService.logToSystem("Added product "+product.getName());
		this.productDao.add(product);
		
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
