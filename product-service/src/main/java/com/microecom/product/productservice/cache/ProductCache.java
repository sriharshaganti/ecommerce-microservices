package com.microecom.product.productservice.cache;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.microecom.product.productservice.domain.Product;
import com.microecom.product.productservice.repository.ProductRepository;

@Component
public class ProductCache {
	@Autowired
	ProductRepository productRepository;
	
	@Cacheable(value = "productCache", key = "#displayName")
	public Product getProduct(String displayName){
		return productRepository.findByDisplayName(displayName);
		
	}
	
	@Cacheable(value = "allCache")
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

}
