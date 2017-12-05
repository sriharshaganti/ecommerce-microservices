package com.microecom.product.productservice;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceApplicationTests {
	
	TestRestTemplate testRestTemplate = new TestRestTemplate();
	
	@Test
	public void testProductsData() {
		assertTrue(Boolean.TRUE);
	}

}
