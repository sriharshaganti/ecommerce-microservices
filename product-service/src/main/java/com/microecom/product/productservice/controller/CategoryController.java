package com.microecom.product.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microecom.product.productservice.domain.Category;
import com.microecom.product.productservice.repository.CategoryRepository;

@RestController
@RequestMapping("/rest/categories")
public class CategoryController {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	
	@GetMapping("/all")
	public List<Category> getAllCategorys(){
		return categoryRepository.findAll();
	}
}
