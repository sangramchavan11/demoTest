package com.jpa.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.test.Entity.Category

;
@Repository
public interface CategoryRepository  extends JpaRepository<Category, Integer>{

}
