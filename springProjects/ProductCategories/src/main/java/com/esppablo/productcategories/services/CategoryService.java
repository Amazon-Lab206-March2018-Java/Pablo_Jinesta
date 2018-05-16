package com.esppablo.productcategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.esppablo.productcategories.models.Category;
import com.esppablo.productcategories.models.Product;
import com.esppablo.productcategories.repositories.CategoryRepository;

@Service
public class CategoryService {
	private CategoryRepository categoryRepository;
	
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	// return all categories
	public List<Category> allCategories(){
		return categoryRepository.findAll();
	}
	
	// add new Category
	public void addCategory(Category category) {
		categoryRepository.save(category);
	}
	
	// add product to category
	public void addCategoryProduct(Product product, Category category) {
		List<Product> categoryProduct = category.getProducts();
		categoryProduct.add(product);
		category.setProducts(categoryProduct);
		categoryRepository.save(category);
	}
	
	// return category
	public Category findCategoryByID(Long id) {
		return categoryRepository.findById(id).get();
	}
	
	
}
