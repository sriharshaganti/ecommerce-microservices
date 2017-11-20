package com.microecom.product.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProductServiceApplication{
	
	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}
	
	/*@Autowired
	CatalogRepository catalogRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	SKURepository skuRepository;
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		Product product1 = new Product();
		Product product2 = new Product();
		
		
		List<Sku> skusList = skuRepoSave();
 		Catalog catalog = catalogRepoSave();
		Category category = categoryRepoSave(catalog);
		product1.setChildSkus(skusList);
		product1.setDefaultParentCategory(category);
		product1.setDescription("Sample Product");
		product1.setDiscountable(Boolean.TRUE);
		product1.setDisplayName("Sample Product");
		product1.setOnlineOnly(Boolean.TRUE);
		product1.setPc5("00501");
		product1.setPc9("005011124");
		product1.setPrice(35.00);
		product2.setChildSkus(skusList);
		product2.setDefaultParentCategory(category);
		product2.setDescription("Sample Product 2");
		product2.setDiscountable(Boolean.TRUE);
		product2.setDisplayName("Sample Product 2");
		product2.setOnlineOnly(Boolean.TRUE);
		product2.setPc5("00501");
		product2.setPc9("005011125");
		product2.setPrice(45.00);
		productRepository.save(product1);
		productRepository.save(product2);
		
		
	}

	private Catalog catalogRepoSave() {
		Catalog catalog1 = new Catalog();
		Catalog catalog2 = new Catalog();
		Catalog catalog3 = new Catalog();
		Catalog catalog4 = new Catalog();
		Catalog catalog5 = new Catalog();
		catalog1.setDisplayName("501");
		catalog2.setDisplayName("711");
		catalog3.setDisplayName("502");
		catalog4.setDisplayName("511");
		catalog5.setDisplayName("713");
		catalogRepository.save(catalog1);
		catalogRepository.save(catalog2);
		catalogRepository.save(catalog3);
		catalogRepository.save(catalog4);
		catalogRepository.save(catalog5);
		return catalog1;
	}

	private Category categoryRepoSave( Catalog catalog) {
		Category category1 = new Category();
		Category category2 = new Category();
		Category category3 = new Category();
		Category category4 = new Category();
		category1.setCatalog(catalog);
		category1.setDescription("MENS");
		category1.setDisplayName("MENS 501");
		category2.setCatalog(catalog);
		category2.setDescription("WOMEN");
		category2.setDisplayName("WOMEN 711");
		category3.setCatalog(catalog);
		category3.setDescription("KIDS");
		category3.setDisplayName("KIDS");
		category4.setCatalog(catalog);
		category4.setDescription("SALE");
		category4.setDisplayName("SALE ITEMS");
		categoryRepository.save(category1);
		categoryRepository.save(category2);
		categoryRepository.save(category3);
		categoryRepository.save(category4);
		return category2;
	}

	private List<Sku> skuRepoSave() {
		Sku sku1 = new Sku();
		Sku sku2 = new Sku();
		Sku sku3 = new Sku();
		Sku sku4 = new Sku();
		sku1.setDescription("Blue Jeans");
		sku1.setDisplayName("Blue Jeans");
		sku1.setQuantity(10L);
		sku1.setUnitOfMeasure(UnitOfMeasure.units);
		sku1.setPc13("00501112403230");
		sku2.setDescription("Black Jeans");
		sku2.setDisplayName("Back Jeans");
		sku2.setQuantity(5L);
		sku2.setUnitOfMeasure(UnitOfMeasure.units);
		sku2.setPc13("00501112503230");
		sku3.setDescription("Blue Jeans");
		sku3.setDisplayName("Blue Jeans");
		sku3.setQuantity(10L);
		sku3.setUnitOfMeasure(UnitOfMeasure.units);
		sku3.setPc13("00501112403430");
		sku4.setDescription("Black Jeans");
		sku4.setDisplayName("Back Jeans");
		sku4.setQuantity(5L);
		sku4.setUnitOfMeasure(UnitOfMeasure.units);
		sku4.setPc13("00501112503430");
		skuRepository.save(sku1);
		skuRepository.save(sku2);
		skuRepository.save(sku3);
		skuRepository.save(sku4);
		List<Sku> skuList = new ArrayList<Sku>();
		skuList.add(sku1);
		skuList.add(sku2);
		skuList.add(sku3);
		skuList.add(sku4);
		return skuList;
 	}*/
}
