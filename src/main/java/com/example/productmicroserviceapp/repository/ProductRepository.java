package com.example.productmicroserviceapp.repository;

import com.example.productmicroserviceapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
