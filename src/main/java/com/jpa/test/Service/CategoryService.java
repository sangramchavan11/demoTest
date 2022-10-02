package com.jpa.test.Service;

import java.util.List;


import com.jpa.test.Entity.Category;
import com.jpa.test.Entity.Products;


public interface CategoryService {

	public List<Category> getCatagory();

	public Category findCatogoryId(Integer categoryId);

	public void deleteCategory(Integer categoryId);

	public Category updateCatogory(Category category);

	public Category addCategory(Category category);

	public List<Products> getProducts();

	public Products findProductsId(Integer id);

	public Products addProducts(Products products);

	public Products updateProducts(Products products);

	public void deleteProducts(Integer id);

}
