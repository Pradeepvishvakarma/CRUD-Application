package io.firstcrudproject.firstcrude;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstcrudeApplicationTests {

	private Calculator c = new Calculator();
	
	@Test
	void contextLoads() {
	}

	@Test
	void testsum() {
		
		int actualResult = c.doSum(10, 5, 5);
		
		int expectedResult = 20;
		
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test	
	void testProduct() {
		
		int actualResult = c.Product(12, 2);
		
		int expectedResult = 24;
		
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	void testCompare() {
		
			boolean actualResult =	c.Compare(56, 56);
			
			assertThat(actualResult).isTrue();
	}
}
