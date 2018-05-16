package com.esppablo.productcategories.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.esppablo.productcategories.models.Category;
import com.esppablo.productcategories.models.Product;
import com.esppablo.productcategories.services.CategoryService;
import com.esppablo.productcategories.services.ProductService;

@Controller
public class AppController {
	
	// Services
	private final ProductService productService;
	private final CategoryService categoryService;
	
	// Constructor
	public AppController(ProductService productService, CategoryService categoryService) {
		this.productService = productService;
		this.categoryService = categoryService;
	}
	
	@RequestMapping("/")
	public String index() { 
		return "redirect:/products/new";
	}
	
	// Allow users to create a product
	@RequestMapping("/products/new")
	public String newProduct(@ModelAttribute("product") Product product) {
		return "newProduct";
	}
	
	@PostMapping("/products/new")
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "newProduct";
		} else {
			productService.addProduct(product);
			return "redirect:/products/new";
		}
	}
	
	// Allow users to create a new category
	@RequestMapping("/categories/new")
	public String newCategory(@ModelAttribute("category") Category category) {
		return "newCategory";
	}
	
	@PostMapping("/categories/new")
	public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if (result.hasErrors()) {
			return "newCategory";
		} else {
			categoryService.addCategory(category);
			return "redirect:/categories/new";
		}
	}
	
	// In the products show page, allow users to add a category to a specific product.
	@RequestMapping("/products/{id}")
	public String showProduct(@PathVariable("id") Long id, Model model) {
		Product product = productService.findProductByID(id);
		model.addAttribute("product", product);
		List<Category> categories = categoryService.allCategories();
		model.addAttribute("categories", categories);
		return "showProduct";
	}
	
	@PostMapping("/products/{id}/add_category")
	public String addProductCategory(@PathVariable("id") Long id, @RequestParam("categories") Long category_id) {
		Product product = productService.findProductByID(id);
		Category category = categoryService.findCategoryByID(category_id);
		productService.addProductCategory(category, product);
		System.out.println(id);
		return "redirect:/products/" + id;	
	}
	
	// In the categories show page, allow users to add a product to a specific category
	@RequestMapping("/categories/{id}")
	public String showCategory(@PathVariable("id") Long id, Model model) {
		Category category = categoryService.findCategoryByID(id);
		model.addAttribute("category", category);
		List<Product> products = productService.allProducts();
		model.addAttribute("products", products);
		return "showCategory";
	}
	
	@PostMapping("/categories/{id}/add_product")
	public String addCategoryProduct(@PathVariable("id") Long id, @RequestParam("products") Long product_id) {
		Category category = categoryService.findCategoryByID(id);
		Product product = productService.findProductByID(product_id);
		categoryService.addCategoryProduct(product, category);
		return "redirect:/categories/" + id;	
	}
}
