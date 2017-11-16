package com.microecom.product.productservice.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.TextScore;

import java.util.Date;
import java.util.List;
import java.util.Map;


@Document
public class Category {

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

    @DBRef
    private Catalog catalog;

    @TextIndexed
    private List<String> keywords;

    @DBRef
    private Category defaultParentCategory;

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

    @DBRef(lazy = true)
    private List<Category> fixedParentCategories;

    @Transient
    private List<Category> ancestorCategories;

    @Transient
    private List<Category> fixedChildCategories;

    private List<String> sites;

    @TextScore
    private Float score;

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

	public Catalog getCatalog() {
		return catalog;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
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

	public List<Category> getFixedParentCategories() {
		return fixedParentCategories;
	}

	public void setFixedParentCategories(List<Category> fixedParentCategories) {
		this.fixedParentCategories = fixedParentCategories;
	}

	public List<Category> getAncestorCategories() {
		return ancestorCategories;
	}

	public void setAncestorCategories(List<Category> ancestorCategories) {
		this.ancestorCategories = ancestorCategories;
	}

	public List<Category> getFixedChildCategories() {
		return fixedChildCategories;
	}

	public void setFixedChildCategories(List<Category> fixedChildCategories) {
		this.fixedChildCategories = fixedChildCategories;
	}

	public List<String> getSites() {
		return sites;
	}

	public void setSites(List<String> sites) {
		this.sites = sites;
	}

	public Float getScore() {
		return score;
	}

	public void setScore(Float score) {
		this.score = score;
	}
    
}