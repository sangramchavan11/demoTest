package com.jpa.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.test.Entity.Products;
@Repository
public interface ProductRepository  extends JpaRepository<Products, Integer>{

}
