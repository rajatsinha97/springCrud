package com.example.rajat.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.rajat.springboot.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
