package com.simple_api.models.repos;

import org.springframework.data.repository.CrudRepository;

import com.simple_api.models.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Long> {

}
