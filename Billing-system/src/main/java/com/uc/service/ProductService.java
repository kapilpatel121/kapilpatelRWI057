package com.uc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uc.entity.Product;
import com.uc.repo.ProductRepository;
@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Other service methods for stock management
}

