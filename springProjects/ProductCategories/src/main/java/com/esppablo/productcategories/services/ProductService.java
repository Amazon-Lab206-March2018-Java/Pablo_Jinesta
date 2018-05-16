package com.esppablo.productcategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.esppablo.productcategories.models.Category;
import com.esppablo.productcategories.models.Product;
import com.esppablo.productcategories.repositories.ProductRepository;

@Service
public class ProductService {
	private ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	// return all products
	public List<Product> allProducts(){
		return productRepository.findAll();
	}
	
	// add new Product
	public void addProduct(Product product) {
		productRepository.save(product);
	}
	
	// add category to product
	public void addProductCategory(Category category, Product product) {
		List<Category> productCategory = product.getCategories();
		productCategory.add(category);
		product.setCategories(productCategory);
		productRepository.save(product);
	}
	
	// return Product
	public Product findProductByID(Long id) {
		return productRepository.findById(id).get();
	}
	
}
