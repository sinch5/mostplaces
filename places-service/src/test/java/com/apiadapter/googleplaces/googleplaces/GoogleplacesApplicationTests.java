package com.apiadapter.googleplaces.googleplaces;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=GoogleplacesApplicationTests.class, properties = "spring.cloud.config.enabled=false")
public class GoogleplacesApplicationTests {

	@Test
	public void contextLoads() {
	}

}
