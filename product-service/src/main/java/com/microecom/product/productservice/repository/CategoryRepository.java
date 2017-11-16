package com.microecom.product.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microecom.product.productservice.domain.Category;

public interface CategoryRepository extends MongoRepository<Category, String> {

}
