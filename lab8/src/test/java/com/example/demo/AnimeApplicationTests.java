package com.example.demo;

import com.example.demo.controller.AnimeController;
import com.example.demo.service.AnimeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private AnimeController animeController;

	@Autowired
	private AnimeService animeService;

	@Test
	void contextLoads() {
		assertNotNull(animeController);
		assertNotNull(animeService);
	}

	// Add more tests for specific components or functionality as needed
}
