package com.microecom.product.productservice.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Folder {

	@Id
	private String id;
	
	@TextIndexed
	private String displayName;
	
	@TextIndexed
	private String description;
	
	@DBRef
	private Folder parent;

}