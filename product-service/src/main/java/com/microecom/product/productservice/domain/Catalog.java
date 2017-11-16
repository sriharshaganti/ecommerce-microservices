package com.microecom.product.productservice.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Document
public class Catalog implements Serializable{

    @Id
    private String id;

    private String displayName;

    private List<Category> rootCategories;

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

	public List<Category> getRootCategories() {
		return rootCategories;
	}

	public void setRootCategories(List<Category> rootCategories) {
		this.rootCategories = rootCategories;
	}

}