package com.jpa.test.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.Entity.Category;
import com.jpa.test.Entity.Products;
import com.jpa.test.Service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping(value = "/api/categories")
	public List<Category> GetCatagary() {
		List<Category> catagoryList = categoryService.getCatagory();
		return catagoryList;

	}

	@GetMapping(value = "/api/categories/{categoryId}")
	public Category getCategoryes(@PathVariable("categoryId") Integer categoryId) {
		return categoryService.findCatogoryId(categoryId);
	}

	@PostMapping(value = "/api/categories")
	public Category addCatagary(@RequestBody Category category) {
		return categoryService.addCategory(category);

	}

	@PutMapping(value = "/api/categories")
	public Category updateCatogory(@RequestBody Category category) {
		return categoryService.updateCatogory(category);

	}

	@DeleteMapping(value = "/api/categories/{categoryId}")
	public String removeCatogory(@PathVariable("categoryId") Integer categoryId) {
		categoryService.deleteCategory(categoryId);
		String respMessage = "Record Delete Successfully";
		return respMessage;

	}
	@GetMapping(value = "/api/products")
	public List<Products> getProducts() {
		List<Products> productsList = categoryService.getProducts();
		return productsList;

	}

	@GetMapping(value = "/api/products/{id}")
	public Products getProducts(@PathVariable("id") Integer id) {
		return categoryService.findProductsId(id);
	}

	@PostMapping(value = "/api/products")
	public Products addProducts(@RequestBody Products products) {
		return categoryService.addProducts(products);

	}

	@PutMapping(value = "/api/products")
	public Products updateProducts(@RequestBody Products products) {
		return categoryService.updateProducts(products);

	}

	@DeleteMapping(value = "/api/products/{id}")
	public String removeProducts(@PathVariable("id") Integer id) {
		categoryService.deleteProducts(id);
		String respMessage = "Record Delete Successfully";
		return respMessage;

	}
}
