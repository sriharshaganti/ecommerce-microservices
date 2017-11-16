package com.microecom.product.productservice.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Map;
import java.util.Set;

@Document
public class Sku {

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
	
	private Double listPrice;
	
	private Double salePrice;
	
	private Boolean onSale;
	
	private Boolean nonreturnable;
	
	private Boolean discountable;
	
	@TextIndexed
	private String manufacturerPartNumber;
	
	private Boolean onlineOnly;
	
	private Map<String, String> dynamicAttributes;
	
	@DBRef
	private Media template;
	
	@DBRef
	private Media thumbnailImage;

	@DBRef
	private Media smallImage;
	
	@DBRef
	private Media largeImage;
	
	@DBRef(lazy = true)
	private Map<String, Media> auxiliaryMedia;
	
	private Double quantity;
	
	private	UnitOfMeasure unitOfMeasure;

	private Set<String> sites;

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

	public Double getListPrice() {
		return listPrice;
	}

	public void setListPrice(Double listPrice) {
		this.listPrice = listPrice;
	}

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	public Boolean getOnSale() {
		return onSale;
	}

	public void setOnSale(Boolean onSale) {
		this.onSale = onSale;
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

	public String getManufacturerPartNumber() {
		return manufacturerPartNumber;
	}

	public void setManufacturerPartNumber(String manufacturerPartNumber) {
		this.manufacturerPartNumber = manufacturerPartNumber;
	}

	public Boolean getOnlineOnly() {
		return onlineOnly;
	}

	public void setOnlineOnly(Boolean onlineOnly) {
		this.onlineOnly = onlineOnly;
	}

	public Map<String, String> getDynamicAttributes() {
		return dynamicAttributes;
	}

	public void setDynamicAttributes(Map<String, String> dynamicAttributes) {
		this.dynamicAttributes = dynamicAttributes;
	}

	public Media getTemplate() {
		return template;
	}

	public void setTemplate(Media template) {
		this.template = template;
	}

	public Media getThumbnailImage() {
		return thumbnailImage;
	}

	public void setThumbnailImage(Media thumbnailImage) {
		this.thumbnailImage = thumbnailImage;
	}

	public Media getSmallImage() {
		return smallImage;
	}

	public void setSmallImage(Media smallImage) {
		this.smallImage = smallImage;
	}

	public Media getLargeImage() {
		return largeImage;
	}

	public void setLargeImage(Media largeImage) {
		this.largeImage = largeImage;
	}

	public Map<String, Media> getAuxiliaryMedia() {
		return auxiliaryMedia;
	}

	public void setAuxiliaryMedia(Map<String, Media> auxiliaryMedia) {
		this.auxiliaryMedia = auxiliaryMedia;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public UnitOfMeasure getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public Set<String> getSites() {
		return sites;
	}

	public void setSites(Set<String> sites) {
		this.sites = sites;
	}

	

}