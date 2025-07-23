package com.projectspring.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspring.coursespring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
