package com.example.productmicroserviceapp.service;

import com.example.productmicroserviceapp.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public List<Product> findAll();

    public Optional<Product> findById(Long id);

    public void deleteById(Long id);

    public Product save(Product product);

    public Product update(Product product);
}
