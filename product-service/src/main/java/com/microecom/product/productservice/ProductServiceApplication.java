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
	private ProductRepository productRepository;
	
	@Autowired
	ObjectMapper objectMapper;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		TypeReference<List<PC9Product>> productType = new TypeReference<List<PC9Product>>() {};
		InputStream is = TypeReference.class.getResourceAsStream("/json/product.json");
		InputStream is2 = TypeReference.class.getResourceAsStream("/json/product.json");
		
		try {
			productRepository.deleteAll();
			List<PC9Product> productList =  objectMapper.readValue(is, productType);
		    
			
			for(PC9Product product: productList){
				System.out.println("Product list  : " +product  +"\n" + " : "+ product.getSkus());
			}
			
		
			productRepository.save(productList);
		//	skuRepository.save(skuList);
			System.out.println("States list saved successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
		*/
}
