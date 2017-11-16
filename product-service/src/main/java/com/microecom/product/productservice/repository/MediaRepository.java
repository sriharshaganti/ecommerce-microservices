package com.microecom.product.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microecom.product.productservice.domain.Media;

public interface MediaRepository extends MongoRepository<Media, String> {

}
