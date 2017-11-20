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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RefreshScope
@RestController
@RequestMapping("/rest/catalogs")
@Api(value="Catalog services", description="Operations pertaining to Catalogs")
public class CatalogController {
	
	@Value("${message}")
	private String message;
	
	@Autowired
	CatalogRepository catalogRepository;
	
	@GetMapping("/all/{displayName}")
	@ApiOperation(value = "View a list of catalogs based on catalog name",response = Catalog.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
	public Catalog getCatalog(@PathVariable String displayName ){
		return catalogRepository.findByDisplayName(displayName);
	}
	
	@GetMapping("/all")
	@ApiOperation(value = "View a list of all catalogs",response = Catalog.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
	public List<Catalog> getAllCatalogs(){
		return catalogRepository.findAll();
	}
	
	@GetMapping(value ="/message")
	public String getMessage(){
		return message;
	}
}
