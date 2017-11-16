package com.microecom.product.productservice.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.Map;


@Document
public  class Product {

    @Id
    private String id;

    private int version;

    @TextIndexed
    private String displayName;

    private Date creationDate;

    private Date startDate;

    private Date endDate;

    @TextIndexed
    private String description;

    @TextIndexed
    private String longDescription;

    private Boolean nonreturnable;

    private Boolean discountable;

    private String brand;

    private Boolean disallowAsRecommendation;

    private Boolean onlineOnly;

    @TextIndexed
    private List<String> keywords;


    @DBRef
    private Category defaultParentCategory;

    @DBRef(lazy = true)
    private List<Sku> childSkus;

    private List<Image> images;


    @DBRef(lazy = true)
    private Map<String, Media> auxiliaryMedia;

    private List<String> displayableSkuAttributes;

    @DBRef(lazy = true)
    private List<Category> fixedParentCategories;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public Boolean getNonreturnable() {
		return nonreturnable;
	}

	public void setNonreturnable(Boolean nonreturnable) {
		this.nonreturnable = nonreturnable;
	}

	public Boolean getDiscountable() {
		return discountable;
	}

	public void setDiscountable(Boolean discountable) {
		this.discountable = discountable;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Boolean getDisallowAsRecommendation() {
		return disallowAsRecommendation;
	}

	public void setDisallowAsRecommendation(Boolean disallowAsRecommendation) {
		this.disallowAsRecommendation = disallowAsRecommendation;
	}

	public Boolean getOnlineOnly() {
		return onlineOnly;
	}

	public void setOnlineOnly(Boolean onlineOnly) {
		this.onlineOnly = onlineOnly;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
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

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public Map<String, Media> getAuxiliaryMedia() {
		return auxiliaryMedia;
	}

	public void setAuxiliaryMedia(Map<String, Media> auxiliaryMedia) {
		this.auxiliaryMedia = auxiliaryMedia;
	}

	public List<String> getDisplayableSkuAttributes() {
		return displayableSkuAttributes;
	}

	public void setDisplayableSkuAttributes(List<String> displayableSkuAttributes) {
		this.displayableSkuAttributes = displayableSkuAttributes;
	}

	public List<Category> getFixedParentCategories() {
		return fixedParentCategories;
	}

	public void setFixedParentCategories(List<Category> fixedParentCategories) {
		this.fixedParentCategories = fixedParentCategories;
	}
    
}