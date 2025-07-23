package com.projectspring.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspring.coursespring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	

}
