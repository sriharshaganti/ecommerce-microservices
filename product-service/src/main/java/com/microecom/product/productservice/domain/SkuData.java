package com.microecom.product.productservice.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;




@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(collection= "sku")
public class SkuData implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
    private String height;

    private String length;

    private String sizeDescription;

    private String sku;

    private String upc;

    private String upcCanada;

    private String waist;

    private String weight;

    private String width;

    private String text;

    public SkuData() {
    	
    }
    
    public SkuData(String _id, String height, String length, String sizeDescription, String sku, String upc,
			String upcCanada, String waist, String weight, String width, String text) {
		super();
		this.id = _id;
		this.height = height;
		this.length = length;
		this.sizeDescription = sizeDescription;
		this.sku = sku;
		this.upc = upc;
		this.upcCanada = upcCanada;
		this.waist = waist;
		this.weight = weight;
		this.width = width;
		this.text = text;
	}
	public void setHeight(String height){
        this.height = height;
    }
    public String getHeight(){
        return height;
    }
    public void setLength(String length){
        this.length = length;
    }
    public String getLength(){
        return length;
    }
    public void setSizeDescription(String sizeDescription){
        this.sizeDescription = sizeDescription;
    }
    public String getSizeDescription(){
        return sizeDescription;
    }
    public void setSku(String sku){
        this.sku = sku;
    }
    public String getSku(){
        return sku;
    }
    public void setUpc(String upc){
        this.upc = upc;
    }
    public String getUpc(){
        return upc;
    }
    public void setUpcCanada(String upcCanada){
        this.upcCanada = upcCanada;
    }
    public String getUpcCanada(){
        return upcCanada;
    }
    public void setWaist(String waist){
        this.waist = waist;
    }
    public String getWaist(){
        return waist;
    }
    public void setWeight(String weight){
        this.weight = weight;
    }
    public String getWeight(){
        return weight;
    }
    public void setWidth(String width){
        this.width = width;
    }
    public String getWidth(){
        return width;
    }
    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return text;
    }
}

