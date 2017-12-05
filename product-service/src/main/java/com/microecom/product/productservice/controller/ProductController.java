package com.microecom.product.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microecom.product.productservice.cache.ProductCache;
import com.microecom.product.productservice.domain.PC9Product;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/rest/products")
@Api(value="Product services", description="Operations pertaining to Products")
public class ProductController {

	@Autowired
	private ProductCache productCache;

	@ApiOperation(value = "View a list of all available products",response = PC9Product.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
	@GetMapping("/all")
	public List<PC9Product> getAllProducts(){
		return productCache.getAllProducts();
	}
	
	@ApiOperation(value = "View a list of products based on the Product Description",response = PC9Product.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
	
	@GetMapping("/{productDescription}/description")
	public List<PC9Product> getByProductDescription(@PathVariable String productDescription){
		return productCache.getProductDetailsByDescription(productDescription);
	}
	
	
	@ApiOperation(value = "View a list of products based on the Product Code",response = PC9Product.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
	@GetMapping("/code/{productCode}")
	public List<PC9Product> getProductCode(@PathVariable String productCode){
		
		return productCache.getProductCode(productCode);
	}

}
