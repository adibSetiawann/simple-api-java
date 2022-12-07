package com.simple_api.models.repos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.simple_api.models.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Long> {

    @Query("SELECT c from product WHERE qty  > 0")
    List<Product> findAvailableProducts(Integer name);

}
