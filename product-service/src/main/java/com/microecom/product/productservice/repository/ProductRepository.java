package com.microecom.product.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microecom.product.productservice.domain.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

	Product findByDisplayName(String displayName);

}
