package com.projectspring.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspring.coursespring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
