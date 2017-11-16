package com.microecom.product.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microecom.product.productservice.domain.Catalog;

public interface CatalogRepository extends MongoRepository<Catalog, String> {
	
	public Catalog findByDisplayName(String displayName);

}
