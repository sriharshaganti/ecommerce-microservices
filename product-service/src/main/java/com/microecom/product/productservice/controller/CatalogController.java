package com.microecom.product.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microecom.product.productservice.cache.CatalogCache;
import com.microecom.product.productservice.domain.Catalog;

@RestController
@RequestMapping("/rest/catalogs")
public class CatalogController {
	
	@Autowired
	private CatalogCache catalogCache;
	
	@GetMapping("/all/{displayName}")
	public Catalog getCatalog(@PathVariable String displayName ){
		return catalogCache.getCatalog(displayName);
	}
	
	@GetMapping("/all")
	public List<Catalog> getAllCatalogs(){
		return catalogCache.getAllCatalog();
	}

}
