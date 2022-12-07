package com.simple_api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple_api.models.entities.Product;
import com.simple_api.models.repos.ProductRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public Product save(Product product) {
        return productRepo.save(product);
    }
    
    public Product update(Product product) {
        return productRepo.save(product);
    }

    public Product finfById(Long id) {
        Optional<Product> product = productRepo.findById(id);
        if (!product.isPresent()) {
            return null;
        }
        return product.get();
    }

    public Iterable<Product> findAll() {
        return productRepo.findAll();
    }

    public void removeProduct(Long id) {
        productRepo.deleteById(id);
    }

    public List<Product> findAvailableProducts(Integer name) {
        return productRepo.findAvailableProducts(name);
    }
}
