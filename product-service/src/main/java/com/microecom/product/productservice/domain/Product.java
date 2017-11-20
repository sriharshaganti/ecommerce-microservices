package com.microecom.product.productservice.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public  class Product implements Serializable {

    @Id
    private String id;

    private String pc9;
    
    private String pc5;

    @TextIndexed
    private String displayName;
   
    @TextIndexed
    private String description;

    private Double price;

    private Boolean discountable;

    private Boolean onlineOnly;

    @DBRef
    private Category defaultParentCategory;

    @DBRef(lazy = true)
    private List<Sku> childSkus;

   
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public Boolean getDiscountable() {
		return discountable;
	}

	public void setDiscountable(Boolean discountable) {
		this.discountable = discountable;
	}



	public Boolean getOnlineOnly() {
		return onlineOnly;
	}

	public void setOnlineOnly(Boolean onlineOnly) {
		this.onlineOnly = onlineOnly;
	}


	public Category getDefaultParentCategory() {
		return defaultParentCategory;
	}

	public void setDefaultParentCategory(Category defaultParentCategory) {
		this.defaultParentCategory = defaultParentCategory;
	}

	public List<Sku> getChildSkus() {
		return childSkus;
	}

	public void setChildSkus(List<Sku> childSkus) {
		this.childSkus = childSkus;
	}

	public String getPc9() {
		return pc9;
	}

	public void setPc9(String pc9) {
		this.pc9 = pc9;
	}

	public String getPc5() {
		return pc5;
	}

	public void setPc5(String pc5) {
		this.pc5 = pc5;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	
    
}