package com.microecom.product.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microecom.product.productservice.domain.Sku;
import com.microecom.product.productservice.repository.SKURepository;

@RestController
@RequestMapping("/rest/sku")
public class SKUController {
	
	@Autowired
	SKURepository skuRepository;
	
	
	@GetMapping("/all")
	public List<Sku> getAllSkus(){
		return skuRepository.findAll();
	}
}
