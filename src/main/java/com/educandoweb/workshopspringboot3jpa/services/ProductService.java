package com.educandoweb.workshopspringboot3jpa.services;

import com.educandoweb.workshopspringboot3jpa.entities.Product;
import com.educandoweb.workshopspringboot3jpa.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product findProductById(Long id) {
        return productRepository.findById(id).get();
    }

    public List<Product> findProducts() {
        return productRepository.findAll();
    }
}
