package com.example.springbootdocker;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringbootDockerDemoApplicationTests {

	public  static Logger logger = LoggerFactory.getLogger(SpringbootDockerDemoApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Tests class executing ...");
		assertEquals(true,true);
	}

}
