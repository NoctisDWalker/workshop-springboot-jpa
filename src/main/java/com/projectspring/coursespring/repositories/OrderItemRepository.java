package com.projectspring.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspring.coursespring.entities.OrderItem;
import com.projectspring.coursespring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	

}
