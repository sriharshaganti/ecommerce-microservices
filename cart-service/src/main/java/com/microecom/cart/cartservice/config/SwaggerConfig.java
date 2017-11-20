package com.microecom.cart.cartservice.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
    public Docket cartApi() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.groupName("carts")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.microecom.cart.cartservice.controller"))
                .paths(regex("/rest/carts.*"))
                .build()
                .apiInfo(metaData());
    }
    
    @Bean
    public Docket promotionApi() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.groupName("Catalog")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.microecom.cart.cartservice.controller"))
                .paths(regex("/rest/catalogs.*"))
                .build()
                .apiInfo(metaData());
    }
    
    @Bean
    public Docket userApi() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.groupName("Category")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.microecom.cart.cartservice.controller"))
                .paths(regex("/rest/categories.*"))
                .build()
                .apiInfo(metaData());
    }
    
    @Bean
    public Docket storeApi() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.groupName("SKU")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.microecom.cart.cartservice.controller"))
                .paths(regex("/rest/sku.*"))
                .build()
                .apiInfo(metaData());
    }
    
    private ApiInfo metaData() {
    	
    	ApiInfo apiInfo = new ApiInfo("ECommerce Micro-services", 
    			"Micro-services for ecommerce business", "1.0", "Terms of service", new Contact("Sriharsha Ganti", "https://github.com/sriharshaganti", "sganti@levi.com"), "Apache License Version 2.0", "https://www.apache.org/licenses/LICENSE-2.0");
        return apiInfo;
    }
}
