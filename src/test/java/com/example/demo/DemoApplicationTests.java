package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;


@RunWith(SpringRunner.class)
@ActiveProfiles("dev")
@SpringBootTest
class DemoApplicationTests {

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	Environment env;
	
	@Test
	void testDemo() {
		String actual = restTemplate.getForObject(env.getProperty("rest.url"), String.class);
		assertEquals("Hello World!", actual);
	}

}
