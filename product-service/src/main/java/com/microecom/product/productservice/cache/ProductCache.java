package com.microecom.product.productservice.cache;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.microecom.product.productservice.domain.PC9Product;
import com.microecom.product.productservice.repository.ProductRepository;

@Component
public class ProductCache {
	@Autowired
	ProductRepository productRepository;
	
	@Cacheable(value = "allCache")
	public List<PC9Product> getAllProducts() {
		return productRepository.findAll();
	}
	
	@Cacheable(value = "productDescription", key = "#productDescription")
	public List<PC9Product> getProductDetailsByDescription(String productDescription) {
		return productRepository.findByProductDescription(productDescription);
	}
	
	@Cacheable(value = "productCode", key = "#productCode")
	public List<PC9Product> getProductCode(String productCode) {
		return productRepository.findByProductDescription(productCode);
	}

}
