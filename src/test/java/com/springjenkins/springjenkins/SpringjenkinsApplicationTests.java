package com.springjenkins.springjenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringjenkinsApplicationTests {
	private static Logger logger= LoggerFactory.getLogger(SpringjenkinsApplicationTests.class);

	@Test
	void contextLoads() {

		logger.info("testing");
logger.info("----------------------------------===");
	}

}
