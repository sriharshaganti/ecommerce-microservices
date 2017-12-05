package com.microecom.product.productservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microecom.product.productservice.domain.PC9Product;

public interface ProductRepository extends MongoRepository<PC9Product, String> {
	
	 List<PC9Product> findByProductDescription(String productDescription);
	 
	 List<PC9Product> findByProductCode(String productCode);
	
 
}
