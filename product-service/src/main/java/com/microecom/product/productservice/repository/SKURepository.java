package com.microecom.product.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microecom.product.productservice.domain.Sku;

public interface SKURepository extends MongoRepository<Sku, String> {

}
