package com.haefliger.estoque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haefliger.estoque.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
