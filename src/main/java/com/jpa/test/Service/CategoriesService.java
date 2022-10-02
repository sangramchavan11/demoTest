package com.jpa.test.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.test.Entity.Category;
import com.jpa.test.Entity.Products;
import com.jpa.test.Repository.CategoryRepository;
import com.jpa.test.Repository.ProductRepository;

@Service
public class CategoriesService implements CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	 private ProductRepository productRepository;

	@Override
	public List<Category> getCatagory() {
		return categoryRepository.findAll();
		
	}

	@Override
	public Category findCatogoryId(Integer categoryId) {

		return categoryRepository.getReferenceById(categoryId);
	}

	@Override
	public void deleteCategory(Integer categoryId) {
     categoryRepository.deleteById(categoryId);
		
	}

	@Override
	public Category updateCatogory(Category category) {
		
		return  categoryRepository.save(category);
	}

	@Override
	public Category addCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}

	@Override
	public List<Products> getProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Products findProductsId(Integer id) {
		// TODO Auto-generated method stub
		return productRepository.getReferenceById(id);
	}

	@Override
	public Products addProducts(Products products) {
	
		return productRepository.save(products);
	}

	@Override
	public Products updateProducts(Products products) {
		
		return productRepository.save(products);
	}

	@Override
	public void deleteProducts(Integer id) {
		productRepository.deleteById(id);
		
	}
	

}
