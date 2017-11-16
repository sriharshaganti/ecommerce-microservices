package com.microecom.product.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microecom.product.productservice.domain.Image;

public interface ImageRepository extends MongoRepository<Image, String> {

}
