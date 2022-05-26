package com.haefliger.estoque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haefliger.estoque.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
