package com.example.springbootpostgresqlcrud.repository;

import com.example.springbootpostgresqlcrud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}