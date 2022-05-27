package com.haefliger.estoque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haefliger.estoque.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
