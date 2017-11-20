package com.microecom.product.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microecom.product.productservice.cache.ProductCache;
import com.microecom.product.productservice.domain.Product;

@RestController
@RequestMapping("/rest/products")
public class ProductController {

	@Autowired
	private ProductCache productCache;
	
	@GetMapping("/all/{displayName}")
	public Product getProduct(@PathVariable String displayName ){
		return productCache.getProduct(displayName);
	}
	
	@GetMapping("/all")
	public List<Product> getAllProducts(){
		return productCache.getAllProducts();
	}

}
