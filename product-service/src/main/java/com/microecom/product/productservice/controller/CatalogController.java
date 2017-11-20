package com.microecom.product.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microecom.product.productservice.domain.Catalog;
import com.microecom.product.productservice.repository.CatalogRepository;

@RefreshScope
@RestController
@RequestMapping("/rest/catalogs")
public class CatalogController {
	
	@Value("${message}")
	private String message;
	
	@Autowired
	CatalogRepository catalogRepository;
	
	@GetMapping("/all/{displayName}")
	public Catalog getCatalog(@PathVariable String displayName ){
		return catalogRepository.findByDisplayName(displayName);
	}
	
	@GetMapping("/all")
	public List<Catalog> getAllCatalogs(){
		return catalogRepository.findAll();
	}
	
	@GetMapping(value ="/message")
	public String getMessage(){
		return message;
	}
}
