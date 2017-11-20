package com.microecom.product.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microecom.product.productservice.domain.Sku;
import com.microecom.product.productservice.repository.SKURepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/rest/sku")
@Api(value="SKU services", description="Operations pertaining to SKU")
public class SKUController {
	
	@Autowired
	SKURepository skuRepository;
	
	
	@GetMapping("/all")
	@ApiOperation(value = "View a list of all SKU's",response = Sku.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
	public List<Sku> getAllSkus(){
		return skuRepository.findAll();
	}
}
