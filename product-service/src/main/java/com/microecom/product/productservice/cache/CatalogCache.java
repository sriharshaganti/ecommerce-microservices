package com.microecom.product.productservice.cache;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.microecom.product.productservice.domain.Catalog;
import com.microecom.product.productservice.repository.CatalogRepository;

@Component
public class CatalogCache {

	@Autowired
	CatalogRepository catalogRepository;
	
	@Cacheable(value = "catalogCache", key = "#displayName")
	public Catalog getCatalog(String displayName){
		return catalogRepository.findByDisplayName(displayName);
		
	}
	
	@Cacheable(value = "allCache")
	public List<Catalog> getAllCatalog() {
		// TODO Auto-generated method stub
		return catalogRepository.findAll();
	}
}
