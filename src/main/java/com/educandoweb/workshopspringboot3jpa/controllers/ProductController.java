package com.educandoweb.workshopspringboot3jpa.controllers;

import com.educandoweb.workshopspringboot3jpa.entities.Product;
import com.educandoweb.workshopspringboot3jpa.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findProductByIdController(@PathVariable Long id) {
        return ResponseEntity.ok().body(productService.findProductById(id));
    }

    @GetMapping
    public ResponseEntity<List<Product>> findProductsController() {
        return ResponseEntity.ok().body(productService.findProducts());
    }
}
