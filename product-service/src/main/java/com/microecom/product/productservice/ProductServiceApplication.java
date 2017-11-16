package com.microecom.product.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.microecom.product.productservice.repository.CatalogRepository;

@SpringBootApplication
public class ProductServiceApplication {

	@Autowired
	private CatalogRepository repository;
	
	public static void main(String[] args)  {
		SpringApplication.run(ProductServiceApplication.class, args);
	}
}
